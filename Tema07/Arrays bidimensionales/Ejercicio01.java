package tema07.ArraysBidimensionales;

/**
 * Ejercicio 01 del Tema 07 (Arrays bidimensionales)
 *
 * Define un array de 12 números enteros con nombre num y asigna los valores
 * según la tabla que se muestra a continuación. Muestra el contenido de todos
 * los elementos del array. ¿Qué sucede con los valores de los elementos que no
 * han sido inicializados?
 *
 * @author Jorge García Molina
 */
public class Ejercicio01 {

  public static void main(String[] args) {
    System.out.println("Array bidimensional (6*3)");
    System.out.println();

    //Crear el array
    final int C = 6;
    final int F = 3;
    int[][] num = new int[F][C];
    num[0][0] = 0;
    num[0][1] = 30;
    num[0][2] = 2;
    num[0][5] = 5;
    num[1][0] = 75;
    num[1][4] = 0;
    num[2][2] = -2;
    num[2][3] = 9;
    num[2][5] = 11;
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