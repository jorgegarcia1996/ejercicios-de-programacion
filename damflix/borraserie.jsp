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
      Class.forName("com.mysql.jdbc.Driver");
      Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/mis_series", "root", "root");
      Statement s = conexion.createStatement();
      
      String borrado = "DELETE FROM serie WHERE id=";
      borrado += request.getParameter("id");
      
      s.execute(borrado);
      conexion.close();
    %>
    
    <script>
      // Redirecciona a la página principal
      location.replace("index.jsp");
    </script>
  </body>
</html>
