/**
* Ejercicio 17 del Tema 4
* 
* Escribe un programa que diga cuál es la última cifra de un número entero
* introducido por teclado.
* 
* @author Jorge García Molina
*/

public class Ejercicio17 {
  public static void main(String[] args) {
    //Pedir un número entero
    System.out.println("Introduce un número entero y separa la última cifra.");
    System.out.print("Introduce el número entero: ");
    int numero = Integer.parseInt(System.console().readLine());
    
    //Seperar la última cifra del número
    int ultimaCifra = numero % 10;
    System.out.print("La última cifra del número " + numero + " es: " + ultimaCifra);
  }
}
