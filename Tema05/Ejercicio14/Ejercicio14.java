/**
* Ejercicio 14 del Tema 5
* 
* Escribe un programa que pida una base y un exponente (entero positivo) y
* que calcule la potencia.
* 
* @author Jorge García Molina
*/

public class Ejercicio14 {
  public static void main(String[] args) {
    System.out.println("Hacer una potencia a partir de 2 números enteros positivos.");
    //Pedir el número
    System.out.print("Introduzca la base: ");
    int base = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca el exponente: ");
    int exponente = Integer.parseInt(System.console().readLine());
    
    //hacer la potencia
    int i = 1;
    int resultado = base;
    while (i < exponente) {
      resultado = resultado * base;
      i++;
    }
    System.out.print("El resultado de hacer la potencia de " + base + " elevado a ");
    System.out.print(exponente + " es: " + resultado);
  }
}
