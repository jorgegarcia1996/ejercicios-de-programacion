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
    <title>Ejercicio 07 del tema 12</title>
  </head>
  <body>
    <h1>Conversor</h1>
    <form action="convierte.jsp" method="post">
      <select name="moneda">
        <option value="eur" selected>Euros --> Pesetas</option>
        <option value="pts">Pesetas --> Euros</option>
      </select>
      <label>Cantidad: </label>
      <input type="number" name="cantidad" step="0.01"><br>
      <input type="submit" value="Enviar">
    </form>
    <img src="img/pesetas-euros.jpg">
  </body>
</html>
