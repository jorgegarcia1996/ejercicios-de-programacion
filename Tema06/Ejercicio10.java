package tema06;
/**
 * Ejercicio 09 del Tema 06
 * 
 * Realiza un programa que pinte por pantalla diez líneas formadas por carac-
 * teres. El carácter con el que se pinta cada línea se elige de forma aleatoria
 * entre uno de los siguientes: *, -, =, ., |, @. Las líneas deben tener una
 * longitud aleatoria entre 1 y 40 caracteres.
 * 
 * @author jorge
 */
public class Ejercicio10 {
  public static void main(String[] args) {
    System.out.println("Líneas de símbolos.");
    
    //Generar los números y comprobar si el numero generado es 24 o no
    for (int i = 0; i < 10; i++) {
      int caracter = (int)(Math.random() * 6);
      String simbolo = "";
      switch (caracter) {
        case 0:
          simbolo = "*";
          break;
        case 1:
          simbolo = "-";
          break;
        case 2:
          simbolo = "=";
          break;
        case 3:
          simbolo = ".";
          break;
        case 4:
          simbolo = "|";
          break;
        case 5:
          simbolo = "@";
          break;
        default:
      }
      int longitud = (int)(Math.random() * 40) + 1;
      for (int j = 0; j < longitud; j++) {
        System.out.print(simbolo);
      }
      System.out.println();
    }
  }
}
