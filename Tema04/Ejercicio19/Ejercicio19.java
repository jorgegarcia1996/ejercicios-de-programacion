/**
* Ejercicio 19 del Tema 4
* 
* Escribe un programa que diga cuántos dígitos tiene un número entero
* que puede ser positivo o negativo. Se permiten números de hasta 5 cifras.
* 
* @author Jorge García Molina
*/

public class Ejercicio19 {
  public static void main(String[] args) {
    //Pedir un número entero
    System.out.println("Introduce un número entero y separa la primera cifra.");
    System.out.print("Introduce el número entero (máximo 5 cifras): ");
    int numero = Integer.parseInt(System.console().readLine());
    
    //Seperar el último número
    if (numero > 99999 || numero < -99999) {
      System.out.print("El número introducido tiene más de 5 cifras.");
    } else if (numero > 9999 || numero < -9999) {
      System.out.print("El número " + numero + " tiene 5 cifras.");
    } else if (numero > 999 || numero < -999) {
      System.out.print("El número " + numero + " tiene 4 cifras.");
    } else if (numero > 99 || numero < -99) {
      System.out.print("El número " + numero + " tiene 3 cifras.");
    } else if (numero > 9 || numero < -9) {
      System.out.print("El número " + numero + " tiene 2 cifras.");
    } else {
      System.out.print("El número " + numero + " solo tiene una cifra.");
    }
  }
}
