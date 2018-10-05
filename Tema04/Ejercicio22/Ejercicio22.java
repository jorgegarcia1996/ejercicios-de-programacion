/**
* Ejercicio 22 del Tema 4
* 
* Realiza un programa que, dado un día de la semana (de lunes a viernes) y una
* hora (horas y minutos), calcule cuántos minutos faltan para el fin de semana.
* Se considerará que el fin de semana comienza el viernes a las 15:00h. Se da
* por hecho que el usuario introducirá un día y hora correctos, anterior al
* viernes a las 15:00h.
* 
* @author Jorge García Molina
*/

public class Ejercicio22 {
  public static void main(String[] args) {
    //Pedir los datos al usuario
    System.out.println("Calcular cuanto falta para el fin de semana (Viernes a las 15:00).");
    System.out.print("Introduce el día de la semana (Lunes - Viernes): ");
    String diaSemana = System.console().readLine().toLowerCase();
    System.out.print("Introduce la hora (00 - 23): ");
    int hora = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce los minutos (00 - 59): ");
    int minutos = Integer.parseInt(System.console().readLine());
    
    //Calcular los minutos que faltas hasta que llegue el fin de semana
    int minutosRestantes = 0;
    switch (diaSemana) {
      case "lunes":
        minutosRestantes = (((24 * 60)) * 4 + (15 * 60)) - (hora * 60 + minutos);
        System.out.print("Faltan " + minutosRestantes + " minutos hasta el fin de semana.");
        break;
      case "martes":
        minutosRestantes = (((24 * 60)) * 3 + (15 * 60)) - (hora * 60 + minutos);
        System.out.print("Faltan " + minutosRestantes + " minutos hasta el fin de semana.");
        break;
      case "miercoles":
        minutosRestantes = (((24 * 60)) * 2 + (15 * 60)) - (hora * 60 + minutos);
        System.out.print("Faltan " + minutosRestantes + " minutos hasta el fin de semana.");
        break;
      case "jueves":
        minutosRestantes = (((24 * 60)) + (15 * 60)) - (hora * 60 + minutos);
        System.out.print("Faltan " + minutosRestantes + " minutos hasta el fin de semana.");
        break;
      case "viernes":
        minutosRestantes = (15 * 60) - (hora * 60 + minutos);
        System.out.print("Faltan " + minutosRestantes + " minutos hasta el fin de semana.");
        break;
      default:
      System.out.print("El día introducido no es válido, los días válidoss son:");
      System.out.print(" lunes, martes, miercoles, jueves, viernes");
    }
  }
}
