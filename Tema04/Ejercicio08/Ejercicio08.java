/**
* Ejercicio 8 del Tema 4
* 
* Realiza un programa que calcule la media de tres notas y un mensaje según la
* nota.
* 
* @author Jorge García Molina
*/

public class Ejercicio08 {
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
    //Mostrar un mensaje distinto en función de la nota
    if (notaMedia < 5) {
      System.out.printf("Su nota es %.2f. !Insuficiente¡", notaMedia);
    } else if (notaMedia < 6) {
      System.out.printf("Su nota es %.2f. !Suficiente¡", notaMedia);
    } else if (notaMedia < 7) {
      System.out.printf("Su nota es %.2f. !Bien¡", notaMedia);
    } else if (notaMedia < 9) {
      System.out.printf("Su nota es %.2f. !Notable¡", notaMedia);
    } else {
      System.out.printf("Su nota es %.2f. !Sobresaliente¡", notaMedia);
    }
  }
}
