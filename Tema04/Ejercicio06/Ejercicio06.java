/**
* Ejercicio 6 del Tema 4
* 
* Realiza un programa que calcule el tiempo que tardará en caer un objeto desde
* una altura h. Aplica la fórmula t = √(2h/g) siendo g = 9.81m/s²
* 
* @author Jorge García Molina
*/

public class Ejercicio06 {
  public static void main(String[] args) {
    //Pedir el valor de h
    System.out.println("Calculer el tiempo que tarda un objeto en caer.");
    System.out.print("Introduzca la altura a la que desea tirar el objeto (m): ");
    double altura = Double.parseDouble(System.console().readLine());
    
    //Resolver la ecuación y mostrar el resultado
    if ( altura <= 0) {
      System.out.print("La altura debe ser un número mayor que '0'.");
    } else {
      double g = 9.81;
      double tiempo = Math.sqrt((2 * altura) / g);
      System.out.printf("Al tirar el objeto desde %.2f metros tarda", altura);
      System.out.printf(" %.2f segundos en llegar al sualo", tiempo);
    }
  }
}
