package tema07.ArraysBidimensionales;
import java.util.Scanner;

/**
 * Ejercicio 09 del Tema 07 (Arrays bidimensionales)
 *
 * Realiza un programa que sea capaz de rotar todos los elementos de una matriz
 * cuadrada una posición en el sentido de las agujas del reloj. La matriz debe
 * tener 12 filas por 12 columnas y debe contener números generados al azar
 * entre 0 y 100. Se debe mostrar tanto la matriz original como la matriz
 * resultado, ambas con los números convenientemente alineados.
 *
 * @author Jorge García Molina
 */
public class Ejercicio09 {

  public static void main(String[] args) throws InterruptedException {
    Scanner s = new Scanner(System.in);
    System.out.println("Desplazamiento de números de un  array bidimensional");
    System.out.println();

    //Generar el array y su contenido
    final int F = 12;
    final int C = 12;
    int[][] datos = new int[F][C];
    int aux1, aux2, capa, i, j;
    System.out.println("Array original.");
    for (i = 0; i < F; i++) {
      for (j = 0; j < C; j++) {
        datos[i][j] = (int)(Math.random() * 101);
        System.out.printf("%4d ", datos[i][j]);
      }
      System.out.println();
    }
    System.out.println("");
    
    //Rotar el array
    for(capa = 0; capa < 6; capa++) {
      aux1 = datos[capa][(F - 1) - capa];
      for (i = (F - 1) - capa; i > capa; i--) {
        datos[capa][i] = datos[capa][i - 1];
      }
      
      aux2 = datos[(F - 1) - capa][(F - 1) - capa];
      for (i = (F - 1) - capa; i > capa + 1; i--) {
        datos[i][(F - 1) - capa] = datos[i - 1][(F - 1) - capa];
      }
      datos[capa + 1][(F - 1) - capa] = aux1;
      
      aux1 = datos[(F - 1) - capa][capa];
      for (i = capa; i < (F - 1) - capa - 1; i++) {
        datos[(F - 1) - capa][i] = datos[(F - 1) - capa][i + 1];
      }
      datos[(F - 1) - capa][(F - 1) - capa - 1] = aux2;
      
      for (i = capa; i < (F - 1) - capa - 1; i++) {
        datos[i][capa] = datos[i + 1][capa];
      }
      datos[(F - 1) - capa - 1][capa] = aux1;
    } 
    
    //Mostrar el array rotado
    System.out.println("Array rotado.");
    for (i = 0; i < F; i++) {
      for (j = 0; j < C; j++) {
        System.out.printf("%4d ", datos[i][j]);
      }
      System.out.println();
    }
  }
}