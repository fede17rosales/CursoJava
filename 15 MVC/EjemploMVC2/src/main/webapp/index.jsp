<!DOCTYPE html>
<html>
    <head>
        <title>Ejemplo MVC 2</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <h1>Ejemplo MVC 2</h1>
        <br>
        <div style="color: red">${mensaje}</div>
        <br>
        <a href="${pageContext.request.contextPath}/ServletControlador">Link al Servlet controlador SIN PARAMETROS</a>
        <br>
        <a href="${pageContext.request.contextPath}/ServletControlador?accion=agregarVariables">Link al Servlet controlador para agregar las variables</a>
        <br>
        <a href="${pageContext.request.contextPath}/ServletControlador?accion=listarVariables">Link al Servlet controlador para listar las variables</a>

    </body>
</html>