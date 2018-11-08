package tema07;
import java.util.Scanner;

/**
 * Ejercicio 05 del Tema 07
 *
 * Escribe un programa que pida 10 números por teclado y que luego muestre los
 * números introducidos junto con las palabras “máximo” y “mínimo” al lado del
 * máximo y del mínimo respectivamente.
 *
 * @author Jorge García Molina
 */
public class Ejercicio05 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Detectar máximo y mínimo de un array con numeros"
            + " introducidos por teclado");
    System.out.println();

    //Crear el array con los numeros del usuario
    int[] numeros = new int[10];
    for (int i = 0; i < 10; i++) {
      System.out.print("Introduzca un número entero y pulse 'intro': ");
      int numero = Integer.parseInt(s.nextLine());
      numeros[i] = numero;
    }
    //Detectar el máximo y el mínimo
    int maximo = Integer.MIN_VALUE;
    int minimo = Integer.MAX_VALUE;
    for (int elemento : numeros) {
      if (elemento < minimo) {
        minimo = elemento;
      } else if (elemento > maximo) {
        maximo = elemento;
      }
    }
    //Mostrar el resultado
    for (int elemento : numeros) {
      if (elemento == minimo) {
        System.out.println(elemento + " --> MÍNIMO");
      } else if (elemento == maximo) {
        System.out.println(elemento + " --> MÁXIMO");
      } else {
        System.out.println(elemento);
      }
    }
  }
}
