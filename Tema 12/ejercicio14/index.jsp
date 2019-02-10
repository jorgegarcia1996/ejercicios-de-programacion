<%-- 
    Document   : index
    Created on : 10-feb-2019, 12:16:56
    Author     : Jorge
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link href="./main.css" type="text/css" rel="stylesheet">
    <title>Ejercicio 14 del tema 12</title>
  </head>
  <body>
    <div class="centrado">
      <h1>Fibonacci</h1>
      <form action="fibonachi.jsp" method="post">
        <label>¿Cuantos números de la serie de Fibonacci quere ver?</label>
        <input type="number" name="numero" min="1" step="1">
        <input type="submit" value="Enviar">
      </form>
    </div>
  </body>
</html>
