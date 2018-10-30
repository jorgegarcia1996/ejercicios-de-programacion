package tema06;
/**
 * Ejercicio 03 del Tema 06
 * 
 * Igual que el ejercicio anterior pero con la baraja española. Se utilizará la
 * baraja de 40 cartas: 2, 3, 4, 5, 6, 7, sota, caballo, rey y as.
 * 
 * @author jorge
 */
public class Ejercicio03 {
  public static void main(String[] args) {
    System.out.println("Carta aleatoria (baraja española).");
    
    //Generar carta aleatoria
    int numero = (int)(Math.random() * 10) + 1;
    int palo = (int)(Math.random() * 4) + 1;
    switch (numero) {
      case 1:
        System.out.print("As");
        break;
      case 8:
        System.out.print("Sota");
        break;
      case 9:
        System.out.print("Caballo");
        break;
      case 10:
        System.out.print("Rey");
        break;
      default:
        System.out.print(numero);
    }
    System.out.print(" de ");
    switch (palo) {
      case 1:
        System.out.println("oros");
        break;
      case 2:
        System.out.println("bastos");
        break;
      case 3:
        System.out.println("copas");
        break;
      case 4:
        System.out.println("espadas");
        break;
      default:
    }
  }
}