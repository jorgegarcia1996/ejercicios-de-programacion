package tema07.ArraysBidimensionales;

/**
 * Ejercicio 12 del Tema 07 (Arrays bidimensionales)
 *
 * Realiza un programa que muestre por pantalla un array de 9 filas por 9
 * columnas relleno con números aleatorios entre 500 y 900. A continuación, el
 * programa debe mostrar los números de la diagonal que va desde la esquina
 * inferior izquierda a la esquina superior derecha, así como el máximo, el
 * mínimo y la media de los números que hay en esa diagonal.
 *
 * @author Jorge García Molina
 */
public class Ejercicio12 {

  public static void main(String[] args) throws InterruptedException {
    System.out.println("Array bidimensional (9 * 9), diagonal '/' y calculos de la diagonal");
    System.out.println();

    //Crear el array
    final int F = 9;
    final int C = 9;
    int[][] num = new int[F][C];
    int[] diagonal = new int[F];
    int fila = 0, columna = 0;
    int maximo = Integer.MIN_VALUE, minimo = Integer.MAX_VALUE;
    int suma = 0, media = 0;
    for(fila = 0; fila < F; fila++) {
      for(columna = 0; columna < C; columna++) {
        num[fila][columna] = (int)((Math.random() * 401) + 500);
        System.out.print(num[fila][columna] + " ");
      }
      System.out.println();
    }
    System.out.println();
    
    //Sacar los números de la diagonal
    for(fila = 0; fila < F; fila++) {
      for(columna = 0; columna < C; columna++) {
        if (columna - fila == 0) {
          diagonal[columna] = num[fila][C - 1 - columna];
          suma += diagonal[columna];
          if (diagonal[columna] < minimo) {
            minimo = diagonal[columna];
          } else if (diagonal[columna] > maximo) {
            maximo = diagonal[columna];
          }
        }
      }
    }
    System.out.print("Los números de la diagonal son: ");
    for (int i = C - 1; i >= 0; i--) {
      System.out.print(diagonal[i] + " ");
    }
    System.out.println();
    System.out.println("El máximo es: " + maximo);
    System.out.println("El minimo es: " + minimo);
    System.out.println("La media es: " + (suma / C));
  }
}