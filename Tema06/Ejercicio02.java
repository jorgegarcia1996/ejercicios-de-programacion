package tema06;
import java.util.Scanner;
/**
 * Ejercicio 02 del Tema 06
 * 
 * Realiza un programa que muestre al azar el nombre de una carta de la
 * baraja francesa. Esta baraja está dividida en cuatro palos: picas, corazones,
 * diamantes y tréboles. Cada palo está formado por 13 cartas, de las cuales 9
 * cartas son numerales y 4 literales: 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K y A
 * (que sería el 1).
 * 
 * @author jorge
 */
public class Ejercicio02 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Carta aleatoria.");
    
    //Generar carta aleatoria
    int numero = (int)(Math.random() * 13) + 1;
    int palo = (int)(Math.random() * 4) + 1;
    switch (numero) {
      case 1:
        System.out.print("A");
        break;
      case 11:
        System.out.print("J");
        break;
      case 12:
        System.out.print("Q");
        break;
      case 13:
        System.out.print("K");
        break;
      default:
        System.out.print(numero);
    }
    switch (palo) {
      case 1:
        System.out.println("♠");
        break;
      case 2:
        System.out.println("♣");
        break;
      case 3:
        System.out.println("♦");
        break;
      case 4:
        System.out.println("♥");
        break;
      default:
    }
  }
}