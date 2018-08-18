<%-- 
    Document   : demonstrativoCarro
    Created on : 06/04/2017, 19:46:59
    Author     : professor
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="meuCarro" scope="session" class="beans.Carro" />
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <center>            
        <font face="Verdana" size="2">
        <h3>Demonstrativo de carro</h3>
        <p>
        <font color="#000080"><b>
            Carro: <jsp:getProperty name="meuCarro" property="nome" /><p>    
            Placa: <jsp:getProperty name="meuCarro" property="placa" /><p>    
            Valor da diária: <jsp:getProperty name="meuCarro" property="valorDiaria" /><p>
            Valor total do aluguel: <%= meuCarro.calcularValorTotal(10) %>     
        </font></b>
     </center>    
    </body>
</html>
