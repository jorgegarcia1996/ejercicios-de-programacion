
/**
 * Fichero con una copia de las funciones que voy creando por si acaso
 * las necesito en un futuro cercano
 * 
 * @author Jorge García Molina
 */
public class Funciones {
  /**
   * Funcion para invertir un número entero
   * 
   * @param numero es un número entero
   * @return devuelve el número introducido invertido
   */
  public static int invierte(int numero) {
    int invertido = 0;
    while (numero > 0) {
      invertido = (invertido * 10) + (numero % 10);
      numero/= 10;
    }
    return invertido;
  }
}
