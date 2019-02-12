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
    <title>Ejercicio 17 del tema 12</title>
  </head>
  <body>
    <div class="centrado">
      <h1>Configurador del interior del coche</h1>
      <form action="configurador.jsp" method="POST">
        <label>Color del interior: </label>
        <select name="color">
          <option value="negro">Negro</option>
          <option value="berengena">Berengena</option>
          <option value="blanco">Blanco</option>
        </select><br>
        <label>Material del interior: </label>
        <select name="material">
          <option value="carbono">Carbono</option>
          <option value="madera">Madera</option>
        </select><br>
        <input type="submit" value="Enviar">
      </form>
    </div>
  </body>
</html>
