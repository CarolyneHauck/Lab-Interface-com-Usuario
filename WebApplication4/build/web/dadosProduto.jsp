<%-- 
    Document   : dadosProduto
    Created on : 05/10/2017, 22:05:29
    Author     : Arthur
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:useBean id="prod" scope="session" class="beans.Produto" />
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Dados do Produto</h1>
        <p>
            Codigo: <b><jsp:getProperty name="prod" property="codigo" /></b><br><br>
            Nome: <b><jsp:getProperty name="prod" property="nome" /></b><br><br>
            Fornecedor: <b><jsp:getProperty name="prod" property="fornecedor" /></b><br><br>
            Tipo: <b><jsp:getProperty name="prod" property="tipo" /></b><br><br>
            Preço Unitário: <b><jsp:getProperty name="prod" property="preco" /></b><br><br>
            Data de Validade: <b><jsp:getProperty name="prod" property="datavalidade" /></b><br><br>
    </body>
</html>
