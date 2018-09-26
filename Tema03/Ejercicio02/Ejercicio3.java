/**
* Ejercicio 3 del Tema 3
* Conversor de pesetas a euros pidiendo la cantidad de pesetas por pantalla.
* 
* @author Jorge García Molina
*/

public class Ejercicio3 {
  public static void main(String[] args) {
    //Pedir la cantidad de pesetas
    System.out.print("Introduzca la cantida de pesetas que desea convertir: ");
    int pesetas = Integer.parseInt(System.console().readLine());
    
    //Realizar la conversión
    double euros = (double)pesetas / 166.386;
    System.out.printf("%d pesetas son %.2f euros", pesetas, euros);
  }
}
