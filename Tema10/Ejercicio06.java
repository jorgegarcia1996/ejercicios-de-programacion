package ejercicios;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Ejercicio 06 del tema 10
 * 
 * Implementa el control de acceso al área restringida de un programa. Se debe
 * pedir un nombre de usuario y una contraseña. Si el usuario introduce los
 * datos correctamente, el programa dirá “Ha accedido al área restringida”. El
 * usuario tendrá un máximo de 3 oportunidades. Si se agotan las oportunidades
 * el programa dirá “Lo siento, no tiene acceso al área restringida”.
 *
 * @author JorgeGarciaMolina
 */
public class Ejercicio06 {
  public static void main(String[] args) {
    //Usuarios del sistema
    HashMap<String, String> usuarios = new HashMap<>();
    usuarios.put("usuario","usuario");
    usuarios.put("admin", "admin");
    
    //Variables
    boolean entra = false, usuCorrecto = false, conCorrecta = false;
    String usu, con;
    int intentos = 3;
    
    Scanner s = new Scanner(System.in);
    
    //Login
    do {
      System.out.print("Introduzca el nombre de usuario:");
      usu = s.nextLine();
      System.out.print("Introduzca la contraseña:");
      con = s.nextLine();
      
      //Comprobar el usuario y la contraseña
      usuCorrecto = (usuarios.containsKey(usu));
      conCorrecta = (usuCorrecto && usuarios.containsValue(con));
      entra = (usuCorrecto && conCorrecta);
      
      if (!usuCorrecto && !conCorrecta) {
        intentos--;
        System.out.println("El usuario o la contraseña no son correctos, intentelo de nuevo.");
        System.out.println("Le quedan " + intentos + " intentos.");
      }  
    } while (!entra && intentos > 0);
    
    if (!entra) {
      System.out.println("Lo siento, no tiene acceso al área restringida.");
    } else {
      System.out.println("Ha accedido al área restringida.");
    }
  }
}