package tema06;

/**
 * Ejercicio 25 del Tema 06
 *
 * Escribe un programa que muestre por pantalla 100 números enteros separa- dos
 * por un espacio. Los números deben estar generados de forma aleatoria en un
 * rango entre 10 y 200 ambos incluidos. Los primos deben aparecer entre
 * almohadillas (p. ej. #19#) y los múltiplos de 5 entre corchetes (p. ej.
 * [25]).
 *
 * @author Jorge García Molina
 */
public class Ejercicio25 {

  public static void main(String[] args) {
    System.out.println("100 númeroa aleatorios entre 10 y 200, #primos# y [múltiplos de 5]");
    System.out.println();

    //Generar los números y mostrarlos por pantalla
    for (int i = 0; i < 100; i++) {
      boolean primo = true;
      int numero = (int)(Math.random() * 191) + 10;
      //comprobar primo
      for (int j = 2; j < numero; j++){
        if ((numero % j) == 0) {
          primo = false;
        }
      }
        
      if (numero % 5 == 0) {
        System.out.print("[" + numero + "] ");
      } else if (primo) {
        System.out.print("#" + numero + "# ");
      } else {
        System.out.print(numero + " ");
      }
    }
  }
}