package tema07;

import java.util.Scanner;

/**
 * Ejercicio 14 del Tema 07
 *
 * Escribe un programa que pida 8 palabras y las almacene en un array. A
 * continuación, las palabras correspondientes a colores se deben almacenar al
 * comienzo y las que no son colores a continuación. Puedes utilizar tantos
 * arrays auxiliares como quieras. Los colores que conoce el programa deben
 * estar en otro array y son los siguientes: verde, rojo, azul, amarillo,
 * naranja, rosa, negro, blanco y morado.
 *
 * @author Jorge García Molina
 */
public class Ejercicio14 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Ordenar palabras de un array");
    System.out.println();

    //Crear el array con las palabras del usuario y mostrarlas
    final int N = 8;
    String[] palabrasDesordenadas = new String[N];
    for (int i = 0; i < N; i++) {
      System.out.print("Introduzca una palabra, luego pulse 'INTRO': ");
      palabrasDesordenadas[i] = s.nextLine().toLowerCase();
    }
    System.out.println();
    System.out.println("-----Palabras introducidas-----");
    System.out.print("Índices: ");
    for (int i = 0; i < N; i++) {
      System.out.printf("%15d |", i);
    }
    System.out.println();
    System.out.print("Valores: ");
    for (String elemento : palabrasDesordenadas) {
      System.out.printf("%15s |", elemento);
    }
    System.out.println();
    //Ordenar las palabras
    String[] palabrasOrdenadas = new String[N];
    int numColores = 0, numNoColores = N - 1;
    for (int i = 0; i < N; i++) {
      boolean color = false;
      switch (palabrasDesordenadas[i]) {
        case "verde":
        case "rojo":
        case "azul":
        case "amarillo":
        case "naranja":
        case "rosa":
        case "negro":
        case "blanco":
        case "morado":
          color = true;
          break;
        default:
      }
      if (color) {
        palabrasOrdenadas[numColores] = palabrasDesordenadas[i];
        numColores++;
      } else {
        palabrasOrdenadas[numNoColores] = palabrasDesordenadas[i];
        numNoColores--;
      }
    }
    System.out.println();
    System.out.println("-----Palabras ordenadas-----");
    //Mostrar las palabras ordenadas
    System.out.print("Índices: ");
    for (int i = 0; i < N; i++) {
      System.out.printf("%15d |", i);
    }
    System.out.println();
    System.out.print("Valores: ");
    for (String elemento : palabrasOrdenadas) {
      System.out.printf("%15s |", elemento);
    }
    System.out.println();
  }
}
