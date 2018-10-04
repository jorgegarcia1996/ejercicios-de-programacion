/**
* Ejercicio 16 del Tema 4
* 
* Realiza un programa que nos diga si hay probabilidad de que nuestra pareja
* nos está siendo infiel. El programa irá haciendo preguntas que el usuario
* contestará con verdadero o falso. Cada pregunta contestada como verdadero
* sumará 3 puntos. Las preguntas contestadas con falso no suman puntos.
* 
* @author Jorge García Molina
*/

public class Ejercicio16 {
  public static void main(String[] args) {
    //Encabezado del test
    String titulo = "Averigua si tu pareja es infiel.";
    String subtitulo = "Contesta a las preguntas con V o F.";
    int puntuacion = 0;
    String resp;
    
    //Primera pregunta
    System.out.println(titulo);
    System.out.println(subtitulo);
    System.out.println();
    System.out.print("1.- ¿Tu pareja parece estar más inquieta de lo normal");
    System.out.print(" sin ningún motivo aparente? ");
    resp = System.console().readLine().toLowerCase();
    if (resp.equals("v")) {
      puntuacion = puntuacion + 3;
    }
    
    //Limpiar la pantalla
    System.out.print("\033[H\033[2J");
    System.out.flush();
    
    //Segunda pregunta
    System.out.println(titulo);
    System.out.println(subtitulo);
    System.out.println();
    System.out.print("2.- ¿Ha aumentado sus gastos de vestuario? ");
    resp = System.console().readLine().toLowerCase();
    if (resp.equals("v")) {
      puntuacion = puntuacion + 3;
    }
    
    //Limpiar la pantalla
    System.out.print("\033[H\033[2J");
    System.out.flush();
    
    //Tercera pregunta
    System.out.println(titulo);
    System.out.println(subtitulo);
    System.out.println();
    System.out.print("3.- ¿Ha perdido el interés que mostraba anteriormente por ti? ");
    resp = System.console().readLine().toLowerCase();
    if (resp.equals("v")) {
      puntuacion = puntuacion + 3;
    }
    
    //Limpiar la pantalla
    System.out.print("\033[H\033[2J");
    System.out.flush();
    
    //Cuarta pregunta
    System.out.println(titulo);
    System.out.println(subtitulo);
    System.out.println();
    System.out.print("4.- ¿Ahora se afeita y se asea con más frecuencia (si es");
    System.out.print(" hombre) o ahora se arregla el pelo y se asea con más");
    System.out.print(" frecuencia (si es mujer)? ");
    resp = System.console().readLine().toLowerCase();
    if (resp.equals("v")) {
      puntuacion = puntuacion + 3;
    }
    
    //Limpiar la pantalla
    System.out.print("\033[H\033[2J");
    System.out.flush();
    
    //Quinta pregunta
    System.out.println(titulo);
    System.out.println(subtitulo);
    System.out.println();
    System.out.print("5.- ¿No te deja que mires la agenda de su teléfono móvil? ");
    resp = System.console().readLine().toLowerCase();
    if (resp.equals("v")) {
      puntuacion = puntuacion + 3;
    }
    
    //Limpiar la pantalla
    System.out.print("\033[H\033[2J");
    System.out.flush();
    
    //Sexta pregunta
    System.out.println(titulo);
    System.out.println(subtitulo);
    System.out.println();
    System.out.print("6.- ¿A veces tiene llamadas que dice no querer contestar");
    System.out.print(" cuando estás tú delante? ");
    resp = System.console().readLine().toLowerCase();
    if (resp.equals("v")) {
      puntuacion = puntuacion + 3;
    }
    
    //Limpiar la pantalla
    System.out.print("\033[H\033[2J");
    System.out.flush();
    
    //Séptima pregunta
    System.out.println(titulo);
    System.out.println(subtitulo);
    System.out.println();
    System.out.print("7.- ¿Últimamente se preocupa más en cuidar la línea y/o");
    System.out.print(" estar bronceado/a? ");
    resp = System.console().readLine().toLowerCase();
    if (resp.equals("v")) {
      puntuacion = puntuacion + 3;
    }
    
    //Limpiar la pantalla
    System.out.print("\033[H\033[2J");
    System.out.flush();
    
    //Octava pregunta
    System.out.println(titulo);
    System.out.println(subtitulo);
    System.out.println();
    System.out.print("8.- ¿Muchos días viene tarde después de trabajar porque");
    System.out.print(" dice tener mucho más trabajo? ");
    resp = System.console().readLine().toLowerCase();
    if (resp.equals("v")) {
      puntuacion = puntuacion + 3;
    }
    
    //Limpiar la pantalla
    System.out.print("\033[H\033[2J");
    System.out.flush();
    
    //Novena pregunta
    System.out.println(titulo);
    System.out.println(subtitulo);
    System.out.println();
    System.out.print("9.- ¿Has notado que últimamente se perfuma más? ");
    resp = System.console().readLine().toLowerCase();
    if (resp.equals("v")) {
      puntuacion = puntuacion + 3;
    }
    
    //Limpiar la pantalla
    System.out.print("\033[H\033[2J");
    System.out.flush();
    
    //Décima pregunta
    System.out.println(titulo);
    System.out.println(subtitulo);
    System.out.println();
    System.out.print("10.- ¿Se confunde y te dice que ha estado en sitios");
    System.out.print(" donde no ha ido contigo? ");
    resp = System.console().readLine().toLowerCase();
    if (resp.equals("v")) {
      puntuacion = puntuacion + 3;
    }
    
    //Limpiar la pantalla
    System.out.print("\033[H\033[2J");
    System.out.flush();
    
    //Mostrar el resultado del test
    if (puntuacion <= 10) {
      System.out.println("La puntuación es " + puntuacion + ".");
      System.out.print("¡Enhorabuena! tu pareja parece ser totalmente fiel.");
    } else if (puntuacion <= 22) {
      System.out.println("La puntuación es " + puntuacion + ".");
      System.out.print("Quizás exista el peligro de otra persona en su vida");
      System.out.print(" o en su mente, aunque seguramente será algo sin");
      System.out.print(" importancia. No bajes la guardia.");
    } else {
      System.out.println("La puntuación es " + puntuacion + ".");
      System.out.print("Tu pareja tiene todos los ingredientes para estar");
      System.out.print(" viviendo un romance con otra persona. Te aconsejamos");
      System.out.print(" que indagues un poco más y averigües que es lo que");
      System.out.print(" está pasando por su cabeza.");
    }
  }
}
