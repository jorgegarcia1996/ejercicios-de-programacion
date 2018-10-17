package tema05;

/**
 * Ejercicio 30 del Tema 5
 *
 * Realiza una programa que calcule las horas transcurridas entre dos horas de
 * dos días de la semana. No se tendrán en cuenta los minutos ni los segundos.
 * El día de la semana se puede pedir como un número (del 1 al 7) o como una
 * cadena (de “lunes” a “domingo”). Se debe comprobar que el usuario introduce
 * los datos correctamente y que el segundo día es posterior al primero.
 *
 * @author Jorge García Molina
 */
import java.util.Scanner;

public class Ejercicio30 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Calcular las horas que hay entre 2 dadas por el usuario");
    // Pedir los datos al usuario
    System.out.println("Datos de la primera hora");
    System.out.print("Día (1-7): ");
    int dia1 = Integer.parseInt(s.nextLine());
    System.out.print("Hora (00-23): ");
    int hora1 = Integer.parseInt(s.nextLine());
    System.out.println("Datos de la segunda hora:");
    System.out.print("Día (1-7): ");
    int dia2 = Integer.parseInt(s.nextLine());
    System.out.print("Hora (00-23): ");
    int hora2 = Integer.parseInt(s.nextLine());

    //Calcular la horas que hay de la primera a la segunda
    int horasRestantes = 0;
    if ((hora1 < 24 || hora2 < 24) || (hora1 >= 0 || hora2 >= 0)) {//Comprobar que las horas son correctas
      if (dia1 == dia2) {//Caso de que se de el mismo día en ambas partes
        if (hora1 < hora2) {
          horasRestantes = hora2 - hora1;
          System.out.println("Desde las " + hora1 + ":00 hasta las " + hora2 + ":00"
                  + " hay " + horasRestantes + " horas");
          
        } else {
          System.out.println("Para el mismo día, debe introducir primero la hora"
                  + " menor y luego la mayor");
        }
      } else if (dia1 < dia2) {//Caso de que el día 1 sea menor que el día 2
        int horasDia1 = 24 - hora1;
        for (int i = dia1 + 1; i < dia2; i++) {
          horasRestantes += 24;
        }
        horasRestantes = horasRestantes + horasDia1 + hora2;
        String primerDia = "";
        String segundoDia = "";
        switch (dia1) {
          case 1:
            primerDia = "lunes";
            break;
          case 2:
            primerDia = "martes";
            break;
          case 3:
            primerDia = "miércoles";
            break;
          case 4:
            primerDia = "jueves";
            break;
          case 5:
            primerDia = "viernes";
            break;
          case 6:
            primerDia = "sábado";
            break;
          case 7:
            primerDia = "domingo";
            break;
          default:
            break;
        }
        switch (dia2) {
          case 1:
            segundoDia = "lunes";
            break;
          case 2:
            segundoDia = "martes";
            break;
          case 3:
            segundoDia = "miércoles";
            break;
          case 4:
            segundoDia = "jueves";
            break;
          case 5:
            segundoDia = "viernes";
            break;
          case 6:
            segundoDia = "sábado";
            break;
          case 7:
            segundoDia = "domingo";
            break;
          default:
            break;
        }
        System.out.println("Desde el " + primerDia + " a las " + hora1 + ":00 hasta "
                + "el " + segundoDia + " a las " + hora2 + ":00 hay " + horasRestantes
                + " horas restantes.");
      } else {//Caso de que el día 2 sea menor que el día 1
        System.out.println("Por favor, introduzca primero el día que va antes y"
                + " luego el día que va después");
      }
    } else {
      System.out.println("Las horas deben ser más de 0 y menos de 23.");
    }
  }
}
