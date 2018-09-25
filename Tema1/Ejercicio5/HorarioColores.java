/**
 * 
 * Ejercicio 5 Tema 1
 * 
 * Tabla con el horario de la clase en colores
 * 
 * @author Jorge García Molina
 */
public class HorarioColores {
  public static void main(String[] args) {
    /**String rojo="\033[31m";
    String verde="\033[32m";
    String naranja="\033[33m";
    String azul="\033[34m";
    String morado="\033[35m";
    String blanco="\033[37m";
    */
    System.out.printf("  \033[36m%-10s  \033[32m%-10s  \033[32m%-10s  \033[32m%-10s  \033[32m%-10s\n", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes");
    System.out.printf("-------------------------------------------------------------\n");
    System.out.printf("| %-10s| %-10s| %-10s| %-10s| %-10s|\n", "ED", "SINF", "PRO", "PRO", "SINF");
    System.out.printf("-------------------------------------------------------------\n");
    System.out.printf("| %-10s| %-10s| %-10s| %-10s| %-10s|\n", "LM", "SINF", "PRO", "PRO", "SINF");
    System.out.printf("-------------------------------------------------------------\n");
    System.out.printf("| %-10s| %-10s| %-10s| %-10s| %-10s|\n", "LM", "SINF", "PRO", "ED", "SINF");
    System.out.printf("-------------------------------------------------------------\n");
    System.out.printf("| %-10s| %-10s| %-10s| %-10s| %-10s|\n", "Recreo", "Recreo", "Recreo", "Recreo", "Recreo");
    System.out.printf("-------------------------------------------------------------\n");
    System.out.printf("| %-10s| %-10s| %-10s| %-10s| %-10s|\n", "BD", "PRO", "BD", "LM", "FOL");
    System.out.printf("-------------------------------------------------------------\n");
    System.out.printf("| %-10s| %-10s| %-10s| %-10s| %-10s|\n", "BD", "PRO", "BD", "LM", "FOL");
    System.out.printf("-------------------------------------------------------------\n");
    System.out.printf("| %-10s| %-10s| %-10s| %-10s| %-10s|\n", "BD", "PRO", "BD", "LM", "FOL");
    System.out.printf("-------------------------------------------------------------\n");
  }
}
