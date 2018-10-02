/**
* Ejercicio 9 del Tema 4
* 
* Programa para resolver una ecuación de segundo grado (ax² + bx + c = 0)
* 
* @author Jorge García Molina
*/

public class Ejercicio09 {
  public static void main(String[] args) {
    //Pedir los valores de 'a', 'b' y 'c'
    System.out.println("CResolver la ecuación 'ax² + bx + c = 0'.");
    System.out.print("Introduzca el valor de 'a': ");
    double a = Double.parseDouble(System.console().readLine());
    System.out.print("Introduzca el valor de 'b': ");
    double b = Double.parseDouble(System.console().readLine());
    System.out.print("Introduzca el valor de 'c': ");
    double c = Double.parseDouble(System.console().readLine());
    
    //Resolver la ecuación
    double aux = Math.pow(b, 2) - 4 * a * c;
    if (aux < 0) {
      System.out.print("La ecuación no tiene solución en los números reales.");
    } else if (aux > 0){
      double x1 = (- b + Math.sqrt(aux)) /( 2 * a);
      double x2 = (- b - Math.sqrt(aux)) /( 2 * a);
      System.out.printf("La solución de x1 es: %.2f.\n", x1);
      System.out.printf("La solución de x2 es: %.2f.", x2);
    } else if (aux == 0) {
      double x = (-b) / (2 * a);
      System.out.printf("La solución es x = %.2f.", x);
    }
  }
}
