package ejercicios.ejercicio12;

import java.util.ArrayList;

/**
 * Ejercicio 12 del tema 10
 * 
 * Escribe un programa que genere una secuencia de 5 cartas de la baraja
 * española y que sume los puntos según el juego de la brisca. El valor de las
 * cartas se debe guardar en una estructura HashMap que debe contener parejas
 * (figura, valor), por ejemplo (“caballo”, 3). La secuencia de cartas debe ser
 * una estructura de la clase ArrayList que contiene objetos de la clase Carta .
 * El valor de las cartas es el siguiente: as → 11, tres → 10, sota → 2, caballo
 * → 3, rey → 4; el resto de cartas no vale nada.
 *
 * @author JorgeGarciaMolina
 */
public class Ejercicio12 {
  public static void main(String[] args) {
    //Crear el ArrayList
    ArrayList<Carta> c = new ArrayList<>();
    
    int puntos = 0;
    
    //Generar las cartas
    Carta cAux;
    
    for (int i = 0; i < 5; i++) {
      do { 
        cAux = new Carta();
        puntos += cAux.getPnt();
      } while (c.contains(cAux));
      c.add(cAux);
    }
    
    c.forEach((carta) -> {
      System.out.println(carta);
    });
    
    System.out.println("Tienes " + puntos + " puntos.");
  }
}
