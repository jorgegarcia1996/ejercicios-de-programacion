package Ejercicios.Ejercicio03;

/**
 * Subclase de 'Animal'
 *
 * @author JorgeGarciaMolina
 */
public abstract class Mamifero extends Animal {
  
  //Metodos
  void corre() {
    System.out.println("Mira como corre.");
  }
  
  void salta() {
    System.out.println("Mira como salta.");
  }
  
  void muerde() {
    System.out.println("OUCH!!!");
  }
}
