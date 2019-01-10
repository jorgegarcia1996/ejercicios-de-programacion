package Ejercicios.Ejercicio03;

/**
 * Ejercicio 03 del Tema 09 (Parte 2)
 * 
 * Crea las clases Animal , Mamifero , Ave , Gato , Perro , Canario , Pinguino y
 * Lagarto . Crea, al menos, tres métodos específicos de cada clase y redefne
 * el/los método/s cuando sea necesario. Prueba las clases creadas en un
 * programa en el que se instancien objetos y se les apliquen métodos.
 *
 * @author JorgeGarciaMolina
 */
public abstract class Animal {
  
  //Metodos
  void come() {
    System.out.println("ñam ñam ñam");
  }
  
  void bebe() {
    System.out.println("glup glup glup");
  }
  
  void duerme() {
    System.out.println("zzz");
  }
}
