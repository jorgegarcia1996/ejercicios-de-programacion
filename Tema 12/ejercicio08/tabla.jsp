<%-- 
    Document   : nombre
    Created on : 30-ene-2019, 10:14:58
    Author     : JorgeGarciaMolina
--%>
<%@page import="java.text.DecimalFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
  request.setCharacterEncoding("UTF-8");
  long mult = Integer.parseInt(request.getParameter("mult"));
  long resultado;
%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link href="./main.css" type="text/css" rel="stylesheet">
    <title>Ejercicio 07 del tema 12</title>
  </head>
  <body>
    <h1>Tabla de multiplicar del <%= mult%></h1>
    <table>
      <thead>Tabla del 0 al 10</thead><br>
      <%
        for (int i = 0; i <= 10; i++) {
          resultado = mult * i;
          out.println("<tr>" + mult + " * " + i + " = " + resultado + "</tr><br>");
        }
      %>
    </table>
  </body>
</html>
