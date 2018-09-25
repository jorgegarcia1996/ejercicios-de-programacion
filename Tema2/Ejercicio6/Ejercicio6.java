/**
 * 
 * Ejercio 6 del tema 2
 * 
 * @author Jorge García Molina
 */
public class Ejercicio6 {
  public static void main(String[] args) {
    double baseImponible = 584.26;
    double IVA = baseImponible * 0.21;
    double precioTotal = baseImponible + IVA;
    System.out.printf("Base Imponible: %.2f €\n", baseImponible);
    System.out.printf("IVA: %.2f €\n", IVA);
    System.out.printf("Precio Total: %.2f €\n", precioTotal);
  }
}
