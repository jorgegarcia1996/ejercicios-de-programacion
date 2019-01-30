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
    <title>Ejercicio 05 del tema 12</title>
  </head>
  <body>
    <h1>Conversor Euros --> Pesetas</h1>
    <form action="convierte.jsp" method="post">
      <label>Euros:</label>
      <input type="number" name="euros" min="0" max="10" step="0.01"><br>
      <input type="text" name="tipo" value="eu-pts">
      <input type="submit" value="Enviar">
    </form>
  </body>
</html>
