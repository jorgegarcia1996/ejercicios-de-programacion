package tema06;
/**
 * Ejercicio 12 del Tema 06
 * 
 * Realiza un programa que llene la pantalla de caracteres aleatorios (a lo
 * Matrix) con el código ascii entre el 32 y el 126. Puedes hacer casting con
 * (char) para convertir un entero en un carácter.
 * 
 * @author Jorge García Molina
 */
public class Ejercicio12 {
   public static void main(String[] args) {
    System.out.println("Caracteres aleatorios a lo matrix.");
    
    //Generar los caracteres y mostrarlos por pantalla
    int linea = 0;
    for(int i = 0; i < 8000; i++) {
      System.out.print((char)(Math.random() * (95) + 32));
      linea++;
      if (linea == 100) {
        linea = 0;
        System.out.println();
      }
    }
  }
}