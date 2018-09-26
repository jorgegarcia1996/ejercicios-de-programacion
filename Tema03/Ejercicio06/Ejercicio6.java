/**
* Ejercicio 6 del Tema 3
* Calcular el área de un triángulo
* 
* @author Jorge García Molina
*/

public class Ejercicio6 {
  public static void main(String[] args) {
    //Pedir las dimensiones del triángulo
    System.out.println("Calcular el área de un triángulo (A=(b*h)/2)");
    System.out.print("Introduzca la altura del triángulo: ");
    double altura = Double.parseDouble(System.console().readLine());
    System.out.print("Introduzca la base del triángulo: ");
    double base = Double.parseDouble(System.console().readLine());
    
    //Calcular el área del triángulo
    double area = (altura * base) / 2.0;
    System.out.printf("Un triángulo de altura %.2f y base %.2f tiene un área" 
    + " de %.2f", altura, base, area);
  }
}
