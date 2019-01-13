package Ejercicios.Ejercicio07;

import static java.lang.Thread.sleep;
import java.util.Scanner;

/**
 * Programa principal de venta de entradas
 *
 * @author JorgeGarcíaMolina
 */
public class VentaEntradas {

  public static void main(String[] args) throws InterruptedException {
    //Scanner
    Scanner s = new Scanner(System.in);

    //Variables
    boolean salir = false;
    int opcion = 0;
    int entradas = 0;

    //Objetos (Zonas)
    Zona salaPrincipal = new Zona(1000);
    Zona compraVenta = new Zona(200);
    Zona vip = new Zona(25);

    do {
      System.out.println("Programa de venta de entradas.");
      System.out.println("Seleccione una opción.");
      System.out.println("1. Mostrar número de entradas libres.");
      System.out.println("2. Vender entradas.");
      System.out.println("3. Salir.");
      System.out.println();
      System.out.print("Elige una opción: ");
      opcion = Integer.parseInt(s.nextLine());
      System.out.println();
      switch (opcion) {
        case 1:
          System.out.println("Entradas disponibles de cada zona.");
          System.out.println("Sala Principal: " + salaPrincipal.getEntradasPorVender());
          System.out.println("Compra-Venta: " + compraVenta.getEntradasPorVender());
          System.out.println("VIP: " + vip.getEntradasPorVender());
          sleep(1000);
          break;
        case 2:
          System.out.println("Lista de zonas.");
          System.out.println("1. Sala principal.");
          System.out.println("2. Compra-Venta.");
          System.out.println("3. VIP");
          System.out.println();
          System.out.print("Seleccione una zona: ");
          opcion = Integer.parseInt(s.nextLine());
          System.out.println();
          System.out.print("¿Cuantas entradas desea vender? ");
          entradas = Integer.parseInt(s.nextLine());
          sleep(500);
          switch (opcion) {
            case 1:
              if (salaPrincipal.getEntradasPorVender() <= 0) {
                System.out.println("No hay entradas disponibles para la sala principal.");
              } else if (salaPrincipal.getEntradasPorVender() - entradas < 0) {
                System.out.println("Solo quedan " + salaPrincipal.getEntradasPorVender()
                        + " entradas para la sala principal.");
              } else {
                salaPrincipal.vender(entradas);
              }
              break;
            case 2:
              if (compraVenta.getEntradasPorVender() <= 0) {
                System.out.println("No hay entradas disponibles para la zona de Compra-venta.");
              } else if (compraVenta.getEntradasPorVender() - entradas < 0) {
                System.out.println("Solo quedan " + compraVenta.getEntradasPorVender()
                        + " entradas para la zona de Compra-venta.");
              } else {
                compraVenta.vender(entradas);
              }
              break;
            case 3:
              if (vip.getEntradasPorVender() <= 0) {
                System.out.println("No hay entradas disponibles para la zona VIP.");
              } else if (vip.getEntradasPorVender() - entradas < 0) {
                System.out.println("Solo quedan " + vip.getEntradasPorVender()
                        + " entradas para la zona VIP.");
              } else {
                vip.vender(entradas);
              }
              break;
            default:
              System.out.println("La opción seleccionada no es válida.");
          }
          break;
        case 3:
          System.out.println("Saliendo...");
          salir = true;
          break;
        default:
          System.out.println("La opción seleccionada no es válida.");
      }
      System.out.println();
      sleep(1000);
    } while (!salir);

  }
}
