/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.ejercicio08;

/**
 *
 * @author Jorge
 */
public class Carta {
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
}
