package tema05;

/**
* Ejercicio 31 del Tema 5
* 
* Realiza un programa que pinte la letra L por pantalla hecha con asteriscos. El
* programa pedirá la altura. El palo horizontal de la L tendrá una longitud de
* la mitad (división entera entre 2) de la altura más uno.
* 
* @author Jorge García Molina
*/
import java.util.Scanner;

public class Ejercicio31 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Mostrar la letra 'L'");
    // Pedir la altura de la letra
    System.out.print("Introduzca la altura de la letra: ");
    int altura = Integer.parseInt(s.nextLine());
    
    //Calcular y mostrar el resultado
    for (int i = 1; i < altura; i++) {
      System.out.println("*");
    }
    int baseL = (altura / 2) + 1;
    for (int i = 0; i < baseL; i++) {
      System.out.print("* ");
    }
    System.out.println();
  }
}
