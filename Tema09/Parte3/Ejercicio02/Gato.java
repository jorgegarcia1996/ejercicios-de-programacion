package parte3.Ejercicio02;

import parte3.Ejercicio01.*;

/**
 * GatoSimple.java
 * Definición de la clase GatoSimple
 * @author Luis José Sánchez
 */
public class Gato {

  //Atributos
  String color;
  String raza;
  String sexo;
  int edad;
  double peso;

  
  //Constructores
  public Gato() {
  }

  public Gato(String color, String sexo) {
    this.color = color;
    this.sexo = sexo;
  }
  
  
  
  //Getters
  public String getColor() {
    return color;
  }

  public String getSexo() {
    return sexo;
  }

  public int getEdad() {
    return edad;
  }
  
  //Settters
  public void setEdad(int edad) {
    this.edad = edad;
  }

  public void setPeso(double peso) {
    this.peso = peso;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public void setRaza(String raza) {
    this.raza = raza;
  }

  public void setSexo(String sexo) {
    this.sexo = sexo;
  }
}
