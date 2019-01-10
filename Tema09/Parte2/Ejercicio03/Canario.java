package Ejercicios.Ejercicio03;

/**
 * 
 * Subclase de 'Ave'
 *
 * @author JorgeGarciaMolina
 */
public class Canario extends Ave {
  
  //Atributos
  private String raza;
  
  //Constructores
  public Canario(String raza) {
    this.raza = raza;
  }
  
  
  //Métodos
  void canta() {
    System.out.println("pio pio piiiiii");
  }
  
  void revolotea() {
    System.out.println("El canario está revoloteando en su jaula");
  }
  
  void avisaGas() {
    System.out.println("El canario avisa de la presencia de gas");
  }
}
