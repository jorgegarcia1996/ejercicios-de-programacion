/**
* Ejercicio 13 del Tema 4
* 
* Escribe un programa que ordene tres números enteros introducidos por teclado.
* 
* @author Jorge García Molina
*/

public class Ejercicio13 {
  public static void main(String[] args) {
    //Pedir los 3 números
    System.out.println("Introduce 3 números y se ordenarán de mayor a menor.");
    System.out.print("Introduce un número entero: ");
    int numero1 = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce otro número entero: ");
    int numero2 = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce un último número entero: ");
    int numero3 = Integer.parseInt(System.console().readLine());
    
    // Ordenar los números de mayor a menor.
    if (numero1 > numero2) {
      if (numero1 > numero3) {
        if (numero2 > numero3) {
          System.out.print("El orden es:" + numero1 + " " + numero2 + " " + numero3);
        } else {
          System.out.print("El orden es:" + numero1 + " " + numero3 + " " + numero2);
        }
      } else {
        System.out.print("El orden es:" + numero3 + " " + numero1 + " " + numero2);
      }
    } else {
      if (numero1 > numero3) {
        System.out.print("El orden es: " + numero2 + " " + numero1 + " " + numero3);
      } else if (numero2 > numero3){
        System.out.print("El orden es:" + numero2 + " " + numero3 + " " + numero1);
      } else {
        System.out.print("El orden es:" + numero3 + " " + numero2 + " " + numero1);
      }
    }
  }
}
