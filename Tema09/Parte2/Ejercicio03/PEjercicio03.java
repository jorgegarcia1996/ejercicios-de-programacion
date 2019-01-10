/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios.Ejercicio03;

/**
 *
 * @author Jorge
 */
public class PEjercicio03 {
  public static void main(String[] args) {
    //Crear los animales
    Canario Piolin = new Canario("r1");
    Pinguino Pingu = new Pinguino("Emperador");
    Perro Pipo = new Perro("Pomeranian");
    Gato Neko = new Gato("JapoGato");
    Lagarto Gabiru = new Lagarto("Inutil");
    
    //Probar los métodos
    
    System.out.println("Probando los métodos:");
    Neko.come();
    System.out.println();
    Pipo.bebe();
    System.out.println();
    Gabiru.duerme();
    System.out.println();
    Pingu.vuela();
    System.out.println();
    Piolin.avisaGas();
    System.out.println();
    Neko.ronronea();
    System.out.println();
    Gabiru.tomaSol();
    System.out.println();
    
  }
}
