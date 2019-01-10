package Ejercicios.Ejercicio03;

/**
 * Subclase de 'Ave'
 *
 * @author JorgeGarciaMolina
 */
public class Pinguino extends Ave {
  
  //Atributos
  private String raza;
  
  
  //Constructores
  public Pinguino(String raza) {
    this.raza = raza;
  }
  
  
  //Métodos
  @Override
  void vuela() {
    System.out.println("Los pingüinos no vuelan");
  }
  
  void nada() {
    System.out.println("El pingüino nada en el mar");
  }
  
  void pesca() {
    System.out.println("El pingüino pesca peces");
  }
}
