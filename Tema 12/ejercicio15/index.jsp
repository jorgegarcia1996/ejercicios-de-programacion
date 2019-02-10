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
    <title>Ejercicio 15 del tema 12</title>
  </head>
  <body>
    <div class="centrado">
      <h1>100 números aleatorios y primos de otro color</h1>
      <%
        int num;
        for (int i = 0; i < 100; i++) {
          num = (int)(Math.random() * 200) + 1;
          if (esPrimo(num)) {
            out.print("<span class=\"color\">" + num + "</span>, ");
          } else {
            out.print(num + ", ");
          }
        }
      %>
    </div>
  </body>
</html>

<!--Funcion de esPrimo-->
<%!
  static boolean esPrimo(int n) {
    for (int i = 2; i < n; i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }
%>
