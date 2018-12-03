package funciones;
import funciones.FuncionesDeArraysSimples;

/**
 * Este archivo contiene las funciones de arrays bidimensionales (Ejercicios 29-34)
 *
 * @author Jorge García Molina
 */
public class FuncionesDeArraysBidimensionales {
  
  /**
   * Función para generar un array bidimensional de 'f' x 'c' números generados
   * aleatoriamente entre 'min' y 'max'
   * 
   * @param f es el número e files que tendrá el array
   * @param c es el número de columnas que tendrá el array
   * @param min es el valor mínimo del array
   * @param max es el valor máximo de array
   * @return un array bidimensionea de 'f' filas y 'c' columnas con números entre 'min' y 'max'
   */
  public static int[][] generaArrayBiInt(int f, int c, int min, int max) {
    int[][] a = new int[f][c];
    for(int i = 0; i < f; i++) {
      for(int j = 0; j < c; j++) {
        a[i][j] = (int)(Math.random()*(max - min) + min + 1);
      }
    }
    return a;
  }
  
  /**
   * Función que busca el valor máximo de un array bidimensional
   * 
   * @param a es el array donde se va a buscar el valor máximo
   * @return el valor máximo del array
   */
  public static int maximoArrayBiInt(int a[][]) {
    int maximo = Integer.MIN_VALUE;
    for (int f = 0; f < a.length; f++) {
      for (int c = 0; c < a[0].length; c++) {
        if (a[f][c] > maximo) {
          maximo = a[f][c];
        }
      }
    }
    return maximo;
  }
  
  /**
   * Función que busca el valor minimo de un array bidimensional
   * 
   * @param a es el array donde se va a buscar el valor mínimo
   * @return el valor mínimo del array
   */
  public static int minimoArrayBiInt(int a[][]) {
    int minimo = Integer.MAX_VALUE;
    for (int f = 0; f < a.length; f++) {
      for (int c = 0; c < a[0].length; c++) {
        if (a[f][c] < minimo) {
          minimo = a[f][c];
        }
      }
    }
    return minimo;
  }
  
  /**
   * Muestra el contenido de la fila seleccionada del array bidimensional
   * 
   * @param a es el array bidimensional
   * @param f es el número de la fila que se quiere ver
   * @return un array con los datos de la fila 'f' del array 'a'
   */
  public static int[] filaDeArrayBiInt(int a[][], int f) {
    int[] fila = new int[a[0].length];
    for (int c = 0; c < a[0].length; c++) {
      fila[c] = a[f][c];
    }
    return fila;
  }
  
  /**
   * Muestra el contenido de la columna seleccionada del array bidimensional
   * 
   * @param a es el array bidimensional
   * @param c es el número de la columna que se quiere ver
   * @return un array con los datos de la columna 'c' del array 'a'
   */
  public static int[] columnaDeArrayBiInt(int a[][], int c) {
    int[] columna = new int[a.length];
    for (int f = 0; f < a.length; f++) {
      columna[f] = a[f][c];
    }
    return columna;
  }
  
  /**
   * Función para buscar un número 'n' en el array bidimensional y obtener las coordenadas del mismo
   * ({-1, -1} si no existe el número)
   * 
   * @param a es el array bidimensional donde se va a buscar el número 'n'
   * @param n es el número del que se devolverán las coordenadas
   * @return un array con las coordenadas del número 'n'
   */
  public static int[] coordenadasEnArrayBiInt(int a[][], int n) {
    for (int f = 0; f < a.length; f++) {
      for (int c = 0; c < a[0].length; c++) {
        if (a[f][c] == n) {
          int[] coordenadas = {f, c};
          return coordenadas;
        }
      }
    }
    int[] coordenadas = {-1, -1};
    return coordenadas;
  }
  
  /**
   * Función para averiguar si un número es punto de silla o no dentro del array bidimensional 
   * (mínimo de su fila y máximo de su columna)
   * 
   * @param a es el array bidimensional
   * @param f es el número de fila del cual se quiere sacar el número
   * @param c es el número de columna del cual se quiere sacar el número
   * @return 'true' si el número es punto de silla o 'false' si no lo es
   */
  public static boolean esPuntoDeSilla(int a[][], int f, int c) {
    int[] fila = filaDeArrayBiInt(a, f);
    int[] columna = columnaDeArrayBiInt(a, c);
    return ((FuncionesDeArraysSimples.minimoArrayInt(fila) == a[f][c])
        && (FuncionesDeArraysSimples.maximoArrayInt(columna) == a[f][c]));
  }
  
  /**
   * Función para mostrar una de las diagonales del array bidimensional desde el número selaccionado
   * 
   * @param a es el array bidimensional
   * @param f es la fila del número de inicio
   * @param c es la columna del número de inicio
   * @param d es la dirección de la diagonal seleccionada
   * @return un array simple con los valores de la diagonal seleccionada
   */
  public static int[] diagonal(int a[][], int f, int c, String d) {
    int elementos = 0, i, j;
    int[] diagonalAux = new int [1000];
    for (i = 0; i < a.length; i++) {
      for (j = 0; j < a[0].length; j++) {
        if ( (((c - j) == (f - i)) && (d.equals("nose")))
          || (((c - j) == (i - f)) && (d.equals("neso"))) ) {
          diagonalAux[elementos++] = a[i][j];
        }
      }
    }
    int[] diagonal = new int[elementos];
    for (j = 0; j < elementos; j++) {
      diagonal[j] = diagonalAux[j];
    }
    return diagonal;
  }
}