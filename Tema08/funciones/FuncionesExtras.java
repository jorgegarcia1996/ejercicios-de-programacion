package funciones;

/**
 * Funciones extras que podrían se útiles en algún momento
 * 
 * @author Jorge García Molina
 */
public class FuncionesExtras {
  
  /**
   * Función para convertir los elementos de un array simple en un solo número
   * 
   * @param n es un array simple
   * @return un número long creado a partir de los elementos de un array
   */
  public static long convierteArrayEnNumero(int[] n) {
    long num = 0;
    for (int elemento : n) {
      num = (num * 10) + elemento;
    }
    return num;
  }
  
  /**
   * Función para convertir cada dígito de un número en un elemento de un array
   * 
   * @param n es un número entero
   * @return un array que en cada posición 
   */
  public static int[] convierteNumeroEnArray(long n) {
    int posiciones = (int)FuncionesConNumeros.digitos(n);
    int[] a = new int[posiciones];
    long digito = 0;
    while (n > 0) {
      digito = n % 10;
      a[posiciones - 1] = (int)digito;
      n /= 10;
      posiciones--;
    }
    return a;
  }
  
  /** IDEAS PARA FUNCIONES
  * 
  * public static int[] agregaAlFinalDeArrayInt(int[] a, int n)
  * 
  * public static int[] agregaAlPrincipioDeArrayInt(int[] a, int n)
  * 
  * public static int[] insertaEnArrayInt(int[] a, int n, int pos)
  * 
  * public static int[] concatenaArrayInt(int[] a, int[] b)
  * 
  * función para generar un camino zigzagueante con obstaculos aleatorios (* - O) 
  * de longitud determinada por el usuario
  * 
  * 
  */
}
