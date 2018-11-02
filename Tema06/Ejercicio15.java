package tema06;
import java.util.Scanner;

/**
 * Ejercicio 15 del Tema 06
 *
 * Realiza un generador de melodía con las siguientes condiciones. 
 * a) Las notas deben estar generadas al azar. Las 7 notas son do, re, mi, fa, sol, la y si.
 * b) Una melodía está formada por un número aleatorio de notas mayor o igual a
 * 4, menor o igual a 28 y siempre múltiplo de 4 (4, 8, 12…). 
 * c) Cada grupo de 4 notas será un compás y estará separado del siguiente compás mediante la barra
 * vertical “|” (Alt + 1). El final de la melodía se marca con dos barras.
 * d) La última nota de la melodía debe coincidir con la primera.
 *
 * @author Jorge García Molina
 */
public class Ejercicio15 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Generador de melodías");

    //Generar la melodía aleatoria
    int notas = 4 * (int)(Math.random() * 7 + 1);
    String nota = "", primeraNota = "";

    for (int i = 1; i <= notas; i++) {
      switch((int)(Math.random() * 7)) {
        case 0:
          nota = "do";
          break;
        case 1:
          nota = "re";
          break;
        case 2:
          nota = "mi";
          break;
        case 3:
          nota = "fa";
          break;
        case 4:
          nota = "sol";
          break;
        case 5:
          nota = "la";
          break;
        case 6:
          nota = "si";
          break;
        default:
      }

      if (i == 1) {
        primeraNota = nota;
      }

      if (i == notas) {
        nota = primeraNota;
      }

      System.out.print(nota + " ");

      if ( i == notas ) {
        System.out.print("||");
      } else if ( i % 4 == 0 ) {
        System.out.print("| ");
      }
    }
  }
}
