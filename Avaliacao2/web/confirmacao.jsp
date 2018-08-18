<%-- 
    Document   : Confirmacao
    Created on : 29/11/2017, 19:07:10
    Author     : alunoces
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>



<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <center>
        <h1>Seu cadastro foi efetivado com êxito</h1>
        <p>
            Usuário: <%= session.getAttribute("user")%><BR><BR>
            Data Nascimento: <%= session.getAttribute("mes")%> / <%= session.getAttribute("ano")%><BR><BR>
            E-mail: <%= session.getAttribute("email")%><BR><BR>
            Avatar: <%= session.getAttribute("arquivo")%>
            <img width="200px" height="200px" src="<%= session.getAttribute("arquivo")%>" />
        </center>
    </body>
</html>
