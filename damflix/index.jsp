<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>DamFlix</title>
  </head>
  <body>
    <h1 class="text-center">DamFlix</h1>
    <h2 class="text-center">Las mejores series en tu ordenador</h2>

    <%
      request.setCharacterEncoding("UTF-8");
      
      Class.forName("com.mysql.jdbc.Driver");
      Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/mis_series", "root", "root");
      Statement s = conexion.createStatement();

      String estado = (request.getParameter("id") == null) ? "listado" : "edicion";
    %>

    <table class="table">
      <tr><th>ID</th><th>Título</th><th>Género</th><th>Descripción</th><th>Nº Capítulos</th><th></th></tr>
      <form action="<%= estado.equals("listado") ? "nuevaserie.jsp" : "actualizaserie.jsp" %>" method="GET">
        <tr>
          <td>
            <%
              if (estado.equals("edicion")) {
                out.print("<input disabled type=\"text\" size=\"2\" value=" + request.getParameter("id") + ">");
                out.print("<input type=\"hidden\" name=\"id\" value=" + request.getParameter("id") + ">");
              }
            %>
          </td>
          <td>
            <div class="form-group">
              <input
                value="<%= estado.equals("edicion") ? request.getParameter("titulo") : "" %>"
                name="titulo"
                type="text"
                class="form-control">
            </div>
          </td>
          <td>
            <div class="form-group">
              <input
                value="<%= estado.equals("edicion") ? request.getParameter("genero") : "" %>"
                name="genero"
                type="text"
                class="form-control">
            </div>
          </td>
          <td>
            <div class="form-group">
              <input
                value="<%= estado.equals("edicion") ? request.getParameter("descripcion") : "" %>"
                name="descripcion"
                type="text"
                class="form-control">
            </div>
          </td>
          <td>
            <div class="form-group">
              <input
                value="<%= estado.equals("edicion") ? request.getParameter("numerodecapitulos") : "" %>"
                name="numerodecapitulos"
                type="number"
                min="1"
                class="form-control">
            </div>
          </td>
          <td>
            <%
              if (estado.equals("listado")) {
            %>
            <button type="submit" class="btn btn-primary">Añadir</button>
            <%
            }
            
            if (estado.equals("edicion")) {
            %>
            <button type="submit" class="btn btn-success">Guardar</button>
          
            <a href="index.jsp">
              <button type="button" class="btn btn-dark">Cancelar</button>
            </a>
            <%
              }
            %>
          </td>
        </tr>
      </form>
      <%
        ResultSet listado = s.executeQuery("SELECT * FROM serie");
        while (listado.next()) {
      %>
      <tr>
        <td><%= listado.getString("id")%></td>
        <td><%= listado.getString("titulo")%></td>
        <td><%= listado.getString("genero")%></td>
        <td><%= listado.getString("descripcion")%></td>
        <td><%= listado.getString("numerodecapitulos")%></td>
        <td>
          <a
            class="btn btn-warning"
            href="index.jsp?id=<%= listado.getString("id")%>&titulo=<%= listado.getString("titulo")%>&genero=<%= listado.getString("genero")%>&descripcion=<%= listado.getString("descripcion")%>&numerodecapitulos=<%= listado.getString("numerodecapitulos")%>" role="button">
          <button type="button" class="btn btn-dark">Modificar</button>
          </a>
          <a class="btn btn-danger" href="borraserie.jsp?id=<%= listado.getString("id")%>" role="button">
          <button type="button" class="btn btn-dark">Borrar</button>
          </a>
        </td>
      </tr>
      <%
        }
      %>

    </table>
  </body>
</html>
