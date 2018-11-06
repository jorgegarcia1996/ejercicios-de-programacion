package tema06;

/**
 * Ejercicio 19 del Tema 06
 * 
 * Escribe un programa que muestre 50 números enteros aleatorios comprendidos
 * entre el -100 y el 200 ambos incluidos y separados por espacios. Muestra
 * luego el máximo de los pares el mínimo de los impares y la media de todos los
 * números generados.
 * 
 * 
 * @author jorge
 */
public class Ejercicio19 {

  public static void main(String[] args) {
    System.out.println("50 números aleatorios entre -100 y 200, mayor par, "
            + "menor impar y media de todos");
    System.out.println();

    /*Generar los números, comprobar el mayor de los pares, el menor de los
    impares y la media de todos*/
    int mayorPar = -100, menorImpar = 200, suma = 0;
    for (int i = 0; i < 50; i++) {
     int numero =  (int)((Math.random() * 301) - 100);
      System.out.print(numero + " ");
      suma += numero;
      if ((numero % 2 == 0) && (numero > mayorPar)) {
        mayorPar = numero;
      } else if ((numero % 2 != 0) && (numero < menorImpar)) {
        menorImpar = numero;
      }
    }
    System.out.println();
    int media = suma / 50;
    System.out.println("El mayor de los pares es: " + mayorPar);
    System.out.println("El menor de los impares es: " + menorImpar);
    System.out.println("La media de los números es: " + media);
  }
}
