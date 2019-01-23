package ejercicios;

import java.util.ArrayList;

/**
 * Ejercicio 2 del tema 10
 * 
 * Realiza un programa que introduzca valores aleatorios (entre 0 y 100) en un
 * ArrayList y que luego calcule la suma, la media, el máximo y el mínimo de
 * esos números. El tamaño de la lista también será aleatorio y podrá oscilar
 * entre 10 y 20 elementos ambos inclusive.
 *
 * @author JorgeGarciaMolina
 */
public class Ejercicio02 {
  public static void main(String[] args) {
    //Crear el ArrayList
    ArrayList<Integer> numeros = new ArrayList<>();
    
    //Rellenar el ArrayList
    int num = aleatorio(10, 20);
    for (int i = 0; i < num; i++) {
      numeros.add(aleatorio(0, 100));
    }
    
    //Calcular la suma, media, max y min del ArrayList
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    int suma = 0;
    int media = 0;
    
    for (int e : numeros) {
      suma += e;
      if (e > max) {
        max = e;
      }
      if (e < min) {
        min = e;
      }
    }
    media = suma / num;
    
    //Mostrar los elementos
    System.out.println("Elementos del ArrayList: " + numeros);
    System.out.println("Suma de los elementos: " + suma);
    System.out.println("Media de los elementos: " + media);
    System.out.println("Elemento mayor: " + max);
    System.out.println("Elemento menor: " + min);
    
    
  }
  
  /**
   * Funcion para generar numeroa aleatorios
   * @param max numero máximo a generar
   * @param min número mínimo a generar
   * @return un número aleatorio entre el máximo y el mínimo especificados, ambos
   * incluidos
   */
  public static int aleatorio(int max, int min) {
    return (int)(Math.random() * (max - min + 1) + min);
  }
}
