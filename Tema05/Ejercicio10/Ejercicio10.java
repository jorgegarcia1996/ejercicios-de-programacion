/**
* Ejercicio 10 del Tema 5
* 
* Escribe un programa que calcule la media de un conjunto de números positivos
* introducidos por teclado. A priori, el programa no sabe cuántos números se
* introducirán. El usuario indicará que ha terminado de introducir los datos
* cuando meta un número negativo.
* 
* @author Jorge García Molina
*/

public class Ejercicio10 {
  public static void main(String[] args) {
    System.out.println("Calcular la media de 'x' números.");
    //Pedir los números
    System.out.println("Introduzca números positivos, cuando termine introduzca un número negativo.");
    int numero = Integer.parseInt(System.console().readLine());
    int suma = 0;
    int i = 0;
    while (numero >= 0) {
      suma = suma + numero;
      i++;
      numero = Integer.parseInt(System.console().readLine());
    }
    System.out.println("Se han introducido " + i + " números positivos.");
    System.out.println("La suma de todos ellos hace: " + suma);
    if (i != 0) {
      System.out.println("La media es: " + (suma / i));
    }
  }
}
