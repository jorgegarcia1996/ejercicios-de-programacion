package tema06;
import java.util.Scanner;
/**
 * Ejercicio 06 del Tema 06
 * 
 * Escribe un programa que piense un número al azar entre 0 y 100. El usuario
 * debe adivinarlo y tiene para ello 5 oportunidades. Después de cada intento
 * fallido, el programa dirá cuántas oportunidades quedan y si el número intro-
 * ducido es menor o mayor que el número secreto.
 * 
 * @author jorge
 */
public class Ejercicio06 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Adivina el número.");
    
    //Generar el número y comprobar si el usuario ha acertado
    int numero = (int)(Math.random() * 101);
    System.out.println(numero);
    boolean acierto = false;
    for (int i = 5; i > 0; i--) {
      System.out.print("Introduzca un número entre el 0 y el 100 (" + i
              + " intentos restantes): ");
      int nUsuario = Integer.parseInt(s.nextLine());
      if (numero == nUsuario) {
        i = 0;
        acierto = true;
      } else if (numero < nUsuario) {
        System.out.print("El número introducido es muy grande. ");
      } else {
        System.out.print("El número introducido es muy pequeño. ");
      }
    }
    if (acierto) {
      System.out.println("¡¡Enhorabuena!! Has acertado el número.");
    } else {
      System.out.println("Mala suerte, no has adivinado el número, el número"
              + " era: " + numero);
    }
  }
}