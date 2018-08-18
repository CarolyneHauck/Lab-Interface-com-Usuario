<%-- 
    Document   : BemVindo
    Created on : 22/03/2017, 22:03:34
    Author     : iguin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Página do Usuário</title>
    </head>
    <body>
        <center>
            <h3>Bem-vindo Usuário!</h3>
            <p>
                Bem-vindo usuário <%= session.getAttribute("nome") %>
                <br>
                Seu login é: <%= session.getAttribute("usuario") %>
            </p>
        </center>
    </body>
</html>