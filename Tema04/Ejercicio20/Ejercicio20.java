/**
* Ejercicio 20 del Tema 4
* 
* Escribe un programa que diga si un número entero positivo introducido por
* teclado es capicúa. Se permiten números de hasta 5 cifras.
* 
* @author Jorge García Molina
*/

public class Ejercicio20 {
  public static void main(String[] args) {
    //Pedir un número entero
    System.out.println("Introduce un número entero y separa la primera cifra.");
    System.out.print("Introduce el número entero positivo (máximo 5 cifras): ");
    int numero = Integer.parseInt(System.console().readLine());
    
    //Comprobar si el número es capicúa
    if (numero < 0){
      System.out.print("El número introducino no es positivo.");
    } else if (numero > 99999) {
      System.out.print("El número introducino tiene más de 5 cifras.");
    } else if (numero > 9999) {
      if (((numero / 10000) == (numero % 10)) && ((numero / 1000) % 10) == ((numero / 10) % 10)) {
        System.out.print("El número " + numero + " es capicúa.");
      } else {
        System.out.print("El número " + numero + " no es capicúa.");
      }
    } else if (numero > 999) {
      if (((numero / 1000) == (numero % 10)) && ((( numero / 100 ) % 10)== (( numero / 10) % 10))) {
        System.out.print("El número " + numero + " es capicúa.");
      } else {
        System.out.print("El número " + numero + " no es capicúa.");
      }
    } else if (numero > 99) {
      if ((numero / 100) == (numero % 10)) {
        System.out.print("El número " + numero + " es capicúa.");
      } else {
        System.out.print("El número " + numero + " no es capicúa.");
      }
    } else if (numero > 9) {
      if ((numero / 10) == (numero % 10)) {
        System.out.print("El número " + numero + " es capicúa.");
      } else {
        System.out.print("El número " + numero + " no es capicúa.");
      }
    } else {
      System.out.print("El número " + numero + " es capicúa.");
    }
  }
}
