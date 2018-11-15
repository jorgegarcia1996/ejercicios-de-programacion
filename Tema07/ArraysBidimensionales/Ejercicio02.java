package tema07.ArraysBidimensionales;
import java.util.Scanner;

/**
 * Ejercicio 02 del Tema 07 (Arrays bidimensionales)
 *
 * Define un array de 12 números enteros con nombre num y asigna los valores
 * según la tabla que se muestra a continuación. Muestra el contenido de todos
 * los elementos del array. ¿Qué sucede con los valores de los elementos que no
 * han sido inicializados?
 *
 * @author Jorge García Molina
 */
public class Ejercicio02 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Array bidimensional (4 * 5) y totales");
    System.out.println();

    //Crear el array
    final int F = 4;
    final int C = 5;
    int[][] num = new int[F][C];
    for (int i = 0; i < F; i++) {
      System.out.println("Datos de la fila " + i);
      for (int j = 0; j < C; j++) {
        System.out.print("Introduzca un número entero: ");
        num[i][j] = Integer.parseInt(s.nextLine());
      }
      System.out.println();
    }
    //Mostrar los datos del array
    System.out.print("Índice: ");
    for (int j = 0; j < C; j++) {
      System.out.printf("%4d |", j);
    }
    System.out.println();
    System.out.println("--------------------------------------------");
    for (int i = 0; i < F; i++) {
      System.out.print("Fila " + i + ": ");
      for (int j = 0; j < C; j++) {
        System.out.printf("%4d |", num[i][j]);
      }
      System.out.println();
    }
  }
}