package tema06;
import java.util.Scanner;
/**
 * Ejercicio 05 del Tema 06
 * 
 * Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos)
 * separados por espacios. Muestra también el máximo, el mínimo y la media
 * de esos números.
 * 
 * @author jorge
 */
public class Ejercicio05 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("50 números aleatorios entre 100 y 199, el mayor, "
            + "el menor y la media.");
    
    //Tirada de 3 dados
    int mayor = 0, menor = 200, media = 0, suma = 0;
    for (int i = 0; i < 50; i++) {
      int numero = (int)(Math.random() * 100) + 100;
      System.out.print(numero + " ");
      if (numero < menor) {
        menor = numero;
      }
      if (numero > mayor) {
        mayor = numero;
      }
      suma += numero;
    }
    System.out.println();
    media = suma / 50;
    System.out.println("El mayor número es: " + mayor);
    System.out.println("El menor número es: " + menor);
    System.out.println("La media de los números es: " + media);
  }
}