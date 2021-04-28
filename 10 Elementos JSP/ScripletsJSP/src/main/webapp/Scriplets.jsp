<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP con Scriptlets</title>
    </head>
    <body>
        <h1>JSP con Scriptlets</h1>
        <br>
        <%-- Sriptlet para enviar al navegador --%>
        <% 
            out.print("Saludos desde un Scriptlet");
        %>
        <%-- Sriptlet para enviar al navegador --%>
        <% 
          String nombreAplicacion = request.getContextPath();
          out.print("nombre de la aplicacion: " + nombreAplicacion);
        %>
        <br>
        <%-- Codigo Scriplet condicionado --%>
        <%
            if(session != null && session.isNew()){
         %>   
          La Sesion SI es nueva
          <%
              }else if (session != null) {
          %>
          La Sesion NO es nueva
          <% } %>
          <a href="index.html">Regresar al Inicio</a>
    </body>
</html>
