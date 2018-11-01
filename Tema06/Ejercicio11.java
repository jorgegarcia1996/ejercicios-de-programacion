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
    for (int i = 1; i <= 20; i++) {
     int nota = (int)(Math.random() * 11);
      System.out.printf("%2d. ", i);
     switch (nota) {
       case 0:
       case 1:
       case 2:
       case 3:
       case 4:
         System.out.println("Suspenso");
         suspenso++;
         break;
       case 5:
         System.out.println("Suficiente");
         suficiente++;
         break;
       case 6:
         System.out.println("Bien");
         bien++;
         break;
       case 7:
       case 8:
         System.out.println("Notable");
         notable++;
         break;
       case 9:
       case 10:
         System.out.println("Sobresaliente");
         sobresaliente++;
         break;
       default:
     }
    }
    System.out.println("Número de Suspensos: " + suspenso);
    System.out.println("Número de Suficientes: " + suficiente);
    System.out.println("Número de Bienes: " + bien);
    System.out.println("Número de Notables: " + notable);
    System.out.println("Número de Sobresalientes: " + sobresaliente);
  }
}
