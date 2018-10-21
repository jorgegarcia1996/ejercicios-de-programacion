package tema05;

/**
* Ejercicio 36 del Tema 5
* 
* Escribe un programa que diga si un número introducido por teclado es o no
* capicúa. Los números capicúa se leen igual hacia delante y hacia atrás. El
* programa debe aceptar números de cualquier longitud siempre que lo permita
* el tipo, en caso contrario el ejercicio no se dará por bueno. Se recomienda usar
* long en lugar de int ya que el primero admite números más largos.
* 
* @author Jorge García Molina
*/
import java.util.Scanner;

public class Ejercicio36 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Comprobador de número capicúa");
    // Pedir el número al usuario
    System.out.print("Introduzca un número entero: ");
    long numero = Long.parseLong(s.nextLine());
    
    //Comprobar si el número es capicúa o no
    long volteado = 0, numero2 = numero;
    while (numero2 > 0) {
      volteado = (volteado * 10) + (numero2 % 10);
      numero2 /= 10;
    }
    if (numero == volteado) {
      System.out.println("El número " + numero + " es capicúa.");
    } else {
      System.out.println("El número " + numero + " no es capicúa.");
    }
  }
}