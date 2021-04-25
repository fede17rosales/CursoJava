<%-- 
    Document   : index
    Created on : 25 abr. 2021, 20:30:22
    Author     : Federico
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Hola Mundo JSPs</title>
    </head>
    <body>
        <h1>Hola Mundo JSPs</h1>
        <ul>
            <il><% out.print("HolaMundo con Scriptes");%></il>
            <il>${"HolaMundo con Expression Language (EL)"}</il>
            <il><%= "HolaMundo con Scriptes"%></il>
            <il><c:out  value="Hola Mundo con JSPL" /></il>
        </ul>
    </body>
</html>
