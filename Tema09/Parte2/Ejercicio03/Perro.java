package Ejercicios.Ejercicio03;

/**
 * Subclase de 'Mamifero'
 *
 * @author JorgeGarciaMolina
 */
public class Perro extends Mamifero {
  
  //Atributos
  private String raza;
  
  //Constructores
  public Perro(String raza) {
    this.raza = raza;
  }
  
  
  //Métodos
  void ladra() {
    System.out.println("Guau guau");
  }
  
  void grune() {
    System.out.println("Gggrrrrrrrrrr");
  }
  
  void escarba() {
    System.out.println("Èl perro escarba en el suelo");
  }
}
