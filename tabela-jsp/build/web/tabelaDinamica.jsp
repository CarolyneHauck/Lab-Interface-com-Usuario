<%-- 
    Document   : tabelaDinamica
    Created on : 30/08/2017, 21:25:47
    Author     : alunoces
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body align="center">
        <h3>Tabela Dinâmica</h3>
        <br />
        <table align="center" border="1" cellspacing="5" cellpadding="10">
            <tr align="center">
                <th>Meses</th>
                <th>Valor Mensal</th>
                <th>Acumulado</th>
            </tr>
            <%
                int meses = 24;
                float valor = 1000;
                float soma = 1000;
                
                for(int i = 1; i <= meses; i++)
                {
            %>
                    <tr align="center">
                        <td><%= i %></td>
                        <td><%= valor %></td>
                        <td><%= soma %></td>
                    </tr>
            <%
                valor *= 1.05f;
                soma += valor;
                }
            %>
        </table>
    </body>
</html>
