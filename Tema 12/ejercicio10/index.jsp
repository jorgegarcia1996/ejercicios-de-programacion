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
    <link href="./main.css" type="text/css" rel="stylesheet">
    <title>Ejercicio 09 del tema 12</title>
  </head>
  <body>
    <div class="centrado">
      <h1>Cuestionario</h1>
      <form action="cuestionario.jsp" method="post">
        
        <h3>1. ¿Cuál de los siguientes tipos de datos de Java tiene más precisión?</h3>
        <input type="radio" name="p1" value="0"> int</input></br>
        <input type="radio" name="p1" value="1"> double</input></br>
        <input type="radio" name="p1" value="0"> float</input></br></br>

        <h3>2. ¿Cuál es el lenguaje que se utiliza para hacer consultas en las bases de datos?</h3>
        <input type="radio" name="p2" value="0"> XML</input></br>
        <input type="radio" name="p2" value="0"> SELECT</input></br>
        <input type="radio" name="p2" value="1"> SQL</input></br></br>

        <h3>3. Para insertar un hiperenlace en una página se utiliza la etiqueta...</h3>
        <input type="radio" name="p3" value="0"> href</input></br>
        <input type="radio" name="p3" value="1"> a</input></br>
        <input type="radio" name="p3" value="0"> link</input></br></br>

        <h3>4. ¿En qué directorio se encuentran los archivos de configuración de Linux?</h3>
        <input type="radio" name="p4" value="1"> /etc</input></br>
        <input type="radio" name="p4" value="0"> /config</input></br>
        <input type="radio" name="p4" value="0"> /cfg</input></br></br>

        <h3>5. ¿Cuál de las siguientes memorias es volátil?</h3>
        <input type="radio" name="p5" value="1"> RAM</input></br>
        <input type="radio" name="p5" value="0"> EPROM</input></br>
        <input type="radio" name="p5" value="0"> ROM</input></br></br>

        <h3>6. En Java, para definir una clase como subclase de otra se utiliza...</h3>
        <input type="radio" name="p6" value="1"> extends</input></br>
        <input type="radio" name="p6" value="0"> inherit</input></br>
        <input type="radio" name="p6" value="0"> subclass</input></br></br>

        <h3>7. ¿Java soporta la herencia múltiple?</h3>
        <input type="radio" name="p7" value="0"> Sí</input></br>
        <input type="radio" name="p7" value="1"> No</input></br>
        <input type="radio" name="p7" value="0"> A veces</input></br></br>

        <h3>8. ¿Qué significan las siglas CSS?</h3>
        <input type="radio" name="p8" value="0"> Computer Style Sheets</input></br>
        <input type="radio" name="p8" value="0"> Creative Style Sheets</input></br>
        <input type="radio" name="p8" value="1"> Cascading Style Sheets</input></br></br>

        <h3>9. ¿Qué propiedad se utiliza en CSS para cambiar el color de fondo?</h3>
        <input type="radio" name="p9" value="0"> bgcolor:</input></br>
        <input type="radio" name="p9" value="0"> color:</input></br>
        <input type="radio" name="p9" value="1"> background-color:</input></br></br>

        <h3>10. ¿Cómo se muestran los hiperenlaces sin subrayar?</h3>
        <input type="radio" name="p10" value="0"> a {text-decoration:no underline}</input></br>
        <input type="radio" name="p10" value="0"> a {underline:none}</input></br>
        <input type="radio" name="p10" value="1"> a {text-decoration:none}</input></br></br>
      
        <input type="submit" value="Enviar">
      </form>
    </div>
  </body>
</html>
