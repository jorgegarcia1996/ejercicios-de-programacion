package tema06;
/**
 * Ejercicio 11 del Tema 06
 * 
 * Escribe un programa que muestre 20 notas generadas al azar. Las notas deben
 * aparecer de la forma: suspenso, suficiente, bien, notable o sobresaliente. Al
 * final aparecerá el número de suspensos, el número de suficientes, el número
 * de bienes, etc.
 * 
 * @author jorge
 */
public class Ejercicio11 {
  public static void main(String[] args) {
    System.out.println("20 notas generadas al azar.");
    
    //Generar las notas y contar los tipos de notas
    int suspenso = 0, suficiente = 0, bien = 0, notable = 0, sobresaliente = 0;
    for (int i = 0; i < 20; i++) {
     int nota = (int)(Math.random() * 11);
     switch (nota) {
       case 0:
       case 1:
       case 2:
       case 3:
       case 4:
         System.out.println("Suspenso");
         suspenso++;
     }
    }
  }
}
