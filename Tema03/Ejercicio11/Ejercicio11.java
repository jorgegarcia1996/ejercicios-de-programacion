/**
* Ejercicio 11 del Tema 3
* Conversor de Kb a Mb
* 
* @author Jorge García Molina
*/

public class Ejercicio11 {
  public static void main(String[] args) {
    System.out.println("Conversor de Kb a Mb");
    //Pedir los Mb que se quieren convertir
    System.out.print("Introduzca cuantos Kb desea convertir: ");
    double Kb = Double.parseDouble(System.console().readLine());
    
    //Calcular los Kb
    double Mb = Kb / 1024;
    System.out.printf("%.2f Kb son %.2f Mb", Kb, Mb);
  }
}
