/**
* Ejercicio 4 del Tema 3
* Pedir 2 números por pantalla y mostrar su suma, resta, multiplicación y 
* división
* 
* @author Jorge García Molina
*/

public class Ejercicio4 {
  public static void main(String[] args) {
    //Pedir el primer numero
    System.out.print("Introduzca un número: ");
    double primerNumero = Double.parseDouble(System.console().readLine());
    
    //Pedir el segundo numero
    System.out.print("Introduzca un número: ");
    double segundoNumero = Double.parseDouble(System.console().readLine());
    
    //Realizar las operacioens y mostrarlas por pantalla
    double suma = primerNumero + segundoNumero;
    double resta = primerNumero - segundoNumero;
    double multiplicacion = primerNumero * segundoNumero;
    double division = primerNumero / segundoNumero;
    System.out.printf("La suma de %.2f y %.2f es: %.2f\n", primerNumero,
    segundoNumero, suma);
    System.out.printf("La resta de %.2f y %.2f es: %.2f\n", primerNumero,
    segundoNumero, resta);
    System.out.printf("La multiplicación de %.2f y %.2f es: %.2f\n", 
    primerNumero, segundoNumero, multiplicacion);
    System.out.printf("La división de %.2f y %.2f es: %.2f\n", primerNumero,
    segundoNumero, division);
  }
}
