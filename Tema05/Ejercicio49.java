package tema05;

import java.util.Scanner;

/**
* Ejercicio 49 del Tema 5
* 
* Realiza un programa que calcule el máximo, el mínimo y la media de una serie
* de números enteros positivos introducidos por teclado. El programa terminará
* cuando el usuario introduzca un número primo. Este último número no se
* tendrá en cuenta en los cálculos. El programa debe indicar también cuántos
* números ha introducido el usuario (sin contar el primo que sirve para salir).
* 
* @author Jorge García Molina
*/

public class Ejercicio49 { 
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Cambiar dígito en un número.");
    //Pedir el número
    System.out.print("Introduzca numeros enteros positivos, para terminar,"
            + " introduzca un número primo: ");
    
    //Insertar el dígito en la posición indicada
    boolean primo = true;
    int numero;
    do {
      numero = Integer.parseInt(s.nextLine());
      for (int i = 2; i < numero; i++){
        if ((numero % i) == 0) {
          primo = false;
        }
      }
      
    } while (!primo);
  }
}

