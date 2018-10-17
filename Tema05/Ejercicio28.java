package tema05;

/**
* Ejercicio 28 del Tema 5
* 
* Escribe un programa que calcule el factorial de un número entero leído por
* teclado.
* 
* @author Jorge García Molina
*/
import java.util.Scanner;

public class Ejercicio28 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Calcular el factorial de un número");
    // Pedir el número al usuario
    System.out.print("Introduzca un número entero: ");
    int numero = Integer.parseInt(s.nextLine());
    
    //Calcular el factorial
    int numero2 = numero, factorial = 1;
    while ( numero2 > 0) {
      factorial *= numero2;
      numero2--;
    }
    System.out.println(numero + "! = " + factorial);
  }
}
