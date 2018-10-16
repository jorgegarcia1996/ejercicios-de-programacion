/**
* Ejercicio 21 del Tema 5
* 
* Realiza un programa que vaya pidiendo números hasta que se introduzca un
* numero negativo y nos diga cuantos números se han introducido, la media de
* los impares y el mayor de los pares. El número negativo sólo se utiliza para
* indicar el final de la introducción de datos pero no se incluye en el cómputo.
* 
* @author Jorge García Molina
*/
import java.util.Scanner;

public class Ejercicio21 { 
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Números, para finalizar introduzca un número negativo.");
    //Pedir la altura de la pirámide y el símbolo
    System.out.print("Introduzca un número entero: ");
    int numero = Integer.parseInt(s.nextLine());
    
    //Comprobar el número, realizar los cálculos y mostrar los resultados
    int mayorPares = 0, numeroNumeros = 0;
    double sumaImpares = 0, numerosImpares = 0;
    while (numero >= 0) {
      numeroNumeros++;
      if ((numero % 2) == 0) {
        if (mayorPares < numero) {
          mayorPares = numero;
        }
      } else {
        numerosImpares++;
        sumaImpares = sumaImpares + numero;
      }
      System.out.print("Introduzca un número entero: ");
      numero = Integer.parseInt(s.nextLine());
    }
    System.out.println();
    System.out.println("Se han introducido " + numeroNumeros + " números.");
    System.out.println("El mayor de los números pares es: " + mayorPares);
    System.out.printf("La media de los impares es: %.2f", (sumaImpares / numerosImpares));
  }
}
