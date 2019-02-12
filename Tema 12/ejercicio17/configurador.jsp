<%-- 
    Document   : configurador
    Created on : 12-feb-2019, 12:19:28
    Author     : JorgeGarciaMolina
--%>

<%
  request.setCharacterEncoding("UTF-8");
  String color = request.getParameter("color");
  String material = request.getParameter("material");
  String interior = color + material + ".jpg";
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Ejercicio 17 del tema 12</title>
  </head>
  <body>
    <h1>El interior de su coche es de <%= material%> y de color <%= color%></h1>
    <%out.println("<img src=\"./img/" + interior + "\">");%>
  </body>
</html>
