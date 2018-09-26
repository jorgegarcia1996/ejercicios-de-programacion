/**
* Ejercicio 2 del Tema 3
* Conversor de euros a pesetas pidiendo la cantidad de euros por pantalla.
* 
* @author Jorge García Molina
*/

public class Ejercicio2 {
  public static void main(String[] args) {
    //Pedir la cantidad de euros
    System.out.print("Introduzca la cantida de euros que desea convertir: ");
    double euros = Double.parseDouble(System.console().readLine());
    
    //Realizar la conversión
    int pesetas = (int)euros * (int)166.386;
    System.out.printf("%.2f euros son %d pesetas", euros, pesetas);
  }
}
