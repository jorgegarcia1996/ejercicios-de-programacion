package tema05;

/**
* Ejercicio 42 del Tema 5
* 
* Escribe un programa que pida un número entero positivo por teclado y que
* muestre a continuación los 5 números consecutivos a partir del número
* introducido. Al lado de cada número se debe indicar si se trata de un primo o
* no.
* 
* @author Jorge García Molina
*/
import java.util.Scanner;

public class Ejercicio42 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Primos 5 números por delante");
    // Pedir el número al usuario
    System.out.print("Introduzca un número entero positivo: ");
    int numero = Integer.parseInt(s.nextLine());
    
    //Comprobar los 5 números a partir del introducido si son primos
    for (int j = 0; j < 5; j++) {
      boolean primo = true;
      for (int i = 2; i < numero; i++){
        if ((numero % i) == 0) {
          primo = false;
        }
      }
      if (primo) {
        System.out.println("El número " + numero + " es primo.");
      } else {
        System.out.println("El número " + numero + " no es primo.");
      }
      numero++;
    }
  }
}