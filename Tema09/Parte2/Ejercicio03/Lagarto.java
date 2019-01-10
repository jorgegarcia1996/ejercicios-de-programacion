package Ejercicios.Ejercicio03;

/**
 * Subclase de Animal
 *
 * @author JorgeGarciaMolina
 */
public class Lagarto extends Animal {
  
  //Atributos
  private String raza;
  
  
  //Constructor
  public Lagarto(String raza) {
    this.raza = raza;
  }
  
  
  //Métodos
  void tomaSol() {
    System.out.println("El lagarto toma el sol");
  }
  
  void mudaPiel() {
    System.out.println("El lagarto muda la piel");
  }
  
  void trepaArbol() {
    System.out.println("El lagarto trepa a un árbol");
  }
}
