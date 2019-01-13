package Ejercicios.Ejercicio06;

/**
 * Ejercicio 06 del tema 09 (Parte 2)
 * Crea la clase Tiempo con los métodos suma
 * y resta. Los objetos de la clase Tiempo son intervalos de tiempo y se crean
 * de la forma Tiempo t = new Tiempo(1, 20, 30) donde los parámetros que se le
 * pasan al constructor son las horas, los minutos y los segundos
 * respectivamente. Crea el método toString para ver los intervalos de tiempo de
 * la forma 10h 35m 5s. Si se suman por ejemplo 30m 40s y 35m 20s el resultado
 * debería ser 1h 6m 0s. Realiza un programa de prueba para comprobar que la
 * clase funciona bien.
 *
 * @author JorgeGarciaMolina
 */
public class Tiempo {
  
  //Atributos
  private int segundos;
  
  //Constructor
  public Tiempo(int horas, int minutos, int segundos) {
    this.segundos = (horas * 3600) + (minutos * 60) + segundos;
  }

  public Tiempo(int segundos) {
    this.segundos = segundos;
  }
  
  //Getters

  public int getSegundos() {
    return this.segundos;
  }
  
  //Metodos
  @Override
  public String toString() {
    int seg = this.segundos;
    int horas = seg / 3600;
    seg -= horas * 3600;
    int minutos = seg / 60;
    seg -= minutos * 60;
    
    if (this.segundos < 0) {
      return "-(" + (-horas) + "h " + (-minutos) + "m " + (-seg) + "s)";
    } else {
      return horas + "h " + minutos + "m " + seg + "s";
    }
  }
  
  public Tiempo suma(Tiempo t) {
    return new Tiempo(this.segundos + t.getSegundos());
  }
  
  public Tiempo resta(Tiempo t) {
    return new Tiempo(this.segundos - t.getSegundos());
  }
}
