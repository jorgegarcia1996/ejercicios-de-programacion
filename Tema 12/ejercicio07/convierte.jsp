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
  double cantidad = Double.parseDouble(request.getParameter("cantidad"));
  String moneda = request.getParameter("moneda");
  double resultado;
  String m1, m2;
  if (moneda.equals("eur")) {
    resultado = cantidad * 166;
    m1 = "euros";
    m2 = "pesetas";
  } else {
    resultado = cantidad / 166;
    m2 = "euros";
    m1 = "pesetas";
  }
%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link href="./main.css" type="text/css" rel="stylesheet">
    <title>Ejercicio 07 del tema 12</title>
  </head>
  <body>
    <h1><%= dosD.format(cantidad) + " " + m1%> son <%= dosD.format(resultado) + " " + m2%></h1>
  </body>
</html>
