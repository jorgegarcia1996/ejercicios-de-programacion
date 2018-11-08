package tema07;

import java.util.Scanner;

/**
 * Ejercicio 09 del Tema 07
 *
 * Realiza un programa que pida 8 números enteros y que luego muestre esos
 * números junto con la palabra “par” o “impar” según proceda.
 *
 * @author Jorge García Molina
 */
public class Ejercicio09 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Detector de pares e impares");
    System.out.println();

    //Crear el array con los datos de usuario
    final int N = 8;
    int[] numeros = new int[N];
    for (int i = 0; i < N; i++) {
      System.out.print("Introduzca un número entero y pulse 'INTRO': ");
      int numero = Integer.parseInt(s.nextLine());
      numeros[i] = numero;
    }
    System.out.println();
    //Detectar los pares e impares de los datos
    System.out.println("Los datos introducidos son:");
    for (int elemento : numeros) {
      if (elemento % 2 == 0) {
        System.out.printf("%5d --> %-5s\n",elemento, "PAR");
      } else {
        System.out.printf("%5d --> %-5s\n",elemento, "IMPAR");
      }
    }
  }
}