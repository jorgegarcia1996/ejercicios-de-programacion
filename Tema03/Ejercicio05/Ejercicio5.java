/**
* Ejercicio 5 del Tema 3
* Calcular el área de un rectángulo
* 
* @author Jorge García Molina
*/

public class Ejercicio5 {
  public static void main(String[] args) {
    //Pedir las dimensiones del rectángulo
    System.out.println("Calcular el área de un rectángulo (A=b*h)");
    System.out.print("Introduzca la altura del rectángulo: ");
    double altura = Double.parseDouble(System.console().readLine());
    System.out.print("Introduzca la base del rectángulo: ");
    double base = Double.parseDouble(System.console().readLine());
    
    //Calcular el área del rectángulo
    double area = altura * base;
    System.out.printf("Un rectángulo de altura %.2f y base %.2f tiene un área" 
    + " de %.2f", altura, base, area);
  }
}
