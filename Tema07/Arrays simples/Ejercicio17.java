package tema07;
import java.util.Scanner;

/**
 * Ejercicio 14 del Tema 07
 *
 * Escribe un programa que muestre por pantalla un array de 10 números enteros
 * generados al azar entre 0 y 100. A continuación, el programa debe pedir un
 * número al usuario. Se debe comprobar que el número introducido por teclado se
 * encuentra dentro del array, en caso contrario se mostrará un mensaje por
 * pantalla y se volverá a pedir un número; así hasta que el usuario introduzca
 * uno correctamente. A continuación, el programa rotará el array hacia la
 * derecha las veces que haga falta hasta que el número introducido quede
 * situado en la posición 0 del array. Por último, se mostrará el array rotado
 * por pantalla.
 *
 * @author Jorge García Molina
 */
public class Ejercicio17 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Reordenar array para que el número seleccionado quede el primero.");
    System.out.println();

    //Crear el array con los números aleatorios
    final int N = 10;
    int[] numeros = new int[N];
    boolean existe = false;
    int mover = 0, primero = Integer.MAX_VALUE;
    for (int i = 0; i < N; i++) {
      numeros[i] = (int)(Math.random() * 101);
    }
    //Mostrar el array
    System.out.println("Números disponibles:");
    System.out.print("Índices: ");
    for (int i = 0; i < N; i++) {
      System.out.printf("%3d |", i);
    }
    System.out.println();
    System.out.print("Números: ");
    for (int elemento : numeros) {
      System.out.printf("%3s |", elemento);
    }
    System.out.println();
    System.out.println();
    while (!existe) {
      System.out.print("¿Qué número desea mover? ");
      mover = Integer.parseInt(s.nextLine());
      for (int elemento : numeros) {
        if (elemento == mover) {
          existe = true;
        }
      }
      if (!existe) {
        System.out.println("Debe introducir un número de la lista anterior.");
      }
    }
    System.out.println();
    while (numeros[0] != mover) {
      primero = numeros[0];
      for (int i = 0; i < N; i++) {
        if (i != (N-1)) {
          numeros[i] = numeros[i+1];
        } else {
          numeros[i] = primero;
        }
      }
    }
    System.out.println("Resultado tras mover los números.");
    System.out.print("Índices: ");
    for (int i = 0; i < N; i++) {
      System.out.printf("%3d |", i);
    }
    System.out.println();
    System.out.print("Números: ");
    for (int elemento : numeros) {
      System.out.printf("%3s |", elemento);
    }
    System.out.println();
  }
}
