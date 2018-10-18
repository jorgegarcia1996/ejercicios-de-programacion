package tema05;

/**
* Ejercicio 33 del Tema 5
* 
* Realiza un programa que pinte la letra U por pantalla hecha con asteriscos.
* El programa pedirá la altura. Fíjate que el programa inserta un espacio y
* pinta dos asteriscos menos en la base para simular la curvatura de las
* esquinas inferiores.
* 
* @author Jorge García Molina
*/
import java.util.Scanner;

public class Ejercicio33 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Letra U personalizada");
    // Pedir la altura de la letra
    System.out.print("Introduzca la altura de la letra U: ");
    int altura = Integer.parseInt(s.nextLine());
    
    //Calcular y mostrar la letra
    int espacios = altura - 2;
    for (int i = 1; i < altura; i++) {
      System.out.print("*");
      for (int k = 0; k < espacios; k++) {
        System.out.print(" ");
      }
      System.out.println("*");
    }
    System.out.print(" ");
    for (int i = 0; i < espacios; i++) {
      System.out.print("*");
    }
    System.out.println();
  }
}