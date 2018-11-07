
package tema06;
import java.util.Scanner;

/**
 * Ejercicio 20 del Tema 06
 *
 * Realiza un programa que pinte por pantalla una cuba con cierta cantidad de
 * agua. La capacidad será indicada por el usuario. La cuba se llenará con una
 * cantidad aleatoria de agua que puede ir entre 0 y la capacidad máxima que
 * pueda admitir. El ancho de la cuba no varía.
 *
 * @author Jorge García Molina
 */
public class Ejercicio20 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Cubeta de agua.");
    System.out.print("Introduce la capacidad máxima de la cubeta: ");
    int capacidad = Integer.parseInt(s.nextLine());

    //Generar la cubeta y el contenido
    int contenido = (int)(Math.random() * (capacidad + 1));
    int vacio = capacidad - contenido;
    while (vacio > 0) {
      System.out.println("*     *");
      vacio--;
    }
    while (contenido > 0) {
      System.out.println("*=====*");
      contenido--;
    }
    System.out.println("*******");
  }
}
