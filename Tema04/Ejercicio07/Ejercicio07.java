/**
* Ejercicio 7 del Tema 4
* 
* Realiza un programa que calcule la media de tres notas.
* 
* @author Jorge García Molina
*/

public class Ejercicio07 {
  public static void main(String[] args) {
    //Pedir las notas
    System.out.println("Calcular la media de 3 notas.");
    System.out.print("Introduzca la primera nota: ");
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
