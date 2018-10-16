package tema05;

/**
* Ejercicio 25 del Tema 5
* 
* Realiza un programa que pida un número por teclado y que luego muestre ese
* número al revés.
* 
* @author Jorge García Molina
*/
import java.util.Scanner;

public class Ejercicio25 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Número del revés");
    // Pedir un número al usuario
    System.out.print("Introduzca un número entero: ");
    int numero = Integer.parseInt(s.nextLine());
    
    //Dar la vuelta al número y mostrar el resultado
    int numero2 = numero;
    int numeroReves = 0;
    while (numero2 > 0) {
      numeroReves = (numeroReves * 10) + (numero2 % 10);
      numero2 /= 10;
    }
    System.out.println("El número " + numero + " al revés es: " + numeroReves);
  }
}
