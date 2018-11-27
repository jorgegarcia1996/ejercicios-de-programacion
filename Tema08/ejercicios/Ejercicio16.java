package ejercicios;
import funciones.FuncionesConNumeros;

/**
 * Ejercicio 16 del tema 08
 * 
 * Muestra los números capicúa que hay entre 1 y 99999.
 *
 * @author Jorge García Molina
 */
public class Ejercicio16 {
  public static void main(String[] args) {
    System.out.println("Números capicúa entre 1 y 99999.");
    System.out.println("Los capicúa son: ");
    int linea = 10, j = 0;
    for (int i = 1; i <= 99999; i++) {
      if (FuncionesConNumeros.esCapicua(i)) {
        System.out.printf("%7d",i);
        if (j < linea) {
        j++;
      } else {
        System.out.println();
        j = 0;
      }
      }
      
    }
    System.out.println();
  }
}
