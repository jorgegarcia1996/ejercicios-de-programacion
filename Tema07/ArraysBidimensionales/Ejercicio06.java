package tema07.ArraysBidimensionales;
import java.util.Scanner;

/**
 * Ejercicio 06 del Tema 07 (Arrays bidimensionales)
 *
 * Modifica el programa anterior de tal forma que no se repita ningún número en
 * el array.
 *
 * @author Jorge García Molina
 */
public class Ejercicio06 {

  public static void main(String[] args) throws InterruptedException {
    Scanner s = new Scanner(System.in);
    System.out.println("Posición de máximo y mínimo");
    System.out.println();

    //Crear el array
    final int F = 6;
    final int C = 10;
    int[][] num = new int[F][C];
    int fila = 0, columna = 0;
    int maximo = Integer.MIN_VALUE;
    int minimo = Integer.MAX_VALUE;
    boolean repetido = false;
    int[] posMax = new int[2];
    int[] posMin = new int[2];
    for(fila = 0; fila < F; fila++) {
      for(columna = 0; columna < C; columna++) {
        do {
        num[fila][columna] = (int)(Math.random() * 1001);
        repetido = false;
          for (int i = 0; i < C * fila + columna; i++) {
            if (num[fila][columna] == num[i / 10][i % 10]) {
              repetido = true;
            }
          }
        } while (repetido);
      }
    }

    // Muestra los datos y calcula la posición del máximo y el mínimo
    for(fila = 0; fila < F; fila++) {
      for(columna = 0; columna < C; columna++) {
        System.out.printf("%7d   |", num[fila][columna]);
        if (num[fila][columna] < minimo) {
          minimo = num[fila][columna];
          posMin[0] = fila;
          posMin[1] = columna;
        } else  if (num[fila][columna] > maximo) {
          maximo = num[fila][columna];
          posMax[0] = fila;
          posMax[1] = columna;
        }
      }
      System.out.println();
    }
    //Muestra la posición del máximo y el mínimo
      System.out.println();
      System.out.println("El máximo está en la columna " + (posMax[1] + 1)
              + " y fila " + (posMax[0] + 1));
      System.out.println("El mínimo está en la columna " + (posMin[1] + 1)
              + " y fila " + (posMin[0] + 1));
  }
}