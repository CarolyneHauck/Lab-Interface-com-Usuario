<%-- 
    Document   : formProduto
    Created on : 04/10/2017, 22:07:39
    Author     : Arthur
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:useBean id="prod" scope="page" class="beans.Produto" />
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <center>
                <font size="2" face="Tahoma">
            <h3>Cadastro de Produto</h3>
            <p>
            <table border="0" celspacing="5" cellpadding="10">
            <form action="ServletProduto">
                <tr><td align="right">Codigo:</td><td><input type="text" size="10" name="codigo" /></td></tr>
                <tr><td align="right">Nome:</td><td><input type="text" size="30" name="nome" /></td></tr>
                <tr><td align="right">Fornecedor:</td><td><input type="text" size="20" name="fornecedor" /></td></tr>
                <tr><td align="right">Tipo:</td><td><select name="tipo"> 
                    <option value="alimento">Alimento</option>
                    <option value="cosmetico">Cosmetico</option>
                    <option value="eletronico">Eletronico</option>
                    <option value="vestuario">Vestuario</option>
                </select></td></tr>
                <input type="hidden" value="1" name="opcao" />
                <tr><td align="right">Preço Unitário:</td><td><input type="text" size="8" name="preco" /></td></tr>
                <tr><td>Data Validade:</td><td><input type="text" size="12" name="datavalidade" /></td></tr>

                <tr><td><input type="submit" value="Cadastrar" /></td><td align="right"><input type="reset" value="limpar"></td></tr>
            </form>
    </body>
</html>
