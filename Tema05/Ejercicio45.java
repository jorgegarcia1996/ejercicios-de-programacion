package tema05;

import java.util.Scanner;

/**
* Ejercicio 45 del Tema 5
* 
* Escribe un programa que cambie un dígito dentro de un número dando la
* posición y el valor nuevo. Las posiciones se cuentan de izquierda a derecha
* empezando por el 1. Se recomienda usar long en lugar de int ya que el
* primero admite números más largos. Suponemos que el usuario introduce
* correctamente los datos.
* 
* @author Jorge García Molina
*/

public class Ejercicio45 { 
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Cambiar dígito en un número.");
    //Pedir el número
    System.out.print("Introduzca un número entero: ");
    long numero = Long.parseLong(s.nextLine());
    System.out.print("Introduzca el dígito que desea insertar: ");
    int digito = Integer.parseInt(s.nextLine());
    System.out.print("Introduzca la posición donde cambiar el dígito: ");
    int corte = Integer.parseInt(s.nextLine());
    
    //Insertar el dígito en la posición indicada
    long numero2 = numero, volteado = 0, insertado = 0;
    while (numero2 > 0) {
      volteado = (volteado * 10) + (numero2 % 10);
      numero2 /= 10;
    }
    for (int i = 1; i < corte; i++) {
      insertado = (insertado * 10) + (volteado % 10);
      volteado /= 10;
    }
    insertado = (insertado * 10) + (long)digito;
    volteado /= 10;
    while (volteado > 0) {
      insertado = (insertado * 10) + (volteado % 10);
      volteado /= 10;
    }
    System.out.println("El resultado de la inserción es: " + insertado);
  }
}

