<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP con Expresiones</title>
    </head>
    <body>
        <h1>JSP con Expresiones</h1>
        Concatenacion: <%= "Saludos" + " " + "JSP" %>
        <br>
        Operaci�n Matematica <%= 2 * 3 / 2 %>
        <br>
        Sesion id: <%= session.getId() %>
        <br>
        <br>
        <a href="index.html">Regresar al HTML</a>
    </body>
</html>
