package tema05;

/**
* Ejercicio 41 del Tema 5
* 
* Escribe un programa que diga cuántos dígitos pares y cuántos dígitos impares
* hay dentro de un número. Se recomienda usar long en lugar de int ya que el
* primero admite números más largos.
* 
* @author Jorge García Molina
*/
import java.util.Scanner;

public class Ejercicio41 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Contar cifras pares e impares");
    // Pedir un número al usuario
    System.out.print("Introduzca un número entero positivo: ");
    long numero = Long.parseLong(s.nextLine());
    
    //Calcular y mostrar los factoriales
    long numero2 = numero;
    int par = 0, impar = 0;
    if (numero < 0) {
        System.out.println("Debe introducir un número entero positivo.");  
    } else {
      while (numero2 > 0) {
        if ((numero2 % 2) == 0) {
          par++;
        } else {
          impar++;
        }
        numero2 /= 10;
      }
      System.out.println("El número " + numero + " tiene " + par + " cifras pares"
              + " y " + impar + " cifras impares.");
    }
  }
}