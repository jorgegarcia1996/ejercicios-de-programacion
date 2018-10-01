/**
* Ejercicio 3 del Tema 4
* Decir el día de la semana a partir de un número del 1 al 7
* 
* @author Jorge García Molina
*/

public class Ejercicio03 {
  public static void main(String[] args) {
    //Pedir el número
    System.out.print("Decir el dia en función del número introducido.");
    System.out.print(" Por favor, introduzca un número del 1 al 7: ");
    String dia = System.console().readLine();
    
    //Mostrar el día correspondiente
    if (dia.equals("1")) {
      System.out.print("Hoy es Lunes.");
    } else if (dia.equals("2")) {
      System.out.print("Hoy es Martes.");
    } else if (dia.equals("3")) {
      System.out.print("Hoy es Miercoles.");
    } else if (dia.equals("4")) {
      System.out.print("Hoy es Jueves.");
    } else if (dia.equals("5")) {
      System.out.print("Hoy es Viernes.");
    } else if (dia.equals("6")) {
      System.out.print("Hoy es Sábado.");
    } else if (dia.equals("7")) {
      System.out.print("Hoy es Domingo.");
    } else {
      //Mensaje de error si no se ha introducido un dia correcto
      System.out.print("Dia no válido, por favor, cierre el programa y");
      System.out.println(" ejecútelo de nuevo introduciendo un día válido.");
    } 
  }
}
