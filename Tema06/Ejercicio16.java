package tema06;
import java.util.Scanner;

/**
 * Ejercicio 16 del Tema 06
 * 
 * Realiza un simulador de máquina tragaperras simplificada que cumpla los
 * siguientes requisitos: 
 * a) El ordenador mostrará una tirada que consiste en mostrar 3 figuras. 
 * b)Hay 5 figuras posibles: corazón, diamante, herradura, campana y limón. 
 * c) Si las tres figuras son diferentes se debe mostrar el mensaje “Lo siento, ha perdido”.
 * d) Si hay dos figuras iguales y una diferente se debe mostrar el mensaje “Bien, ha recuperado su moneda”. 
 * e) Si las tres figuras son iguales se debe mostrar “Enhorabuena, ha ganado 10 monedas”.
 * 
 * @author jorge
 */
public class Ejercicio16 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Máquina tragaperras");

    //Generar las figuras
    for (int i = 0; i < 3; i++) {
     String figura = "";
      switch ((int)(Math.random() * 5)) {
        case 0:
          figura = "corazón";
          break;
        case 1:
          figura = "diamante";
          break;
        case 2:
          figura = "herradura";
          break;
        case 3:
          figura = "campana";
          break;
        case 4:
          figura = "limón";
          break;
        default:
      }
      
      System.out.print(figura + " ");
      switch (i)
             
    }
  }
}
