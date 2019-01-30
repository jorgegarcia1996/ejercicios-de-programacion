/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.ejercicio12;

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
  private int pnt;
  
  //Constructor

  public Carta() {
    this.num = valores[(int)(Math.random()*10)];
    this.palo = palos[(int)(Math.random()*4)];
    switch (this.num) {
      case "as":
        this.pnt = 11;
        break;
      case "tres":
        this.pnt = 10;
        break;
      case "sota":
        this.pnt = 2;
        break;
      case "caballo":
        this.pnt = 3;
        break;
      case "rey":
        this.pnt = 4;
        break;
      default:
        this.pnt = 0;
    }
  }
  
  //Getters
  public String getNum() {
    return num;
  }

  public String getPalo() {
    return palo;
  }

  public int getPnt() {
    return pnt;
  }
  
  
  
  //toString

  @Override
  public String toString() {
    return this.num + " de " + this.palo;
  }  
}
