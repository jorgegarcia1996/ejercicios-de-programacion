package tema06;
import java.util.Scanner;
/**
 * Ejercicio 04 del Tema 06
 * 
 * Muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos)
 * separados por espacios.
 * 
 * @author jorge
 */
public class Ejercicio04 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("20 numeros aleatorios entre 0 y 10.");
    
    //Generar 20 números
    for (int i = 0; i < 20; i++) {
      int numero = (int)(Math.random() * 11);
      System.out.print(numero + " ");
    }
    System.out.println();
  }
}