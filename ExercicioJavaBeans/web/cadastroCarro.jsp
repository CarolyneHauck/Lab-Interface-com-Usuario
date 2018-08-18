<%-- 
    Document   : cadastroCarro
    Created on : 06/04/2017, 18:58:37
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
    <center>
        <font face="Verdana" size="2"><b>
        <h3>Faça o cadastro de seu Carro</h3>
        <p><p>&nbsp;
        <form action="processaCarro" method="get">
            Placa: <input type="text" name="vPlaca" size="10"/><p>
            Nome: <input type="text" name="vNome" size="30"/><p>
            Modelo: <select name="vModelo">
                <option value="GM">Chevrolet</option>
                <option value="Citroen">Citroen</option>
                <option value="Fiat">Fiat</option>
                <option value="Ford">Ford</option>
                <option value="VW">Volkswagen</option>                                
                    </select><p>
            Preço: <input type="text" name="vPreco" size="10"/><p>    
            Valor da diária: <input type="text" name="vDiaria" size="10"/><p>    
            <input type="hidden" name="opcao" value="1" />            
            <input type="submit" value="Cadastrar" />
            <input type="reset" value="Cancelar" />
        </form>
        </b></font>
    </center>    
    </body>
</html>
