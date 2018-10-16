package tema05;
/**
* Ejercicio 23 del Tema 5
* 
* Escribe un programa que permita ir introduciendo una serie indeterminada
* de números mientras su suma no supere el valor 10000. Cuando esto último
* ocurra, se debe mostrar el total acumulado, el contador de los números
* introducidos y la media.
* 
* @author Jorge García Molina
*/

import java.util.Scanner;

public class Ejercicio23 { 
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Numeros hasta 10.000.");
    //Pedir el primer número
    System.out.print("Introduzca un número entero:");
    int numero = Integer.parseInt(s.nextLine());
    
    //Calcular los números y pedir el siguiente
    int sumaNumeros = numero, nNumeros = 1;
    double media;
    while (sumaNumeros < 10000) {
    System.out.print("Introduzca un número entero:");
    numero = Integer.parseInt(s.nextLine());
      sumaNumeros += numero;
      nNumeros++;
    }
    media = sumaNumeros / nNumeros;
    System.out.println("El total de los números introducidos es: " + sumaNumeros);
    System.out.println("Se han introducido " + nNumeros + " números.");
    System.out.printf("La media de los números introducidos es: %.2f", media);
  }
}
