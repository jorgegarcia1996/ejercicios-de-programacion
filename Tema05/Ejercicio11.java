package tema05;
/**
* Ejercicio 11 del Tema 5
* 
* Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de
* los 5 primeros números enteros a partir de uno que se introduce por teclado.
* 
* @author Jorge García Molina
*/

public class Ejercicio11 {
  public static void main(String[] args) {
    System.out.println("Calcular la media de 'x' números.");
    //Pedir el número
    System.out.println("Introduzca números positivos, cuando termine introduzca un número negativo.");
    int numero = Integer.parseInt(System.console().readLine());
    
    //Calcular y mostrar el número, cuadrado y el cubo en 3 columnas
    System.out.printf("%-10s ║ %-10s ║ %-10s \n", "Número", "Cuadrado", "Cubo");
    System.out.printf("═══════════╬════════════╬═══════════ \n");
    for (int i = 0; i < 5; i++) {
      numero = numero + i;
      int cuadrado = numero * numero;
      int cubo = cuadrado * numero;
      System.out.printf("%-10d ║ %-10d ║ %-10d \n", numero, cuadrado, cubo);
    }
  }
}
