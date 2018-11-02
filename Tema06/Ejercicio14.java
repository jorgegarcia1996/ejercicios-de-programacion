package tema06;
import java.util.Scanner;

/**
 * Ejercicio 14 del Tema 06
 *
 * Realiza un programa que haga justo lo contrario a lo que hace el ejercicio 6.
 * El programa intentará adivinar el número que estás pensando - un número entre
 * 0 y 100 - teniendo para ello 5 oportunidades. En cada intento fallido, el
 * programa debe preguntar si el número que estás pensando es mayor o menor que
 * el que te acaba de decir.
 *
 * @author Jorge García Molina
 */
public class Ejercicio14 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Adivina el número versión 2 (El programa es quién adivina).");
    System.out.println();

    //Generar el número, decirselo al usuario y preguntar si es o no el que pensaba
    int minimo = 0, maximo = 100, respuesta = 0;
    boolean acierto = false;
    for (int i = 1; i <= 5; i++) {
      int numero = (int)(Math.random() * (maximo - minimo) + minimo);
      System.out.println("Intento Nº " + i);
      System.out.println("¿Estás pensando en el " + numero + "?");
      System.out.println("1) Si, es ese.");
      System.out.println("2) No, es mayor.");
      System.out.println("3) No, es menor.");
      System.out.print("Respuesta: ");    
      respuesta = Integer.parseInt(s.nextLine());
      
      switch (respuesta) {
        case 1:
          acierto = true;
          i = 10;
          System.out.println("¡Bien, he acertado!");
          break;
        case 2:
          minimo = numero + 1;
          break;
        case 3:
          maximo = numero - 1;
          break;
        default:
      }
      System.out.println();
    }
    if (!acierto) {
      System.out.println("No he acertado, que pena.");
    }
  }
}
