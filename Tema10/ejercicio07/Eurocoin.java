package ejercicios.ejercicio07;

import java.util.ArrayList;

/**
 * Ejercicio 07 del tema 10
 * 
 * un botón siguiendo la siguiente pauta: o bien coincide el valor con la moneda
 * anteriormente generada - 1 céntimo, 2 céntimos, 5 céntimos, 10 céntimos, 25
 * céntimos, 50 céntimos, 1 euro o 2 euros - o bien coincide la posición – cara
 * o cruz. Simula, mediante un programa, la generación de 6 monedas aleatorias
 * siguiendo la pauta correcta. Cada moneda generada debe ser una instancia de
 * la clase Moneda y la secuencia se debe ir almacenando en una lista.
 *
 * @author JorgeGarciaMolina
 */
public class Eurocoin {
  public static void main(String[] args) {
    ArrayList<Moneda> monedas = new ArrayList<>();
    
    //Generar una moneda y coger sus cantidad y posicion
    Moneda monedaAux = new Moneda();
    monedas.add(monedaAux);
    String posicion = monedaAux.getPos();
    String cantidad = monedaAux.getCant();
    
    for (int i = 0; i < 5; i++) {
      do {
        monedaAux = new Moneda();
      } while (!((monedaAux.getPos()).equals(posicion)) && !((monedaAux.getCant()).equals(cantidad)));
      
      monedas.add(monedaAux);
      posicion = monedaAux.getPos();
      cantidad = monedaAux.getCant();
    }
    
    //Otra forma de hacer un foreach de un arraylist
    monedas.forEach((mo) -> {
      System.out.println(mo);
    });
  }
}
