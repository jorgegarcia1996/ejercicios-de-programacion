package funciones;

/**
 *
 * @author Jorge García Molina
 */
public class FuncionesVarias {
  
  /**
   * Función para convertir un número en palotes
   * 
   * @param n es el número a convertir en palotes
   * @return un string de palotes que representa al número
   */
  public static String convierteEnPalotes(int n) {
    long volteado = FuncionesConNumeros.voltea((long)n);
    String palotes = "";
    while (volteado > 0) {
      long i = volteado % 10;
      while (i > 0) {
        palotes += "|";
        i--;
      }
      if (volteado > 9) {
        palotes += "-";
      }
      volteado /= 10;
    }
    return palotes;
  }
  
  /**
   * Función para sacar los números primos de un array
   * 
   * @param a es un array simple
   * @return un array simple con los 
   */
  public static int[] filtraPrimos(int[] a) {
    int j = 0;
    for (int i = 0; i < a.length; i++) {
      if (FuncionesConNumeros.esPrimo(a[i])) {
        j++;
      }
    }
    int[] primos = new int[j];
    j = 0;
    for (int i = 0; i < a.length; i++) {
      if (FuncionesConNumeros.esPrimo(a[i])) {
        primos[j] = a[i];
        j++;
      }
    }
    return primos;
  }
  
  /**
   * Función para traducir un número a código morse
   * 
   * @param n es el número que se convertirá en morse
   * @return Un string con el código morse que representa al número
   */
  public static String convierteEnMorse(int n) {
    long volteado = FuncionesConNumeros.voltea((long)n);
    String morse = "";
    while (volteado > 0) {
      int digito = (int)volteado % 10;
      switch (digito) {
        case 0:
          morse += "-----";
          break;
        case 1:
          morse += "·----";
          break;
        case 2:
          morse += "··---";
          break;
        case 3:
          morse += "···--";
          break;
        case 4:
          morse += "····-";
          break;
        case 5:
          morse += "·····";
          break;
        case 6:
          morse += "-····";
          break;
        case 7:
          morse += "--···";
          break;
        case 8:
          morse += "---··";
          break;
        case 9:
          morse += "----·";
          break;
        default:
      }
      volteado /= 10;
    }
    return morse;
  }
  
  /**
   * Función para sacar los números capicúa de un array
   * 
   * @param a es el array donde se buscarán números capicúa
   * @return un array de números con los capicua del array 'a'
   */
  public static int[] filtraCapicuas(int[] a) {
    int j = 0;
    for (int i = 0; i < a.length; i++) {
      if (FuncionesConNumeros.esCapicua(a[i])) {
        j++;
      }
    }
    int[] capicua = new int[j];
    j = 0;
    for (int i = 0; i < a.length; i++) {
      if (FuncionesConNumeros.esCapicua(a[i])) {
        capicua[j] = a[i];
        j++;
      }
    }
    return capicua;
  }
  
  
  public static String convierteEnPalabras(int n) {
    long volteado = FuncionesConNumeros.voltea((long)n);
    String palabras = "";
    while (volteado > 0) {
      int digito = (int)volteado % 10;
      switch (digito) {
        case 0:
          palabras += "cero";
          break;
        case 1:
          palabras += "uno";
          break;
        case 2:
          palabras += "dos";
          break;
        case 3:
          palabras += "tres";
          break;
        case 4:
          palabras += "cuatro";
          break;
        case 5:
          palabras += "cinco";
          break;
        case 6:
          palabras += "seis";
          break;
        case 7:
          palabras += "siete";
          break;
        case 8:
          palabras += "ocho";
          break;
        case 9:
          palabras += "nueve";
          break;
        default:
      }
      volteado /= 10;
      if (volteado > 0) {
        palabras += ", ";
      }
    }
    return palabras;
  }
  
  /**
   * Función para buscar números con el dígito 7 en un array
   * 
   * @param a es un array simple
   * @return un array con los números con '7' del array 'a'
   */
  public static int[] filtraCon7(int[] a) {
    int j = 0;
    for (int i = 0; i < a.length; i++) {
      if (FuncionesConNumeros.esCapicua(a[i])) {
        j++;
      }
    }
    int[] numerosCon7 = new int[j];
    j = 0;
    for (int i = 0; i < a.length; i++) {
      if (FuncionesConNumeros.posicionDeDigito(a[i], 7) != -1) {
        numerosCon7[j] = a[i];
        j++;
      }
    }
    return numerosCon7;
  }
}
