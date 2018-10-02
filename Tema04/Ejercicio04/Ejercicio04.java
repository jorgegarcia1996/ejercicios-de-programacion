/**
* Ejercicio 4 del Tema 4
* 
* Vamos a ampliar uno de los ejercicios de la relación anterior para considerar
* las horas extras. Escribe un programa que calcule el salario semanal de un
* trabajador teniendo en cuenta que las horas ordinarias (40 primeras horas de
* trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16
* euros la hora.
* 
* @author Jorge García Molina
*/

public class Ejercicio04 {
  public static void main(String[] args) {
    //Pedir el número de horas trabajadas esta semana
    System.out.println("Calculador de salario.");
    System.out.print("¿Cuátas horas ha trabajado esta semana? ");
    int horas = Integer.parseInt(System.console().readLine());
    
    //Mostrar el día correspondiente
    if (horas <= 40) {
      int salario = horas * 12;
      System.out.print("Esta semana ha cobrado " + salario + " euros.");
    } else {
      int horasExtras = horas - 40;
      int salario = 40 * 12 + horasExtras * 16;
      System.out.print("Esta semana ha cobrado " + salario + " euros.");
    }
  }
}
