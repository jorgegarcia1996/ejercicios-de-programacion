package tema07;

import java.util.Scanner;

/**
 * Ejercicio 08 del Tema 07
 *
 * Realiza un programa que pida la temperatura media que ha hecho en cada mes de
 * un determinado año y que muestre a continuación un diagrama de barras
 * horizontales con esos datos. Las barras del diagrama se pueden dibujar a base
 * de asteriscos o cualquier otro carácter.
 *
 * @author Jorge García Molina
 */
public class Ejercicio08 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Diagrama de barras de temperaturas");
    System.out.println();

    //Crear el array con los meses y otro para guardar las temperaturas
    final int N = 12;
    String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", 
      "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
    int[] temperaturas = new int[N];
    for (int i = 0; i < N; i++) {
      System.out.print("Introduzca la temperatura media de " + meses[i] + ": ");
      int temperatura = Integer.parseInt(s.nextLine());
      System.out.print(temperatura + " ");
      temperaturas[i] = temperatura;
    }
    System.out.println();
    //Crear el diagrama de barras con las temperaturas
    System.out.println("Representación de las temperaturas.");
    for (int i = 0; i < N; i++) {
      String barra = "";
      for (int j = 0; j <= temperaturas[i]; j++){
        barra = barra + "█";
      }
      System.out.printf("%-12s %3d|%-70s\n", meses[i],temperaturas[i], barra);
    }
  }
}
