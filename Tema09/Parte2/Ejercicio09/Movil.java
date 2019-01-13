package Ejercicios.Ejercicio09;

/**
 * Ejercicio 09 del tema 09 (Parte2)
 * Implementa la clase Movil como subclase de Terminal (la clase del ejercicio
 * anterior que ya no hace falta modificar). Cada móvil lleva asociada una
 * tarifa que puede ser “rata”, “mono” o “bisonte”. El coste por minuto es de 6,
 * 12 y 30 céntimos respectivamente. Se tarifican los segundos exactos.
 * Obviamente, cuando un móvil llama a otro, se le cobra al que llama, no al que
 * recibe la llamada.
 *
 * @author JorgeGarciaMolina
 */
public class Movil extends Terminal {
  //Atributos
  private String cuota;
  private double gasto = 0;

  //Constructor
  public Movil(String id, String cuota) {
    super(id);
    this.cuota = cuota;
  }
  
  
  //Getters
  public String getCuota() {
    return cuota;
  }

  public double getGasto() {
    return gasto;
  }
  
  
  
  //Métodos
  @Override
  public String toString() {
    return "Nº " + this.getId() + " - " + this.getTiempo() + "s de conversación - " 
            + "tarificados " + this.getGasto() + " euros";
  }
  
  public void llama(Movil m, int segundos) {
    double min = (double)segundos / 60;
    super.llama(m, segundos);
    if (this.cuota.equals("rata")) {
      this.gasto += min * 0.06;
    } else if (this.cuota.equals("mono")) {
      this.gasto += min * 0.12;
    } else if (this.cuota.equals("bisonte")) {
      this.gasto += min * 0.3;
    }
  }
}
