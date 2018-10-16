package tema05;
/**
* Ejercicio 07 del Tema 5
* 
* Realiza el control de acceso a una caja fuerte. La combinación será un
* número de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no
* acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación”
* y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
* Tendremos cuatro oportunidades para abrir la caja fuerte.
* 
* @author Jorge García Molina
*/

public class Ejercicio07 {
  public static void main(String[] args) {
    System.out.println("Abrir la caja fuerte, código de 4 dígitos.");
    for (int i = 4; i > 0; i--) {
      //Pedir el código
      System.out.print("Introduzca el código (" + i + " intentos restantes): ");
      int codigo = Integer.parseInt(System.console().readLine());
      
      //Comprobar si el código es correcto
      if (codigo == 1234) {
        System.out.println("La caja fuerte se ha abierto.");
        i = 0;
      } else {
        System.out.println("Lo siento, código incorrecto.");
      }
    }
  }
}
