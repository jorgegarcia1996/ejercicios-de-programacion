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
    String subtitulo = "Para responder selecciona una de las opciones (a, b, c)";
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
    System.out.print("Introduzca su respuesta: ");
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
    System.out.println();
    System.out.println("2.- ¿Para qué sirve la etiqueta HTML '<h1>'?");
    System.out.println();
    System.out.println("a) Para el título de la pestaña.");
    System.out.println("b) Para poner en negrita un párrafo.");
    System.out.println("c) Para definir un encabezado de nivel 1.");
    System.out.println();
    System.out.print("Introduzca su respuesta: ");
    String resp2 = System.console().readLine().toLowerCase();
    if (resp2.equals("c")) {
      puntuacion++;
    }
    
    //Limpiar la pantalla
    System.out.print("\033[H\033[2J");
    System.out.flush();
    
    //Tercera pregunta
    System.out.println(titulo);
    System.out.println(subtitulo);
    System.out.println();
    System.out.println("3.- ¿Cuál de los siguientes SGBD es NoSQL?");
    System.out.println();
    System.out.println("a) SQLite.");
    System.out.println("b) Oracle Data Base.");
    System.out.println("c) MongoDB.");
    System.out.println();
    System.out.print("Introduzca su respuesta: ");
    String resp3 = System.console().readLine().toLowerCase();
    if (resp3.equals("c")) {
      puntuacion++;
    }
    
    //Limpiar la pantalla
    System.out.print("\033[H\033[2J");
    System.out.flush();
    
    //Cuarta pregunta
    System.out.println(titulo);
    System.out.println(subtitulo);
    System.out.println();
    System.out.println("4.- ¿Cual de los siguientes lesguajes NO es de programación?");
    System.out.println();
    System.out.println("a) CSS.");
    System.out.println("b) C++.");
    System.out.println("c) Python.");
    System.out.println();
    System.out.print("Introduzca su respuesta: ");
    String resp4 = System.console().readLine().toLowerCase();
    if (resp4.equals("a")) {
      puntuacion++;
    }
    
    //Limpiar la pantalla
    System.out.print("\033[H\033[2J");
    System.out.flush();
    
    //Quinta pregunta
    System.out.println(titulo);
    System.out.println(subtitulo);
    System.out.println();
    System.out.println("5.- ¿Qué tipo de datos puede guardar una variable 'int'?");
    System.out.println();
    System.out.println("a) Cadenas de caracteres.");
    System.out.println("b) Números enteros.");
    System.out.println("c) Números decimales.");
    System.out.println();
    System.out.print("Introduzca su respuesta: ");
    String resp5 = System.console().readLine().toLowerCase();
    if (resp5.equals("b")) {
      puntuacion++;
    }
    
    //Limpiar la pantalla
    System.out.print("\033[H\033[2J");
    System.out.flush();
    
    //Sexta pregunta
    System.out.println(titulo);
    System.out.println(subtitulo);
    System.out.println();
    System.out.println("6.- ¿Cuál debe ser la primera línea de un documento HTML?");
    System.out.println();
    System.out.println("a) <!DOCTIPE html>.");
    System.out.println("b) <DOCTYPE html>.");
    System.out.println("c) <!DOCTYPE html>.");
    System.out.println();
    System.out.print("Introduzca su respuesta: ");
    String resp6 = System.console().readLine().toLowerCase();
    if (resp6.equals("c")) {
      puntuacion++;
    }
    
    //Limpiar la pantalla
    System.out.print("\033[H\033[2J");
    System.out.flush();
    
    //Septima pregunta
    System.out.println(titulo);
    System.out.println(subtitulo);
    System.out.println();
    System.out.println("7.- ¿Cuales son los componentes de un sistema infoprmático?");
    System.out.println();
    System.out.println("a) El hardware, software y firmware.");
    System.out.println("b) El ordenador y los periféricos.");
    System.out.println("c) El hardware, software y el usuario.");
    System.out.println();
    System.out.print("Introduzca su respuesta: ");
    String resp7 = System.console().readLine().toLowerCase();
    if (resp7.equals("c")) {
      puntuacion++;
    }
    
    //Limpiar la pantalla
    System.out.print("\033[H\033[2J");
    System.out.flush();
    
    //Octava pregunta
    System.out.println(titulo);
    System.out.println(subtitulo);
    System.out.println();
    System.out.println("8.- ¿Cuál de los siguientes SGBD es híbrido ?");
    System.out.println();
    System.out.println("a) MySQL.");
    System.out.println("b) PostgreSQL.");
    System.out.println("c) Cassandra.");
    System.out.println();
    System.out.print("Introduzca su respuesta: ");
    String resp8 = System.console().readLine().toLowerCase();
    if (resp8.equals("b")) {
      puntuacion++;
    }
    
    //Limpiar la pantalla
    System.out.print("\033[H\033[2J");
    System.out.flush();
    
    //Novena pregunta
    System.out.println(titulo);
    System.out.println(subtitulo);
    System.out.println();
    System.out.println("9.- ¿Cómo se llama el símbolo '~'?");
    System.out.println();
    System.out.println("a) Virgulilla.");
    System.out.println("b) El rabito de la 'ñ'.");
    System.out.println("c) No tiene nombre.");
    System.out.println();
    System.out.print("Introduzca su respuesta: ");
    String resp9 = System.console().readLine().toLowerCase();
    if (resp9.equals("a")) {
      puntuacion++;
    }
    
    //Limpiar la pantalla
    System.out.print("\033[H\033[2J");
    System.out.flush();
    
    //Décima pregunta
    System.out.println(titulo);
    System.out.println(subtitulo);
    System.out.println();
    System.out.println("10.- ¿Cuantas horas a la semana hay de BBDD?");
    System.out.println();
    System.out.println("a) 4 horas.");
    System.out.println("b) 8 horas.");
    System.out.println("c) 6 horas.");
    System.out.println();
    System.out.print("Introduzca su respuesta: ");
    String resp10 = System.console().readLine().toLowerCase();
    if (resp10.equals("c")) {
      puntuacion++;
    }
    
    //Limpiar la pantalla
    System.out.print("\033[H\033[2J");
    System.out.flush();
    
    //Mostrar el resultado del test
    switch (puntuacion) {
      case 1:
        System.out.println("Solo has acertado " + puntuacion + " pregunta.");
        break;
      case 2:
        System.out.println("Solo has acertado " + puntuacion + " preguntas.");
        break;
      case 3:
        System.out.println("Solo has acertado " + puntuacion + " preguntas.");
        break;
      case 4:
        System.out.println("Solo has acertado " + puntuacion + " preguntas.");
        break;
      case 5:
        System.out.println("¡Bien! Has acertado " + puntuacion + " preguntas.");
        break;
      case 6:
        System.out.println("¡Bien! Has acertado " + puntuacion + " preguntas.");
        break;
      case 7:
        System.out.println("¡Bien! Has acertado " + puntuacion + " preguntas.");
        break;
      case 8:
        System.out.println("¡Genial! Has acertado " + puntuacion + " preguntas.");
        break;
      case 9:
        System.out.println("¡Genial! Has acertado " + puntuacion + " preguntas.");
        break;
      case 10:
        System.out.println("Has acertado " + puntuacion + " preguntas, ¡Seguro que has copiado!");
        break;
      default:
        System.out.println("No has acertado ninguna pregunta, ¡No hay nadie igual que tú!");
    }
  }
}
