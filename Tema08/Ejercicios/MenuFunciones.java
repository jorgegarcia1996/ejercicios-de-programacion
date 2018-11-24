package Ejercicios;


import static Funciones.FuncionesConNumeros.esCapicua;
import static Funciones.FuncionesConNumeros.esPrimo;
import java.util.Scanner;

/**
 * 
 * Con este archivo se pueden testear todas las funciones creadas en el tema 08
 * 
 * @author Jorge Garcia Molina
 */
public class MenuFunciones {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Selecciona la funcion que quiere probar "
            + "de la lista de abajo.");
    System.out.println("01.- Función 'esCapicua'.");
    System.out.println("02.- Función 'esPrimo'.");
    System.out.println("03.- Función 'siguientePrimo'.");
    System.out.println("04.- Función 'potencia'.");
    System.out.println("05.- Función 'digitos'.");
    System.out.println("06.- Función 'voltea'.");
    System.out.println("07.- Función 'digitoN'.");
    System.out.println("08.- Función 'posicionDeDigito'.");
    System.out.println("09.- Función 'quitaPorDetras'.");
    System.out.println("10.- Función 'quitaPorDelante'.");
    System.out.println("11.- Función 'pegaPorDetras'.");
    System.out.println("12.- Función 'pegaPorDelante'.");
    System.out.println("13.- Función 'trozoDeNumero'.");
    System.out.println("14.- Función 'juntaNumeros'.");
    System.out.println();
    System.out.print("Elige una opción (1 - 14): ");
    int opcion = Integer.parseInt(s.nextLine());
    System.out.println();
    
    //Sección para probar las funciones en función de la opción elegida
    long num;
    switch (opcion) {
      case 1:
        System.out.println("Función 'esCapicua'.");
        System.out.println("Función para comprobar si un número es capicúa o no");
        System.out.print("Introduce un número entero: ");
        num = Long.parseLong(s.nextLine());
        if (esCapicua(num)) {
          System.out.println("El número " + num + " es capicúa.");
        } else {
          System.out.println("El número " + num + " no es capicúa.");
        }
        break;
      case 2:
        System.out.println("Función 'esPrimo'.");
        System.out.println("Función para averiguar si un número es primo");
        System.out.print("Introduce un número entero: ");
        num = Long.parseLong(s.nextLine());
        if (esPrimo(num)) {
          System.out.println("El número " + num + " es primo.");
        } else {
          System.out.println("El número " + num + " no es primo.");
        }
        break;
      case 3:
        break;
      case 4:
        break;
      case 5:
        break;
      case 6:
        break;
      case 7:
        break;
      case 8:
        break;
      case 9:
        break;
      case 10:
        break;
      case 11:
        break;
      case 12:
        break;
      case 13:
        break;
      case 14:
        break;
    }
  }
}
