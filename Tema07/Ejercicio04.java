package tema07;

import java.util.Scanner;

/**
 * Ejercicio 04 del Tema 07
 *
 * Escribe un programa que lea 10 números por teclado y que luego los muestre en
 * orden inverso, es decir, el primero que se introduce es el último en
 * mostrarse y viceversa.
 *
 * @author Jorge García Molina
 */
public class Ejercicio04 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("3 arrays con número, cuadrado y cubo");
    System.out.println();

    //Crear los arrays
    int[] numero = new int[20], cuadrado = new int[20], cubo = new int[20];
    for (int i = 0; i < 20; i++) {
      int aleatorio = (int)(Math.random() * 101);
      numero[i] = aleatorio;
      cuadrado[i] = (int)(Math.pow(aleatorio, 2));
      cubo[i] = (int)(Math.pow(aleatorio, 3));
    }
    
    
    //Mostrar los datos en columnas
    System.out.printf( "┃%9s┃%9s┃%9s┃\n", "Número", "Cuadrado", "Cubo");
    System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
    for (int i = 0; i < 20; i++) {
      System.out.printf("┃%-9s┃%-9s┃%-9s┃\n", numero[i], cuadrado[i], cubo[i]);
    }
  }
}
