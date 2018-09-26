/**
* Ejercicio 9 del Tema 3
* Calcular el volumen de un cono
* 
* @author Jorge García Molina
*/

public class Ejercicio9 {
  public static void main(String[] args) {
    System.out.println("Calcular el volumen de un cono");
    //Pedir el radio y la altura
    System.out.print("Introduzca el valor del radio de la base del cono: ");
    double radio = Double.parseDouble(System.console().readLine());
    System.out.print("Introduzca el valor de la altura del cono: ");
    double altura = Double.parseDouble(System.console().readLine());
    
    //Calcular el volumen del cono
    double volumen = (Math.PI * radio * radio * altura) / 3;
    System.out.printf("El cono tiene un volumen de %.2f", volumen);
  }
}
