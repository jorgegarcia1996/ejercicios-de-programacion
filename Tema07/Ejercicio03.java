package tema07;

import java.util.Scanner;

/**
 * Ejercicio 03 del Tema 07
 *
 * Escribe un programa que lea 10 números por teclado y que luego los muestre en
 * orden inverso, es decir, el primero que se introduce es el último en
 * mostrarse y viceversa.
 *
 * @author Jorge García Molina
 */
public class Ejercicio03 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Array de números introducidos por teclado y mostrarlos al revés");
    System.out.println();

    //Crear el array y guardar los datos
    int[] datos = new int[10];
    for (int i = 0; i < 10; i++) {
      System.out.print("Introduzca un número entero y pulse 'intro': ");
      int numero = Integer.parseInt(s.nextLine());
      datos[i] = numero;
    }
    
    //Mostrar los datos al revés
    System.out.print("Los datos introducidos son: ");
    for (int i = 9; i >= 0; i--) {
      System.out.print(datos[i] + " ");
    }
  }
}