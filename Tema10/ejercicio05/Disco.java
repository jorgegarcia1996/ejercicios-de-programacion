package ejercicios.ejercicio05;

/**
 * Definición de la clase Disco
 * 
 * @author Luis José Sánchez
 */

public class Disco {
  //Atributos
  private String codigo = "LIBRE";
  private String autor;
  private String titulo;
  private String genero;
  private int duracion; // duración total en minutos

  public Disco(String codigo, String autor, String titulo, String genero, int duracion) {
    this.codigo = codigo;
    this.autor = autor;
    this.titulo = titulo;
    this.genero = genero;
    this.duracion = duracion;
  }
  
  
  //Getters
  public String getCodigo() {
    return codigo;
  }

  public String getAutor() {
    return autor;
  }

  public String getTitulo() {
    return titulo;
  }

  public String getGenero() {
    return genero;
  }

  public int getDuracion() {
    return duracion;
  }
  
  //Setters
  public void setCodigo(String codigo) {
        this.codigo = codigo;
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public void setGenero(String genero) {
    this.genero = genero;
  }

  public void setDuracion(int duracion) {
    this.duracion = duracion;
  }

  //Métodos
  @Override
  public String toString() {
    return "\n------------------------------------------"
    + "\nCódigo: " + this.codigo + "\nAutor: " + this.autor
    + "\nTítulo: " + this.titulo + "\nGénero: " + this.genero
    + "\nDuración: " + this.duracion 
    + "\n------------------------------------------";
  }
}
