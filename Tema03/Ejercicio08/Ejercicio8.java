/**
* Ejercicio 8 del Tema 3
* Calcualr el salario semanal de un empleado en funcion de las horas trabajadas
* 
* @author Jorge García Molina
*/

public class Ejercicio8 {
  public static void main(String[] args) {
    System.out.println("Calcular el salario semanal de un empleado segun las" + 
    " horas y cobrando 12€ por hora");
    //Pedir el numero de horas trabajadas
    System.out.print("Introduzca el numero de horas: ");
    int horas = Integer.parseInt(System.console().readLine());
    
    //Calcular el salario del trabajador
    int salario = horas * 12;
    System.out.println("El trabajador ha cobrado " + salario + "euros");
  }
}
