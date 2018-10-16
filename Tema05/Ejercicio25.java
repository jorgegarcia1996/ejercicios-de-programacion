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
    System.out.println("Pirámide de números.");
    // Pedir un número al usuario
    System.out.print("Introduzca un número entero: ");
    int numero = Integer.parseInt(s.nextLine());
    
    //Crear y mostrar la pirámide
    for (int i = 1; i <= numero; i++) {
      int espacios = numero - i;
      for (int j = 1; j <= espacios; j++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= i; j++) {
        System.out.print(j);
      }
      for (int j = i - 1; j > 0; j--) {
        System.out.print(j);
      }
      System.out.println();
    }
  }
}
