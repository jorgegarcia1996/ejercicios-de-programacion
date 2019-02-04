<%-- 
    Document   : nombre
    Created on : 30-ene-2019, 10:14:58
    Author     : JorgeGarciaMolina
--%>
<%@page import="java.text.DecimalFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
  request.setCharacterEncoding("UTF-8");
  String mes = request.getParameter("mes");
  int anyo = Integer.parseInt(request.getParameter("anyo"));
  int columna = 1;
  int numDias = Integer.parseInt(request.getParameter("numdias"));
  int dia1 = Integer.parseInt(request.getParameter("dia1"));
%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link href="./main.css" type="text/css" rel="stylesheet">
    <title>Ejercicio 11 del tema 12</title>
  </head>
  <body>
    <div class="centrado">
      <h1>Calendario de <%= mes%> del año <%= anyo%></h1>
      <table>
        <tr>
          <th>lunes</th>
          <th>martes</th>
          <th>miércoles</th>
          <th>jueves</th>
          <th>viernes</th>
          <th>sábado</th>
          <th>domingo</th>
        </tr>
        <tr>
        <%
        for (int i = 1; i < numDias + dia1; i++) {
          if (i >= dia1) {
            out.print("<td>" + (i - dia1 + 1) + "</td>");
          } else {
            out.print("<td> </td>");
          }
          columna++;
          if (columna == 8) {
            out.println("</tr><tr>");
            columna = 1;
          }
        }
        %>
        </td></tr>
      </table>
    </div>
  </body>
</html>
