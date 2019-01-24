package parte3.Ejercicio03;

import java.util.Scanner;

/**
 * Ejercicio 03 del Tema 09 (Parte 3)
 * 
 * Realiza el programa “Colección de discos” por tu cuenta, mirando lo menos
 * posible el ejemplo que se proporciona. Pruébalo primero para ver cómo
 * funciona y luego intenta implementarlo tú mismo.
 *
 * @author JorgeGarciaMolina
 */
public class Ejercicio03 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    //Variables
    final int D = 50;
    int opcion;
    String codigoIntroducido, autorIntroducido, tituloIntroducido;
    String generoIntroducido, duracionIntroducidaString;
    int duracionIntroducida;
    int primeraLibre;
    int pos;
    boolean salir = false;
    
    //Crear el array de discos
    Disco[] album = new Disco[D];
    
    //Crear los discos
    for(int i = 0; i < D; i++) {
      album[i] = new Disco();
    }
    
    //Menú
    do {
      System.out.println("\n\nMenú de colección de discos.");
      System.out.println("--------------------------------");
      System.out.println("1. Lista de discos.");
      System.out.println("2. Agregar disco.");
      System.out.println("3. Modificar disco.");
      System.out.println("4. Borrar disco.");
      System.out.println("5. Salir.");
      System.out.print("Seleccione una opción: ");
      opcion = Integer.parseInt(s.nextLine());

      //Acciones para la opcion seleccionada
      switch(opcion) {
        case 1:
          System.out.println("\nLista de discos.");
          System.out.println("------------------");
          for (int i = 0; i < D; i++) {
            if (!album[i].getCodigo().equals("LIBRE")) {
              System.out.println(album[i]);
            }
          }
          break;
          
        case 2:
          System.out.println("\nAgregar un nuevo disco.");
          System.out.println("-------------------------");
          primeraLibre = -1;
          do {
            primeraLibre++;
          } while (!((album[primeraLibre].getCodigo()).equals("LIBRE")));
          System.out.println("Introduzca los datos del nuevo disco.");
          System.out.print("Código: ");
          codigoIntroducido = s.nextLine();
          album[primeraLibre].setCodigo(codigoIntroducido);
          System.out.print("Autor: ");
          autorIntroducido = s.nextLine();
          album[primeraLibre].setAutor(autorIntroducido);
          System.out.print("Título: ");
          tituloIntroducido = s.nextLine();
          album[primeraLibre].setTitulo(tituloIntroducido);
          System.out.print("Género: ");
          generoIntroducido = s.nextLine();
          album[primeraLibre].setGenero(generoIntroducido);
          System.out.print("Duración: ");
          duracionIntroducida = Integer.parseInt(s.nextLine());
          album[primeraLibre].setDuracion(duracionIntroducida);
          break;
        
        case 3:
          System.out.println("\nModificar un disco existnte.");
          System.out.println("------------------------------");
          System.out.print("Introduzca el código del disco que quiere modificar: ");
          codigoIntroducido = s.nextLine();
          pos = -1;
          do {
            pos++;
          } while (!((album[pos].getCodigo()).equals(codigoIntroducido)));
          System.out.println("Introduzca los nuevos datos del disco.");
          System.out.println("Código: " + album[pos].getCodigo());
          System.out.print("Nuevo código: ");
          codigoIntroducido = s.nextLine();
          if (!codigoIntroducido.equals("")) {
            album[pos].setCodigo(codigoIntroducido);
          }
          System.out.println("Autor: " + album[pos].getAutor());
          System.out.print("Nuevo autor: ");
          autorIntroducido = s.nextLine();
          if (!autorIntroducido.equals("")) {
            album[pos].setAutor(autorIntroducido);
          }
          System.out.println("Título: " + album[pos].getTitulo());
          System.out.print("Nuevo título: ");
          tituloIntroducido = s.nextLine();
          if (!tituloIntroducido.equals("")) {
            album[pos].setTitulo(tituloIntroducido);
          }
          System.out.println("Género: " + album[pos].getGenero());
          System.out.print("Nuevo género: ");
          generoIntroducido = s.nextLine();
          if (!generoIntroducido.equals("")) {
            album[pos].setGenero(generoIntroducido);
          }
          System.out.println("Duración: " + album[pos].getDuracion());
          System.out.print("Duración: ");
          duracionIntroducidaString = s.nextLine();
          if (!duracionIntroducidaString.equals("")) {
            album[pos].setDuracion(Integer.parseInt(duracionIntroducidaString));
          }
          break;
        case 4:
          System.out.println("\nBorrar un disco.");
          System.out.println("------------------");
          System.out.print("Introduce el código del disco que quieres borrar: ");
          codigoIntroducido = s.nextLine();
          pos = -1;
          do {
            pos++;
          } while (!((album[pos].getCodigo()).equals(codigoIntroducido)));
          album[pos].setCodigo("LIBRE");
          System.out.println("Disco borrado.");
          break;
        case 5:
          System.out.println("GRACIAS POR USAR NUESTROS SERVICIOS.");
          salir = true;
          break;
        default:
          System.out.println("La opcion seleccionada no es válida.");
      } 
    } while(!salir);
  }
}
