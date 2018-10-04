/**
* Ejercicio 14 del Tema 4
* 
* Realiza un programa que diga si un número introducido por teclado es par y/o 
* divisible entre 5.
* 
* @author Jorge García Molina
*/

public class Ejercicio14 {
  public static void main(String[] args) {
    //Pedir un número entero
    System.out.println("Introduce un número entero y averigua si es par y/o divisible entre 5.");
    System.out.print("Introduce el número entero: ");
    int numero = Integer.parseInt(System.console().readLine());
    
    // Comprobar si el númer es par
    int par = numero % 2;
    if (par > 0) {
      System.out.println("El número " + numero + " es impar." );
    } else {
      System.out.println("El número " + numero + " es par.");
    }
    
    //Comprobar si el número es divisible enntre 5
    int divisible5 = numero % 5;
    if (divisible5 > 0) {
      System.out.println("El número " + numero + " no es divisible entre 5." );
    } else {
      System.out.println("El número " + numero + " es divisible entre 5.");
    }
  }
}
