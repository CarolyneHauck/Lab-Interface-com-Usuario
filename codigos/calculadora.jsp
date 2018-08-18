<%-- 
    Document   : calculadora.jsp
    Created on : 23/08/2017, 21:52:08
    Author     : professor
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h3>Bem-vindo a Calculadora!</h1>
        <p>
        <form action="processaCalculo.jsp" method="get">
            Valor A: <input type="text" name="valorA" size="15" /><p>
            Valor B: <input type="text" name="valorB" size="15" /><p>
            <input type="submit" value="Calcular" /> <input type="reset" value="Limpar" />    
        </form>
    </body>
</html>
