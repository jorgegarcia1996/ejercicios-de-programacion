package tema05;

/**
* Ejercicio 39 del Tema 5
* 
* Escribe un programa que pida un número entero positivo por teclado y que
* muestre a continuación los números desde el 1 al número introducido junto
* con su factorial.
* 
* @author Jorge García Molina
*/
import java.util.Scanner;

public class Ejercicio39 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Lista de factoriales");
    // Pedir un número al usuario
    System.out.print("Introduzca un número entero positivo: ");
    int numero = Integer.parseInt(s.nextLine());
    
    //Calcular y mostrar los factoriales
    long resultado = 1;
    for (int i = 1; i <= numero; i++) {
        resultado = resultado * i;
        System.out.println(i + "! = " + resultado);
    }
  }
}