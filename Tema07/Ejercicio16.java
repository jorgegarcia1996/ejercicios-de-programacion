package tema07;

import java.util.Scanner;

/**
 * Ejercicio 16 del Tema 07
 *
 * Escribe un programa que rellene un array de 20 elementos con números ente-
 * ros aleatorios comprendidos entre 0 y 400 (ambos incluidos). A continuación
 * el programa mostrará el array y preguntará si el usuario quiere resaltar los
 * múltiplos de 5 o los múltiplos de 7. Seguidamente se volverá a mostrar el
 * array escribiendo los números que se quieren resaltar entre corchetes.
 *
 * @author Jorge García Molina
 */
public class Ejercicio16 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Resaltar múltiplos de 5 o 7");
    System.out.println();

    //Crear el array con los números aleatorios y mostrar los datos al usuario
    final int N = 20;
    int[] numeros = new int[N];
    int multiplo = 0;
    System.out.print("Los númeos disponibles son: ");
    for (int i = 0; i < N; i++) {
      numeros[i] = (int)(Math.random() * 401);
      System.out.print(numeros[i] + " ");
    }
    System.out.println();
    System.out.println();
    //Pedir al usuario qué números quiere resaltar
    System.out.println("¿Qué números desea resaltar?");
    System.out.println("1- Los múltoplos de 5.");
    System.out.println("2- Los múltiplos de 7.");
    System.out.print("Escriba su respuesta (1 - 2): ");
    int respuesta = Integer.parseInt(s.nextLine());
    System.out.println();
    //Comprobar y marcar los números que ha dicho el usuario
    switch (respuesta) {
      case 1:
        multiplo = 5;
        break;
      case 2:
        multiplo = 7;
        break;
      default:
        System.out.println("La respuesta debe ser 1 o 2.");
    }
    if (multiplo != 0) {
      System.out.print("Los múltiplos de '" + multiplo + "' se han resaltado: ");
      for (int elemento : numeros) {
        if (elemento % multiplo == 0) {
          System.out.print("[" + elemento + "] ");
        } else {
          System.out.print(elemento + " ");
        }
      }
    }
    System.out.println();
  }
}
