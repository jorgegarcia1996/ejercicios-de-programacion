package parte3.Ejercicio01;

import java.util.Scanner;

/**
 * Ejercicio 1 de Arrays de objetos del tema 09
 * 
 * Utiliza la clase Gato para crear un array de cuatro gatos e introduce los
 * datos de cada uno de ellos mediante un bucle. Muestra a continuación los
 * datos de todos los gatos utilizando también un bucle.
 *
 * @author JorgeGarciaMolina
 */
public class Ejercicio01 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    Gato[] gato = new Gato[4];
    
    System.out.println("Introduzca los datos de los gatos.");
    String sexo = "";
    String color;
    for (int i = 0; i < gato.length; i++) {
      gato[i] = new Gato();
      System.out.print("Color del gato " + i + ": ");
      color = s.nextLine();
      (gato[i]).setColor(color);
      System.out.print("Sexo del gato " + i + ": ");
      sexo = s.nextLine();
      (gato[i]).setSexo(sexo);
      System.out.println();
    }
    
    System.out.println("Gatos guardados.");
    for (int i = 0; i < gato.length; i++) {
      System.out.println("Gato " + i + ":");
      System.out.println("Color: " + gato[i].getColor());
      System.out.println("Sexo: " + gato[i].getSexo());
      System.out.println();
    }
  }
}
