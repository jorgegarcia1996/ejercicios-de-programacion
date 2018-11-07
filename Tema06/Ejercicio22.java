package tema06;
import java.util.Scanner;

/**
 * Ejercicio 22 del Tema 06
 *
 * Realiza un programa que pinte por pantalla una serpiente con un “serpenteo”
 * aleatorio. La cabeza se representará con el carácter @ y se debe colocar
 * exactamente en la posición 13 (con 12 espacios delante). A partir de ahí, el
 * cuerpo irá serpenteando de la siguiente manera: se generará de forma
 * aleatoria un valor entre tres posibles que hará que el siguiente carácter se
 * coloque una posición a la izquierda del anterior, alineado con el anterior o
 * una posición a la derecha del anterior. La longitud de la serpiente se pedirá
 * por teclado y se supone que el usuario introducirá un dato correcto.
 *
 * @author Jorge García Molina
 */
public class Ejercicio22 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Serpiente serpenteante.");
    System.out.print("Introduzca la longitud de la serpiente: ");
    int longitud = Integer.parseInt(s.nextLine());

    //Generar las monedas y su lanzamiento
    int espacios = 12;
    for (int i = 0; i < longitud; i++) {
       
      for (int j = 0; j < espacios; j++) {
        System.out.print(" ");
      }
      
      if (i == 0) {
        System.out.println("@");
      } else {
        System.out.println("*");
      }
      
      int desplazamiento = (int)((Math.random() * 4) - 2);
      espacios += desplazamiento;
    }
  }
}