package tema07;

import java.util.Scanner;

/**
 * Ejercicio 07 del Tema 07
 *
 * Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los
 * muestre por pantalla separados por espacios. El programa pedirá entonces por
 * teclado dos valores y a continuación cambiará todas las ocurrencias del
 * primer valor por el segundo en la lista generada anteriormente. Los números
 * que se han cambiado deben aparecer entrecomillados.
 *
 * @author Jorge García Molina
 */
public class Ejercicio07 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Pasar el último elemento de un array al primero y "
            + "mover el resto hacia la derecha");
    System.out.println();

    //Crear el array con los numeros aleatorios
    int[] numeros = new int[100];
    for (int i = 0; i < 100; i++) {
      int numero = (int) (Math.random() * 21);
      System.out.print(numero + " ");
      numeros[i] = numero;
    }
    System.out.println();
    //Pddir el número a cambiar y en nuevo número al usuario
    System.out.print("Introduzca el numero que desea cambiar de la lista anterior: ");
    int cambiar = Integer.parseInt(s.nextLine());
    System.out.print("Introduzca el nuevo número: ");
    int nuevo = Integer.parseInt(s.nextLine());
    //Mostrar los valores cambiados
    for (int elemento : numeros) {
      if (elemento == cambiar) {
        System.out.print("'" + nuevo + "' ");
      } else {
        System.out.print(elemento + " ");
      }
    }
    System.out.println();
  }
}
