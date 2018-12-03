
package funciones;

/**
 * Este archivo contiene funciones de arrays simples (Ejercicios 20-28)
 * 
 * @author Jorge García Molina
 */
public class FuncionesDeArraysSimples {
  /**
   * Función para generar un array de 'n' elementos int con números aleatorios entre
   * 'min' y 'max'
   * 
   * @param n es el número de elementos del array
   * @param max es el valor máximo del array
   * @param min es el valor mínimo del array
   * @return un array int de 'n' valores entre 'min' y 'max'
   */
  public static int[] generaArrayInt(int n, int max, int min) {
    int[] x = new int[n];
    for(int i = 0; i < n; i++) {
      x[i] = (int)(Math.random() * (max - min + 1) + min);
    }
    return x;
  }
  
  /**
   * Función para seleccionar el mínio valor de un array int
   * 
   * @param a es el array del cual se quiere buscar el mínimo valor
   * @return el mínimo valos del array 'a'
   */
  public static int minimoArrayInt(int[] a) {
    int minimo = Integer.MAX_VALUE;
    for (int n : a) {
      if (n < minimo) {
        minimo = n;
      }
    }
    return minimo;
  }
    
  /**
   * Función para seleccionar el valor máximo de un array int
   * 
   * @param a es el array del cual se quiere buscar el valor máximo
   * @return el máximo valor del array
   */
  public static int maximoArrayInt(int[] a) {
    int maximo = Integer.MIN_VALUE;
    for (int n : a) {
      if (n > maximo) {
        maximo = n;
      }
    }
    return maximo;
  }
  
  /**
   * Función para calcular la media de los valores de un array
   * 
   * @param a es el array del cual se quiere sacar la media
   * @return un número double el cual es la media de los valores del array
   */
  public static double mediaArrayInt(int[] a) {
    int suma = 0;
    for (int n : a) {
      suma += n;
    }
    return (double)suma / a.length;
  }
  
  /**
   * Función para comprobar si un valor está en un array determinado
   * 
   * @param a es el array donde se va a buscar el valor 'n'
   * @param n es el valor que se va a buscar en el array 'a'
   * @return 'false' si el valor no existe el valor en el array o 'true' si existe
   */
  public static boolean estaEnArrayInt(int[] a, int n) {
    for (int num : a) {
      if (num == n) {
        return true;
      }
    }
    return false;
  }
  
  /**
   * Función que dice el índice de un valor del array (-1 si no se encuentra el valor)
   * 
   * @param a es el array donde se va a buscar el número 'n'
   * @param n es el número del que se quiere saber la posición
   * @return la posiciónm del número 'n' dentro del array 'a'
   */
  public static int posicionEnArrayInt(int[] a, int n) {
    for(int i = 0; i < a.length; i++) {
      if (a[i] == n) {
        return i;
      }
    }
    return -1;
  }
  
  /**
   * Función para voltear los valores de un array
   * 
   * @param a es el array cuyos valores se van a voltear
   * @return un array con los valores volteados del array 'a'
   */
  public static int[] volteaArrayInt(int[] a) {
    int[] a2 = new int[a.length];
    for(int i = 0; i < a.length; i++) {
      a2[a.length - i - 1] = a[i];
    }
    return a2;
  }
  
  /**
   * Función para desplazar 'n' posiciones a la derecha los valores del array 'a'
   * 
   * @param a es el array al que se le van a desplazar las posiciones
   * @param n número de posiciones que se van a desplazar los valores del array
   * @return un array con los valores desplazados 'n' posiciones a la derecha
   */
  public static int[] rotaDerechaArrayInt(int[] a, int n) {
    int[] a2 = a.clone();
    int i, aux;
    while (n-- > 0) {
      aux = a2[a2.length - 1];
      for(i = a2.length - 1; i > 0; i--) {
        a2[i] = a2[i - 1];
      }
      a2[0] = aux;
    }
    return a2;
  }
  
  /**
   * Función para desplazar 'n' posiciones a la izquierda los valores del array 'a'
   * 
   * @param a es el array al que se le van a desplazar las posiciones
   * @param n número de posiciones que se van a desplazar los valores del array
   * @return un array con los valores desplazados 'n' posiciones a la izquierda
   */
  public static int[] rotaIzquierdaArrayInt(int[] a, int n) {
    int[] a2 = a.clone();
    int i, aux;
    while (n-- > 0) {
      aux = a2[0];
      for(i = 0; i < a2.length - 1; i++) {
        a2[i] = a2[i + 1];
      }
      a2[a2.length - 1] = aux;
    }
    return a2;
  }
}
