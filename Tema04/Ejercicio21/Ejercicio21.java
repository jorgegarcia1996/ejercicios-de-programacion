/**
* Ejercicio 21 del Tema 4
* 
* Calcula la nota de un trimestre de la asignatura Programación. El programa
* pedirá las dos notas que ha sacado el alumno en los dos primeros controles.
* Si la media de los dos controles da un número mayor o igual a 5, el alumno
* está aprobado y se mostrará la media. En caso de que la media sea un número
* menor que 5, el alumno habrá tenido que hacer el examen de recuperación
* que se califica como apto o no apto, por tanto se debe preguntar al usuario
* ¿Cuál ha sido el resultado de la recuperación? (apto/no apto). Si el
* resultado de la recuperación es apto, la nota será un 5; en caso contrario, se
* mantiene la nota media anterior.
* 
* @author Jorge García Molina
*/

public class Ejercicio21 {
  public static void main(String[] args) {
    //Pedir las notas de los exámenes
    System.out.println("Calcular la nota del trimestre.");
    System.out.print("Introduce la nota del primer examen: ");
    double nota1 = Double.parseDouble(System.console().readLine());
    System.out.print("Introduce la nota del segundo examen: ");
    double nota2 = Double.parseDouble(System.console().readLine());
    
    //Comprobar si tiene que hacer o no el examen de recuperación
    double notaMedia = (nota1 + nota2) / 2;
    if (notaMedia < 5) {
      System.out.print("¿Cuál ha sido el resultado del examen de");
      System.out.print(" recuperación? (apto / no apto): ");
      String recuperacion = System.console().readLine().toLowerCase();
      if (recuperacion.equals("apto")) {
        System.out.print("La nota final es: 5");
      } else {
        System.out.printf("La nota final es: %.2f", notaMedia);
      }
    } else {
      System.out.printf("La nota final es: %.2f", notaMedia);
    }
  }
}
