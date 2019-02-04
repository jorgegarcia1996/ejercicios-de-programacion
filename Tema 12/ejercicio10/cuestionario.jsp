<%-- 
    Document   : nombre
    Created on : 30-ene-2019, 10:14:58
    Author     : JorgeGarciaMolina
--%>
<%@page import="java.text.DecimalFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
  request.setCharacterEncoding("UTF-8");
  int nota = 0;
  for (Integer i = 1; i < 11; i++) {
    nota += Integer.parseInt(request.getParameter("p" + i.toString()));
  }
%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link href="./main.css" type="text/css" rel="stylesheet">
    <title>Ejercicio 10 del tema 12</title>
  </head>
  <body>
    <h1>Has sacado <%= nota%> de 10 puntos</h1>
  </body>
</html>
