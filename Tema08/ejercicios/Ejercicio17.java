package ejercicios;
import funciones.FuncionesConNumeros;
import java.util.Scanner;

/**
 * Ejercicio 17 del tema 08
 * 
 * Escribe un programa que pase de binario a decimal.
 *
 * @author Jorge García Molina
 */
public class Ejercicio17 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Conversor de binario a decimal");
    System.out.print("Intruduzca un número binario: ");
    long bin = Long.parseLong(s.nextLine());
    
    long longitud = FuncionesConNumeros.digitos(bin);
    long dec = 0, valor = 1;
    long bin2 = bin;
    for (int i = 0; i < longitud; i++) {
      if (bin2 % 10 == 1) {
        dec += (bin2 % 10) * valor;
      }
      valor *= 2;
      bin2 /= 10;
    }
    System.out.println("El número binario " + bin + " convertido a decimal es: " + dec);
  }
}