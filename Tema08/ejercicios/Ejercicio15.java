package ejercicios;
import funciones.FuncionesConNumeros;

/**
 * Ejercicio 15 del tema 08
 * 
 * Muestra los números primos que hay entre 1 y 1000.
 *
 * @author Jorge García Molina
 */
public class Ejercicio15 {
  public static void main(String[] args) {
    System.out.println("Números primos entre 1 y 1000.");
    System.out.print("Los primos son: ");
    for (int i = 1; i <= 1000; i++) {
      if (FuncionesConNumeros.esPrimo(i)) {
        System.out.print(i + " ");
      }
    }
    System.out.println();
  }
}
