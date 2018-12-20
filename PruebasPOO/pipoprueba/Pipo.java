package pipoprueba;

/**
 * Pipo Poweeeeeerrrr y datos
 * 
 * Nombre (String)
 * DNI (String)
 * Apellidos (String)
 * email (String)
 * telefono (String)
 * 
 * @author Jorge García Molina
 */
public class Pipo {
  
  private String dni;
  public String nombre, apellidos, email, telefono;

  //CONSTRUCTORES
  public Pipo() {
  }

  public Pipo(String dni, String nombre, String apellidos) {
    this.dni = dni;
    this.nombre = nombre;
    this.apellidos = apellidos;
  }

  //GETTERS
  
  public String getDni() {
    return dni;
  }

  public String getNombre() {
    return nombre;
  }

  public String getApellidos() {
    return apellidos;
  }

  public String getEmail() {
    return email;
  }

  public String getTelefono() {
    return telefono;
  }

  //SETTERS

  public void setDni(String dni) {
    this.dni = dni;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setApellidos(String apellidos) {
    this.apellidos = apellidos;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }
  
  //METODOS

  @Override
  public String toString() {
    String fichaPipo = "==============================\n"
            + this.apellidos + ", " + this.nombre + "\n"
            + "DNI: " + this.dni + "\n"
            + "Email: " + this.email + "\n"
            + "Telefono: " + this.telefono + "\n"
            + "==============================";
    return fichaPipo;
  }
  
  
  
}
