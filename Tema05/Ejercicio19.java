package tema05;
/**
* Ejercicio 19 del Tema 5
* 
* Realiza un programa que pinte una pirámide por pantalla. La altura se debe
* pedir por teclado. El carácter con el que se pinta la pirámide también se debe
* pedir por teclado.
* 
* @author Jorge García Molina
*/
import java.util.Scanner;

public class Ejercicio19 { 
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Pirámide personalizada.");
    //Pedir la altura de la pirámide y el símbolo
    System.out.print("Introduzca la altura de la pirámide: ");
    int altura = Integer.parseInt(s.nextLine());
    System.out.print("Introduzca el símbolo: ");
    String sim = s.nextLine();
    
    //Contarde un número al otro
    if (altura > 1 ) {
      int base = (altura * 2) - 1;
      int espacios = altura - 1;
      int i = 1;
      while (i <= base) {
        for (int j = 0; j < espacios; j++) {
        System.out.print(" ");
        }
        
        for (int j = 1; j <= i; j++) {
        System.out.print(sim);
        }
        System.out.println();
        i += 2;
        espacios--;
      }
    } else {
      System.out.print(sim);
    }
  }
}
