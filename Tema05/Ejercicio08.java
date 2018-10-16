package tema05;
/**
* Ejercicio 08 del Tema 5
* 
* Muestra la tabla de multiplicar de un número introducido por teclado.
* 
* @author Jorge García Molina
*/

public class Ejercicio08 {
  public static void main(String[] args) {
    System.out.println("Tabla de multiplicar.");
    //Pedir el número
    System.out.print("Introduzca un número para la tabla de multiplicar: ");
    int numero = Integer.parseInt(System.console().readLine());

    //Hacer la tabla de multiplicar
    for (int i = 0; i <= 10; i++) {
      int resultado = numero * i;
      System.out.println(numero + " * " + i + " = " + resultado);
    }
  }
}
