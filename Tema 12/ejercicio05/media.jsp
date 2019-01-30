<%-- 
    Document   : nombre
    Created on : 30-ene-2019, 10:14:58
    Author     : JorgeGarciaMolina
--%>
<%@page import="java.text.DecimalFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
  request.setCharacterEncoding("UTF-8");
  DecimalFormat nota = new DecimalFormat("0.00");
  double nota1 = Double.parseDouble(request.getParameter("nota1"));
  double nota2 = Double.parseDouble(request.getParameter("nota2"));
  double nota3 = Double.parseDouble(request.getParameter("nota3"));
  double media = (nota1 + nota2 + nota3) / 3;

%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link href="./main.css" type="text/css" rel="stylesheet">
    <title>Ejercicio 05 del tema 12</title>
  </head>
  <body>
    <h1>Tu nota es <%= nota.format(media)%></h1>
  </body>
</html>
