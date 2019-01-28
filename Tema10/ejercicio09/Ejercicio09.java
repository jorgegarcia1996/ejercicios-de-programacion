package ejercicios.ejercicio09;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Ejercicio 09 del tema 10
 * 
 * Modifica el programa anterior de tal forma que las cartas se muestren
 * ordenadas. Primero se ordenarán por palo: bastos, copas, espadas, oros.
 * Cuando coincida el palo, se ordenará por número: as, 2, 3, 4, 5, 6, 7, sota,
 * caballo, rey.
 *
 * @author JorgeGarciaMolina
 */
public class Ejercicio09 {
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
    
    //Ordenar las cartas
    Collections.sort(c);
    
    //Mostrar las cartas
    c.forEach((carta) -> {
      System.out.println(carta);
    });
  }
}
