package tema07;

/**
 * Ejercicio 02 del Tema 07
 *
 * Define un array de 10 caracteres con nombre simbolo y asigna valores a los
 * elementos según la tabla que se muestra a continuación. Muestra el contenido
 * de todos los elementos del array. ¿Qué sucede con los valores de los
 * elementos que no han sido inicializados?
 *
 * @author Jorge García Molina
 */
public class Ejercicio02 {

  public static void main(String[] args) {
    System.out.println("Array de 12 números con valores vacíos");
    System.out.println();

    //Crear el array y mostrar los datos del mismo
    String[] simbolo = new String[10];
    simbolo[0] = "a";
    simbolo[1] = "x";
    simbolo[4] = "@";
    simbolo[6] = " ";
    simbolo[7] = "+";
    simbolo[8] = "Q";
    for (String elemento : simbolo) {
      System.out.print(elemento + " ");
    }
    System.out.println();
    /*
    Los elementos que no son inicializados tienen valor '0'
    */
  }
}