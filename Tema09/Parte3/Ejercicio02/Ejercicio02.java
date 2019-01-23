package parte3.Ejercicio02;

import java.util.Scanner;

/**
 * Ejercicio 2 del tema 09 (Parte 3)
 * 
 * Cambia el programa anterior de tal forma que los datos de los gatos se intro-
 * duzcan directamente en el código de la forma gatito[2].setColor(“marrón”) o
 * bien mediante el constructor, de la forma gatito[3] = new Gato(“Garfield”,
 * “naranja”, “macho”) . Muestra a continuación los datos de todos los gatos
 * utilizando un bucle.
 *
 * @author JorgeGarciaMolina
 */
public class Ejercicio02 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    Gato[] gato = new Gato[4];
    
    gato[0] = new Gato("negro", "macho");    
    gato[1] = new Gato("blanco", "hembra");
    gato[2] = new Gato("shiny", "macho");
    gato[3] = new Gato("RGB", "macho");

    
    System.out.println("Gatos guardados.");
    for (int i = 0; i < gato.length; i++) {
      System.out.println("Gato " + i + ":");
      System.out.println("Color: " + gato[i].getColor());
      System.out.println("Sexo: " + gato[i].getSexo());
      System.out.println();
    }
  }
}
