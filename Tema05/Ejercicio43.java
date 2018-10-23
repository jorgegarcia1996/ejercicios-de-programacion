package tema05;

import java.util.Scanner;

/**
* Ejercicio 43 del Tema 5
* 
* Escribe un programa que permita partir un número introducido por teclado en
* dos partes. Las posiciones se cuentan de izquierda a derecha empezando por
* el 1. Suponemos que el usuario introduce correctamente los datos, es decir,
* el número introducido tiene dos dígitos como mínimo y la posición en la que
* se parte el número está entre 2 y la longitud del número. No se permite en
* este ejercicio el uso de funciones de manejo de String (por ej. para extraer
* subcadenas dentro de una cadena).
* 
* @author Jorge García Molina
*/

public class Ejercicio43 { 
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Cortar un número.");
    //Pedir el número
    System.out.print("Introduzca un número entero: ");
    long numero = Long.parseLong(s.nextLine());
    System.out.print("Introduzca la posición donde cortar el número: ");
    int corte = Integer.parseInt(s.nextLine());
    
    //Cortar el número introducido por la posición indicada
    long numero2 = numero, volteado = 0, parte1 = 0, parte2 = 0;
    while (numero2 > 0) {
      volteado = (volteado * 10) + (numero2 % 10);
      numero2 /= 10;
    }
    for (int i = 0; i < corte; i++) {
      parte1 = (parte1 * 10) + (volteado % 10);
      volteado /= 10;
    }
    while (volteado > 0) {
      parte2 = (parte2 * 10) + (volteado % 10);
      volteado /= 10;
    }
    System.out.println("La primera parte del número es " + parte1 + " y la"
            + " segunda parte es " + parte2);
  }
}
