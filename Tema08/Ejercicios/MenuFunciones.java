package Ejercicios;


import Funciones.FuncionesConNumeros;
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
    long num1, num2, num3;
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
    switch (opcion) {
      case 1:
        System.out.println("Función 'esCapicua'.");
        System.out.println("Función para comprobar si un número es capicúa o no");
        System.out.print("Introduce un número entero: ");
        num1 = Long.parseLong(s.nextLine());
        if (FuncionesConNumeros.esCapicua(num1)) {
          System.out.println("El número " + num1 + " es capicúa.");
        } else {
          System.out.println("El número " + num1 + " no es capicúa.");
        }
        break;
      case 2:
        System.out.println("Función 'esPrimo'.");
        System.out.println("Función para averiguar si un número es primo");
        System.out.print("Introduce un número entero: ");
        num1 = Long.parseLong(s.nextLine());
        if (FuncionesConNumeros.esPrimo(num1)) {
          System.out.println("El número " + num1 + " es primo.");
        } else {
          System.out.println("El número " + num1 + " no es primo.");
        }
        break;
      case 3:
        System.out.println("Función 'siguientePrimo'.");
        System.out.println("Función que devuelve el siguiente número primo del número introducido");
        System.out.print("Introduce un número entero: ");
        num1 = Long.parseLong(s.nextLine());
        System.out.println("El número primo mayor más cercano a " + num1 + " es el: "
                + FuncionesConNumeros.siguientePrimo(num1));
        break;
      case 4:
        System.out.println("Función 'potencia'.");
        System.out.println("Función para calcular la potencia dando la base y el exponente");
        System.out.print("Introduce un número entero para la base: ");
        num1 = Long.parseLong(s.nextLine());
        System.out.print("Introduce un número entero para el exponente: ");
        num2 = Long.parseLong(s.nextLine());
        System.out.println("La potencia de base " + num1 + " y exponente " + num2
                + " es: " + FuncionesConNumeros.potencia(num1, num2));
        break;
      case 5:
        System.out.println("Función 'digitos'.");
        System.out.println("Función para contar el número de dígitos de un número entero");
        System.out.print("Introduce un número entero: ");
        num1 = Long.parseLong(s.nextLine());
        System.out.println("El número " + num1 + " tiene " + FuncionesConNumeros.digitos(num1) + 
                " dígitos");
        break;
      case 6:
        System.out.println("Función 'voltea'.");
        System.out.println("Funcion que invierte un número");
        System.out.print("Introduce un número entero: ");
        num1 = Long.parseLong(s.nextLine());
        System.out.println("El número " + num1 + " invertido es " + FuncionesConNumeros.voltea(num1));
        break;
      case 7:
        System.out.println("Función 'digitoN'.");
        System.out.println("Función que te dice el dígito que hay en una determinada posición de un número entero");
        System.out.print("Introduce un número entero: ");
        num1 = Long.parseLong(s.nextLine());
        System.out.print("Introduce la posición del dígito que quieras sacar: ");
        num2 = Long.parseLong(s.nextLine());
        System.out.println("El dígito de la posición " + num2 + " del número "
                + num1 + " es el: " + FuncionesConNumeros.digitoN(num1, num2));
        break;
      case 8:
        System.out.println("Función 'posicionDeDigito'.");
        System.out.println("Función que te dice la posición de un dígito dentro de un número (empezando desde el '0')");
        System.out.print("Introduce un número entero: ");
        num1 = Long.parseLong(s.nextLine());
        System.out.print("Introduce el digito cuya posicion desea saber: ");
        num2 = Long.parseLong(s.nextLine());
        System.out.println("Dentro del número " + num1 + " el dígito " + num2 + 
                " se encuentra en la posición: " + FuncionesConNumeros.posicionDeDigito(num1, num2));
        break;
      case 9:
        System.out.println("Función 'quitaPorDetras'.");
        System.out.println("Funcion que quita a un número 'n' dígitos por la derecha");
        System.out.print("Introduce un número entero: ");
        num1 = Long.parseLong(s.nextLine());
        System.out.print("Introduce la cantidad de dígitos que desea quitar: ");
        num2 = Long.parseLong(s.nextLine());
        System.out.println("El número " + num1 + " menos " + num2 + " dígitos por"
                + " la derecha es: " + FuncionesConNumeros.quitaPorDetras(num1, num2));
        break;
      case 10:
        System.out.println("Función 'quitaPorDelante'.");
        System.out.println("Funcion que quita a un número 'n' dígitos por la izquierda");
        System.out.print("Introduce un número entero: ");
        num1 = Long.parseLong(s.nextLine());
        System.out.print("Introduce la cantidad de dígitos que desea quitar: ");
        num2 = Long.parseLong(s.nextLine());
        System.out.println("El número " + num1 + " menos " + num2 + " dígitos por"
                + " la izquierda es: " + FuncionesConNumeros.quitaPorDelante(num1, num2));
        break;
      case 11:
        System.out.println("Función 'pegaPorDetras'.");
        System.out.println("Funcion para agregar un dígito a un número 'n' por la derecha");
        System.out.print("Introduce un número entero: ");
        num1 = Long.parseLong(s.nextLine());
        System.out.print("Introduce el dígito que desea agregar: ");
        num2 = Long.parseLong(s.nextLine());
        System.out.println("Al agregar el dígito " + num2 + " al número " + num1 + 
                " se obtiene el número: " + FuncionesConNumeros.pegaPorDetras(num1, num2));
        break;
      case 12:
        System.out.println("Función 'pegaPorDelante'.");
        System.out.println("Funcion para agregar un dígito a un número 'n' por la izquierda");
        System.out.print("Introduce un número entero: ");
        num1 = Long.parseLong(s.nextLine());
        System.out.print("Introduce el dígito que desea agregar: ");
        num2 = Long.parseLong(s.nextLine());
        System.out.println("Al agregar el dígito " + num2 + " al número " + num1 + 
                " se obtiene el número: " + FuncionesConNumeros.pegaPorDelante(num1, num2));
        break;
      case 13:
        System.out.println("Función 'trozoDeNumero'.");
        System.out.println("Función para seleccionar un trozo de un número dando la posición inicial y final");
        System.out.print("Introduce un número entero: ");
        num1 = Long.parseLong(s.nextLine());
        System.out.print("Introduce la posición inicial: ");
        num2 = Long.parseLong(s.nextLine());
        System.out.print("Introduce la posición final: ");
        num3 = Long.parseLong(s.nextLine());
        System.out.println("Desde la posición " + num2 + " hasta la posición " + num3 +
                " del número " + num1 + " está el número: " + FuncionesConNumeros.trozoDeNumero(num1, num2, num3));
        break;
      case 14:
        System.out.println("Función 'juntaNumeros'.");
        System.out.println("Función para seleccionar un trozo de un número dando la posición inicial y final");
        System.out.print("Introduce un número entero: ");
        num1 = Long.parseLong(s.nextLine());
        System.out.print("Introduce otro número entero: ");
        num2 = Long.parseLong(s.nextLine());
        System.out.println("El resultado de juntar el número " + num1 + " con el número "
                + num2 + " es: " + FuncionesConNumeros.juntaNumeros(num1, num2));
        break;
      default:
        System.out.println("La opción seleccionada no es válida.");
    }
  }
}
