/**
* Ejercicio 25 del Tema 4
* 
* La tienda online BanderaDeEspaña.es vende banderas personalizadas de la
* máxima calidad y nos ha pedido hacer un configurador que calcule el precio
* según el alto y el ancho. El precio base de una bandera es de un céntimo de
* euro por centímetro cuadrado. Si la queremos con un escudo bordado, el precio
* se incrementa en 2.50€ independientemente del tamaño. Los gastos de envío son
* 3.25 €, El IVA ya está incluido en todas las tarifas.
* 
* @author Jorge García Molina
*/

public class Ejercicio25 {
  public static void main(String[] args) {
    //Pedir los dato al usuario
    System.out.println("Calcular el precio de la bandera.");
    System.out.println("Todas las medidas deben introducirse en cm.");
    System.out.print("Introduce la altura de la bandera: ");
    double altoBandera = Double.parseDouble(System.console().readLine());
    System.out.print("Introduce el ancho de la bandera: ");
    double anchoBandera = Double.parseDouble(System.console().readLine());
    System.out.print("¿Incluir escudo bordado? (s/n): ");
    String escudo = System.console().readLine().toLowerCase();
    
    //Realizar la factura de la bandera
    System.out.println();
    System.out.println("Gracias por su visita, aqui tiene su factura.");
    System.out.println();
    double tamañoBandera = altoBandera * anchoBandera, precioBandera = tamañoBandera / 100;
    double precioEscudo = 2.50, envio = 3.25, total = 0;
    System.out.printf("%-22s %5.2f €\n", "Bandera de " + tamañoBandera + " cm²:", precioBandera);
    if (escudo.equals("s")) {
      total = precioBandera + precioEscudo + envio;
      System.out.printf("%-22s %5.2f €\n", "Con escudo:", precioEscudo);
    } else {
      precioEscudo = 0;
      total = precioBandera + precioEscudo + envio;
      System.out.printf("%-22s %5.2f €\n", "Sin escudo:", precioEscudo);
    }
    System.out.printf("%-22s %5.2f €\n", "Gastos de envío:", envio);
    System.out.printf("%-22s %5.2f €\n", "TOTAL:", total);
  }
}
