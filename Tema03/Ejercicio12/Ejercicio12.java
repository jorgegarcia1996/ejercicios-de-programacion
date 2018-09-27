/**
* Ejercicio 12 del Tema 3
* Calculador de la nota del segundo examen a partir de la nota del primero y la 
* nota final deseada. El primer examen vale un 40% y el segundo un 60%.
* 
* @author Jorge García Molina
*/

public class Ejercicio12 {
  public static void main(String[] args) {
    System.out.println("Calculador de la nota del segundo examen");
    //Pedir la nota del primer examen
    System.out.print("Introduzca la nota del primer examen: ");
    double notaPrimerExamen = Double.parseDouble(System.console().readLine());
    
    //Pedir la nota deseada al final del curso
    System.out.print("Introduxca la nota que desea obtener en el trimestre: ");
    double notaFinal = Double.parseDouble(System.console().readLine());
    
    //Calcular la nota del segundo examen
    double notaContablePrimerExamen = notaPrimerExamen * 0.4;
    double notaContableSegundoExamen = notaFinal - notaContablePrimerExamen;
    double notaSegundoExamen = notaContableSegundoExamen / 0.6;
    System.out.printf("Para sacar un %.0f en el trimestre", notaFinal);
    System.out.printf("debes sacar un %.2f en el segundo examen", notaSegundoExamen);
  }
}
