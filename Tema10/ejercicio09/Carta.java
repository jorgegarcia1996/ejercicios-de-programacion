package ejercicios.ejercicio09;

import java.util.Objects;

/**
 *
 * @author JorgeGarciaMolina
 */
public class Carta implements Comparable<Carta>{
  //Atributos
  private static String[] valores = {"as","dos","tres","cuatro","cinco","seis",
                                     "siete","sota","caballo","rey"};
  private static String[] palos = {"oros","bastos","espadas","copas"};
  
  private String num, palo;
  
  //Constructor

  public Carta() {
    this.num = valores[(int)(Math.random()*10)];
    this.palo = palos[(int)(Math.random()*4)];
  }
  
  //Getters
  public String getNum() {
    return num;
  }

  public String getPalo() {
    return palo;
  }
  
  //toString

  @Override
  public String toString() {
    return this.num + " de " + this.palo;
  }
  
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    final Carta other = (Carta) obj;
    if (!Objects.equals(this.num, other.num)) {
      return false;
    }
    if (!Objects.equals(this.palo, other.palo)) {
      return false;
    }
    return true;
  }
  
  
  public int compareTo(Carta c) {
    if (palo.equals(c.getPalo())) {
      return num.compareTo(c.getNum());
    } else {
      return palo.compareTo(c.getPalo());
    }
  }
}
