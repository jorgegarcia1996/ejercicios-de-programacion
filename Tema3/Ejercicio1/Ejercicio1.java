/**
* Ejercicio 1 del Tema 3
* Pedir 2 números enteros y mostrar el resultado de multiplicación.
* 
* @author Jorge García Molina
*/

public class Ejercicio1 {
  public static void main(String[] args) {
    //Pedir el primer número
    System.out.print("Introduzca un número entero: ");
    int primerNumero = Integer.parseInt(System.console().readLine());
    
    //Pedir el segundo número
    System.out.print("Introduzca otro número entero: ");
    int segundoNumero = Integer.parseInt(System.console().readLine());
    
    //Calcular el resultado de la multiplicación
    int resultadoMultiplicacion = primerNumero * segundoNumero;
    System.out.println("El resultado de multiplicar " + primerNumero + " por " +
     segundoNumero + " es " + resultadoMultiplicacion);
  }
}
