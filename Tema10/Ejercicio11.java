package ejercicios;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Ejercicio 11 del tema 10
 * 
 * Realiza un programa que escoja al azar 5 palabras en español del mini-
 * diccionario del ejercicio anterior. El programa irá pidiendo que el usuario
 * teclee la traducción al inglés de cada una de las palabras y comprobará si
 * son correctas. Al final, el programa deberá mostrar cuántas respuestas son
 * válidas y cuántas erróneas.
 *
 * @author JorgeGarciaMolina
 */
public class Ejercicio11 {
  public static void main(String[] args) {
    //Crear el diccionario
    HashMap<String, String> miniDiccionario = new HashMap<>();
    miniDiccionario.put("perro", "dog");
    miniDiccionario.put("gato", "cat");
    miniDiccionario.put("ordenador", "computer");
    miniDiccionario.put("valla", "fence");
    miniDiccionario.put("pajaro", "bird");
    miniDiccionario.put("raton", "mouse");
    miniDiccionario.put("vaca", "cow");
    miniDiccionario.put("cabra", "goat");
    miniDiccionario.put("altavoz", "speaker");
    miniDiccionario.put("papel", "paper");
    miniDiccionario.put("puerta", "door");
    miniDiccionario.put("plomo", "lead");
    miniDiccionario.put("escudo", "shield");
    miniDiccionario.put("ventana", "window");
    miniDiccionario.put("suelo", "floor");
    miniDiccionario.put("mesa", "table");
    miniDiccionario.put("silla", "chair");
    miniDiccionario.put("duende", "goblin");
    miniDiccionario.put("bicho", "bug");
    miniDiccionario.put("rana", "frog");
    
    //Variables
    Scanner s = new Scanner(System.in);
    int numero;
    int puntos = 0;

    //Array que contiene las claves del diccionario
    String[] a = miniDiccionario.keySet().toArray(new String[0]);

    //ArrayList de 5 números aleatrios
    ArrayList<Integer> n = new ArrayList<>();
    n.add((int)(Math.random() * miniDiccionario.size()));
    for (int i = 0; i < 4; i++) {
      do {
        numero = (int)(Math.random() * miniDiccionario.size());
      } while (n.contains(numero));
      n.add(numero);
    }

    //Mostrar la palabra y pedir su traduccion
    System.out.println("Traduce al inglés.");
    for (int i = 0; i < 5; i++) {
      System.out.print(a[n.get(i)] + ": ");
      String palabraIntro = s.nextLine();
      if (palabraIntro.equals(miniDiccionario.get(a[n.get(i)]))) {
        System.out.println("¡Correcto!");
        puntos++;
      } else {
        System.out.println("Respuesta incorrecta.");
        System.out.println("La respuesta correcta es " + miniDiccionario.get(a[n.get(i)]));
      }
    }
    System.out.println(puntos + "/5 puntos.");
  }
}
