package ejercicios;

import java.util.Scanner;
import funciones.FuncionesExtras;
import funciones.FuncionesDeArraysSimples;

/**
 *
 * @author jorge
 */
public class MenuFuncionesExtras {
  public static void main(String[] args) throws InterruptedException {
    Scanner s = new Scanner(System.in);
    int[] a = new int[10];
    int opcion = 0, n1;
    long num1;
    boolean salir = false;
    do {
      System.out.println();
      System.out.println("Selecciona la funcion que quiere probar "
              + "de la lista de abajo.");
      System.out.println("01.- Función 'convierteArrayEnNumero'.");
      System.out.println("02.- Función 'convierteNumeroEnArray'.");
      System.out.println("03.- SALIR.");
      System.out.println();
      System.out.print("Elige una opción (1 - 3): ");
      opcion = Integer.parseInt(s.nextLine());
      System.out.println();
      switch (opcion) {
        case 1:
          System.out.println("Función 'convierteArrayEnNumero'");
          System.out.println("Función para convertir los elementos de un array simple en un solo número");
          System.out.println("Se va a generar un array de 10 elementos entre 0 y 9");
          a = FuncionesDeArraysSimples.generaArrayInt(10, 0, 9);
          System.out.print("El array generado es: ");
          for (int elemento : a) {
            Thread.sleep(500);
            System.out.print(elemento + " ");
          }
          System.out.println();
          System.out.println("El número creado a partir de los elementos del array es: "
                  + FuncionesExtras.convierteArrayEnNumero(a));
          System.out.println();
          break;
        case 2:
          System.out.println("Función 'convierteNumeroEnArray'");
          System.out.println("Función para convertir cada dígito de un número en un elemento de un array");
          System.out.print("Introduce un número entero: ");
          num1 = Long.parseLong(s.nextLine());
          System.out.println("El array generado a partir del número es el siguiente: ");
          a = FuncionesExtras.convierteNumeroEnArray(num1);
          n1 = a.length;
          System.out.print("Índice:");
          for (int i = 0; i < n1; i++) {
            System.out.print(" " + i + " ");
          }
          System.out.println();System.out.print("Valor: ");
          for (int i = 0; i < n1; i++) {
            System.out.print(" " + a[i] + " ");
          }
          System.out.println();
          break;
        case 3:
          salir = true;
          break;
        default:
          System.out.println("La opción seleccionada no es válida.");
      }
    } while (!salir);
  }
}
