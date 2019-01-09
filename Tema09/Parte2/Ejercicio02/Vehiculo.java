package Ejercicios.Ejercicio02;

/**
 * Ejercicio 2 de POO (Tema 09)
 * 
 * Crea la clase Vehiculo , así como las clases Bicicleta y Coche como subclases
 * de la primera. Para la clase Vehiculo , crea los atributos de clase
 * vehiculosCreados y kilometrosTotales , así como el atributo de instancia
 * kilometrosRecorridos . Crea también algún método específico para cada una de
 * las subclases. Prueba las clases creadas mediante un programa con un menú.
 *
 * @author Jorge García Molina
 */
public class Vehiculo {
  
  //Atributos
  private int vehiculosCreados = 0;
  private long kilometrosTotales = 0;
  
  
  //Getters
  public long getKilometrosTotales() {
    return this.kilometrosTotales;
  }
  
  //Setters
  public void setKilometrosTotales(long kilometrosTotales) {
    this.kilometrosTotales += kilometrosTotales;
  }

  public void setVehiculosCreados(int vehiculosCreados) {
    this.vehiculosCreados += vehiculosCreados;
  }
}
