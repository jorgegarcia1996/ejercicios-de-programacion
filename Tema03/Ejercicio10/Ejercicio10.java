/**
* Ejercicio 10 del Tema 3
* Conversor de Mb a Kb
* 
* @author Jorge García Molina
*/

public class Ejercicio10 {
  public static void main(String[] args) {
    System.out.println("Conversor de Mb a Kb");
    //Pedir los Mb que se quieren convertir
    System.out.print("Introduzca cuantos Mb desea convertir: ");
    double Mb = Double.parseDouble(System.console().readLine());
    
    //Calcular los Kb
    double Kb = Mb * 1024;
    System.out.printf("%.2f Mb son %.2f Kb", Mb, Kb);
  }
}
