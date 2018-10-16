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
    System.out.println("Numeros hasta 10000.");
    //Pedir el primer número
    System.out.print("Introduzca un número entero:");
    int numero = Integer.parseInt(s.nextLine());
    
    //Calcular los números y pedir el siguiente
    int sumaNumeros = 0, numeroNumeros = 0;
    double media = 0;
    
  }
}
