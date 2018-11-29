import funciones.FuncionesDeConversion;
import java.util.Scanner;

/**
 * Ejercicio 19 del tema 08
 * 
 * Une y amplía los dos programas anteriores de tal forma que se permita
 * convertir un número entre cualquiera de las siguientes bases: decimal,
 * binario, hexadecimal y octal.
 *
 * @author Jorge García Molina
 */
public class Ejercicio19 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String s1, s2, s3;
    int opcion = 0;
    boolean salir = false;
    do {
      System.out.println();
      System.out.println("Selecciona la funcion que quiere probar "
                  + "de la lista de abajo.");
      System.out.println("01.- Función 'convierteABinario'.");
      System.out.println("02.- Función 'convierteAOctal'.");
      System.out.println("03.- Función 'convierteADecimal'.");
      System.out.println("04.- Función 'convierteAHexadecimal'.");
      System.out.println("05.- Función 'convierte'.");
      System.out.println("06.- SALIR.");
      System.out.println();
      System.out.print("Elige una opción (1 - 6): ");
      opcion = Integer.parseInt(s.nextLine());
      System.out.println();
      switch (opcion) {
        case 1:
          System.out.println("Función 'convierteABinario'.");
          System.out.println("Funcion para pasar un número de octal (O), "
                  + "decimal (D) o hexadecimal (H) a binario");
          System.out.print("Introduzca un número entero: ");
          s1 = s.nextLine();
          System.out.print("Introduzca la base del número introducido (O - D - H): ");
          s2 = s.nextLine().toUpperCase();
          System.out.print("El número " + s1 + " pasado a binario es: " + 
                  FuncionesDeConversion.convierteABinario(s1, s2));
          break;
        case 2:
          System.out.println("Función 'convierteAOctal'.");
          System.out.println("Funcion para pasar un número de binario (B), "
                  + "decimal (D) o hexadecimal (H) a octal");
          System.out.print("Introduzca un número entero: ");
          s1 = s.nextLine();
          System.out.print("Introduzca la base del número introducido (B - D - H): ");
          s2 = s.nextLine().toUpperCase();
          System.out.println("El número " + s1 + " pasado a octal es: " + 
                  FuncionesDeConversion.convierteAOctal(s1, s2));
          break;
        case 3:
          System.out.println("Función 'convierteADecimal'.");
          System.out.println("Funcion para pasar un número de binario (B), "
                  + "octal (O) o hexadecimal (H) a decimal");
          System.out.print("Introduzca un número entero: ");
          s1 = s.nextLine();
          System.out.print("Introduzca la base del número introducido (B - O - H): ");
          s2 = s.nextLine().toUpperCase();
          System.out.println("El número " + s1 + " pasado a decimal es: " + 
                  FuncionesDeConversion.convierteADecimal(s1, s2));
          break;
        case 4:
          System.out.println("Función 'convierteAHexadecimal'.");
          System.out.println("Funcion para pasar un número de binario (B), "
                  + "octal (O) o decimal (D) a hexadecimal");
          System.out.print("Introduzca un número entero: ");
          s1 = s.nextLine();
          System.out.print("Introduzca la base del número introducido (B - O - D): ");
          s2 = s.nextLine().toUpperCase();
          System.out.println("El número " + s1 + " pasado a hexadecimal es: " + 
                  FuncionesDeConversion.convierteAHexadecimal(s1, s2));
          break;
        case 5:
          System.out.println("Función 'convierte'.");
          System.out.println("Funcion para convertir un número binario (B), "
                  + "decimal (D), octal (O) o hexadecimal (H) a otro sistema de esos cuatro");
          System.out.print("Introduzca un número entero: ");
          s1 = s.nextLine();
          System.out.print("Introduzca la base del número introducido (B - O - D - H): ");
          s2 = s.nextLine().toUpperCase();
          System.out.print("Introduzca la base a la que quieres convertir el número (B - O - D - H): ");
          s3 = s.nextLine().toUpperCase();
          System.out.println("El número " + s1 + " pasado a '" + s3 + "' es: " + 
                  FuncionesDeConversion.convierte(s1, s2, s3));
          break;
        case 6:
          salir = true;
          break;
        default:
          System.out.println("La opción seleccionada no es válida.");
      }
    } while(!salir);
  }
}