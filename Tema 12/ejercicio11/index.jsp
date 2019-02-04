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
          <option>Enero</option>
          <option>Febrero</option>
          <option>Marzo</option>
          <option>Abril</option>
          <option>Mayo</option>
          <option>Junio</option>
          <option>Julio</option>
          <option>Agosto</option>
          <option>Septiembre</option>
          <option>Octubre</option>
          <option>Noviembre</option>
          <option>Diciembre</option>
        </select><br>
        <label>Año </label>
        <select name="anyo">
          <%
          for (int i = 2000; i < 3000; i++) {
            out.println("<option value=\"" + (i - 0) + "\">" + i + "</option>");
          }
          %>
        </select><br>
        <label>El día 1 cae en </label>
        <select name="dia1">
          <option value="1">Lunes</option>
          <option value="2">Martes</option>
          <option value="3">Miércoles</option>
          <option value="4">Jueves</option>
          <option value="5">Viernes</option>
          <option value="6">Sábado</option>
          <option value="7">Domingo</option>
        </select><br>
        <label>Numero de días que tiene el mes </label>
        <select name="numdias">
          <option value="28">28</option>
          <option value="29">29</option>
          <option value="30">30</option>
          <option value="31">31</option>
        </select><br>
        <input type="submit" value="Enviar">
      </form>
    </div>
  </body>
</html>
