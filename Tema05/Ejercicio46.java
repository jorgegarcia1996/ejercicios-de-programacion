package tema05;

import java.util.Scanner;

/**
* Ejercicio 46 del Tema 5
* 
* Escribe un programa que cambie un dígito dentro de un número dando la
* posición y el valor nuevo. Las posiciones se cuentan de izquierda a derecha
* empezando por el 1. Se recomienda usar long en lugar de int ya que el
* primero admite números más largos. Suponemos que el usuario introduce
* correctamente los datos.
* 
* @author Jorge García Molina
*/

public class Ejercicio46 { 
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Rectángulo hueco.");
    //Pedir la altura y anchura al usuario
    System.out.print("Introduzca la altura del rectángulo (mínimo 2): ");
    int altura = Integer.parseInt(s.nextLine());
    System.out.print("Introduzca el ancho del rectángulo (mínimo 2): ");
    int ancho = Integer.parseInt(s.nextLine());
    
    //Crear el rectángulo con los requisitos del usuario
    if (altura < 2 || ancho < 2) {
        System.out.println("El ancho y el alto del rectángulo deben ser mínimo 2.");
    } else {
        //Primera línea
        for (int i = 0; i < ancho; i++) {
            System.out.print("*");
        }
        System.out.println();
        if (altura > 2) {
            int numLineas = altura - 2;
            int espacios = ancho - 2;
            while (numLineas > 0) {
                System.out.print("*");
                for (int j = 0; j < espacios; j++) {
                    System.out.print(" ");
                }
                System.out.println("*");
                numLineas--;
            }
        }
        
        //Última línea
        for (int i = 0; i < ancho; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
  }
}

