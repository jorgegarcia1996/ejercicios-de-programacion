/**
* Ejercicio 2 del Tema 4
* Pedir una hora del dia y mostrar un saludo distinto segun la hora que sea
* 
* @author Jorge García Molina
*/

public class Ejercicio02 {
  public static void main(String[] args) {
    //Pedir la hora del dia
    System.out.print("Saludar en función de la hora introducida");
    System.out.print(" Por favor, introduzca una hora sin los minutos y");
    System.out.print(" en formato de 24 horas (00-23):");
    int hora = Integer.parseInt(System.console().readLine());
    
    //Mostrar el saludo en funcion de la hora introducida
    if (6 <= hora && hora <= 12) {
      System.out.print("¡Buenos días!");
    } else if (14 <= hora && hora <= 20) {
      System.out.print("¡Buenas tardes!");
    } else if ((21 <= hora && hora <= 23) || (0 <= hora && hora <= 5)) {
      System.out.print("¡Buenas noches!");
    } else {
      System.out.print("Valor incorrecto, por favor, introduzca una hora");
      System.out.print(" correcta sin los minutos y en formato de 24 horas,");
      System.out.print(" por ejemplo: 00, 01, 02, ..., 22, 23.");
    } 
  }
}
