package Ejercicios.Ejercicio02;

/**
 * Subclase de 'Vehículo'
 *
 * @author Jorge García Molina
 */
public class Bicicleta extends Vehiculo {
  
  //Atributos
  private long kilometrosBici = 0;
  private String tipo, color;
  
  //Constructores
  public Bicicleta(String tipo, String color) {
    this.tipo = tipo;
    this.color = color;
    setVehiculosCreados(1);
  }
  
  public Bicicleta() {
    this.tipo = "Carretera";
    this.color = "Negro";
    setVehiculosCreados(1);
  }
  
  
  //Getters
  public long getKilometrosBici() {
    return kilometrosBici;
  }
  
  //Setters
  public void setKilometrosBici(long kilometrosBici) {
    this.kilometrosBici += kilometrosBici;
    setKilometrosTotales(kilometrosBici);
  }
  
  //Métodos
  public void andaBici() {
    System.out.println("Has andado 10 km con la bici.");
    setKilometrosBici(10);
  }
  
  public void caballitoBici() {
    if ((Math.random() * 2) < 1) {
      System.out.println("Has hecho un caballito a la perfección.");
    } else {
      System.out.println("Has hecho un caballito pero te has caido.");
    }
  }
}
