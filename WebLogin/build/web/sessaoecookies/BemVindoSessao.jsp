<%-- 
    Document   : BemVindo
    Created on : 22/03/2017, 22:03:34
    Author     : professor
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="usuario" scope="session" class="beans.Usuario" />
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Página do Usuário</title>
    </head>
    <body>        
        <center>
            Bem-vindo Usuário <b><jsp:getProperty name="usuario" property="nome" /></b>            
        <p>
        <h2>Seu login foi: <jsp:getProperty name="usuario" property="login" /></h2>     
        </center>
    </body>
</html>
