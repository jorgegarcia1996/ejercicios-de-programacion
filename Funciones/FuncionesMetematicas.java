package Funciones;

/**
 * Ejercicios 1-14 del tema 08.
 * 
 * Crea una biblioteca de funciones matemáticas que contenga las siguientes
 * funciones. Recuerda que puedes usar unas dentro de otras si es necesario.
 * Observa bien lo que hace cada función ya que, si las implementas en el orden
 * adecuado, te puedes ahorrar mucho trabajo.
 * 
 * @author jorge
 */
public class FuncionesMetematicas {
  
  /**
   * Funcion que invierte un número
   * 
   * @param n es númro entero
   * @return el número invertido
   */
  public static long voltea(long n) {
    long invertido = 0;
    while (n > 0) {
      invertido = (invertido * 10) + (n % 10);
      n /= 10;
    }
    return invertido;
  }
  
  /**
   * Función para averiguar si un número es primo
   * 
   * @param n es un número entero
   * @return devuelve verdadero si el número es primo o falso si no lo es
   */
  public static boolean esPrimo(long n) {
    for (int i = 2; i < n; i++) {
      if ((n % i) == 0) {
        return false;
      }
    }
    return true;
  }
  
  /**
   * Función para comprobar si un número es capicúa o no
   * 
   * @param n es un número entero
   * @return devuelve verdadero si el número es capicúa o falso si no lo es
   */
  public static boolean esCapicua(long n) {
    long invertido = voltea(n);
    if (n == invertido) {
      return true;
    } else {
      return false;
    }
  }
  
  /**
   * Función que devuelve el siguiente número primo del número introducido
   * 
   * @param n es un número entero
   * @return devuelve un número entero long que es el número primo mayor más próximo
   */
  public static long siguientePrimo(long n) {
    do {
      n++;
    } while (!esPrimo(n));
    return n;
  }
  
  /**
   * Función para calcular la potencia dando la base y el exponente
   * 
   * @param b es la base de la potencia
   * @param e es el exponente de la potencia
   * @return devuelve un número entero long como resultado de calcular la potencia
   */
  public static long potencia(long b, long e) {
    long potencia = b;
    for (long i = e; i > 0; i--) {
      potencia *= b;
    }
    return potencia;
  }
  
  /**
   * Función para contar el número de dígitos de un número entero
   * 
   * @param n es un número entero
   * @return devuelve un número entero que es el número de dígitos del número introducido
   */
  public static long digitos(long n) {
    long digitos = 0;
    while (n > 0) {
      digitos++;
      n /= 10;
    }
    return digitos;
  }
  
  /**
   * Función que te dice el dígito que hay en una determinada posición de un número entero
   * 
   * @param n es el número entero
   * @param pos es la posición del dígito que se quiere
   * @return el dígito de la posición dada del número introducido
   */
  public static long digitoN(long n, long pos) {
    long invertido = voltea(n);
    for (int i = 0; i < pos; i++) {
      invertido /= 10;
    }
    long digito = invertido % 10;
    return digito;
  }
  
  /**
   * Función que te dice la posición de un dígito dentro de un número
   * 
   * @param n es un número entero
   * @param d es un número entero el cual es el digito que buscamos en el número n
   * @return la posición del dígito d dentro del número n
   */
  public static long posicionDeNumero(long n, long d) {
    long invertido = voltea(n);
    long pos = 0;
    long digito = invertido % 10;
    while (digito != d) {
      invertido /= 10;
      digito = invertido % 10;
      pos++;
    }
    return pos;
  }
  
  
  public static long quitaPorDetras(long num, long n)
}
