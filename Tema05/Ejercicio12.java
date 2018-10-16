package tema05;
/**
* Ejercicio 12 del Tema 5
* 
* Escribe un programa que muestre los n primeros términos de la serie de
* Fibonacci. El primer término de la serie de Fibonacci es 0, el segundo es 1
* y el resto se calcula sumando los dos anteriores, por lo que tendríamos que
* los términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144... El número
* n se debe introducir por teclado.
* 
* @author Jorge García Molina
*/

public class Ejercicio12 {
  public static void main(String[] args) {
    System.out.println("Cadena de Fibonacci de 'x' números.");
    //Pedir el número
    System.out.println("¿Cuántos números desea ver de la cadena fibonacci (minimo 1)?");
    int cantidad = Integer.parseInt(System.console().readLine());
    
    //Calcular y mostrar la cadena de fibonacci
    System.out.println("Los primeros " + cantidad + " numeros de lacadena de fibonacci son: ");
    int primero = 0;
    int segundo = 1;
    int tercero = 0;
    if (cantidad > 2) {
      for (int i = 0; i < cantidad; i++) {
        System.out.print(primero + " ");
        tercero = primero + segundo;
        primero = segundo;
        segundo = tercero;
      }
    } else if (cantidad == 2) {
      System.out.print(primero + " " + segundo);
    } else {
      System.out.print(primero);
    }
  }
}
