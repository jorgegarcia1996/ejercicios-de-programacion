
package tema06;
import java.util.Scanner;

/**
 * Ejercicio 21 del Tema 06
 *
 * Realiza un programa que genere una secuencia de cinco monedas de curso legal
 * lanzadas al aire. Las monedas disponibles son de 1 céntimo, 2 céntimos, 5
 * céntimos, 10 céntimos, 20 céntimos, 50 céntimos, 1 euro y 2 euros. Las dos
 * posiciones posibles son cara y cruz.
 *
 * @author Jorge García Molina
 */
public class Ejercicio21 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Cara o cruz.");
    System.out.println();

    //Generar las monedas y su lanzamiento
    for (int i = 0; i < 5; i++) {
      String moneda = "", resultado = "";
      //Generar la moneda
      switch ((int)(Math.random() * 8)) {
        case 0:
          moneda = "1 céntimo";
          break;
        case 1:
          moneda = "2 céntimos";
          break;
        case 2:
          moneda = "5 céntimos";
          break;
        case 3:
          moneda = "10 céntimos";
          break;
        case 4:
          moneda = "20 céntimos";
          break;
        case 5:
          moneda = "50 céntimos";
          break;
        case 6:
          moneda = "1 euro";
          break;
        case 7:
          moneda = "2 euros";
          break;
        default:
      }
      //Generar el resultado
      switch ((int)(Math.random() * 2)) {
        case 0:
          resultado = "cara";
          break;
        case 1:
          resultado = "cruz";
          break;
        default:
      }
      System.out.println(moneda + " - " + resultado);
    }
  }
}
