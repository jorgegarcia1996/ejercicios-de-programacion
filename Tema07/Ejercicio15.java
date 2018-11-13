package tema07;

import java.util.Scanner;

/**
 * Ejercicio 15 del Tema 07
 *
 * Un restaurante nos ha encargado una aplicación para colocar a los clientes en
 * sus mesas. En una mesa se pueden sentar de 0 (mesa vacía) a 4 comensales
 * (mesa llena). Cuando llega un cliente se le pregunta cuántos son. De momento
 * el programa no está preparado para colocar a grupos mayores a 4, por tanto,
 * si un cliente dice por ejemplo que son un grupo de 6, el programa dará el
 * mensaje “Lo siento, no admitimos grupos de 6, haga grupos de 4 personas como
 * máximo e intente de nuevo”. Para el grupo que llega, se busca siempre la
 * primera mesa libre (con 0 personas). Si no quedan mesas libres, se busca
 * donde haya un hueco para todo el grupo, por ejemplo si el grupo es de dos
 * personas, se podrá colocar donde haya una o dos personas. Inicialmente, las
 * mesas se cargan con valores aleatorios entre 0 y 4. Cada vez que se sientan
 * nuevos clientes se debe mostrar el estado de las mesas. Los grupos no se
 * pueden romper aunque haya huecos sueltos suficientes.
 *
 * @author Jorge García Molina
 */
public class Ejercicio15 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Restaurante");
    System.out.println();

    //Crear el array con la coupación inicial de las mesas
    final int N = 10;
    int[] ocupacionMesas = new int[N];
    int grupo;
    boolean vacia = false, llena = false;
    for (int i = 0; i < N; i++) {
      ocupacionMesas[i] = (int)(Math.random() * 5);
    }
    //Mostrar la ocupación inicial de las mesas
    System.out.printf("%-10s |", "Mesa nº");
    for (int i = 1; i <= N; i++) {
      System.out.printf("%3d |", i);
    }
    System.out.println();
    System.out.printf("%-10s |", "Ocupación");
    for (int elemento : ocupacionMesas) {
      System.out.printf("%3d |", elemento);
    }
    System.out.println();
    System.out.println();
    //Pedir el número de personas del grupo y comprobar si tienen hueco o no para sentarse
    do {
      System.out.print("¿Cuántos son? (Introduzca '-1' para salir): ");
      grupo = Integer.parseInt(s.nextLine());
      if (grupo != -1) {
        while (grupo < 0 || grupo > 4) {
          System.out.println("Lo siento, no admitimos grupos de 6, haga grupos de"
                  + " 4 personas como máximo e intente de nuevo.");
          System.out.print("¿Cuántos son? (Introduzca '-1' para salir): ");
          grupo = Integer.parseInt(s.nextLine());
        }

        //Comprobar si hay mesas vacías
        for (int i = 0; i < N; i++) {
          if (ocupacionMesas[i] == 0) {
            System.out.println("Por favor, siéntese en la mesa " + (i + 1));
            System.out.println();
            ocupacionMesas[i] += grupo;
            vacia = true;
            i = N;
          }
        }
        
        //Comprobar si en alguna mesa hay hueco para mesa compartida
        if (!vacia) {
          for (int i = 0; i < N; i++) {
            if ((ocupacionMesas[i] - grupo) >= 0 && ocupacionMesas[i] < 4) {
              System.out.println("Tendrán que compartir mesa. Por favor, "
                      + "siéntese en la mesa " + (i + 1));
              System.out.println();
              ocupacionMesas[i] += grupo;
              i = 20;
            } else if (ocupacionMesas[N] == 4) {
              System.out.println("Lo siento, en estos momentos no queda sitio.");
              System.out.println();
            }
          }
        }
        //Mostrar la ocupación de las mesas actualizada
        System.out.printf("%-10s |", "Mesa nº");
        for (int i = 1; i <= N; i++) {
          System.out.printf("%3d |", i);
        }
        System.out.println();
        System.out.printf("%-10s |", "Ocupación");
        for (int elemento : ocupacionMesas) {
          System.out.printf("%3d |", elemento);
        }
        System.out.println();
        System.out.println();
        vacia = false;
      } else {
        System.out.println("Gracias por venir.");
      }
    } while (grupo != -1);
  }
}
