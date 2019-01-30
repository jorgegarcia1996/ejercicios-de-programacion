<%-- 
    Document   : index
    Created on : 30-ene-2019, 10:14:47
    Author     : JorgeGarciaMolina
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link href="./main.css" type="text/css" rel="stylesheet">
    <title>Ejercicio 04 del tema 12</title>
  </head>
  <body>
    <h1>Introduzca los datos</h1>
    <form action="media.jsp" method="post">
      <label>Nota 1:</label>
      <input type="number" name="nota1" min="0" max="10" step="0.01"><br>
      <label>Nota 2:</label>
      <input type="number" name="nota2" min="0" max="10" step="0.01"><br>
      <label>Nota 3:</label>
      <input type="number" name="nota3" min="0" max="10" step="0.01"><br>
      <input type="submit" value="Enviar">
    </form>
  </body>
</html>
