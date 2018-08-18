<%-- 
    Document   : PaginaErros
    Created on : 08/03/2017, 23:01:37
    Author     : professor
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page isErrorPage="true" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <center>
        <h1>Página de erro</h1>
        <p>
            <b><font size='3' color='red'>Houve um erro de conversão do número<p>
                <%= exception %>
                
                
                </font></b>
    </body>
</html>
