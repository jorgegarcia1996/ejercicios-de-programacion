package Ejercicios.Ejercicio05;

/**
 * Ejercicio 05 del tema 09 (Parte 2)
 * se necesita saber el tamaño - mediana o
 * familiar - el tipo - margarita, cuatro quesos o funghi - y su estado - pedida
 * o servida. La clase debe almacenar información sobre el número total de
 * pizzas que se han pedido y que se han servido. Siempre que se crea una pizza
 * nueva, su estado es “pedida”. El siguiente código del programa principal debe
 * dar la salida que se muestra:
 * @author JorgeGarciaMolina
 */
public class Pizza {
   
  //Atributos
  private final String tamano, tipo;
  private String estado;
  private static int totalPedidas = 0, totalServidas = 0;
  
  //Constructor
  public Pizza(String tamano, String tipo) {
    this.tamano = tamano;
    this.tipo = tipo;
    this.estado = "pedida";
    Pizza.totalPedidas++;
  }
  
  //Getters

  public static int getTotalPedidas() {
    return totalPedidas;
  }

  public static int getTotalServidas() {
    return totalServidas;
  }
  
  
  //Metodos
  @Override
  public String toString() {
    return "pizza " + this.tipo + " " + this.tamano + ",  " + this.estado;
  }
  
  void sirve() {
    if (this.estado.equals("pedida")) {
      this.estado = "servida";
      Pizza.totalServidas++;
    } else {
      System.out.println("Esa pizza está servida.");
    }
  }
}
