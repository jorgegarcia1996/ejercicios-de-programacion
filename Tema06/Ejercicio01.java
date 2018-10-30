package tema06;
/**
 * Ejercicio 01 del Tema 06
 * 
 * Escribe un programa que muestre la tirada de tres dados. Se debe mostrar
 * también la suma total (los puntos que suman entre los tres dados).
 * 
 * @author jorge
 */
public class Ejercicio01 {
  public static void main(String[] args) {
    System.out.println("Tirada de dados.");
    
    //Tirada de 3 dados
    int suma = 0;
    for (int i = 1; i <= 3; i++) {
      int tirada = (int)(Math.random()*6) + 1;
      System.out.println("Dado " + i + ": " + tirada);
      suma += tirada;
    }
    System.out.println("El total es: " + suma);
  }
}
