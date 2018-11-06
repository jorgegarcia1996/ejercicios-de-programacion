package tema06;
import java.util.Scanner;

/**
 * Ejercicio 17 del Tema 06
 *
 * Realiza un programa que pinte por pantalla una pecera con un pececito dentro.
 * Se debe pedir al usuario el ancho y el alto de la pecera, que como mínimo
 * serán de 4 unidades. No hay que comprobar que los datos se introducen
 * correctamente; podemos suponer que el usuario los introduce bien. Dentro de
 * la pecera hay que colocar de forma aleatoria un pececito, que puede estar
 * situado en cualquiera de las posiciones que quedan en el hueco que forma el
 * rectángulo.
 *
 * @author Jorge García Molina
 */
public class Ejercicio17 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Pez en la pecera.");
    System.out.print("Introduzla la altura de la pecera (mínimo 4): ");
    int altura = Integer.parseInt(s.nextLine());
    System.out.print("Introduzca el ancho de la pecera (mínimo 4): ");
    int ancho = Integer.parseInt(s.nextLine());
    System.out.println();

    //Crear la pecera y generar el pez.
    //Variables
    int altoAgua = altura - 2, anchoAgua = ancho - 2;
    int posicionX = (int)(Math.random() * altoAgua);
    int posicionY = (int)(Math.random() * anchoAgua);
    //Marco superior de la pecera
    for (int i = 0; i < ancho; i++) {
      System.out.print("*");
    }
    System.out.println();
    //Contenido de la pecera y pez
    for (int i = 0; i < altoAgua; i++) {
      System.out.print("*");
      for (int j = 0; j < anchoAgua; j++) {
        if (posicionX == i && posicionY == j) {
          System.out.print("&");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println("*");
    }
    //Marco inferior de la pecera
    for (int i = 0; i < ancho; i++) {
      System.out.print("*");
    }
    System.out.println();
  }
}
