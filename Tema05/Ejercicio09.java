package tema05;
/**
* Ejercicio 09 del Tema 5
* 
* Realiza un programa que nos diga cuántos dígitos tiene un número introducido
* por teclado. Este ejercicio es equivalente a otro realizado anteriormente, con
* la salvedad de que el anterior estaba limitado a números de 5 dígitos como
* máximo. En esta ocasión, hay que realizar el ejercicio utilizando bucles; de
* esta manera, la única limitación en el número de dígitos la establece el tipo
* de dato que se utilice (int o long).
* 
* @author Jorge García Molina
*/

import java.util.Scanner;

public class Ejercicio09 {
  public static void main(String[] args) {
    System.out.println("Contador de cifras.");
    //Pedir el número
    System.out.print("Introduzca un número para contar el número de cifras que tiene: ");
    Scanner s = new Scanner(System.in);
    int numero = Integer.parseInt(s.nextLine());
    
    //Contar las cifras del número
    int cifras = 0;
    if (numero != 0) {
      while (numero != 0) {
        numero = numero / 10;
        cifras++;
      }
    } else {
      cifras = 1;
    }
    System.out.println("El número tiene " + cifras + " cifras.");
  }
}
