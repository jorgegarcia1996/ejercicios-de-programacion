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
    double nota1 = Double.parseDouble(System.console().readLine());
    System.out.print("Introduzca la segunda nota: ");
    double nota2 = Double.parseDouble(System.console().readLine());
    System.out.print("Introduzca la tercera nota: ");
    double nota3 = Double.parseDouble(System.console().readLine());
    
    //Calcular la media de las 3 notas
    double notaMedia = (nota1 + nota2 + nota3) / 3;
    System.out.printf("Su nota media es %.2f.", notaMedia);
  }
}
