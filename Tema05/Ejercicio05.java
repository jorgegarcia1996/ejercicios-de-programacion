package tema05;
/**
* Ejercicio 05 del Tema 5
* 
* Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás
* utilizando un bucle while.
* 
* @author Jorge García Molina
*/

public class Ejercicio05 {
  public static void main(String[] args) {
    System.out.println("Contar desde 360 hasta 160 de 20 en 20.");
    int i = 360;
    while (i >= 160) {
      System.out.print(i + " ");
      i -= 20;
    }
  }
}
