package Ejercicios.Ejercicio03;

/**
 * Subclase de 'Mamifero'
 *
 * @author JorgeGarciaMolina
 */
public class Gato extends Mamifero {
  
  //Atributos
  private String raza;
  
  //Constructores
  public Gato(String raza) {
    this.raza = raza;
  }
  
  
  //Métodos
  void arana() {
    System.out.println("El gato araña el sofá");
  }
  
  void maulla() {
    System.out.println("Miiiaaaaaaauuuuuuuuuu");
  }
  
  void ronronea() {
    System.out.println("El gato ronronea feliz");
  }
}
