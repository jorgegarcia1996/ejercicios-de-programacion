<%-- 
    Document   : nombre
    Created on : 30-ene-2019, 10:14:58
    Author     : JorgeGarciaMolina
--%>
<%@page import="java.util.Calendar"%>
<%@page import="java.text.DecimalFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
  request.setCharacterEncoding("UTF-8");
  int puntos = 0;
  for (Integer i = 1; i < 11; i++) {
    puntos += Integer.parseInt(request.getParameter("p" + i.toString()));
  }
%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link href="./main.css" type="text/css" rel="stylesheet">
    <title>Ejercicio 11 del tema 12</title>
  </head>
  <body>
    <div class="centrado">
      <h1>Resultado del test</h1>
      <p>
        <%
          if (puntos <= 10) {
            out.println("¡Enhorabuena! tu pareja parece ser totalmente fiel.");
          }

          if ((puntos >= 11) && (puntos <= 22)) {
            out.println("Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");
          }

          if (puntos > 22) {
            out.println("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza.");
          }
      %>
      <br><br>Haga clic <a href="index.jsp">aquí</a> para repetir el cuestionario.
      </p>
    </div>
  </body>
</html>
