/**
* Ejercicio 22 del Tema 5
* 
* Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos.
* 
* @author Jorge García Molina
*/

public class Ejercicio22 { 
  public static void main(String[] args) {
    System.out.println("Números primos entre el 2 y el 100.");
    
    boolean primo = true;
    for (int j = 2; j < 101; j++) {
      primo = true;
      for (int i = 2; i < j; i++){
        if (j % i == 0) {
          primo = false;
        }
      }
      
      if (primo) {
        System.out.print(j + " ");
      }
    }
  }
}
