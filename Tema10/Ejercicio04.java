package ejercicios;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Ejercicio 04 del tema 10
 * 
 * Realiza un programa equivalente al anterior pero en esta ocasión, el programa
 * debe ordenar palabras en lugar de números.
 *
 * @author JorgeGarciaMolina
 */
public class Ejercicio04 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    //Crear el ArrayList
    ArrayList<String> palabras = new ArrayList<>();        
    
    //Variables
    String palabra;
    
    //Pedir los números al usuario y guardarlos en el arraylist
    System.out.println("Introduzca 10 palabras de uno en uno.");
    for (int i = 1; i <= 10; i++) {
      System.out.print(i + "ª palabra: ");
      palabra = s.nextLine();
      palabras.add(palabra);
    }
    
    //Mostrar, copiar, ordenar la copia y mostrar la copya del arraylist
    System.out.println("\nLos números introducidos son: " + palabras);
    ArrayList<String> palabrasOrdenadas = new ArrayList<>(palabras);
    Collections.sort(palabrasOrdenadas);
    System.out.println("Los números ordenados son: " + palabrasOrdenadas);
  }
}
