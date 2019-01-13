package Ejercicios.Ejercicio06;

/**
 * Fichero de pruebas de la clase 'Tiempo'
 *
 * @author JorgeGarciaMolina
 */
public class PruebaTiempo {
  public static void main(String[] args) {
    Tiempo t1 = new Tiempo(10,20,3);
    Tiempo t2 = new Tiempo(0, 30, 52);
    
    System.out.println("Tiempo 1: " + t1.toString());
    System.out.println("Tiempo 2: " + t2.toString());
    System.out.println();
    System.out.println("Suma: " + t1.suma(t2));
    System.out.println("Resta: " + t1.resta(t2));
  }
}
