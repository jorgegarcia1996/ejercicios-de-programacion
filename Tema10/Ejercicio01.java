package ejercicios;

import java.util.ArrayList;

/**
 * Ejercicio 01 del tema 10
 * 
 * Crea un ArrayList con los nombres de 6 compañeros de clase. A continuación,
 * muestra esos nombres por pantalla. Utiliza para ello un bucle for que recorra
 * todo el ArrayList sin usar ningún índice.
 *
 * @author JorgeGarciaMolina
 */
public class Ejercicio01 {
  public static void main(String[] args) {
    ArrayList<String> compis = new ArrayList<>();
    compis.add("Rafa");
    compis.add("Borja");
    compis.add("Lino");
    compis.add("José");
    compis.add("Pedro");
    compis.add("Iván");

    System.out.print("Mis compañeros son: ");
    for (String e : compis) {
      System.out.print(e + " ");
    }
    System.out.println();
  }
}
