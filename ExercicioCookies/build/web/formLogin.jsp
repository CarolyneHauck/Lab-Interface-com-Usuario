<%-- 
    Document   : formLogin
    Created on : 22/03/2017, 22:07:47
    Author     : iguin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Formulário de autentcação</title>
    </head>
    <body>
    <center>
        <h3>Autenticação de Usuário via Cookie</h3>
        <p>
        <form action="processaLogin.jsp">
            Login: <input type="text" size="30" name="pUser"><p>
            Senha: <input type="password" size="30" name="pSenha"><p>
            <input type="submit" value="Efetuar Login">
            <input type="reset" value="Cancelar">
        </form>
        <br>
        <br>
        <h3>Autenticação de Usuário via Sessão e Servlet</h3>
        <p>
        <form action="Login">
            Login: <input type="text" size="30" name="pUser"><p>
            Senha: <input type="password" size="30" name="pSenha"><p>
            <input type="submit" value="Efetuar Login">
            <input type="reset" value="Cancelar">
        </form>
    </center>
    </body>
</html>
