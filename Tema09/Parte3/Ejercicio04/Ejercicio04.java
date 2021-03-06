package parte3.Ejercicio04;

import java.util.Scanner;

/**
 * Ejercicio 04 del Tema 09 (Parte 3)
 * 
 * Modifica el programa “Colección de discos” como se indica a continuación: 
 * a) Mejora la opción “Nuevo disco” de tal forma que cuando se llenen todas las
 * posiciones del array, el programa muestre un mensaje de error. No se
 * permitirá introducir los datos de ningún disco hasta que no se borre alguno
 * de la lista. 
 * b) Mejora la opción “Borrar” de tal forma que se verifique que
 * el código introducido por el usuario existe. 
 * c) Modifica el programa de tal forma que el código del disco sea único, 
 * es decir que no se pueda repetir. 
 * d) Crea un submenú dentro dentro de “Listado” de tal forma que exista un listado
 * completo, un listado por autor (todos los discos que ha publicado un
 * determinado autor), un listado por género (todos los discos de un género de-
 * terminado) y un listado de discos cuya duración esté en un rango determinado
 * por el usuario.
 *
 * @author JorgeGarciaMolina
 */
public class Ejercicio04 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    //Variables
    final int D = 50;
    String codigoIntroducido, autorIntroducido, tituloIntroducido;
    String generoIntroducido, duracionIntroducidaString;
    int duracionIntroducida, primeraLibre, pos, opcion;
    int durMin, durMax;
    boolean salir = false;
    boolean existeCodigo = false;
    
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
          System.out.println("\n\nMenú de listado de discos.");
          System.out.println("--------------------------------");
          System.out.println("1. Lista de todos los discos.");
          System.out.println("2. Lista por autor.");
          System.out.println("3. Lista por género");
          System.out.println("4. Lista por duración.");
          System.out.println("5. Atrás.");
          System.out.print("Seleccione una opción: ");
          opcion = Integer.parseInt(s.nextLine());
          switch (opcion) {
            case 1:
              System.out.println("\nLista completa de discos.");
              System.out.println("---------------------------");
              for (int i = 0; i < D; i++) {
                if (!album[i].getCodigo().equals("LIBRE")) {
                  System.out.println(album[i]);
                }
              }
              break;
            case 2:
              System.out.print("\nIntroduce el nombre del autor: ");
              autorIntroducido = s.nextLine();
              System.out.println("\nLista de discos del autor " + autorIntroducido);
              System.out.println("-------------------------------------------------");
              for (int i = 0; i < D; i++) {
                if (album[i].getAutor().equals(autorIntroducido)) {
                  System.out.println(album[i]);
                }
              }
              break;
            case 3:
              System.out.print("\nIntroduce el género: ");
              generoIntroducido = s.nextLine();
              System.out.println("\nLista de discos del género " + generoIntroducido);
              System.out.println("-------------------------------------------------");
              for (int i = 0; i < D; i++) {
                if (album[i].getGenero().equals(generoIntroducido)) {
                  System.out.println(album[i]);
                }
              }
              break;
            case 4:
              System.out.print("\nIntroduce la duración mínima: .");
              durMin = Integer.parseInt(s.nextLine());
              System.out.print("Introduce la duración máxima: .");
              durMax = Integer.parseInt(s.nextLine());
              System.out.println("\nLista de discos de duraación entre " + durMin 
                      + " y " + durMax + "min");
              System.out.println("-------------------------------------------------");
              for (int i = 0; i < D; i++) {
                if ((durMax < album[i].getDuracion()) && (album[i].getDuracion() > durMin)) {
                  System.out.println(album[i]);
                }
              }
              break;
            case 5:
              break;
            default:
              System.out.println("Opción no válida.");
          }
          break;
          
        case 2:
          System.out.println("\nAgregar un nuevo disco.");
          System.out.println("-------------------------");
          primeraLibre = -1;
          do {
            primeraLibre++;
          } while (!((album[primeraLibre].getCodigo()).equals("LIBRE")) || primeraLibre == D);
          if (primeraLibre == (D)) {
            System.out.println("No hay espacio para agregar un nuevo disco.");
          } else {
            System.out.println("Introduzca los datos del nuevo disco.");
            do {
              System.out.print("Código: ");
              codigoIntroducido = s.nextLine();
              for (int i = 0; i < D; i++) {
                if (album[i].getCodigo().equals(codigoIntroducido)) {
                  existeCodigo = true;
                }
              }
              if (existeCodigo) {
                System.out.println("El código introducido ya existe, introduce otro.");
              } else {
                existeCodigo = false;
              }
            } while(existeCodigo);
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
          }
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
          do {
              System.out.print("Nuevo código: ");
              codigoIntroducido = s.nextLine();
              for (int i = 0; i < D; i++) {
                if (album[i].getCodigo().equals(codigoIntroducido)) {
                  existeCodigo = true;
                }
              }
              if (existeCodigo) {
                System.out.println("El código introducido ya existe, introduce otro.");
              } else {
                existeCodigo = false;
              }
            } while(existeCodigo);
          
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
          for (int i = 0; i < D; i++) {
            if (album[i].getCodigo().equals(codigoIntroducido)) {
              existeCodigo = true;
            }
          }
          
          if (!existeCodigo) {
            System.out.println("El código introducido no existe.");
          } else {
            do {
              pos++;
            } while (!((album[pos].getCodigo()).equals(codigoIntroducido)));
            album[pos].setCodigo("LIBRE");
            System.out.println("Disco borrado.");
            existeCodigo = false;
          }
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
