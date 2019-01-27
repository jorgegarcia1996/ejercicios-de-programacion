package ejercicios.ejercicio05;

import java.util.Scanner;
import java.util.ArrayList;

/**
 * Ejercicio 05 del tema 10
 * 
 * Realiza de nuevo el ejercicio de la colección de discos pero utilizando esta
 * vez una lista para almacenar la información sobre los discos en lugar de un
 * array convencional. Comprobarás que el código se simplifica notablemente
 * ¿Cuánto ocupa el programa original hecho con un array? ¿Cuánto ocupa este
 * nuevo programa hecho con una lista?
 *
 * @author JorgeGarciaMolina
 */
public class Ejercicio05 {
  public static void main(String[] args) {
    ArrayList<Disco> album = new ArrayList<>();
    
    //Variables
    String codigoIntroducido, autorIntroducido, tituloIntroducido, generoIntroducido;
    String duracionIntroducidaString;
    int pos, opcion, duracionIntroducida, limiteInferior, limiteSuperior;
    boolean salir, atras;
    
    Scanner s = new Scanner(System.in);
    
    //Menú
    do {
      salir = false;
      atras = false;
      System.out.println("\n\nMenú de colección de discos.");
      System.out.println("--------------------------------");
      System.out.println("1. Lista de discos.");
      System.out.println("2. Agregar disco.");
      System.out.println("3. Modificar disco.");
      System.out.println("4. Borrar disco.");
      System.out.println("5. Salir.");
      System.out.print("Seleccione una opción: ");
      opcion = Integer.parseInt(s.nextLine());
      
      switch (opcion) {
      case 1:
        do {
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
              for(Disco d : album) {
                System.out.println(d);
              }              
              break;
                    
            case 2:
              System.out.print("Introduzca el autor: ");
              autorIntroducido = s.nextLine();
              
              for(Disco d : album) {
                if(d.getAutor().equals(autorIntroducido)) {
                  System.out.println(d);
                }
              }
              break;
              
            case 3:
              System.out.print("Introduzca el género: ");
              generoIntroducido = s.nextLine();
              
              for(Disco d : album) {
                if(d.getGenero().equals(generoIntroducido)) {
                  System.out.println(d);
                }
              }              
              break;
  
            case 4:
              System.out.println("Establezca el intervalo para la duración");
              System.out.print("Introduzca el límite inferior de duración en minutos: ");
              limiteInferior = Integer.parseInt(s.nextLine());
              System.out.print("Introduzca el límite superior de duración en minutos: ");
              limiteSuperior = Integer.parseInt(s.nextLine());

              for(Disco d : album) {
                if((d.getDuracion() <= limiteSuperior) && (d.getDuracion() >= limiteInferior)) {
                  System.out.println(d);
                }
              }
            case 5:
              atras = true;
              System.out.println("Volviendo al menú principal.");
              break;
            default:
              System.out.println("La opción seleccionada no es válida");
          }
        } while (!atras);
        break;
      
      case 2:
        System.out.println("\nAgregar un nuevo disco.");
        System.out.println("-------------------------");

        System.out.println("Por favor, introduzca los datos del disco.");  
        System.out.print("Código: ");
        codigoIntroducido = s.nextLine();
        while (album.contains(new Disco(codigoIntroducido,"", "", "", 0))) {
          System.out.println("Ese código ya existe en la base de datos.");
          System.out.print("Introduzca otro código: ");
          codigoIntroducido = s.nextLine();
        }
        System.out.print("Autor: ");
        autorIntroducido = s.nextLine();        
        System.out.print("Título: ");
        tituloIntroducido = s.nextLine();      
        System.out.print("Género: ");
        generoIntroducido = s.nextLine();      
        System.out.print("Duración: ");
        duracionIntroducida = Integer.parseInt(s.nextLine());
        
        album.add(new Disco(codigoIntroducido, autorIntroducido, tituloIntroducido, generoIntroducido, duracionIntroducida));
        
        break;
        
      case 3:
        System.out.println("\nModificar un disco existnte.");
        System.out.println("------------------------------");
        System.out.print("Por favor, introduzca el código del disco cuyos datos desea cambiar: ");
        codigoIntroducido = s.nextLine();

        while (!album.contains(new Disco(codigoIntroducido,"", "", "", 0))) {
          System.out.print("Ese código no existe.\nIntroduzca otro código: ");
          codigoIntroducido = s.nextLine();
        }  
        pos = album.indexOf(new Disco(codigoIntroducido,"", "", "", 0));
        System.out.println("Introduzca los nuevos datos del disco o INTRO para dejarlos igual.");
        System.out.println("Código: " + album.get(pos).getCodigo());
        System.out.print("Nuevo código: ");
        codigoIntroducido = s.nextLine();
        if (!codigoIntroducido.equals("")) {
          album.get(pos).setCodigo(codigoIntroducido);
        }
        System.out.println("Autor: " + album.get(pos).getAutor());
        System.out.print("Nuevo autor: ");
        autorIntroducido = s.nextLine();
        if (!autorIntroducido.equals("")) {
          album.get(pos).setAutor(autorIntroducido);
        }
        System.out.println("Título: " + album.get(pos).getTitulo());
        System.out.print("Nuevo título: ");
        tituloIntroducido = s.nextLine();
        if (!tituloIntroducido.equals("")) {
          album.get(pos).setTitulo(tituloIntroducido);
        }
        System.out.println("Género: " + album.get(pos).getGenero());
        System.out.print("Nuevo género: ");
        generoIntroducido = s.nextLine();
        if (!generoIntroducido.equals("")) {
          album.get(pos).setGenero(generoIntroducido);
        }
        System.out.println("Duración: " + album.get(pos).getDuracion());
        System.out.print("Duración: ");
        duracionIntroducidaString = s.nextLine();
        if (!duracionIntroducidaString.equals("")) {
          album.get(pos).setDuracion(Integer.parseInt(duracionIntroducidaString));
        }
        break;

      case 4:
        System.out.println("\nBorrar un disco.");
        System.out.println("------------------");
        System.out.print("Por favor, introduzca el código del disco que desea borrar: ");
        codigoIntroducido = s.nextLine();
        if (!album.contains(new Disco(codigoIntroducido,"", "", "", 0))) {
          System.out.println("Lo siento, el código introducido no existe.");
        } else {
          album.remove(album.indexOf(new Disco(codigoIntroducido,"", "", "", 0)));
          System.out.println("Album borrado.");
        }
      case 5:
        salir = true;
        System.out.println("---FIN DEL PROGRAMA---");
        break;
      default:
        System.out.println("La opción seleccionada no es válida");
      }
    } while (!salir);
  }
}
