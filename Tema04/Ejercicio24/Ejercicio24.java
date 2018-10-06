/**
* Ejercicio 24 del Tema 4
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

public class Ejercicio24 {
  public static void main(String[] args) {
    //Pedir los dato al usuario
    System.out.println("Calcular la nómina según el trabajador.");
    System.out.println("1.- Programadar junior");
    System.out.println("2.- Programador senior");
    System.out.println("3.- Jefe de proyecto");
    System.out.println();
    System.out.print("Introduce el cargo del trabajador (1 - 3): ");
    int cargo = Integer.parseInt(System.console().readLine());
    System.out.print("¿Cuántos días ha estado de viaje visitando clientes? ");
    int diasVisita = Integer.parseInt(System.console().readLine());
    System.out.print("Estado civil (1.- Soltero, 2.- Casado): ");
    int estadoCivil = Integer.parseInt(System.console().readLine());
    
    //Realizar las nóminas
    //─ ━ │ ┃ ┄ ┅ ┆ ┇ ┈ ┉ ┊ ┋ ┌ ┏ ┐ ┓ └ ┗ ┘ ┛ ├ ┣ ┤ ┫ ┬ ┳ ┴ ┻ ┼ ╋ ═ ║ ╔ ╗ ╚ ╝ ╠ ╣ ╦ ╩ ╬ ╭ ╮ ╯ ╰
    double sueldoBase = 0, dietas = diasVisita * 30, sueldoBruto = 0, irpf = 0;
    double sueldoNeto = 0;
    String porIrpf = "";
    switch (cargo) {
      case 1:
        sueldoBase = 950;
        sueldoBruto = sueldoBase + dietas;
        if (estadoCivil == 1) {
          porIrpf = "25%";
          irpf = sueldoBruto * 0.25;
        } else {
          porIrpf = "20%";
          irpf = sueldoBruto * 0.2;
        }
        sueldoNeto = sueldoBruto - irpf;
        System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
        System.out.printf("┃ %-22s %10.2f ┃\n", "Sueldo base", sueldoBase);
        System.out.printf("┃ %-22s %10.2f ┃\n", "Dietas (" + diasVisita + " viajes)", dietas);
        System.out.println("┣━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┫");
        System.out.printf("┃ %-22s %10.2f ┃\n", "Sueldo bruto", sueldoBruto);
        System.out.printf("┃ %-22s %10.2f ┃\n", "Retención IRPF (" + porIrpf + ")", irpf);
        System.out.println("┣━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┫");
        System.out.printf("┃ %-22s %10.2f ┃\n", "Sueldo neto", sueldoNeto);
        System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
        break;
      case 2:
        sueldoBase = 1200;
        sueldoBruto = sueldoBase + dietas;
        if (estadoCivil == 1) {
          porIrpf = "25%";
          irpf = sueldoBruto * 0.25;
        } else {
          porIrpf = "20%";
          irpf = sueldoBruto * 0.2;
        }
        sueldoNeto = sueldoBruto - irpf;
        System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
        System.out.printf("┃ %-22s %10.2f ┃\n", "Sueldo base", sueldoBase);
        System.out.printf("┃ %-22s %10.2f ┃\n", "Dietas (" + diasVisita + " viajes)", dietas);
        System.out.println("┣━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┫");
        System.out.printf("┃ %-22s %10.2f ┃\n", "Sueldo bruto", sueldoBruto);
        System.out.printf("┃ %-22s %10.2f ┃\n", "Retención IRPF (" + porIrpf + ")", irpf);
        System.out.println("┣━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┫");
        System.out.printf("┃ %-22s %10.2f ┃\n", "Sueldo neto", sueldoNeto);
        System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
        break;
      case 3:
        sueldoBase = 1600;
        sueldoBruto = sueldoBase + dietas;
        if (estadoCivil == 1) {
          porIrpf = "25%";
          irpf = sueldoBruto * 0.25;
        } else {
          porIrpf = "20%";
          irpf = sueldoBruto * 0.2;
        }
        sueldoNeto = sueldoBruto - irpf;
        System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
        System.out.printf("┃ %-22s %10.2f ┃\n", "Sueldo base", sueldoBase);
        System.out.printf("┃ %-22s %10.2f ┃\n", "Dietas (" + diasVisita + " viajes)", dietas);
        System.out.println("┣━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┫");
        System.out.printf("┃ %-22s %10.2f ┃\n", "Sueldo bruto", sueldoBruto);
        System.out.printf("┃ %-22s %10.2f ┃\n", "Retención IRPF (" + porIrpf + ")", irpf);
        System.out.println("┣━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┫");
        System.out.printf("┃ %-22s %10.2f ┃\n", "Sueldo neto", sueldoNeto);
        System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
        break;
      default:
      
    }
  }
}
