package ejercicios.ejercicio07;

/**
 * Clase 'Moneda' para el ejercicio 07 del tema 10
 *
 * @author JorgeGarciaMolina
 */
public class Moneda {
  //Atributos
  private static String posiciones[] = {"cara", "cruz"};
  private static String cantidades[] = {"1 cts", "2 cts", "5 cts", "10 cts", "20 cts"
                                      , "50 cts", "1 eur", "2 eur"};
  private String pos, cant;
  
  //Constructor
  public Moneda() {
    this.pos = posiciones[(int)(Math.random()*2)];
    this.cant = cantidades[(int)(Math.random()*8)];
  }
  
  //Getters
  public String getPos() {
    return pos;
  }

  public String getCant() {
    return cant;
  }
  
  //toString
  @Override
  public String toString() {
    return this.cant + " - " + this.pos;
  }  
}
