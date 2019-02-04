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
    <title>Ejercicio 11 del tema 12</title>
  </head>
  <body>
    <div class="centrado">
      <h1>Cuestionario</h1>
      <form action="calendario.jsp" method="post">
        <label>Mes </label>
        <select name="mes">
          <option value="1">Enero</option>
          <option value="2">Febrero</option>
          <option value="3">Marzo</option>
          <option value="4">Abril</option>
          <option value="5">Mayo</option>
          <option value="6">Junio</option>
          <option value="7">Julio</option>
          <option value="8">Agosto</option>
          <option value="9">Septiembre</option>
          <option value="10">Octubre</option>
          <option value="11">Noviembre</option>
          <option value="12">Diciembre</option>
        </select><br>
        <label>Año </label>
        <select name="anyo">
          <%
          for (int i = 1950; i < 2100; i++) {
            out.println("<option value=\"" + (i - 0) + "\">" + i + "</option>");
          }
          %>
        </select><br>
        <input type="submit" value="Enviar">
      </form>
    </div>
  </body>
</html>
