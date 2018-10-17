package tema05;

/**
* Ejercicio 27 del Tema 5
* 
* Escribe un programa que muestre, cuente y sume los múltiplos de 3 que hay
* entre 1 y un número leído por teclado.
* 
* @author Jorge García Molina
*/
import java.util.Scanner;

public class Ejercicio27 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Multiplos de 3 ente el 1 y un número del usuario");
    // Pedir el número al usuario
    System.out.print("Introduzca un número entero mayor que 1: ");
    int numero = Integer.parseInt(s.nextLine());
    
    //Calcular los múltiplos de 3
    int sumaMultiplos = 0, cuentaMultiplos = 0;
    System.out.print("Los múltiplos de 3 desde el número 1 hasta el número ");
    System.out.print(numero + " son: ");
    for (int i = 1; i <= numero; i++) {
      if ((i % 3) == 0) {
        cuentaMultiplos++;
        sumaMultiplos += i;
        System.out.print(i + " "); 
      }
    }
    System.out.println();
    System.out.println("La suma de los multiplos es: " + sumaMultiplos);
    System.out.print("En total hay " + cuentaMultiplos + " múltiplos de 3"); 
    System.out.println(" entre el 1 y el " + numero);
  }
}
