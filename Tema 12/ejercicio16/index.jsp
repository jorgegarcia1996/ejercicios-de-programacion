<%-- 
    Document   : index
    Created on : 10-feb-2019, 12:16:56
    Author     : Jorge
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link href="./main.css" type="text/css" rel="stylesheet">
    <title>Ejercicio 16 del tema 12</title>
  </head>
  <body>
    <div class="centrado">
      <h1>Dados de Póker</h1>
      <%
        int d;
        for (int i = 0; i < 3; i++) {
          d = (int)((Math.random() * 6) + 1);
          out.println("<img src=\"./img/" + d + ".png\" width=\"300px\">");
        }
      %>
    </div>
  </body>
</html>
