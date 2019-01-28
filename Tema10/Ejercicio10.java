package ejercicios;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Ejercicio 10 del tema 10
 * 
 * Crea un mini-diccionario español-inglés que contenga, al menos, 20 palabras
 * (con su correspondiente traducción). Utiliza un objeto de la clase HashMap
 * para almacenar las parejas de palabras. El programa pedirá una palabra en
 * español y dará la correspondiente traducción en inglés.
 *
 * @author JorgeGarciaMolina
 */
public class Ejercicio10 {
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
    
    Scanner s = new Scanner(System.in);
    String palabra;
    
    do {
    //Pedir la palabra y mostrar su traduccion
    System.out.print("Introduce una palabra en español (introduce 'salir' para salir del programa): ");
    palabra = s.nextLine().toLowerCase();
    
    if (miniDiccionario.containsKey(palabra)) {
      System.out.println("Traducción: " + miniDiccionario.get(palabra));
    } else if (!palabra.equals("salir")){
      System.out.println("La palabra " + palabra + " no existe en el diccionario.");
    }
    } while (!palabra.equals("salir"));
  }
}
