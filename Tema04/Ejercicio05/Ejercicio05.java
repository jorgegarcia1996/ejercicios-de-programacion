/**
* Ejercicio 5 del Tema 4
* 
* Realiza un programa que resuelva una ecuación de primer grado (del tipo ax +
* b = 0).
* 
* @author Jorge García Molina
*/

public class Ejercicio05 {
  public static void main(String[] args) {
    //Pedir los valores de 'a' y 'b'
    System.out.println("Calcular ecuación de primer grado (ax + b = 0).");
    System.out.print("Introduzca el valor de 'a': ");
    double a = Double.parseDouble(System.console().readLine());
    System.out.print("Introduzca el valor de 'b': ");
    double b = Double.parseDouble(System.console().readLine());
    
    //Resolver la ecuación y mostrar el resultado
    if (a == 0) {
      System.out.print("La ecución no tiene solución real.");
    } else {
      double x = (0 - b) / a;
      System.out.printf("Para %.2fx + %.2f = 0 --> x = %.2f", a, b, x);
    }
  }
}
