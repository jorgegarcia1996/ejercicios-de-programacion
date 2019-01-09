package Ejercicios.Ejercicio02;

/**
 * Subclase de 'Vehículo'
 *
 * @author Jorge García Molina
 */
public class Bicicleta extends Vehiculo {
  
  //Atributos
  private String tipo; //Tipo de bicicleta
  
  //Constructor
  public Bicicleta(String tipo) {
    this.tipo = tipo;
  }
  
  //Getters
  public String getTipo() {
    return tipo;
  }
  
  //Métodos
  public void caballitoBici() {
    if ((Math.random() * 2) < 1) {
      System.out.println("Has hecho un caballito a la perfección.");
    } else {
      System.out.println("Has hecho un caballito pero te has caido.");
    }
  }
}
