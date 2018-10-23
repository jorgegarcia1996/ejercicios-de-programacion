package tema05;

import java.util.Scanner;

/**
 * Ejercicio 48 del Tema 5
 *
 * Realiza un programa que diga los dígitos que aparecen y los que no aparecen
 * en un número entero introducido por teclado. El orden es el que se muestra en
 * los ejemplos. Utiliza el tipo long para que el usuario pueda introducir
 * números largos.
 *
 * @author Jorge García Molina
 */
public class Ejercicio48 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Detector de cifras.");
    //Pedir el número
    System.out.print("Introduzca un número entero: ");
    long numero = Long.parseLong(s.nextLine());

    //Insertar el dígito en la posición indicada
    System.out.print("Números encontrados: ");
    for (int i = 0; i < 10; i++) {
      long numero2 = numero;
      boolean encontrado = false;
      while (numero2 > 0) {
        if (numero2 % 10 == i) {
          encontrado = true;
        }
        numero2 /= 10;
      }
      if (encontrado) {
         System.out.print(i + " ");
      }
    }
    System.out.println();
    System.out.print("Números no encontrados: ");
    for (int i = 0; i < 10; i++) {
      long numero2 = numero;
      boolean encontrado = false;
      while (numero2 > 0) {
        if (numero2 % 10 == i) {
          encontrado = true;
        }
        numero2 /= 10;
      }
      if (!encontrado) {
        System.out.print(i + " ");
      }
    }
    System.out.println();
  }
}
