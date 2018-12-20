/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pipoprueba;

/**
 *
 * @author jorge
 */
public class Piramide {
  
  int altura;
  String caracter = "*";
  boolean estaHueco = false;
  
  //CONSTRUCTORES

  public Piramide(int altura) {
    this.altura = altura;
  }

  public Piramide(int altura, String caracter) {
    this.altura = altura;
    this.caracter = caracter;
  }

  public Piramide(int altura, boolean estaHueco) {
    this.altura = altura;
    this.estaHueco = estaHueco;
  }

  public Piramide(int altura, String caracter, boolean estaHueco) {
    this.altura = altura;
    this.caracter = caracter;
    this.estaHueco = estaHueco;
  }
  
  //toString

  @Override
  public String toString() {
    int espacios = this.altura - 1;
    int base = (altura * 2) - 1;
    String piramide = "";
    int i = 1;
    if (!this.estaHueco) {
      while (i <= base) {
        for (int j = 0; j < espacios; j++) {
        piramide += " ";
        }

        for (int j = 1; j <= i; j++) {
        piramide += this.caracter;
        }
        piramide += "\n";
        i += 2;
        espacios--;
      }
    } else {
      while (i <= base) {
        for (int j = 0; j < espacios; j++) {
        piramide += " ";
        }
                
        if (i != base) {
          piramide += this.caracter;
          for (int j = 1; j < (i - 1); j++) {
            piramide += " ";
          }
          
          if (i != 1) {
            piramide += this.caracter;
          }
        } else {
          for (int j = 1; j <= i; j++) {
          piramide += this.caracter;
          }
        }
        piramide += "\n";
        i += 2;
        espacios--;
      }
    }
    return piramide;
  }
  
  
}
