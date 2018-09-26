/**
* Ejercicio 7 del Tema 3
* Calcular el total de una factura a partir de una base imponible que se pide
* por pantalla
* 
* @author Jorge García Molina
*/

public class Ejercicio7 {
  public static void main(String[] args) {
    System.out.println("Calcular el total de una factura a partir de la base" + 
    " imponible.");
    //Pedir labase imponible
    System.out.print("Introduzca la base imponible: ");
    double baseImponible = Double.parseDouble(System.console().readLine());
    
    //Calcular el total de la factura
    double IVA = baseImponible * 0.21;
    double total = baseImponible + IVA;
    System.out.printf("El IVA de la factura es %.2f euros\n", IVA);
    System.out.printf("El total de la factura es %.2f euros", total);
  }
}
