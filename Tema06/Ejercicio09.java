package tema06;
/**
 * Ejercicio 09 del Tema 06
 * 
 * Realiza un programa que vaya generando números aleatorios pares entre 0 y 100
 * y que no termine de generar números hasta que no saque el 24. El programa
 * deberá decir al final cuántos números se han generado.
 * 
 * @author jorge
 */
public class Ejercicio09 {
  public static void main(String[] args) {
    System.out.println("Numeros aleatorios hasta que sale el 24.");
    
    //Generar los números y comprobar si el numero generado es 24 o no
    int numero = 0, i = 0;
    while (numero != 24) {
      numero = (int)(Math.random() * 101);
      System.out.print(numero + " ");
      i++;
    }
    System.out.println();
    System.out.println("Se han generado " + i + " números.");
  }
}
