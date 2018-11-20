package tema07.ArraysBidimensionales;
import java.util.Scanner;

/**
 * Ejercicio 08 del Tema 07 (Arrays bidimensionales)
 *
 * Escribe un programa que, dada una posición en un tablero de ajedrez, nos diga
 * a qué casillas podría saltar un alfil que se encuentra en esa posición. Como
 * se indica en la figura, el alfil se mueve siempre en diagonal. El tablero
 * cuenta con 64 casillas. Las columnas se indican con las letras de la “a” a la
 * “h” y las filas se indican del 1 al 8.
 *
 * @author Jorge García Molina
 */
public class Ejercicio08 {

  public static void main(String[] args) throws InterruptedException {
    Scanner s = new Scanner(System.in);
    System.out.println("Movimiento del alfil");
    System.out.println();

    //Pedir la posción del alfil y comprobar que sea válida
    boolean valido;
    int fila = 0, columna = 0;
    do {
      valido = false;
      System.out.print("Introduzca la posición del alfil: ");
      String alfil = s.nextLine();
      columna = (int)(alfil.charAt(0)) - 96;
      fila = (int)(alfil.charAt(1)) - 48;
      if ((columna > 8 || fila > 8) || (columna < 1 || fila < 1)) {
        System.out.println("Coordenada no válida.");
      } else {
        valido = true;
        System.out.println();
      }
    } while (!valido);
    
    //Decir las posiciones en las que se pueden o no mover el array
    System.out.print("El alfil se puede mover a las posiciones: ");
    for (int i = 1; i < 9; i++) {
      for (int j = 1; j < 9; j++) {
        if ((Math.abs(i - fila) == Math.abs(j - columna)) && Math.abs(i - fila) != 0) {
          System.out.print((char)(j + 96) + "" + i + " ");
        }
      }
    }
    System.out.println();
  }
}