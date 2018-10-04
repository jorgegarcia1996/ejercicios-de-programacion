/**
* Ejercicio 18 del Tema 4
* 
* Escribe un programa que diga cuál es la primera cifra de un número entero
* introducido por teclado. Se permiten números de hasta 5 cifras.
* 
* @author Jorge García Molina
*/

public class Ejercicio18 {
  public static void main(String[] args) {
    //Pedir un número entero
    System.out.println("Introduce un número entero y separa la primera cifra.");
    System.out.print("Introduce el número entero (máximo 5 cifras): ");
    int numero = Integer.parseInt(System.console().readLine());
    
    //Seperar el último número
    if (numero > 99999) {
      System.out.print("El número introducido tiene más de 5 cifras.");
    } else if (numero > 9999) {
      int primeraCifra = (numero - (numero % 10000)) / 10000;
      System.out.print("La primera cifra del número " + numero + " es: " + primeraCifra);
    } else if (numero > 999) {
      int primeraCifra = (numero - (numero % 1000)) / 1000;
      System.out.print("La primera cifra del número " + numero + " es: " + primeraCifra);
    } else if (numero > 99) {
      int primeraCifra = (numero - (numero % 100)) / 100;
      System.out.print("La primera cifra del número " + numero + " es: " + primeraCifra);
    } else if (numero > 9) {
      int primeraCifra = (numero - (numero % 10)) / 10;
      System.out.print("La primera cifra del número " + numero + " es: " + primeraCifra);
    } else {
      System.out.print("El número " + numero + " solo tiene una cifra, la primera.");
    }
    
    
    //Otra forma de sacar la primera cifra del número
    //System.out.print("La última cifra del número " + numero + " es: " + numero.charAt(0));
  }
}
