/**
* Ejercicio 15 del Tema 5
* 
* Escribe un programa que dados dos números, uno real (base) y un entero
* positivo (exponente), saque por pantalla todas las potencias con base el
* numero dado y exponentes entre uno y el exponente introducido. No se deben
* utilizar funciones de exponenciación. Por ejemplo, si introducimos el 2 y el 5,
* se deberán mostrar 2¹ , 2² , 2³ , 2⁴ y 2⁵ .
* 
* @author Jorge García Molina
*/

public class Ejercicio15 {
  public static void main(String[] args) {
    System.out.println("Hacer una potencia a partir de 2 números enteros positivos.");
    //Pedir el número
    System.out.print("Introduzca la base: ");
    int base = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca el exponente máximo: ");
    int exponente = Integer.parseInt(System.console().readLine());
    
    //Mostrar las potencias
    int i = 0;
    while (i < exponente) {
      i++;
      System.out.print(base + "^" + i + " ");
    }
  }
}
