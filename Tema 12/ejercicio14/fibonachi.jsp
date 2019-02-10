<%-- 
    Document   : nombre
    Created on : 30-ene-2019, 10:14:58
    Author     : JorgeGarciaMolina
--%>
<%@page import="java.util.Calendar"%>
<%@page import="java.text.DecimalFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
  request.setCharacterEncoding("UTF-8");
  int numeros = Integer.parseInt(request.getParameter("numero"));
  long num1 = 0, num2 = 1, aux;
%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link href="./main.css" type="text/css" rel="stylesheet">
    <title>Ejercicio 14 del tema 12</title>
  </head>
  <body>
    <div class="centrado">
      <h1>Estos son los <%= numeros%> primeros números de la sucesión de finonacci</h1>
      <%
        switch (numeros) {
          case 1:
            out.println("0");
            break;
          case 2:
            out.println("0 | 1");
            break;
          default:
            out.println("0 | 1");
            while (numeros > 2) {
              aux = num1;
              num1 = num2;
              num2 = aux + num1;
              out.println("| " + num2);
              numeros--;
            }
        }
      %>
    </div>
  </body>
</html>
