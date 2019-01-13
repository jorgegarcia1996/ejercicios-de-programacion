package Ejercicios.Ejercicio07;

/**
 * Ejercicio 07 del tema 09 (Parte 2)
 * Queremos gestionar la venta de entradas
 * (no numeradas) de Expocoches Campanillas que tiene 3 zonas, la sala principal
 * con 1000 entradas disponibles, la zona de compra-venta con 200 entradas
 * disponibles y la zona vip con 25 entradas disponibles. Hay que controlar que
 * existen entradas antes de venderlas.
 *
 * @author JorgeGarcíaMolina
 */
public class Zona {
  //Atributos
  private int entradasPorVender;

  
  //Constructor
  public Zona(int n) {
    entradasPorVender = n;
  }

  
  //Getter
  public int getEntradasPorVender() {
    return entradasPorVender;
  }
  
  
  //Métodos
  public void vender(int n) {
    if (this.entradasPorVender == 0) {
      System.out.println("Lo siento, las entradas para esa zona están agotadas.");
    } else if (this.entradasPorVender < n) {
      System.out.println("Sólo me quedan " + this.entradasPorVender
              + " entradas para esa zona.");
    }
    if (this.entradasPorVender >= n) {
      entradasPorVender -= n;
      System.out.println("Aquí tiene sus " + n + " entradas, gracias.");
    }
  }
}
