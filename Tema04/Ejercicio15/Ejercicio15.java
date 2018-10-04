/**
* Ejercicio 15 del Tema 4
* 
* Escribe un programa que pinte una pirámide rellena con un carácter introducido
* por teclado que podrá ser una letra, un número o un símbolo como *, +, -, $,
* &, etc. El programa debe permitir al usuario mediante un menú elegir si 
* el vértice de la pirámide está apuntando hacia arriba, hacia abajo, hacia la 
* izquierda o hacia la derecha.
* 
* @author Jorge García Molina
*/

public class Ejercicio15 {
  public static void main(String[] args) {
    //Pedir un número entero
    System.out.println("Dibuja la pirámide que quieras.");
    System.out.print("Introduzca el símbolo para la pirámide (carácter, numero o símbolo): ");
    String simbolo = System.console().readLine();
    System.out.print("Dirección del vértice (Arriba, Abajo, Derecha o Izquierda): ");
    String direccion = System.console().readLine().toLowerCase();
    
    // Mostrar la pirámide al usuario
    String s = simbolo;
    switch (direccion) {
      case "arriba":
        System.out.println("   " + s);
        System.out.println("  " + s + s + s);
        System.out.println(" " + s + s + s + s + s);
        System.out.println(s + s + s + s + s + s + s);
        break;
      case "abajo":
        System.out.println(s + s + s + s + s + s + s);
        System.out.println(" " + s + s + s + s + s);
        System.out.println("  " + s + s + s);
        System.out.println("   " + s);
        break;
      case "derecha":
        System.out.println(s);
        System.out.println(s + " " + s);
        System.out.println(s + " " + s + " " + s);
        System.out.println(s + " " + s + " " + s + " " + s);
        System.out.println(s + " " + s + " " + s);
        System.out.println(s + " " + s);
        System.out.println(s);
        break;
      case "izquierda":
        System.out.println("      " + s);
        System.out.println("    "+ s + " " + s);
        System.out.println("  " + s + " " + s + " " + s);
        System.out.println(s + " " + s + " " + s + " " + s);
        System.out.println("  " + s + " " + s + " " + s);
        System.out.println("    " + s + " " + s);
        System.out.println("      " + s);
        break;
      default:
        System.out.print("La dirección introducida no es válida, las direcciones");
        System.out.print(" válidas son: Arriba, Abajo, Derecha o Izquierda");
    }
  }
}
