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
    int fila = 0, columna = 0;
    System.out.println("Por favor, introduzca los números (enteros) en el array");
    for(fila = 0; fila < F; fila++) {
      for(columna = 0; columna < 5; columna++) {
        System.out.print("Fila " + fila + ", columna " + columna + ": ");
        num[fila][columna] = Integer.parseInt(s.nextLine());
      }
    }
    System.out.println();

    // Muestra los datos y las sumas parciales de las filas
    int sumaFila = 0;
    for(fila = 0; fila < 4; fila++) {
      sumaFila = 0;
      for(columna = 0; columna < C; columna++) {
        System.out.printf("%7d   ", num[fila][columna]);
        sumaFila += num[fila][columna];
      }
      System.out.printf("|%7d\n", sumaFila);
    }
    
    // Muestra las sumas parciales de las columnas
    for(columna = 0; columna < C; columna++) {
      System.out.print("----------");
    }
    System.out.println("-----------");

    int sumaColumna = 0;
    int sumaTotal = 0;
    for(columna = 0; columna < C; columna++) {
      sumaColumna = 0;
      for(fila = 0; fila < F; fila++) {
        sumaColumna += num[fila][columna];
      }

      sumaTotal += sumaColumna;
      System.out.printf("%7d   ", sumaColumna);
    }
    System.out.printf("|%7d   ", sumaTotal);
  }
}