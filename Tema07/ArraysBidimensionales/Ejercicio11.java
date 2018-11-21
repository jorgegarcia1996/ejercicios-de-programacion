package tema07.ArraysBidimensionales;

/**
 * Ejercicio 11 del Tema 07 (Arrays bidimensionales)
 *
 * Realiza un programa que muestre por pantalla un array de 10 filas por 10
 * columnas relleno con números aleatorios entre 200 y 300. A continuación, el
 * programa debe mostrar los números de la diagonal que va desde la esquina
 * superior izquierda a la esquina inferior derecha, así como el máximo, el
 * mínimo y la media de los números que hay en esa diagonal.
 *
 * @author Jorge García Molina
 */
public class Ejercicio11 {

  public static void main(String[] args) throws InterruptedException {
    System.out.println("Array bidimensional (10 * 10), diagonal '\\' y calculos de la diagonal");
    System.out.println();

    //Crear el array
    final int F = 10;
    final int C = 10;
    int[][] num = new int[F][C];
    int[] diagonal = new int[F];
    int fila = 0, columna = 0;
    int maximo = Integer.MIN_VALUE, minimo = Integer.MAX_VALUE;
    int suma = 0, media = 0;
    for(fila = 0; fila < F; fila++) {
      for(columna = 0; columna < C; columna++) {
        num[fila][columna] = (int)((Math.random() * 101) + 200);
        System.out.print(num[fila][columna] + " ");
      }
      System.out.println();
    }
    System.out.println();
    
    //Sacar los números de la diagonal
    System.out.print("Los números de la diagonal son: ");
    for(fila = 0; fila < F; fila++) {
      for(columna = 0; columna < C; columna++) {
        if (columna - fila == 0) {
          diagonal[columna] = num[fila][columna];
          System.out.print(diagonal[columna] + " ");
          suma += diagonal[columna];
          if (diagonal[columna] < minimo) {
            minimo = diagonal[columna];
          } else if (diagonal[columna] > maximo) {
            maximo = diagonal[columna];
          }
        }
      }
    }
    System.out.println();
    System.out.println("El máximo es: " + maximo);
    System.out.println("El minimo es: " + minimo);
    System.out.println("La media es: " + (suma / C));
  }
}