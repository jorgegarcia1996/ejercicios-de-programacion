package ejercicios;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Ejercicio 03 del tema 10
 * 
 * Escribe un programa que ordene 10 números enteros introducidos por teclado y
 * almacenados en un objeto de la clase ArrayList.
 *
 * @author JorgeGarciaMolina
 */
public class Ejercicio03 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    //Crear el ArrayList
    ArrayList<Integer> numeros = new ArrayList<>();        
    
    //Variables
    int num;
    
    //Pedir los números al usuario y guardarlos en el arraylist
    System.out.println("Introduzca 10 números de uno en uno.");
    for (int i = 0; i < 10; i++) {
      System.out.print(i + "º número: ");
      num = Integer.parseInt(s.nextLine());
      numeros.add(num);
    }
    
    //Mostrar, copiar, ordenar la copia y mostrar la copya del arraylist
    System.out.println("\nLos números introducidos son: " + numeros);
    ArrayList<Integer> numerosOrdenados = new ArrayList<>(numeros);
    Collections.sort(numerosOrdenados);
    System.out.println("Los números ordenados son: " + numerosOrdenados);
  } 
}
