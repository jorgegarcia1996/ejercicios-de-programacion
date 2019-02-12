<%-- 
    Document   : configurador
    Created on : 12-feb-2019, 12:19:28
    Author     : JorgeGarciaMolina
--%>

<%
  request.setCharacterEncoding("UTF-8");
  int seleccionado = Integer.parseInt(request.getParameter("cubilete"));
  int ganador = (int)(Math.random() * 3);
  String mensaje;
  
  if (seleccionado == ganador) {
    mensaje = "Enhorabuena, has ganado";
  } else {
    mensaje = "Lo siento, has perdido";
  }
  
  String[] cubiletes = new String[3];
  for (int i = 0; i < 3; i++) {
    cubiletes[i] = "cubilete_sin_bola.png";
  }
  cubiletes[ganador] = "cubilete_con_1bola.png";
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link href="./main.css" type="text/css" rel="stylesheet">
    <title>Ejercicio 18 del tema 12</title>
  </head>
  <body>
    <div class="centrado">
      <h1><%= mensaje%></h1>
      <img src="./img/<%= cubiletes[0]%>">
      <img src="./img/<%= cubiletes[1]%>">
      <img src="./img/<%= cubiletes[2]%>">
    </div>
  </body>
</html>
