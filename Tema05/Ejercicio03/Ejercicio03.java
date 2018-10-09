/**
* Ejercicio 03 del Tema 5
* 
* Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle do-while.
* 
* @author Jorge García Molina
*/

public class Ejercicio03 {
  public static void main(String[] args) {
    System.out.println("Múltiplos de 5 mediante 'do-while'.");
    int i = 0;
    do {
      System.out.print(i + " ");
      i += 5;
    } while (i <= 100);
  }
}
