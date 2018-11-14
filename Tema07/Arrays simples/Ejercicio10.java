package tema07;

import java.util.Scanner;

/**
 * Ejercicio 10 del Tema 07
 *
 * Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100 y
 * que los almacene en un array. El programa debe ser capaz de pasar todos los
 * números pares a las primeras posiciones del array (del 0 en adelante) y todos
 * los números impares a las celdas restantes. Utiliza arrays auxiliares si es
 * necesario.
 *
 * @author Jorge García Molina
 */
public class Ejercicio10 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Ordenar 20 números, pares a la izquierda y impares a la derecha");
    System.out.println();

    //Crear el array y generar los números
    final int N = 20;
    int[] numerosDesordenados = new int[N];
    System.out.print("Números generados: ");
    for (int i = 0; i < N; i++) {
      numerosDesordenados[i] = (int)(Math.random() * 101);
      System.out.print(numerosDesordenados[i] + " ");
    }
    System.out.println();
    //Ordenar los números en otro array y mostrar el resultado
    int[] numerosOrdenados = new int[N];
    int posPar = N -1;
    int posImpar = 0;
    for (int i = 0; i < N; i++) {
      if (numerosDesordenados[i] % 2 == 0) {
        numerosOrdenados[posPar] = numerosDesordenados[i];
        posPar--;
      } else {
        numerosOrdenados[posImpar] = numerosDesordenados[i];
        posImpar++;
      }
    }
    System.out.println();
    System.out.print("Números ordenados: ");
    for (int elemento : numerosOrdenados) {
      System.out.print(elemento + " ");
    }
    System.out.println();
  }
}