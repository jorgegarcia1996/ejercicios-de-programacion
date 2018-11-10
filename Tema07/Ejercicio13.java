package tema07;

import java.util.Scanner;

/**
 * Ejercicio 13 del Tema 07
 *
 * Escribe un programa que rellene un array de 100 elementos con números enteros
 * aleatorios comprendidos entre 0 y 500 (ambos incluidos). A continuación el
 * programa mostrará el array y preguntará si el usuario quiere destacar el
 * máximo o el mínimo. Seguidamente se volverá a mostrar el array escribiendo el
 * número destacado entre dobles asteriscos.
 *
 * @author Jorge García Molina
 */
public class Ejercicio13 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Destacar el máximo o el mínimo");
    System.out.println();

    //Crear el array y mostrarlo
    final int N = 100;
    int [] numeros = new int[N];
    int linea = 1;
    int minimo = Integer.MAX_VALUE;
    int maximo = Integer.MIN_VALUE;
    for (int i = 0; i < N; i++) {
      numeros[i] = (int)(Math.random() * 501);
      if (linea == 25) {
        System.out.println(numeros[i]);
        linea = 1;
      } else {
        System.out.print(numeros[i] + " ");
        linea++;
      }
    }
    System.out.println();
    //Pedir el valor que se quiere destacar
    System.out.println("¿Qué valor desea destacar?");
    System.out.println("1) - El valor mínimo");
    System.out.println("2) - El valor máximo");
    System.out.print("Introduzca el número de la respuesta (1 - 2): ");
    int destacado = Integer.parseInt(s.nextLine());
    while (destacado < 1 || destacado > 2) {
    System.out.print("Valor incorrecto, introduzca 1 o 2: ");
    destacado = Integer.parseInt(s.nextLine());
    }
    System.out.println();
    //Buscar el máximo y el mínimo
    for (int elemento : numeros) {
      if (elemento < minimo) {
        minimo = elemento;
      } else if (elemento > maximo) {
        maximo = elemento;
      }
    }
    //Mostrar los datos con el valor destacado
    linea = 1;
    for (int i = 0; i < N; i++) {
      if (linea == 26) {
        System.out.println();
        linea = 1;
      } else {
        if (destacado == 1 && numeros[i] == minimo) {
          System.out.print("**" + numeros[i] + "** ");
        } else if (destacado == 2 && numeros[i] == maximo) {
          System.out.print("**" + numeros[i] + "** ");
        } else {
          System.out.print(numeros[i] + " ");
        }
        linea++;
      }
    }
  }
}
