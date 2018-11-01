package tema06;
/**
 * Ejercicio 13 del Tema 06
 * 
 * Escribe un programa que simule la tirada de dos dados. El programa deberá
 * continuar tirando los dados una y otra vez hasta que en alguna tirada los dos
 * dados tengan el mismo valor.
 * 
 * @author Jorge García Molina
 */
public class Ejercicio13 {
   public static void main(String[] args) {
    System.out.println("Tirar los dados hasta que tengan el mismo valor.");
    
    //Generar los caracteres y mostrarlos por pantalla
    int dado1, dado2;
    do {
      dado1 = (int)((Math.random() * 6) + 1);
      dado2 = (int)((Math.random() * 6) + 1);
      System.out.println("Dado1: " + dado1 + " | Dado 2: " + dado2);
    } while (dado1 != dado2);
  }
}