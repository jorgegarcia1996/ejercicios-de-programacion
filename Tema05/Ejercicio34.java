package tema05;

/**
* Ejercicio 34 del Tema 5
* 
* Escribe un programa que pida dos números por teclado y que luego mezcle en
* dos números diferentes los dígitos pares y los impares. Se van comprobando
* los dígitos de la siguiente manera: primer dígito del primer número, primer
* dígito del segundo número, segundo dígito del primer número, segundo
* dígito del segundo número, tercer dígito del primer número... Para facilitar
* el ejercicio, podemos suponer que el usuario introducirá dos números de la
* misma longitud y que siempre habrá al menos un dígito par y uno impar. Usa
* long en lugar de int donde sea necesario para admitir números largos.
* 
* @author Jorge García Molina
*/
import java.util.Scanner;

public class Ejercicio34 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Mezclador de números");
    // Pedir los números al usuario
    System.out.print("Introduzca el primer número: ");
    long numero1 = Long.parseLong(s.nextLine());
    System.out.print("Introduzca el segundo número: ");
    long numero2 = Long.parseLong(s.nextLine());
    
    //Calcular y mostrar la letra
    long volteado1 = 0, volteado2 = 0, pares = 0, impares = 0;
    while (numero1 > 0) {
      volteado1 = (volteado1 * 10) + (numero1 % 10);
      numero1 /= 10;
    }
    while (numero2 > 0) {
      volteado2 = (volteado2 * 10) + (numero2 % 10);
      numero2 /= 10;
    }
    while (volteado1 > 0) {
      if ((volteado1 %10) %2 == 0) {
        pares = (pares * 10) + (volteado1 % 10);
      } else {
        impares = (impares * 10) + (volteado1 % 10);
      }
      volteado1 /= 10;
      if ((volteado2 %10) %2 == 0) {
        pares = (pares * 10) + (volteado2 % 10);
      } else {
        impares = (impares * 10) + (volteado2 % 10);
      }
      volteado2 /= 10;
    }
    System.out.println("El número formado por los dígitos pares es: " + pares);
    System.out.println("El número formado por los dígitos impares es: " + impares);
  }
}