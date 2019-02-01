<%-- 
    Document   : nombre
    Created on : 30-ene-2019, 10:14:58
    Author     : JorgeGarciaMolina
--%>
<%@page import="java.text.DecimalFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
  request.setCharacterEncoding("UTF-8");
  String caracter = "&#x" + request.getParameter("caracter") + ";";
  int altura = Integer.parseInt(request.getParameter("altura"));
  int base = (altura * 2) - 1;
  int espacios = altura - 1;
  int i = 1;
%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.1/css/font-awesome.min.css" rel="stylesheet"/>
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.0/css/all.css" integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ" crossorigin="anonymous">
    <link href="./main.css" type="text/css" rel="stylesheet">
    <title>Ejercicio 09 del tema 12</title>
  </head>
  <body>
    <h1>Pirámide de <%= altura%> caracteres de altura</h1>
    <%
      if (altura > 1 ) {
      while (i <= base) {
        out.print("<pre>");
        for (int j = 0; j < espacios; j++) {
        out.print("    ");
        }
        for (int j = 1; j <= i; j++) {
        out.print(caracter);
        }
        i += 2;
        espacios--;
        out.print("</pre>");
      }
    } else {
      out.print("<pre>" + caracter + "</pre>");
    }
    %>
  </body>
</html>
