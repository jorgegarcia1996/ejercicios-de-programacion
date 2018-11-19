package tema07.ArraysBidimensionales;
import java.util.Scanner;

/**
 * Ejercicio 04 del Tema 07 (Arrays bidimensionales)
 *
 * Modifica el programa anterior de tal forma que las sumas parciales y la suma
 * total aparezcan en la pantalla con un pequeño retardo, dando la impresión de
 * que el ordenador se queda “pensando” antes de mostrar los números.
 *
 * @author Jorge García Molina
 */
public class Ejercicio04 {

  public static void main(String[] args) throws InterruptedException {
    Scanner s = new Scanner(System.in);
    System.out.println("Array bidimensional (4 * 5) y totales <con retardo y números aleatorios>");
    System.out.println();

    //Crear el array
    final int F = 4;
    final int C = 5;
    int[][] num = new int[F][C];
    int fila = 0, columna = 0;
    for(fila = 0; fila < F; fila++) {
      for(columna = 0; columna < 5; columna++) {
        num[fila][columna] = (int)((Math.random() * 900) + 100);
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
      Thread.sleep(1000);
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
      Thread.sleep(1000);
      System.out.printf("%7d   ", sumaColumna);
    }
    Thread.sleep(3000);
    System.out.printf("|%7d   ", sumaTotal);
  }
}