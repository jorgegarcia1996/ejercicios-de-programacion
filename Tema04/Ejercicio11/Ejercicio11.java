/**
* Ejercicio 11 del Tema 4
* 
* Escribe un programa que dada una hora determinada (horas y minutos), 
* calcule los segundos que faltan para llegar a la medianoche.
* 
* @author Jorge García Molina
*/

public class Ejercicio11 {
  public static void main(String[] args) {
    //Pedir la hora y los minutos
    System.out.println("Averigua cuantos segundos quedan hasta media noche.");
    System.out.print("Introduzca la hora que es (00-23): ");
    int hora = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca los minutos (00-59): ");
    int minutos = Integer.parseInt(System.console().readLine());
    
    // Calcular los segundos que faltan hasta meda noche.
    if (hora > 23 || minutos > 59) {
      System.out.print("El día no puede tener más de 24 horas ni los minutos");
      System.out.print(" más de 59 minutos.");
    } else {
      int segundosDia = 24 * 3600;
      int segundosHoraActual = hora * 3600 + minutos * 60;
      int segundosRestantes = segundosDia - segundosHoraActual;
      System.out.print("Hasta las 00:00 faltan " + segundosRestantes + " segundos.");
    }
  }
}
