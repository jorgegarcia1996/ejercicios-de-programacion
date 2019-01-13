package Ejercicios.Ejercicio08;

/**
 * Ejercicio 08 del tema 09 (Parte 2)
 * Implementa la clase Terminal. Un terminal
 * tiene asociado un número. Los terminales se pueden llamar unos a otros y el
 * tiempo de conversación corre para ambos.
 *
 * @author Jorge
 */
public class Terminal {
  //Atributos
  private int tiempo = 0;
  private final String id;
  
  
  //Constructor
  public Terminal(String id) {
    this.id = id;
  }
  
  //Getter
  public int getTiempo() {
    return tiempo;
  }

  public String getId() {
    return id;
  }
  
  
  //Métodos
  @Override
  public String toString() {
    return "Nº " + this.getId() + " - " + this.getTiempo() + "s de conversación";
  }
  
  public void llama(Terminal t, int segundos) {
    this.tiempo += segundos;
    t.tiempo += segundos;
  }
}
