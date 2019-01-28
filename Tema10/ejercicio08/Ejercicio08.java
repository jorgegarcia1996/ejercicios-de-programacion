package ejercicios.ejercicio08;

import java.util.ArrayList;

/**
 * Ejercicio 08 del tema 10
 * 
 * Realiza un programa que escoja al azar 10 cartas de la baraja española (10
 * objetos de la clase Carta). Emplea un objeto de la clase ArrayList para
 * almacenarlas y asegúrate de que no se repite ninguna.
 *
 * @author JorgeGarciaMolina
 */
public class Ejercicio08 {
  public static void main(String[] args) {
    //Crear el ArrayList
    ArrayList<Carta> c = new ArrayList<>();
    
    //Generar las cartas
    Carta cAux = new Carta();
    c.add(cAux);
    
    for (int i = 0; i < 9; i++) {
      do { 
        cAux = new Carta();
      } while (c.contains(cAux));
      c.add(cAux);
    }
    
    c.forEach((carta) -> {
      System.out.println(carta);
    });
  }
}
