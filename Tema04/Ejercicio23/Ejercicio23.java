/**
* Ejercicio 23 del Tema 4
* 
* Escribe un programa que calcule el precio final de un producto según su
* base imponible (precio antes de impuestos), el tipo de IVA aplicado (general,
* reducido o superreducido) y el código promocional. Los tipos de IVA general,
* reducido y superreducido son del 21%, 10% y 4% respectivamente. Los códigos
* promocionales pueden ser nopro, mitad, meno5 o 5porc que significan
* respectivamente que no se aplica promoción, el precio se reduce a la mitad,
* se descuentan 5 euros o se descuenta el 5%. El ejercicio se da por bueno si se
* muestran los valores correctos, aunque los números no estén tabulados.
* 
* @author Jorge García Molina
*/

public class Ejercicio23 {
  public static void main(String[] args) {
    //Pedir los dato al usuario
    System.out.println("Calcular la factura a partir de la base imponible.");
    System.out.print("Introduce la base imponible: ");
    double baseImponible = Double.parseDouble(System.console().readLine());
    System.out.print("Tipo de IVA (normal, reducido, minimo): ");
    String iva = System.console().readLine().toLowerCase();
    System.out.print("Promoción (nopro, mitad, meno5, 5porc): ");
    String promocion = System.console().readLine().toLowerCase();
    
    //Realizar la factura
    System.out.printf("%-22s %9.2f\n", "Base Imponible", baseImponible);
    double precioIva = 0;
    //Calcular el IVA
    if (iva.equals("normal")) {
      double cuantiaIva = baseImponible * 0.21;
      precioIva = baseImponible + cuantiaIva;
      System.out.printf("%-22s %9.2f\n", "IVA (21%)", cuantiaIva);
      System.out.printf("%-22s %9.2f\n", "Precio con IVA", precioIva);
    } else if (iva.equals("reducido")) {
      double cuantiaIva = baseImponible * 0.1;
      precioIva = baseImponible + cuantiaIva;
      System.out.printf("%-22s %9.2f\n", "IVA (10%)", cuantiaIva);
      System.out.printf("%-22s %9.2f\n", "Precio con IVA", precioIva);
    } else if (iva.equals("minimo")) {
      double cuantiaIva = baseImponible * 0.04;
      precioIva = baseImponible + cuantiaIva;
      System.out.printf("%-22s %9.2f\n", "IVA (4%)", cuantiaIva);
      System.out.printf("%-22s %9.2f\n", "Precio con IVA", precioIva);
    }
    
    //Calcular la promoción y total de la factura
    if (promocion.equals("nopro")) {
      double descuento = 0.00;
      double total = precioIva - descuento;
      System.out.printf("%-22s %9.2f\n", "Cód. pro. (nopro)", descuento);
      System.out.printf("%-22s %9.2f\n", "TOTAL", total);
    } else if (promocion.equals("mitad")) {
      double descuento = precioIva / 2;
      double total = precioIva - descuento;
      System.out.printf("%-22s %9.2f\n", "Cód. pro. (mitad)", descuento);
      System.out.printf("%-22s %9.2f\n", "TOTAL", total);
    } else if (promocion.equals("meno5")) {
      double descuento = 5;
      double total = precioIva - descuento;
      System.out.printf("%-22s %9.2f\n", "Cód. pro. (meno5)", descuento);
      System.out.printf("%-22s %9.2f\n", "TOTAL", total);
    } else if (promocion.equals("5porc")) {
      double descuento = precioIva * 0.05;
      double total = precioIva - descuento;
      System.out.printf("%-22s %9.2f\n", "Cód. pro. (5porc)", descuento);
      System.out.printf("%-22s %9.2f\n", "TOTAL", total);
    }
  }
}
