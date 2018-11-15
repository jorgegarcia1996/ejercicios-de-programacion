package tema07;

import java.util.Scanner;

/**
 * Ejercicio 12 del Tema 07
 *
 * Realiza un programa que pida 10 números por teclado y que los almacene en un
 * array. A continuación se mostrará el contenido de ese array junto al índice
 * (0 – 9). Seguidamente el programa pedirá dos posiciones a las que llamaremos
 * “inicial” y “final”. Se debe comprobar que inicial es menor que final y que
 * ambos números están entre 0 y 9. El programa deberá colocar el número de la
 * posición inicial en la posición final, rotando el resto de números para que
 * no se pierda ninguno. Al final se debe mostrar el array resultante.
 *
 * @author Jorge García Molina
 */
public class Ejercicio12 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Mover un valos de una posición a otra, desplazando el resto");
    System.out.println();

    //Crear el array y pedir los datos al usuario
    final int N = 10;
    int[] numeros = new int[N];
    for (int i = 0; i < N; i++) {
      System.out.print("Introduzca un número entero, luego pulse 'INTRO': ");
      numeros[i] = Integer.parseInt(s.nextLine());
    }
    System.out.println();
    //Mostrar los datos del array y su índice correspondiente
    System.out.println("Datos introducidos:");
    System.out.print("Índices: ");
    for (int i = 0; i < N; i++) {
      System.out.printf("%5d |", i);

    }
    System.out.println();
    System.out.print("Valores: ");
    for (int elemento : numeros) {
      System.out.printf("%5d |", elemento);
    }
    System.out.println();
    System.out.println();
    //Pedir el valor de 'inicial' y 'fin' y comprobarlos, 
    System.out.print("Introduzca el índice del valor que desea desplazar (0-9): ");
    int inicial = Integer.parseInt(s.nextLine());
    while (inicial < 0 || inicial > 9) {
      System.out.print("Valor incorrecto, introduzca un número entero del 0 al 9: ");
      inicial = Integer.parseInt(s.nextLine());
    }
    System.out.print("Introduzca el índice donde dese colocar el valor ("
            + inicial +  "-9): ");
    int fin = Integer.parseInt(s.nextLine());
    while (fin <= inicial || fin > 9) {
      System.out.print("Valor incorrecto, introduzca un número entero del " + inicial + " al 9: ");
      fin = Integer.parseInt(s.nextLine());
    }
    System.out.println();
    //Desplazar el valor 'inicial' a la posición 'final' y desplazar el resto de elementos
    int[] auxNumeros = new int[N];
    System.arraycopy(numeros, 0, auxNumeros, 0, N);
    auxNumeros[fin] = numeros[inicial];
    for (int i = fin + 1; i > N; i++) {
      auxNumeros[i] = numeros[i + 1];
    }
    auxNumeros[0] = numeros[N - 1];
    System.arraycopy(numeros, 0, auxNumeros, 1, inicial);
    //Mostrar el resultado
    System.out.println("Resultado:");
    System.out.print("Índices: ");
    for (int i = 0; i < N; i++) {
      System.out.printf("%5d |", i);

    }
    System.out.println();
    System.out.print("Valores: ");
    for (int elemento : auxNumeros) {
      System.out.printf("%5d |", elemento);
    }
    System.out.println();
  }
}
