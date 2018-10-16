package tema05;

/**
* Ejercicio 26 del Tema 5
* 
* Realiza un programa que pida primero un número y a continuación un dígito.
* El programa nos debe dar la posición (o posiciones) contando de izquierda a
* derecha que ocupa ese dígito en el número introducido.
* 
* @author Jorge García Molina
*/
import java.util.Scanner;

public class Ejercicio26 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("posiciones de un dígito concreto");
    // Pedir los datos al usuario
    System.out.print("Introduzca un número entero: ");
    int numero = Integer.parseInt(s.nextLine());
    System.out.print("Introduzca un dígito: ");
    int digito = Integer.parseInt(s.nextLine());
    
    //Decir en la posicion o posiciones en las que se encuentra el dígito
    int numero2 = numero, numeroReves = 0, posicion = 1;
    
    while (numero2 > 0) {
      numeroReves = (numeroReves * 10) + (numero2 % 10);
      numero2 /= 10;
    }
    
    System.out.print("El número " + digito + " aparece en las posiciones: ");
    while (numeroReves > 0) {
      if ((numeroReves % 10) == digito) {
        System.out.print(posicion + " ");
      }
      numeroReves /= 10;
      posicion++;
    }
  }
}