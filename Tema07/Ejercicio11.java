package tema07;

import java.util.Scanner;

/**
 * Ejercicio 11 del Tema 07
 *
 * Realiza un programa que pida 10 números por teclado y que los almacene en un
 * array. A continuación se mostrará el contenido de ese array junto al índice
 * (0 – 9) utilizando para ello una tabla. Seguidamente el programa pasará los
 * primos a las primeras posiciones, desplazando el resto de números (los que no
 * son primos) de tal forma que no se pierda ninguno. Al final se debe mostrar
 * el array resultante.
 *
 * @author Jorge García Molina
 */
public class Ejercicio11 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Array de 10 números, primos los primeros");
    System.out.println();

    //Crear el array y pedir los datos al usuario
    final int N = 10;
    int[] numerosDesordenados = new int[N];
    for (int i = 0; i < N; i++) {
      System.out.print("Introduzca un número entero, luego pulse 'INTRO': ");
      numerosDesordenados[i] = Integer.parseInt(s.nextLine());
    }
    System.out.println();
    //Ordenar los números del array
    int[] numerosOrdenados = new int[N];
    int siPrimo = 0, noPrimo = N - 1;
    for (int i = 0; i < N; i++) {
      boolean primo = true;
      for (int j = 2; j < numerosDesordenados[i]; j++) {
        if (numerosDesordenados[i] % j == 0) {
          primo = false;
        }
      }
      if (primo) {
        numerosOrdenados[siPrimo] = numerosDesordenados[i];
        siPrimo++;
      } else {
        numerosOrdenados[noPrimo] = numerosDesordenados[i];
        noPrimo--;
      }
    }
    //Mostrar la tabla con los valores del array y los índices
    System.out.print("Índices: ");
    for (int i = 0; i < N; i++) {
      System.out.printf("%5d |", i);
      
    }
    System.out.println();
    System.out.print("Valores: ");
    for (int elemento : numerosOrdenados) {
      System.out.printf("%5d |", elemento);
    }
    System.out.println();
  }
}
