package tema05;

/**
* Ejercicio 24 del Tema 5
* 
* Escribe un programa que lea un número n e imprima una pirámide de números
con n filas como en la siguiente figura:
* 
*    1
*   121
*  12321
* 1234321
* 
* @author Jorge García Molina
*/
import java.util.Scanner;

public class Ejercicio24 {
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
