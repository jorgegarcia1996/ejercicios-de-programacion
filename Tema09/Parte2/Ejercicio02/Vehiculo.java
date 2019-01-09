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
public abstract class Vehiculo {
  
  //Atributos de clase
  private static int vehiculosCreados = 0;
  private static int kilometrosTotales = 0;
  
  //Atributos de instancia
  private int kilometrosRecorridos;
  
  
  //Getters
  public static int getKilometrosTotales() {
    return kilometrosTotales;
  }

  public int getKilometrosRecorridos() {
    return kilometrosRecorridos;
  }
  
  //Métodos
  public void recorre(int k) {
    this.kilometrosRecorridos += k;
    Vehiculo.kilometrosTotales += k;
  }
  
}
