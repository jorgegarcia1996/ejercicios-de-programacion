<%-- 
    Document   : nombre
    Created on : 30-ene-2019, 10:14:58
    Author     : JorgeGarciaMolina
--%>
<%@page import="java.text.DecimalFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
  request.setCharacterEncoding("UTF-8");
  DecimalFormat dosD = new DecimalFormat("0.00");
  double pesetas = Double.parseDouble(request.getParameter("euros"));
  double euros = pesetas / 166;

%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link href="./main.css" type="text/css" rel="stylesheet">
    <title>Ejercicio 06 del tema 12</title>
  </head>
  <body>
    <h1><%= dosD.format(pesetas)%> pesetas son <%= dosD.format(euros)%> euros</h1>
  </body>
</html>
