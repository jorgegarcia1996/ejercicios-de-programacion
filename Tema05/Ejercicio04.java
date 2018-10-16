package tema05;
/**
* Ejercicio 04 del Tema 5
* 
* Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás
* utilizando un bucle for.
* 
* @author Jorge García Molina
*/

public class Ejercicio04 {
  public static void main(String[] args) {
    System.out.println("Contar desde 360 hasta 160 de 20 en 20.");
    for (int i = 360; i >= 160; i -= 20) {
      System.out.print(i + " ");
    }
  }
}
