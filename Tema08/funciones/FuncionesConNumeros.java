package funciones;

/**
 * Ejercicios 1-14 del tema 08.
 * 
 * Crea una biblioteca de funciones matemáticas que contenga las siguientes
 * funciones. Recuerda que puedes usar unas dentro de otras si es necesario.
 * Observa bien lo que hace cada función ya que, si las implementas en el orden
 * adecuado, te puedes ahorrar mucho trabajo.
 * 
 * @author Jorge Garcia Molina
 */
public class FuncionesConNumeros {
  
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
    return n == invertido;
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
    long potencia = (long)(Math.pow((double)b, (double)e));
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
   * @return la posición del dígito d dentro del número n, si no lo encuentra devuelve '-1'
   */
  public static long posicionDeDigito(long n, long d) {
    long invertido = voltea(n);
    long pos = 0;
    long digito;
    boolean encontrado = false;
    while (invertido > 0 && !encontrado) {
      invertido /= 10;
      digito = invertido % 10;
      pos++;
      if (digito == d) {
        encontrado = true;
      }
    }
    if (encontrado) {
      return pos;
    } else {
      return -1;
    }
  }
  
  /**
   * Funcion que quita a un número 'd' dígitos por la derecha
   * 
   * @param n es un número entero long
   * @param d es el número de dígitos que se le van a quitar al número n
   * @return devuelve un número con 'd' dígitos menos por la derecha
   */
  public static long quitaPorDetras(long n, long d) {
    for (int i = 0; i < d; i++) {
      n /= 10;
    }
    return n;
  }
  
  /**
   * Funcion que quita a un número 'd' dígitos por la izquierda
   * 
   * @param n es un número entero long
   * @param d es el número de dígitosque se le van a quitar al número n
   * @return devuelve un número con 'd' dígitos menos por la izquierda
   */
  public static long quitaPorDelante(long n, long d) {
    long invertido = voltea(n);
    for (int i = 0; i < d; i++) {
      invertido /= 10;
    }
    return voltea(invertido);
  }
  
  /**
   * Función para juntar 2 números formando uno nuevo
   * 
   * @param n1 es un número entero long
   * @param n2 es un número entero long
   * @return devuelve un número entero el cual es los dos numeros anteriores juntos
   */
  public static long juntaNumeros(long n1, long n2) {
    long invertido = voltea(n2);
    while (invertido > 0) {
      n1 = (n1 * 10) + (invertido % 10);
      invertido /= 10;
    }
    return n1;
  }
  
  /**
   * Funcion para agregar un dígito a un número 'n' por la derecha
   * 
   * @param n es un número entero long
   * @param d es un número entero de un dígito
   * @return devuelve el número 'n' mas el dígito 'd' por la derecha
   */
  public static long pegaPorDetras(long n, long d) {
    return juntaNumeros(n, d);
  }
  
  /**
   * Funcion para agregar un dígito a un número 'n' por la izquierda
   * 
   * @param n es un número entero long
   * @param d es un número entero de un dígito
   * @return devuelve el número 'n' mas el dígito 'd' por la izquierda
   */
  public static long pegaPorDelante(long n, long d) {
    return juntaNumeros(d, n);
  }
  
  /**
   * Función para seleccionar un trozo de un número dando la posición inicial y final
   * 
   * @param n es un número entero long
   * @param pos1 es la posición de inicial
   * @param pos2 es la posición final
   * @return el fragmento seleccionado del número
   */
  public static long trozoDeNumero(long n, long pos1, long pos2) {
    long longitud = digitos(n);
    n = quitaPorDelante(n, pos1);
    n = quitaPorDetras(n, longitud - pos2 - 1);
    return n;
  }
}
