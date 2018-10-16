package tema05;
/**
* Ejercicio 02 del Tema 5
* 
* Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle while.
* 
* @author Jorge García Molina
*/

public class Ejercicio02 {
  public static void main(String[] args) {
    System.out.println("Múltiplos de 5 mediante 'while'.");
    int i = 0;
    while (i <= 100) {
      System.out.print(i + " ");
      i += 5;
    }
  }
}
