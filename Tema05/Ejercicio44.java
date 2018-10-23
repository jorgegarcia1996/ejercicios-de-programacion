package tema05;

import java.util.Scanner;

/**
* Ejercicio 44 del Tema 5
* 
* Escribe un programa que sea capaz de insertar un dígito dentro de un número
* indicando la posición. El nuevo dígito se colocará en la posición indicada y el
* resto de dígitos se desplazará hacia la derecha. Las posiciones se cuentan de
* izquierda a derecha empezando por el 1. Suponemos que el usuario introduce
* correctamente los datos. Se recomienda usar long en lugar de int ya que el
* primero admite números más largos.
* 
* @author Jorge García Molina
*/

public class Ejercicio44 { 
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Insertar dígito en un número.");
    //Pedir el número
    System.out.print("Introduzca un número entero: ");
    long numero = Long.parseLong(s.nextLine());
    System.out.print("Introduzca el dígito que desea insertar: ");
    int digito = Integer.parseInt(s.nextLine());
    System.out.print("Introduzca la posición donde insertar el dígito: ");
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
    while (volteado > 0) {
      insertado = (insertado * 10) + (volteado % 10);
      volteado /= 10;
    }
    System.out.println("El resultado de la inserción es: " + insertado);
  }
}
