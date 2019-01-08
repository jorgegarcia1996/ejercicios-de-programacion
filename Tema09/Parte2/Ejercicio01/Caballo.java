package Ejercicios.Ejercicio01;

/**
 * Ejercicio 01 del tema 09 (Parte 2)
 *
 * Implementa la clase Caballo vista en un ejercicio anterior. Pruébala creando
 * instancias y aplicándole algunos métodos.
 * 
 * @author Jorge García Molina
 */
public class Caballo {
  
  //Atributos
  public String nombre, colorDePelo, tipoDePelo, peso, estatura, raza, genero;
  
  //Constructores

  public Caballo(String nombre, String colorDePelo, String raza, String genero) {
    this.nombre = nombre;
    this.colorDePelo = colorDePelo;
    this.raza = raza;
    this.genero = genero;
  }
  
  //Getters

  public String getNombre() {
    return nombre;
  }

  public String getColorDePelo() {
    return colorDePelo;
  }

  public String getTipoDePelo() {
    return tipoDePelo;
  }

  public String getPeso() {
    return peso;
  }

  public String getEstatura() {
    return estatura;
  }

  public String getRaza() {
    return raza;
  }

  public String getGenero() {
    return genero;
  }
  
  //Setters

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setColorDePelo(String colorDePelo) {
    this.colorDePelo = colorDePelo;
  }

  public void setTipoDePelo(String tipoDePelo) {
    this.tipoDePelo = tipoDePelo;
  }

  public void setPeso(String peso) {
    this.peso = peso;
  }

  public void setEstatura(String estatura) {
    this.estatura = estatura;
  }

  public void setRaza(String raza) {
    this.raza = raza;
  }

  public void setGenero(String genero) {
    this.genero = genero;
  }
  
  //Métodos
  
  void correr() {
    System.out.println("El caballo está corriendo.");
  }
  
  void galopar() {
    System.out.println("El caballo galopa.");
  }
  
  void saltar() {
    System.out.println("El caballo salta.");
  }
  
  void relinchar() {
    System.out.println("Ffffffrrrrrrrrrrrrr");
  }
}
