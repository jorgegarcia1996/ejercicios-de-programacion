package tema06;

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
    System.out.println("Máquina tragaperras");

    //Generar las figuras
    String figura1 = "", figura2 = "", figura3 = "";
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
      switch (i) {
        case 0:
          figura1 = figura;
          break;
        case 1:
          figura2 = figura;
          break;
        case 2:
          figura3 = figura;
          break;
        default:
      }
    }
    System.out.println();
    if (figura1.equals(figura2) && figura1.equals(figura3)){
      System.out.println("Enhorabuena, ha ganado 10 monedas.");
    } else if (figura1.equals(figura2) || figura1.equals(figura3) || figura2.equals(figura3)){
      System.out.println("Bien, ha recuperado su moneda.");
    } else {
      System.out.println("Lo siento, ha perdido.");
    }
  }
}
