package tema05;

/**
* Ejercicio 32 del Tema 5
* 
* Escribe un programa que, dado un número entero positivo, diga cuáles son y
* cuánto suman los dígitos pares. Los dígitos pares se deben mostrar en orden,
* de izquierda a derecha. Usa long en lugar de int donde sea necesario para
* admitir números largos.
* 
* @author Jorge García Molina
*/
import java.util.Scanner;

public class Ejercicio32 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Dígitos pares de un número");
    // Pedir un número entero positivo
    System.out.print("Introduzca un número entero positivo: ");
    long numero = Long.parseLong(s.nextLine());
    
    //Calcular y mostrar el resultado
    if (numero < 0) {
      System.out.println("el número debe ser positivo.");
    } else {
      long numero2 = numero;
      long volteado = 0;
      int sumaPares = 0;
      while (numero2 > 0) {
        volteado = (volteado * 10) + (numero2 % 10);
        numero2 /= 10;
      }
      System.out.print("Las cifras pares del número " + numero + " son: ");
      while (volteado > 0) {
        if ((volteado % 10) % 2 == 0 ) {
          System.out.print((volteado % 10) + " ");
          sumaPares += volteado % 10;
        }
        volteado /= 10;
      }
      System.out.println();
      System.out.println("La suma de las cifras pares es: " + sumaPares);
    }
  }
}