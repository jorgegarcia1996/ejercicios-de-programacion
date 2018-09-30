/**
* Ejercicio 1 del Tema 4
* Pedir un dia de la semana y mostrar la asignatura que toca a primera hora ese
* dia.
* 
* @author Jorge García Molina
*/

public class Ejercicio01 {
  public static void main(String[] args) {
    //Pedir el dia de la semana
    System.out.print("Programa para saber que asignatura toca a primera hora.");
    System.out.print(" Por favor, introduzca el dia de la semana que desea");
    System.out.print(" consultar (L-V):");
    String dia = System.console().readLine();
    
    //Comprobar el día de la semana
    if (dia.equals("L")) {
      System.out.print("Los Lunes a primera hora toca 'EED'.");
    } else if (dia.equals("M")) {
      System.out.print("Los Martes a primera hora toca 'SINF'.");
    } else if (dia.equals("X")) {
      System.out.print("Los Miércoles a primera hora toca 'PRO'.");
    } else if (dia.equals("J")) {
      System.out.print("Los Jueves a primera hora toca 'PRO'.");
    } else if (dia.equals("V")) {
      System.out.print("Los Viernes a primera hora toca 'SINF'.");
    } else {
      //Mensaje de error si no se ha introducido un dia correcto
      System.out.print("Dia no válido, por favor, cierre el programa y");
      System.out.println(" ejecútelo de nuevo introduciendo un día válido.");
      System.out.print("Los días válidos son: L, M, X, J, V");
    }
  }
}
