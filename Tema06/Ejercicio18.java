package tema06;

/**
 * Ejercicio 18 del Tema 06
 * 
 * Sinestesio y Casilda van a pintar los tres dormitorios de su casa, quieren
 * sustituir el color blanco por colores más alegres. Realiza un programa que
 * genere de forma aleatoria una secuencia de tres colores aleatorios (uno para
 * cada dormitorio) de tal forma que no se repita ninguno. Los colores entre los
 * que debe elegir el programa son los siguientes: rojo, azul, verde, amarillo,
 * violeta y naranja.
 * 
 * 
 * @author jorge
 */
public class Ejercicio18 {

  public static void main(String[] args) {
    System.out.println("Pintar los cuartos de la casa de colores");
    System.out.println();

    //Generar los colores de los cuartos
    String color1 = "", color2 = "", color3 = "";
    for (int i = 0; i < 3; i++) {
     String color = "";
      switch ((int)(Math.random() * 6)) {
        case 0:
          color = "rojo";
          break;
        case 1:
          color = "azul";
          break;
        case 2:
          color = "verde";
          break;
        case 3:
          color = "amarillo";
          break;
        case 4:
          color = "violeta";
          break;
        case 5:
          color = "naranja";
          break;
        default:
      }
      
      switch (i) {
        case 0:
          color1 = color;
          break;
        case 1:
          color2 = color;
          if (color2.equals(color1)) {
            i--;
          }
          break;
        case 2:
          color3 = color;
          if (color3.equals(color2) || color3.equals(color1)) {
            i--;
          }
          break;
        default:
      }
    }
    System.out.println("Habitación 1: " + color1);
    System.out.println("Habitación 2: " + color2);
    System.out.println("Habitación 3: " + color3);
  }
}
