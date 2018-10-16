package tema05;
/**
* Ejercicio 18 del Tema 5
* 
* Escribe un programa que obtenga los números enteros comprendidos entre
* dos números introducidos por teclado y validados como distintos, el programa
* debe empezar por el menor de los enteros introducidos e ir incrementando de
* 7 en 7.
* 
* @author Jorge García Molina
*/
import java.util.Scanner;

public class Ejercicio18 { 
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Contar de 7 en 7 deun número a otro.");
    //Pedir los números
    System.out.print("Introduzca el primer número entero: ");
    int numero1 = Integer.parseInt(s.nextLine());
    System.out.print("Introduzca el segundo número entero: ");
    int numero2 = Integer.parseInt(s.nextLine());
    
    //Contarde un número al otro
    if (numero1 < numero2) {
      int diferencia = numero2 - numero1;
      if (diferencia > 7) {
        numero1 += 7;
        while (numero1 < numero2) {
          System.out.print(numero1 + " ");
          numero1 += 7;
        }
      } else {
        System.out.print("No hay numeros entre " + numero1 + " y " + numero2);
        System.out.print(" porque la diferencia entre ellos es menor o igual que 7");
      }
    } else if (numero1 > numero2) {
      int diferencia = numero1 - numero2;
      if (diferencia > 7) {
        numero2 += 7;
        while (numero2 < numero1) {
          System.out.print(numero2 + " ");
          numero2 += 7;
        }
      } else {
        System.out.print("No hay numeros entre " + numero2 + " y " + numero1);
        System.out.print(" porque la diferencia entre ellos es menor o igual que 7");
      }
    } else {
      System.out.print("Los números son iguales.");
    }
  }
}
