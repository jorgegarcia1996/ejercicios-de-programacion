package Ejercicios.Ejercicio02;

/**
 * Subclase de 'Vehículo'
 *
 * @author Jorge García Molina
 */
public class Coche extends Vehiculo {
  
  //Atributos
  private long kilometrosCoche = 0;
  private String color, marca;
  
  //Constructores

  public Coche() {
    this.color = "Blanco";
    this.marca = "Desconocida";
    setVehiculosCreados(1);
  }

  public Coche(String color, String marca) {
    this.color = color;
    this.marca = marca;
    setVehiculosCreados(1);
  }
  
  
  //Getters
  public long getKilometrosCoche() {
    return kilometrosCoche;
  }
  
  //Setters
  public void setKilometrosCoche(long kilometrosCoche) {
    this.kilometrosCoche += kilometrosCoche;
    setKilometrosTotales(kilometrosCoche);
  }
  
  //Métodos
  public void andaCoche() {
    System.out.println("Has andado 60 km con el coche.");
    setKilometrosCoche(60);
  }
  
  public void quemarRueda() {
    if ((Math.random() * 2) < 1) {
      System.out.println("Has quemado rueda a la perfección.");
    } else {
      System.out.println("Has quemado rueda pero has reventado una goma..");
    }
  }
}
