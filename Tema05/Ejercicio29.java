package tema05;

/**
* Ejercicio 29 del Tema 5
* 
* Escribe un programa que muestre por pantalla todos los números enteros
* positivos menores a uno leído por teclado que no sean divisibles entre otro
* también leído de igual forma.
* 
* @author Jorge García Molina
*/
import java.util.Scanner;

public class Ejercicio29 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Mostrar numeros no divisibles");
    // Pedir los números al usuario
    System.out.print("Introduzca un número entero: ");
    int numero = Integer.parseInt(s.nextLine());
    System.out.print("Introduzca un número enteromenor que el anterior: ");
    int numero2 = Integer.parseInt(s.nextLine());
    
    //Calcular los números no divisibles
    int i = numero - 1;
    System.out.print("Los números menores de " + numero + " que no son");
    System.out.println(" divisibles entre " + numero2 + " son: ");
    while (i > 0) {
      if ((i % numero2) != 0) {
        System.out.print(i + " ");
      }
      i--;
    }
    System.out.println();
  }
}
