package tema07;
import java.util.Scanner;

/**
 * Ejercicio 06 del Tema 07
 *
 * Escribe un programa que lea 15 números por teclado y que los almacene en un
 * array. Rota los elementos de ese array, es decir, el elemento de la posición
 * 0 debe pasar a la posición 1, el de la 1 a la 2, etc. El número que se
 * encuentra en la última posición debe pasar a la posición 0. Finalmente,
 * muestra el contenido del array.
 *
 * @author Jorge García Molina
 */
public class Ejercicio06 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Pasar el último elemento de un array al primero y "
            + "mover el resto hacia la derecha");
    System.out.println();

    //Crear el array con los numeros del usuario
    int[] numeros = new int[15];
    for (int i = 0; i < 15; i++) {
      System.out.print("Introduzca un número entero y pulse 'intro': ");
      int numero = Integer.parseInt(s.nextLine());
      numeros[i] = numero;
    }
    //Guardar el valos de la última posicion en una variable
    int ultimo = numeros[14];
    //mostrar los datos recolocados
    for (int i = -1; i < 14; i++) {
      if (i < 0) {
        System.out.print(ultimo + " ");
      } else {
        System.out.print(numeros[i] + " ");
      }
    }
    System.out.println();
  }
}
