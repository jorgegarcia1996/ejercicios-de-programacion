package tema05;

import java.util.Scanner;

/**
* Ejercicio 47 del Tema 5
* 
* Con motivo de la celebración del día de la mujer, el 8 de marzo, nos han
* encargado realizar un programa que pinte un 8 por pantalla usando la letra
* M. Se pide al usuario la altura, que debe ser un número entero impar mayor
* o igual que 5. Si el número introducido no es correcto, el programa deberá
* mostrar un mensaje de error. A continuación se muestran algunos ejemplos.
* La anchura de la figura siempre será de 6 caracteres.
* 
* @author Jorge García Molina
*/

public class Ejercicio47 { 
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Día de la mujer, 8 de 'M'.");
    //Pedir la altura
    System.out.print("Introduzca un número entero (mínimo 5): ");
    int altura = Integer.parseInt(s.nextLine());
    
    //Mostrar la M
    if (altura < 5 || (altura % 2) == 0) {
        System.out.println("La altura debe ser un número impar mayor o igual a 5.");
    } else {
        int sector = (altura - 3) / 2;
        System.out.println("MMMMMM");
        for (int i = 0; i < sector; i++) {
            System.out.println("M    M");
        }
        System.out.println("MMMMMM");
        for (int i = 0; i < sector; i++) {
            System.out.println("M    M");
        }
        System.out.println("MMMMMM");
    }
  }
}

