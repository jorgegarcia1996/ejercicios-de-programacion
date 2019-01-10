/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios.Ejercicio03;

/**
 * Subclase de 'Animal'
 *
 * @author JorgeGarciaMolina
 */
public abstract class Mamifero extends Animal {
  
  //Metodos
  void corre() {
    System.out.println("Mira como corre.");
  }
  
  void salta() {
    System.out.println("Mira como salta.");
  }
}
