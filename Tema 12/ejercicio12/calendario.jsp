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
  int mes = Integer.parseInt(request.getParameter("mes"));
  int anyo = Integer.parseInt(request.getParameter("anyo"));
  String[] nombreMes = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
    "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
  int columna = 1;
  
  //Calendario
  Calendar calendario = Calendar.getInstance();
  calendario.set(anyo, mes - 1, 1);
  int numDias = calendario.getActualMaximum(Calendar.DAY_OF_MONTH);
  int dia1 = calendario.get(Calendar.DAY_OF_WEEK);
  if (dia1 == 1) {
    dia1 = 7;
  } else {
    dia1--;
  }
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
      <h1>Calendario de <% out.print(nombreMes[mes - 1]);%> del año <%= anyo%></h1>
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
            out.print("<td> </td>"); // pinta los huecos que corresponden a los días del mes pasado
          }
          columna++;
          if (columna == 8) { // termina la fila actual
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
