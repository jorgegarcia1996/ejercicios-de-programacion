package tema06;

import java.util.Scanner;

/**
 * Ejercicio 24 del Tema 06
 *
 * Escribe un programa que, dado un número introducido por teclado, elija al
 * azar uno de sus dígitos.
 *
 * @author Jorge García Molina
 */
public class Ejercicio24 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Elegir dígito aleatorio.");
    System.out.print("Introduzca un número entero: ");
    long numero = Long.parseLong(s.nextLine());

    //Elegir un dígito aleatorio del número introducido
    long numero2 = numero, volteado = 0;
    int cifras = 0;
    while (numero2 > 0) {
      volteado = (volteado * 10) + (numero2 % 10);
      numero2 /= 10;
      cifras++;
    }
    int cifraAleatoria = (int)(Math.random() * cifras);
    for (int i = 0; i < cifras; i++) {
      if (i == cifraAleatoria) {
        System.out.println(volteado % 10);
      }
      volteado /= 10;
    }
  }
}