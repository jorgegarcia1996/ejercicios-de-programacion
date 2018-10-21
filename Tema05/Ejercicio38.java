package tema05;

/**
* Ejercicio 38 del Tema 5
* 
* Realiza un programa que pinte un reloj de arena relleno hecho de asteriscos.
* El programa debe pedir la altura. Se debe comprobar que la altura sea un
* número impar mayor o igual a 3, en caso contrario se debe mostrar un mensaje
* de error.
* 
* @author Jorge García Molina
*/
import java.util.Scanner;

public class Ejercicio38 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Reloj de arena.");
    // Pedir la altura de la letra
    System.out.print("Introduzca la altura del reloj de arena (mínimo 3): ");
    int altura = Integer.parseInt(s.nextLine());
    
    //Calcular y mostrar la letra
    if (altura < 3 || (altura % 2) == 0) {
      System.out.println("La altura debe ser un número impar mayor que 3.");
    } else {
      int espacios = altura - 2;
      int espExt = 0;
      while (espacios > 0) {
        for (int i = 0; i <= espExt ; i++) {
          System.out.print(" ");
        }
        System.out.print("*");
        for ( int j = 0; j < espacios; j++) {
          System.out.print("*");
        }
        System.out.println("*");
        espacios -= 2;
        espExt++;
      }
      for (int i = 0; i <= espExt ; i++) {
        System.out.print(" ");
      }
      System.out.println("*");
      while (espacios != (altura - 2)) {
        espExt--;
        for (int i = 0; i <= espExt ; i++) {
          System.out.print(" ");
        }
        System.out.print("**");
        for (int j = 0; j <= espacios; j++) {
          System.out.print("*");
        }
        System.out.println("*");
        espacios += 2;
      }
    }
  }
}