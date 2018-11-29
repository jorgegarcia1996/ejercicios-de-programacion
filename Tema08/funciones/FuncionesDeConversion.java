package funciones;

/**
 * Este archivo tiene funciones de conversión de los distintos sistemas numéricos
 * (Bunario, Octal, Decimal y Hexadecimal)
 * 
 * @author Jorge García Molina
 */
public class FuncionesDeConversion {
  
  /**
   * Funcion para pasar un número de Octal (O), binario (B) o hexadecimal (H) a decimal
   * 
   * @param n Es el número que se quiere transformar
   * @param t es el tipo de sistema del número 'n'
   * @return Devuelve el número 'n' convertido a decimal
   */
  public static long convierteADecimal(String n, String t) {
    long decimal = 0;
    switch (t) {
      case "B":
        decimal = Long.parseLong(n, 2);
        break;
      case "O":
        decimal = Long.parseLong(n, 8);
        break;
      case "D":
        decimal = Long.parseLong(n);
        break;
      case "H":
        decimal = Long.parseLong(n, 16);
        break;
      default:
    }
    return decimal;
  }
  
  /**
   * Funcion para pasar un número de Octal (O), decimal (D) o hexadecimal (H) a binario
   * 
   * @param n Es el número que se quiere transformar
   * @param t es el tipo de sistema del número 'n'
   * @return Devuelve el número 'n' convertido a binario
   */
  public static String convierteABinario(String n, String t) {
    long decimal = convierteADecimal(n, t);
    String binario = Long.toString(decimal, 2);
    return binario;
  }
  
  /**
   * Funcion para pasar un número de Binario (B), decimal (D) o hexadecimal (H) a Octal
   * 
   * @param n Es el número que se quiere transformar
   * @param t es el tipo de sistema del número 'n'
   * @return Devuelve el número 'n' convertido a octal
   */
  public static String convierteAOctal(String n, String t) {
    long decimal = convierteADecimal(n, t);
    String octal = Long.toString(decimal, 8);
    return octal;
  }
  
  /**
   * Funcion para pasar un número de Octal (O), decimal (D) o binario (B) a hexadecimal
   * 
   * @param n Es el número que se quiere transformar
   * @param t es el tipo de sistema del número 'n'
   * @return Devuelve el número 'n' convertido a hexadecimal
   */
  public static String convierteAHexadecimal(String n, String t) {
    long decimal = convierteADecimal(n, t);
    String hex = Long.toString(decimal, 16);
    return hex.toUpperCase();
  }
  
  /**
   * Funcion para convertir un número binario (B), decimal (D), octal (O) o hexadecimal (H) a
   * otro sistema de esos cuatro
   * 
   * @param n es el número que se quiere convertir
   * @param t1 Es el tipo de sistema al que pertenece el número introducido (B-O-D-H)
   * @param t2 Es el sistema al que se quiere convertir el número (B-O-D-H)
   * @return Devuelve un el número 'n' convertido al sistema 't2'
   */
  public static String convierte(String n, String t1, String t2) {
    String convertido = "";
    switch (t2) {
      case "B":
        convertido = convierteABinario(n, t1);
        break;
      case "O":
        convertido = convierteAOctal(n, t1);
        break;
      case "D":
        convertido = Long.toString(convierteADecimal(n, t1));
        break;
      case "H":
        convertido = convierteAHexadecimal(n, t1);
        break;
      default:
    }
    return convertido.toUpperCase();
  }
}
