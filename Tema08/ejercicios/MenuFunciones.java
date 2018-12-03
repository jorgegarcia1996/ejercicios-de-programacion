package ejercicios;


import funciones.FuncionesConNumeros;
import funciones.FuncionesDeConversion;
import funciones.FuncionesDeArraysSimples;
import funciones.FuncionesDeArraysBidimensionales;
import java.util.Scanner;

/**
 * 
 * Con este archivo se pueden testear todas las funciones creadas en el tema 08
 * 
 * @author Jorge Garcia Molina
 */
public class MenuFunciones {
  public static void main(String[] args) throws InterruptedException {
    Scanner s = new Scanner(System.in);
    int[] a = new int[10];
    int[][] aBi = new int[10][10];
    long num1, num2, num3;
    int opcion, n1, n2, n3, n4;
    String s1, s2, s3, formatoNumero;
    boolean salir = false;
    do {
      System.out.println();
      System.out.println("Seleccione el bloque de funciones que desea probar: ");
      System.out.println("01.- Funciones con números.");
      System.out.println("02.- Funciones de conversion.");
      System.out.println("03.- Funciones de arrays simples.");
      System.out.println("04.- Funciones de arrays bidimensionales.");
      System.out.println("05.- SALIR.");
      System.out.println();
      System.out.print("Elige una opción (1 - 5): ");
      int bloque = Integer.parseInt(s.nextLine());
      System.out.println();

      //Seleccionar el bloque de funciones
      switch (bloque) {
        case 1:
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
        System.out.println("15.- SALIR.");
        System.out.println();
        System.out.print("Elige una opción (1 - 15): ");
        opcion = Integer.parseInt(s.nextLine());
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
          case 15:
            salir = true;
            break;
          default:
            System.out.println("La opción seleccionada no es válida.");
          }
          break;
        case 2:
          System.out.println("Selecciona la funcion que quiere probar "
                  + "de la lista de abajo.");
          System.out.println("01.- Función 'convierteABinario'.");
          System.out.println("02.- Función 'convierteAOctal'.");
          System.out.println("03.- Función 'convierteADecimal'.");
          System.out.println("04.- Función 'convierteAHexadecimal'.");
          System.out.println("05.- Función 'convierte'.");
          System.out.println("06.- SALIR.");
          System.out.println();
          System.out.print("Elige una opción (1 - 6): ");
          opcion = Integer.parseInt(s.nextLine());
          System.out.println();
          switch (opcion) {
            case 1:
              System.out.println("Función 'convierteABinario'.");
              System.out.println("Funcion para pasar un número de octal (O), "
                      + "decimal (D) o hexadecimal (H) a binario");
              System.out.print("Introduzca un número entero: ");
              s1 = s.nextLine();
              System.out.print("Introduzca la base del número introducido (O - D - H): ");
              s2 = s.nextLine().toUpperCase();
              System.out.print("El número " + s1 + " pasado a binario es: " + 
                      FuncionesDeConversion.convierteABinario(s1, s2));
              break;
            case 2:
              System.out.println("Función 'convierteAOctal'.");
              System.out.println("Funcion para pasar un número de binario (B), "
                      + "decimal (D) o hexadecimal (H) a octal");
              System.out.print("Introduzca un número entero: ");
              s1 = s.nextLine();
              System.out.print("Introduzca la base del número introducido (B - D - H): ");
              s2 = s.nextLine().toUpperCase();
              System.out.println("El número " + s1 + " pasado a octal es: " + 
                      FuncionesDeConversion.convierteAOctal(s1, s2));
              break;
            case 3:
              System.out.println("Función 'convierteADecimal'.");
              System.out.println("Funcion para pasar un número de binario (B), "
                      + "octal (O) o hexadecimal (H) a decimal");
              System.out.print("Introduzca un número entero: ");
              s1 = s.nextLine();
              System.out.print("Introduzca la base del número introducido (B - O - H): ");
              s2 = s.nextLine().toUpperCase();
              System.out.println("El número " + s1 + " pasado a decimal es: " + 
                      FuncionesDeConversion.convierteADecimal(s1, s2));
              break;
            case 4:
              System.out.println("Función 'convierteAHexadecimal'.");
              System.out.println("Funcion para pasar un número de binario (B), "
                      + "octal (O) o decimal (D) a hexadecimal");
              System.out.print("Introduzca un número entero: ");
              s1 = s.nextLine();
              System.out.print("Introduzca la base del número introducido (B - O - D): ");
              s2 = s.nextLine().toUpperCase();
              System.out.println("El número " + s1 + " pasado a hexadecimal es: " + 
                      FuncionesDeConversion.convierteAHexadecimal(s1, s2));
              break;
            case 5:
              System.out.println("Función 'convierte'.");
              System.out.println("Funcion para convertir un número binario (B), "
                      + "decimal (D), octal (O) o hexadecimal (H) a otro sistema de esos cuatro");
              System.out.print("Introduzca un número entero: ");
              s1 = s.nextLine();
              System.out.print("Introduzca la base del número introducido (B - O - D - H): ");
              s2 = s.nextLine().toUpperCase();
              System.out.print("Introduzca la base a la que quieres convertir el número (B - O - D - H): ");
              s3 = s.nextLine().toUpperCase();
              System.out.println("El número " + s1 + " pasado a '" + s3 + "' es: " + 
                      FuncionesDeConversion.convierte(s1, s2, s3));
              break;
            case 6:
              salir = true;
              break;
            default:
              System.out.println("La opción seleccionada no es válida.");
          }
          break;
        case 3:
          System.out.println("Selecciona la funcion que quiere probar "
                  + "de la lista de abajo.");
          System.out.println("01.- Función 'generaArrayInt'.");
          System.out.println("02.- Función 'minimoArrayInt'.");
          System.out.println("03.- Función 'maximoArrayInt'.");
          System.out.println("04.- Función 'mediaArrayInt'.");
          System.out.println("05.- Función 'estaEnArrayInt'.");
          System.out.println("06.- Función 'popsicionEnArray'.");
          System.out.println("07.- Función 'volteaArrayInt'.");
          System.out.println("08.- Función 'rotaDerechaArrayInt'.");
          System.out.println("09.- Función 'rotaIzquierdaArrayInt'.");
          System.out.println("10.- SALIR.");
          System.out.println();
          System.out.print("Elige una opción (1 - 10): ");
          opcion = Integer.parseInt(s.nextLine());
          System.out.println();
          switch (opcion) {
            case 1:
              System.out.println("Función 'generaArrayInt'");
              System.out.println("Función para generar un array de 'n' elementos int con números aleatorios entre" +
                      " 'min' y 'max'");
              System.out.print("Introduce la longitud del array: ");
              n1 = Integer.parseInt(s.nextLine());
              System.out.print("Introduce el valor mínimo del array: ");
              n2 = Integer.parseInt(s.nextLine());
              System.out.print("Introduce el valor máximo del array: ");
              n3 = Integer.parseInt(s.nextLine());
              System.out.print("El array generado es: ");
              for (int n : FuncionesDeArraysSimples.generaArrayInt(n1, n2, n3)) {
                System.out.print(n + " ");
              }
              System.out.println();
              break;
            case 2:
              System.out.println("Función 'minimoArrayInt'");
              System.out.println("Función para seleccionar el mínio valor de un array int");
              System.out.println("La función se probará con un array de 10 números"
                      + " entre 0 y 100 generados aleatoriamente.");
              Thread.sleep(1000);
              a = FuncionesDeArraysSimples.generaArrayInt(10, 0, 100);
              System.out.print("El array generado es: ");
              for (int n : a) {
                System.out.print(n + " ");
              }
              System.out.println();
              Thread.sleep(1000);
              System.out.println("El valor mínimo del array es: " + FuncionesDeArraysSimples.minimoArrayInt(a));
              break;
            case 3:
              System.out.println("Función 'maximoArrayInt'");
              System.out.println("Función para seleccionar el valor máximo de un array int");
              System.out.println("La función se probará con un array de 10 números"
                      + " entre 0 y 100 generados aleatoriamente.");
              Thread.sleep(1000);
              a = FuncionesDeArraysSimples.generaArrayInt(10, 0, 100);
              System.out.print("El array generado es: ");
              for (int n : a) {
                System.out.print(n + " ");
              }
              System.out.println();
              Thread.sleep(1000);
              System.out.println("El valor máximo del array es: " + FuncionesDeArraysSimples.maximoArrayInt(a));
              break;
            case 4:
              System.out.println("Función 'mediaArrayInt'");
              System.out.println("Función para calcular la media de los valores de un array");
              System.out.println("La función se probará con un array de 10 números"
                      + " entre 0 y 100 generados aleatoriamente.");
              Thread.sleep(1000);
              a = FuncionesDeArraysSimples.generaArrayInt(10, 0, 100);
              System.out.print("El array generado es: ");
              for (int n : a) {
                System.out.print(n + " ");
              }
              System.out.println();
              Thread.sleep(1000);
              System.out.println("La media de los valores del array es: " + FuncionesDeArraysSimples.mediaArrayInt(a));
              break;
            case 5:
              System.out.println("Función 'estaEnArrayInt'");
              System.out.println("Función para comprobar si un valor está en el array");
              System.out.println("La función se probará con un array de 10 números"
                      + " entre 0 y 100 generados aleatoriamente.");
              Thread.sleep(1000);
              a = FuncionesDeArraysSimples.generaArrayInt(10, 0, 100);
              System.out.print("El array generado es: ");
              for (int n : a) {
                System.out.print(n + " ");
              }
              System.out.println();
              Thread.sleep(1000);
              System.out.print("Introduce el valor que quieres buscar dentro del array: ");
              n1 = Integer.parseInt(s.nextLine());
              if (FuncionesDeArraysSimples.estaEnArrayInt(a, n1)) {
                System.out.println("El número " + n1 + " está en el array.");
              } else {
                System.out.println("El número " + n1 + " no está en el array.");
              }
              break;
            case 6:
              System.out.println("Función 'posicionEnArrayInt'");
              System.out.println("Función que dice el índice de un valor del array (-1 si no se encuentra el valor)");
              System.out.println("La función se probará con un array de 10 números"
                      + " entre 0 y 100 generados aleatoriamente.");
              Thread.sleep(1000);
              a = FuncionesDeArraysSimples.generaArrayInt(10, 0, 100);
              System.out.print("El array generado es: ");
              for (int n : a) {
                System.out.print(n + " ");
              }
              System.out.println();
              Thread.sleep(1000);
              System.out.print("Introduce el valor que quieres buscar dentro del array: ");
              n1 = Integer.parseInt(s.nextLine());
              System.out.println("El número " + n1 + " está en la posición: " + FuncionesDeArraysSimples.posicionEnArrayInt(a, n1));
              break;
            case 7:
              System.out.println("Función 'volteaArrayInt'");
              System.out.println("Función para voltear los valores de un array");
              System.out.println("La función se probará con un array de 10 números"
                      + " entre 0 y 100 generados aleatoriamente.");
              Thread.sleep(1000);
              a = FuncionesDeArraysSimples.generaArrayInt(10, 0, 100);
              System.out.print("El array generado es: ");
              for (int n : a) {
                System.out.print(n + " ");
              }
              System.out.println();
              Thread.sleep(1000);
              System.out.print("El array volteado es: ");
              for (int n : FuncionesDeArraysSimples.volteaArrayInt(a)) {
                System.out.print(n + " ");
              }
              System.out.println();
              break;
            case 8:
              System.out.println("Función 'rotaDerechaArrayInt'");
              System.out.println("Función para desplazar 'n' posiciones a la derecha los valores del array 'a'");
              System.out.println("La función se probará con un array de 10 números"
                      + " entre 0 y 100 generados aleatoriamente.");
              Thread.sleep(1000);
              a = FuncionesDeArraysSimples.generaArrayInt(10, 0, 100);
              System.out.print("El array generado es: ");
              for (int n : a) {
                System.out.print(n + " ");
              }
              System.out.println();
              Thread.sleep(1000);
              System.out.print("Introduce el número de posiciones que quieres rotar el array: ");
              n1 = Integer.parseInt(s.nextLine());
              System.out.print("El array rotado " + n1 + " posiciones es: ");
              for (int n : FuncionesDeArraysSimples.rotaDerechaArrayInt(a, n1)) {
                System.out.print(n + " ");
              }
              System.out.println();
              break;
            case 9:
              System.out.println("Función 'rotaIzquierdaArrayInt'");
              System.out.println("Función para desplazar 'n' posiciones a la izquierda los valores del array 'a'");
              System.out.println("La función se probará con un array de 10 números"
                      + " entre 0 y 100 generados aleatoriamente.");
              Thread.sleep(1000);
              a = FuncionesDeArraysSimples.generaArrayInt(10, 0, 100);
              System.out.print("El array generado es: ");
              for (int n : a) {
                System.out.print(n + " ");
              }
              System.out.println();
              Thread.sleep(1000);
              System.out.print("Introduce el número de posiciones que quieres rotar el array: ");
              n1 = Integer.parseInt(s.nextLine());
              System.out.print("El array rotado " + n1 + " posiciones es: ");
              for (int n : FuncionesDeArraysSimples.rotaIzquierdaArrayInt(a, n1)) {
                System.out.print(n + " ");
              }
              System.out.println();
              break;
            case 10:
              salir = true;
              break;
            default:
              System.out.println("La opción seleccionada no es válida.");
          }
          break;
        case 4:
          System.out.println("Selecciona la funcion que quiere probar "
                  + "de la lista de abajo.");
          System.out.println("01.- Función 'generaArrayBiInt'.");
          System.out.println("02.- Función 'filaDeArrayBiInt'.");
          System.out.println("03.- Función 'columnaDeArrayBiInt'.");
          System.out.println("04.- Función 'coordenadasDeArrayBiInt'.");
          System.out.println("05.- Función 'esPuntoDeSilla'.");
          System.out.println("06.- Función 'diagonal'.");
          System.out.println("07.- SALIR.");
          System.out.println();
          System.out.print("Elige una opción (1 - 7): ");
          opcion = Integer.parseInt(s.nextLine());
          System.out.println();
          switch (opcion) {
            case 1:
              System.out.println("Función 'generaArrayBiInt'");
              System.out.println("Función para generar un array bidimensional de"
                      + " 'f' x 'c' números generados aleatoriamente entre 'min' y 'max'");
              System.out.print("Introduce el número de filas del array: ");
              n1 = Integer.parseInt(s.nextLine());
              System.out.print("Introduce el número de columnas del array: ");
              n2 = Integer.parseInt(s.nextLine());
              System.out.print("Introduce el valor mínimo del array: ");
              n3 = Integer.parseInt(s.nextLine());
              System.out.print("Introduce el valor máximo del array: ");
              n4 = Integer.parseInt(s.nextLine());
              Thread.sleep(1000);
              System.out.println("El array generado es: ");
              aBi = FuncionesDeArraysBidimensionales.generaArrayBiInt(n1, n2, n3, n4);
              formatoNumero = "%" + FuncionesConNumeros.digitos(FuncionesDeArraysBidimensionales.maximoArrayBiInt(aBi)) + "d";
              for (int f = 0; f < aBi.length; f++) {
                for (int c = 0; c < aBi[0].length; c++) {
                  System.out.printf(formatoNumero + " ", aBi[f][c]);
                }
                System.out.println();
                Thread.sleep(500);
              }
              break;
            case 2:
              System.out.println("Función 'filaDeArrayBiInt'");
              System.out.println("Muestra el contenido de la fila seleccionada del array bidimensional");
              System.out.println("Para probar la función se generará un array de 10 x 10 números entre 0 y 100.");
              System.out.println("El array generado es:");
              aBi = FuncionesDeArraysBidimensionales.generaArrayBiInt(10, 10, 0, 100);
              formatoNumero = "%" + FuncionesConNumeros.digitos(FuncionesDeArraysBidimensionales.maximoArrayBiInt(aBi)) + "d";
              for (int f = 0; f < aBi.length; f++) {
                for (int c = 0; c < aBi[0].length; c++) {
                  System.out.printf(formatoNumero + " ", aBi[f][c]);
                }
                System.out.println();
                Thread.sleep(500);
              }
              System.out.print("Introduce el número de la fila que quieres ver: ");
              n1 = Integer.parseInt(s.nextLine());
              a = FuncionesDeArraysBidimensionales.filaDeArrayBiInt(aBi, n1);
              System.out.print("Los datos de la fila seleccionada son: ");
              Thread.sleep(1000);
              for (int n : a) {
                System.out.print(n + " ");
              }
              System.out.println();
              break;
            case 3:
              System.out.println("Función 'columnaDeArrayBiInt'");
              System.out.println("Muestra el contenido de la columna seleccionada del array bidimensional");
              System.out.println("Para probar la función se generará un array de 10 x 10 números entre 0 y 100.");
              System.out.println("El array generado es:");
              aBi = FuncionesDeArraysBidimensionales.generaArrayBiInt(10, 10, 0, 100);
              formatoNumero = "%" + FuncionesConNumeros.digitos(FuncionesDeArraysBidimensionales.maximoArrayBiInt(aBi)) + "d";
              for (int f = 0; f < aBi.length; f++) {
                for (int c = 0; c < aBi[0].length; c++) {
                  System.out.printf(formatoNumero + " ", aBi[f][c]);
                }
                System.out.println();
                Thread.sleep(500);
              }
              System.out.print("Introduce el número de la columna que quieres ver: ");
              n1 = Integer.parseInt(s.nextLine());
              a = FuncionesDeArraysBidimensionales.columnaDeArrayBiInt(aBi, n1);
              System.out.print("Los datos de la columna seleccionada son: ");
              Thread.sleep(1000);
              for (int n : a) {
                System.out.print(n + " ");
              }
              System.out.println();
              break;
            case 4:
              System.out.println("Función 'coordenadasEnArrayBiInt'");
              System.out.println("Función para buscar un número 'n' en el array"
                      + " bidimensional y obtener las coordenadas del mismo ({-1, -1} si no existe el número)");
              System.out.println("Para probar la función se generará un array de 10 x 10 números entre 0 y 100.");
              System.out.println("El array generado es:");
              aBi = FuncionesDeArraysBidimensionales.generaArrayBiInt(10, 10, 0, 100);
              formatoNumero = "%" + FuncionesConNumeros.digitos(FuncionesDeArraysBidimensionales.maximoArrayBiInt(aBi)) + "d";
              for (int f = 0; f < aBi.length; f++) {
                for (int c = 0; c < aBi[0].length; c++) {
                  System.out.printf(formatoNumero + " ", aBi[f][c]);
                }
                System.out.println();
                Thread.sleep(500);
              }
              System.out.print("Introduce el número del que quieres saber la posición: ");
              n1 = Integer.parseInt(s.nextLine());
              a = FuncionesDeArraysBidimensionales.coordenadasEnArrayBiInt(aBi, n1);
              System.out.print("Las coordenadas del número " + n1 + " son: ");
              System.out.println("Fila = " + a[0] + " | Columna = " + a[1]);
              break;
            case 5:
              System.out.println("Función 'esPuntoDeSilla'");
              System.out.println("Función para averiguar si un número es punto de silla o "
                      + "no dentro del array bidimensional (mínimo de su fila y máximo de su columna)");
              System.out.println("Para probar la función se generará un array de 10 x 10 números entre 0 y 100.");
              System.out.println("El array generado es:");
              aBi = FuncionesDeArraysBidimensionales.generaArrayBiInt(10, 10, 0, 100);
              formatoNumero = "%" + FuncionesConNumeros.digitos(FuncionesDeArraysBidimensionales.maximoArrayBiInt(aBi)) + "d";
              for (int f = 0; f < aBi.length; f++) {
                for (int c = 0; c < aBi[0].length; c++) {
                  System.out.printf(formatoNumero + " ", aBi[f][c]);
                }
                System.out.println();
                Thread.sleep(500);
              }
              System.out.print("Introduce el número de la fila: ");
              n1 = Integer.parseInt(s.nextLine());
              System.out.print("Introduce el número de la columna: ");
              n2 = Integer.parseInt(s.nextLine());
              if (FuncionesDeArraysBidimensionales.esPuntoDeSilla(aBi, n1, n2)) {
                System.out.println("El número " + aBi[n1][n2] + " es punto de silla.");
              } else {
                System.out.println("El número " + aBi[n1][n2] + " no es punto de silla.");
              }
              break;
            case 6:
              System.out.println("Función 'diagonal'");
              System.out.println("Función para mostrar una de las diagonales del array bidimensional desde el número seleccionado");
              System.out.println("Para probar la función se generará un array de 10 x 10 números entre 0 y 100.");
              System.out.println("El array generado es:");
              aBi = FuncionesDeArraysBidimensionales.generaArrayBiInt(10, 10, 0, 100);
              formatoNumero = "%" + FuncionesConNumeros.digitos(FuncionesDeArraysBidimensionales.maximoArrayBiInt(aBi)) + "d";
              for (int f = 0; f < aBi.length; f++) {
                for (int c = 0; c < aBi[0].length; c++) {
                  System.out.printf(formatoNumero + " ", aBi[f][c]);
                }
                System.out.println();
                Thread.sleep(500);
              }
              System.out.print("Introduce el número de la fila: ");
              n1 = Integer.parseInt(s.nextLine());
              System.out.print("Introduce el número de la columna: ");
              n2 = Integer.parseInt(s.nextLine());
              System.out.print("Introduce la dirección de la diagonal (nose | neso): ");
              s1 = s.nextLine();
              a = FuncionesDeArraysBidimensionales.diagonal(aBi, n1, n2, s1);
              System.out.print("Los datos de la diagonal seleccionada son: ");
              Thread.sleep(1000);
              for (int n : a) {
                System.out.print(n + " ");
              }
              System.out.println();
              break;
            case 7:
              salir = true;
              break;
            default:
              System.out.println("La opción seleccionada no es válida.");
          }
          break;
        case 5:
          salir = true;
          break;
        default:
          System.out.println("La opción seleccionada no es válida.");
      }
    } while (!salir);
  }
}