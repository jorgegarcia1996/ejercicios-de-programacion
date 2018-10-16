package tema05;
/**
* Ejercicio 13 del Tema 5
* 
* Escribe un programa que lea una lista de diez números y determine cuántos
* son positivos, y cuántos son negativos.
* 
* @author Jorge García Molina
*/

public class Ejercicio13 {
  public static void main(String[] args) {
    System.out.println("Lector de números.");
    //Pedir el número
    System.out.println("Introduzca 10 números enteros, tras cada número debe pulsar intro:");
    
    //Leer los números y contar cuantos son de cada tipo
    int numPos = 0, numNeg = 0, cantidad;
    for (int i = 0; i < 10; i++) {
      cantidad = Integer.parseInt(System.console().readLine());
      if (cantidad < 0) {
        numNeg++;
      } else {
        numPos++;
      }
    }
    System.out.println("Ha introducido " + numPos + " números positivos.");
    System.out.println("Ha introducido " + numNeg + " números negativos.");
  }
}
