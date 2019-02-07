<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
  </head>
  <body>
    <%
      request.setCharacterEncoding("UTF-8");

      Class.forName("com.mysql.jdbc.Driver");
      Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/mis_series", "root", "root");
      Statement s = conexion.createStatement();

      String actualizacion = "UPDATE serie SET titulo='";
      actualizacion += request.getParameter("titulo");
      actualizacion += "', genero='";
      actualizacion += request.getParameter("genero");
      actualizacion += "', descripcion='";
      actualizacion += request.getParameter("descripcion");
      actualizacion += "', numerodecapitulos=";
      actualizacion += request.getParameter("numerodecapitulos");
      actualizacion += " WHERE id=";
      actualizacion += request.getParameter("id");

      //out.print(actualizacion);
       s.execute(actualizacion);
       conexion.close();
    %>

    <script>
      // Redirecciona a la página principal
      location.replace("index.jsp");
    </script>
  </body>
</html>
