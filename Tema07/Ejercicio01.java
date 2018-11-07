package tema07;

/**
 * Ejercicio 01 del Tema 07
 *
 * Define un array de 12 números enteros con nombre num y asigna los valores
 * según la tabla que se muestra a continuación. Muestra el contenido de todos
 * los elementos del array. ¿Qué sucede con los valores de los elementos que no
 * han sido inicializados?
 *
 * @author Jorge García Molina
 */
public class Ejercicio01 {

  public static void main(String[] args) {
    System.out.println("Array de 12 números con valores vacíos");
    System.out.println();

    //Crear el array y mostrar los datos del mismo
    int[] num = new int[12];
    num[0] = 39;
    num[1] = -2;
    num[4] = 0;
    num[6] = 14;
    num[8] = 5;
    num[9] = 120;
    for (int elemento : num) {
      System.out.print(elemento + " ");
    }
    System.out.println();
    /*
    Los elementos que no son inicializados tienen valor '0'
    */
  }
}