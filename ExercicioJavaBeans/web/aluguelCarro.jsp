<%-- 
    Document   : aluguelCarro
    Created on : 06/04/2017, 19:03:18
    Author     : professor
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:useBean id="meuCarro" scope="session" class="beans.Carro" />
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <center>    
        <h3>Aluguel de carro</h3>
        <p>
        <font face="Verdana" size="2">    
        <font color="#000080"><b>            
            Carro: <jsp:getProperty name="meuCarro" property="nome" /><p>    
            Placa: <jsp:getProperty name="meuCarro" property="placa" /><p>    
            Valor da diária: <jsp:getProperty name="meuCarro" property="valorDiaria" /><p>
        </font></b>
        <p>
        <form action="processaCarro" method="get">
            Quantos dias a serem locados? <input type="text" name="vDias" value="" size="10" /><p>
            <input type="hidden" name="opcao" value="2" />
            <input type="submit" value="Alugar" />
            <input type="reset" value="Cancelar" />
        </form>
        </font>
    </center>    
    </body>
</html>
