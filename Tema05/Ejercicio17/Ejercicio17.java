/**
* Ejercicio 17 del Tema 5
* 
* Realiza un programa que sume los 100 números siguientes a un número entero
* y positivo introducido por teclado. Se debe comprobar que el dato introducido
* es correcto (que es un número positivo).
* 
* @author Jorge García Molina
*/
import java.util.Scanner;

public class Ejercicio17 { 
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Sumar los 100 siguientes números a partir del número introducido.");
    //Pedir el número
    System.out.print("Introduzca un número entero positivo: ");
    int numero = Integer.parseInt(s.nextLine());
    
    //Comprobar si es positivo o no y realizar la suma
    if (numero >= 0) {
      int suma = 0, numero2 = 0;
      for (int i = 0; i < 100; i++) {
        numero2 = numero + i;
        suma = suma + numero2;
      }
      System.out.print("La suma de los 100 siguientes números aĺ '" + numero);
      System.out.print("' es: " + suma);
    } else {
      System.out.print("El número '" + numero + "' no es positivo.");
    }
  }
}
