package tema06;
/**
 * Ejercicio 07 del Tema 06
 * 
 * Escribe un programa que muestre tres apuestas de la quiniela en tres colum-
nas para los 14 partidos y el pleno al quince (15 filas).
 * 
 * @author jorge
 */
public class Ejercicio07 {
  public static void main(String[] args) {
    System.out.println("Quiniela.");
    
    //Hacar la quiniela
    int resultadoPartido = 0;
    int columnas = 3;
    for (int fila = 1; fila <= 15; fila++) {
      System.out.printf("%4d. |", fila);
      if (fila == 15) {
        columnas = 1;
      }
      for (int apuesta = 1; apuesta <= columnas; apuesta++) {
        resultadoPartido = (int)(Math.random() * 3) + 1;
        switch(resultadoPartido) {
          case 1:
            System.out.print("1  |");
            break;
          case 2:
            System.out.print("  2|");
            break;
          case 3:
            System.out.print(" X |");
          default:
        }
      }
      System.out.println();
    }
  }
}
