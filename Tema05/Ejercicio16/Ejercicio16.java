
import java.util.Scanner;

/**
* Ejercicio 16 del Tema 5
* 
* Escribe un programa que diga si un número introducido por teclado es o no
* primo. Un número primo es aquel que sólo es divisible entre él mismo y la
* unidad.
* 
* @author Jorge García Molina
*/

public class Ejercicio16 { 
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Comprobar si un número es primo o no.");
    //Pedir el número
    System.out.print("Introduzca un número entero: ");
    int numero = Integer.parseInt(s.nextLine());
    
    //Comprobar si es primo
    boolean primo = true;
    for (int i = 2; i < numero; i++){
      if ((numero % i) == 0) {
        primo = false;
      }
    }
    if (primo) {
      System.out.print("El número " + numero + " es primo.");
    } else {
      System.out.print("El número " + numero + " no es primo.");
    }
  }
}
