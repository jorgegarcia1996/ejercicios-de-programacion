package tema05;

/**
* Ejercicio 37 del Tema 5
* 
* Realiza un conversor del sistema decimal al sistema de “palotes”.
* Ejemplo: 12302 --> |-||-|||--||
* 
* @author Jorge García Molina
*/
import java.util.Scanner;

public class Ejercicio37 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Conversor de decimal a 'palotes'");
    // Pedir el número al usuario
    System.out.print("Introduzca un número entero: ");
    long numero = Long.parseLong(s.nextLine());
    
    //Comprobar si el número es capicúa o no
    long volteado = 0, numero2 = numero;
    while (numero2 > 0) {
      volteado = (volteado * 10) + (numero2 % 10);
      numero2 /= 10;
    }
    System.out.print("El número " + numero + " pasado a palotes es: ");
    while (volteado > 0) {
      long i = volteado % 10;
      while (i > 0) {
        System.out.print("|");
        i--;
      }
      if (volteado > 9) {
        System.out.print("-");
      }
      volteado /= 10;
    }
    System.out.println();
  }
}