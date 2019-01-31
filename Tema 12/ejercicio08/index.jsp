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
    <title>Ejercicio 08 del tema 12</title>
  </head>
  <body>
    <h1>Conversor</h1>
    <form action="tabla.jsp" method="post">
      <label>Qué tabla de multiplicar quieres ver?</label>
      <select name="mult">
        <option value="0" selected>0</option>
        <%
        for (int i = 1; i <= 100; i++) {
          out.println("<option value=\"" + i + "\">" + i + "</option>");
        }
        %>
      </select>
      <input type="submit" value="Enviar">
    </form>
  </body>
</html>
