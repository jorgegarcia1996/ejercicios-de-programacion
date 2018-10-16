package tema05;

/**
 * 5. Bucles
 * 
 * 15. Escribe un programa que dados dos números, uno real (base) y un
 *     entero positivo (exponente), saque por pantalla todas las potencias
 *     con base el numero dado y exponentes entre uno y el exponente introducido.
 *     No se deben utilizar funciones de exponenciación. Por ejemplo, si
 *     introducimos el 2 y el 5, se deberán mostrar 2¹, 2², 2³, 2⁴ y 2⁵.
 * 
 * @author Luis José Sánchez
 */

import java.util.Scanner;
public class Ejercicio15 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Cadena de potencias.");
    System.out.print("Introduzca la base: ");
    int base = Integer.parseInt(s.nextLine());
    
    System.out.print("Introduzca el exponente máximo: ");
    int exponente = Integer.parseInt(s.nextLine());
        
    for (int i = 1; i <= exponente; i++) {
      System.out.print(base + "^" + i + " ");
    }

  }
}