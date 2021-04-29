<%@page errorPage="manejoerroresJSP.jsp"%>
<%@page import="utileria.Conversiones, java.util.Date" %>
<%@page contentType="application/vmd.ms-excel" %>
<%
    String nombreArchivo = "reporte.xls";
    response.setHeader("Content-Disposition", "inline;filename=" + nombreArchivo);
%>    
<!DOCTYPE html>
<html>
    <head>
        <title>Reporte de Excel</title> 
    </head>
    <body>
        <h1>Reporte de Excel</h1>
        <br/>
        <table border="1">
            <tr>
                <th>Curso</th>
                <th>Descripcion</th>
                <th>Fecha</th>
            </tr>
            <tr>
                <th>1. Fundamentos de Java</th>
                <th>Aprendemos sintaxis basica de Java</th>
                <th><%= Conversiones.format("500")%></th>
            </tr>
            <tr>
                <th>2. Programación de Java</th>
                <th>Pondremos en practica conceptos de la programación orientada a Objetos</th>
                <th><%= Conversiones.format(new Date())%></th>
            </tr>
        </table>
    </body>
</html>
