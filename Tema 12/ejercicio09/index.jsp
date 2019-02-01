<%-- 
    Document   : index
    Created on : 30-ene-2019, 10:14:47
    Author     : JorgeGarciaMolina
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
    <h1>Pirámide</h1>
    <form action="piramide.jsp" method="post">
      <label>Selecciona el caracter de la pirámide: </label>
      <select name="caracter">
        <option value="f13d">&#xf13d;</option>
        <option value="f07d">&#xf07d;</option>
        <option value="f0fc">&#xf0fc;</option>
        <option value="f1e2">&#xf1e2;</option>
        <option value="f085">&#xf085;</option>
        <option value="f03b">&#xf03b;</option>
        <option value="f0c7">&#xf0c7;</option>
        <option value="f261">&#xf261;</option>
        <option value="f21e">&#xf21e;</option>
        <option value="f094">&#xf094;</option>
      </select><br>
      <label>Altura de la pirámide:</label>
      <input type="number" name="altura" min="1" max="50" step="1">
      <input type="submit" value="Enviar">
    </form>
  </body>
</html>
