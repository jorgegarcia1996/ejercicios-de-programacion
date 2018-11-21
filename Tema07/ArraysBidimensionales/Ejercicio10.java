package tema07.ArraysBidimensionales;
import java.util.Scanner;

/**
 * Ejercicio 10 del Tema 07 (Arrays bidimensionales)
 *
 * Realiza el juego del 3 en raya
 *
 * @author Jorge García Molina
 */
public class Ejercicio10 {

  public static void main(String[] args) throws InterruptedException {
    Scanner s = new Scanner(System.in);
    System.out.println("3 en raya");
    System.out.println();

    //Variables y arrays
    final String JUGADOR = "O";
    final String IA = "X";
    String[][] tablero = new String[3][3];
    int i;
    int j;
    int movimientos = 0;
    boolean jugadorGana = false;
    boolean ordenadorGana = false;
    String nombreFila = "cba";
    String coordenadas;
    
    // Inicializa el tablero
    for(i = 0; i < 3; i++) {
      for(j = 0; j < 3; j++) {
        tablero[i][j] = " ";
      }
    }
      

    // El Juego /////////////////////////////////////////////////
    do {
      
      // Pinta el tablero
      System.out.println("  -------------");
      for(i = 0; i < 3; i++) {
        System.out.print(nombreFila.charAt(i)+ " ");
        for(j = 0; j < 3; j++) {
          System.out.print("| " + tablero[i][j] + " ");
          }
        System.out.println("|");
        System.out.println("  -------------");
      }
      System.out.println("     1   2   3\n");
      
      // pide las coordenadas
      System.out.print("Introduzca las coordenadas, por ejemplo b2: ");
      coordenadas = s.nextLine();
      int fila = nombreFila.indexOf(coordenadas.charAt(0));
      int columna = coordenadas.charAt(1) - 1 - 48;
      tablero[fila][columna] = JUGADOR;
      movimientos++;
      
      // comprueba si gana el jugador
      jugadorGana = (
        (tablero[0][0].equals(JUGADOR)) && (tablero[0][1].equals(JUGADOR)) && (tablero[0][2].equals(JUGADOR)) ||
        (tablero[1][0].equals(JUGADOR)) && (tablero[1][1].equals(JUGADOR)) && (tablero[1][2].equals(JUGADOR)) ||
        (tablero[2][0].equals(JUGADOR)) && (tablero[2][1].equals(JUGADOR)) && (tablero[2][2].equals(JUGADOR)) ||
        (tablero[0][0].equals(JUGADOR)) && (tablero[1][0].equals(JUGADOR)) && (tablero[2][0].equals(JUGADOR)) ||
        (tablero[0][1].equals(JUGADOR)) && (tablero[1][1].equals(JUGADOR)) && (tablero[2][1].equals(JUGADOR)) ||
        (tablero[0][2].equals(JUGADOR)) && (tablero[1][2].equals(JUGADOR)) && (tablero[2][2].equals(JUGADOR)) ||
        (tablero[0][0].equals(JUGADOR)) && (tablero[1][1].equals(JUGADOR)) && (tablero[2][2].equals(JUGADOR)) ||
        (tablero[0][2].equals(JUGADOR)) && (tablero[1][1].equals(JUGADOR)) && (tablero[2][0].equals(JUGADOR))
      );
      
      if (!jugadorGana && (movimientos < 9)) {
        // juega el ordenador
        do {
          fila = (int)(Math.random() * 3);
          columna = (int)(Math.random() * 3);
        } while (!tablero[fila][columna].equals(" "));
        
        tablero[fila][columna] = IA;
        movimientos++;
        // comprueba si gana el ordenador
        ordenadorGana = (
          (tablero[0][0].equals(IA)) && (tablero[0][1].equals(IA)) && (tablero[0][2].equals(IA)) ||
          (tablero[1][0].equals(IA)) && (tablero[1][1].equals(IA)) && (tablero[1][2].equals(IA)) ||
          (tablero[2][0].equals(IA)) && (tablero[2][1].equals(IA)) && (tablero[2][2].equals(IA)) ||
          (tablero[0][0].equals(IA)) && (tablero[1][0].equals(IA)) && (tablero[2][0].equals(IA)) ||
          (tablero[0][1].equals(IA)) && (tablero[1][1].equals(IA)) && (tablero[2][1].equals(IA)) ||
          (tablero[0][2].equals(IA)) && (tablero[1][2].equals(IA)) && (tablero[2][2].equals(IA)) ||
          (tablero[0][0].equals(IA)) && (tablero[1][1].equals(IA)) && (tablero[2][2].equals(IA)) ||
          (tablero[0][2].equals(IA)) && (tablero[1][1].equals(IA)) && (tablero[2][0].equals(IA))
        );
      }

    } while (!jugadorGana && !ordenadorGana && (movimientos < 9));
    System.out.println();

    // pinta el tablero
    System.out.println("  -------------");
    for(i = 0; i < 3; i++) {
      System.out.print(nombreFila.charAt(i)+ " ");
      for(j = 0; j < 3; j++) {
        System.out.print("| " + tablero[i][j] + " ");
        }
      System.out.println("|");
      System.out.println("  -------------");
    }
    System.out.println("     1   2   3\n");

    if (jugadorGana) {
      System.out.println("¡Enhorabuena! ¡Has ganado!");
    } else if (ordenadorGana) {
      System.out.println("Gana el ordenador.");
    } else {
      System.out.println("Empate. No gana nadie.");
    }
    
  }
}