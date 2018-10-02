/**
* Ejercicio 3 del Tema 4
* Decir el día de la semana a partir de un número del 1 al 7
* 
* @author Jorge García Molina
*/

public class Ejercicio03 {
  public static void main(String[] args) {
    //Pedir el número
    System.out.println("Decir el dia en función del número introducido.");
    System.out.print(" Por favor, introduzca un número del 1 al 7: ");
    int dia = Integer.parseInt(System.console().readLine());
    
    //Mostrar el día correspondiente
    switch (dia) { 
      case 1:
        System.out.print("Hoy es Lunes.");
        break;
      case 2:
        System.out.print("Hoy es Martes.");
        break;
      case 3:
        System.out.print("Hoy es Miércoles.");
        break;
      case 4:
        System.out.print("Hoy es Jueves.");
        break;
      case 5:
        System.out.print("Hoy es Viernes.");
        break;
      case 6:
        System.out.print("Hoy es Sábado.");
        break;
      case 7:
        System.out.print("Hoy es Domingo.");
        break;
      default:
        System.out.print("El dia especificado no es válido. los días válidos");
        System.out.print(" son del 1 al 7.");
    } 
  }
}
