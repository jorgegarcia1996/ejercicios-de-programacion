package ejercicios;
import funciones.FuncionesConNumeros;
import java.util.Scanner;

/**
 * Ejercicio 18 del tema 08
 * 
 * Escribe un programa que pase de decimal a binario
 *
 * @author Jorge García Molina
 */
public class Ejercicio18 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Conversor de decimal a binario");
    System.out.print("Intruduzca un número decimal: ");
    long dec = Long.parseLong(s.nextLine());
    
    long bin;
    if (dec == 0) {
      bin = 0;
    } else {
      bin = 1; 
    }
    long dec2 = dec;
    while (dec2 > 1) {
      bin = (bin * 10) + (dec2 % 2);
      dec2 /= 2;
    }
    System.out.println();
    System.out.println("El número decimal " + dec + " convertido a binario es: " + bin);
  }
}