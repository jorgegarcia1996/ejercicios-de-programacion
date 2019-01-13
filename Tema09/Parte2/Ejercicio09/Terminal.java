package Ejercicios.Ejercicio09;

/**
 * Ejercicio 08 del tema 09 (Parte 2)
 * Copia de la clase 'Terminal' del ejercicio 08
 *
 * @author JorgeGarciaMolina
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
