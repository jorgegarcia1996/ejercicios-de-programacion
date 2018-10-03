/**
* Ejercicio 12 del Tema 4
* 
* Realiza un minicuestionario con 10 preguntas tipo test sobre las asignaturas
* que se imparten en el curso. Cada pregunta acertada sumará un punto. El
* programa mostrará al final la calificación obtenida. Pásale el 
* minicuestionario a tus compañeros y pídeles que lo hagan para ver qué tal
* andan de conocimientos en las diferentes asignaturas del curso.
* 
* @author Jorge García Molina
*/

public class Ejercicio12 {
  public static void main(String[] args) {
    //Titulo del cuestionario
    String titulo = "Cuestionario de 1ºDAM por Jorge García Molina.";
    String subtitulo = "Para responde seleccione una de las opciones (a, b, c)";
    System.out.println(titulo);
    System.out.println(subtitulo);
    int puntuacion = 0;
    
    //Primera pregunta
    System.out.println(titulo);
    System.out.println(subtitulo);
    System.out.println();
    System.out.println("1.- ¿Cuántas horas a la semana tenemos de Programación?");
    System.out.println();
    System.out.println("a) 6 horas.");
    System.out.println("b) 8 horas.");
    System.out.println("c) 4 horas.");
    System.out.println();
    System.out.println("Introduzca su respuesta: ");
    String resp1 = System.console().readLine().toLowerCase();
    if (resp1.equals("b")) {
      puntuacion++;
    }
    
    //Limpiar la pantalla
    System.out.print("\033[H\033[2J");
    System.out.flush();
    
    //Segunda pregunta
    System.out.println(titulo);
    System.out.println(subtitulo);
    System.out.println("2.- ¿Para qué sirve la etiqueta HTML '<h1>'?");
    System.out.println();
    System.out.println("a) Para el título de la pestaña.");
    System.out.println("b) Para poner en negrita un párrafo.");
    System.out.println("c) Para definir un encabezado de nivel 1.");
    System.out.println();
    System.out.println("Introduzca su respuesta: ");
    String resp2 = System.console().readLine().toLowerCase();
    if (resp2.equals("c")) {
      puntuacion++;
    }
    
    //Limpiar la pantalla
    System.out.print("\033[H\033[2J");
    System.out.flush();
    
    System.out.println(titulo);
    System.out.println(subtitulo);
  }
}
