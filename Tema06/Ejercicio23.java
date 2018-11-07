package tema06;

import java.util.Scanner;

/**
 * Ejercicio 23 del Tema 06
 *
 * Las caras de un dado de poker tienen las siguientes figuras: As, K, Q, J, 7 y
 * 8. Escribe un programa que genere de forma aleatoria la tirada de cinco
 * dados.
 *
 * @author Jorge García Molina
 */
public class Ejercicio23 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Dados de póker.");
    System.out.println();

    //Generar los dados
    for (int i = 0; i < 5; i++) {
      String dado = "";
      switch ((int)(Math.random() * 6)) {
        case 0:
          dado = "As";
          break;
        case 1:
          dado = "K";
          break;
        case 2:
          dado = "Q";
          break;
        case 3:
          dado = "J";
          break;
        case 4:
          dado = "7";
          break;
        case 5:
          dado = "8";
          break;
      }
      System.out.print(dado + " ");
    }
    System.out.println();
  }
}
