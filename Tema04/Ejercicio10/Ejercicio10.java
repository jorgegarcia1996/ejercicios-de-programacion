/**
* Ejercicio 10 del Tema 4
* 
* Programa que dice el horóscopo a partir del día y el mes de nacimiento
* 
* @author Jorge García Molina
*/

public class Ejercicio10 {
  public static void main(String[] args) {
    //Pedir el día y el mes de nacimiento
    System.out.println("Averigua que horóscopo tienes.");
    System.out.print("Introduzca su mes de nacimiento (01-12): ");
    String mesNacimiento = System.console().readLine();
    System.out.print("Introduzca dia de nacimiento (01-31): ");
    int diaNacimiento = Integer.parseInt(System.console().readLine());
    
    //Seleccionar el horóscopo
    switch (mesNacimiento) {
      case "01":
        if ((int)diaNacimiento <= 20) {
          System.out.printf("Tu horóscopo es Capricornio.");
        } else if ((int)diaNacimiento <= 31) {
          System.out.printf("Tu horóscopo es Acuario.");
        } else {
          System.out.printf("El mes de Enero solo tiene 31 días.");
        }
        break;
      case "02":
        if ((int)diaNacimiento <= 19) {
          System.out.printf("Tu horóscopo es Acuario.");
        } else if ((int)diaNacimiento <= 28) {
          System.out.printf("Tu horóscopo es Piscis.");
        } else {
          System.out.printf("El mes de Febrero solo tiene 28 días.");
        }
        break;
      case "03":
        if ((int)diaNacimiento <= 20) {
          System.out.printf("Tu horóscopo es Piscis.");
        } else if ((int)diaNacimiento <= 31) {
          System.out.printf("Tu horóscopo es Aries.");
        } else {
          System.out.printf("El mes de Marzo solo tiene 31 días.");
        }
        break;
      case "04":
        if ((int)diaNacimiento <= 20) {
          System.out.printf("Tu horóscopo es Aries.");
        } else if ((int)diaNacimiento <= 30) {
          System.out.printf("Tu horóscopo es Tauro.");
        } else {
          System.out.printf("El mes de Abril solo tiene 30 días.");
        }
        break;
      case "05":
        if ((int)diaNacimiento <= 21) {
          System.out.printf("Tu horóscopo es Tauro.");
        } else if ((int)diaNacimiento <= 31) {
          System.out.printf("Tu horóscopo es Géminis.");
        } else {
          System.out.printf("El mes de Mayo solo tiene 31 días.");
        }
        break;
      case "06":
        if ((int)diaNacimiento <= 21) {
          System.out.printf("Tu horóscopo es Géminis.");
        } else if ((int)diaNacimiento <= 30) {
          System.out.printf("Tu horóscopo es Cáncer.");
        } else {
          System.out.printf("El mes de Junio solo tiene 30 días.");
        }
        break;
      case "07":
        if ((int)diaNacimiento <= 22) {
          System.out.printf("Tu horóscopo es Cáncer.");
        } else if ((int)diaNacimiento <= 31) {
          System.out.printf("Tu horóscopo es Leo.");
        } else {
          System.out.printf("El mes de Julio solo tiene 31 días.");
        }
        break;
      case "08":
        if ((int)diaNacimiento <= 22) {
          System.out.printf("Tu horóscopo es Leo.");
        } else if ((int)diaNacimiento <= 31) {
          System.out.printf("Tu horóscopo es Virgo.");
        } else {
          System.out.printf("El mes de Agosto solo tiene 31 días.");
        }
        break;
      case "09":
        if ((int)diaNacimiento <= 22) {
          System.out.printf("Tu horóscopo es Virgo.");
        } else if ((int)diaNacimiento <= 30) {
          System.out.printf("Tu horóscopo es Libra.");
        } else {
          System.out.printf("El mes de Septiembre solo tiene 30 días.");
        }
        break;
      case "10":
        if ((int)diaNacimiento <= 22) {
          System.out.printf("Tu horóscopo es Libra.");
        } else if ((int)diaNacimiento <= 31) {
          System.out.printf("Tu horóscopo es Escorpio.");
        } else {
          System.out.printf("El mes de Octubre solo tiene 31 días.");
        }
        break;
      case "11":
        if ((int)diaNacimiento <= 22) {
          System.out.printf("Tu horóscopo es Escorpio.");
        } else if ((int)diaNacimiento <= 30) {
          System.out.printf("Tu horóscopo es Sagitario.");
        } else {
          System.out.printf("El mes de Noviembre solo tiene 30 días.");
        }
        break;
      case "12":
        if ((int)diaNacimiento <= 21) {
          System.out.printf("Tu horóscopo es Sagitario.");
        } else if ((int)diaNacimiento <= 31) {
          System.out.printf("Tu horóscopo es Capricornio.");
        } else {
          System.out.printf("El mes de Diciembre solo tiene 31 días.");
        }
        break;
      default:
      System.out.print("El mes introducido no es válido, los meses válidos");
      System.out.print(" son: 01, 02, 03, 04, ..., 11, 12.");
    }
  }
}
