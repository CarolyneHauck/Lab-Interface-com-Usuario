<%-- 
    Document   : exercicio03
    Created on : 08/03/2017, 22:02:51
    Author     : professor
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tabela de depreciação</title>
    </head>
    <body>
        <center>
        <h1>Tabela de depreciação</h1>
        <p>
        <table border="1" cellspacing='5' cellpadding='5' width='50%'>
            <tr>
                <th>Ano</th>
                <th>Depreciação</th>
                <th>Valor no fim do ano</th>
                <th>Depreciação acumulada</th>
            </tr>
            <%
                int ano;
                int depre = 4000;
                int valor = 28000; //request.getParameter("pValor");
                int acumulo = 0;
                
                for(ano=1; ano<=70; ano++)        
                {
                %>
                    <tr align='center'>
                        <td><%= ano %></td>
                        <td><%= depre %></td>
                        <td><%= valor-=depre %></td>
                        <td><%= acumulo+=depre %></td>
                    </tr>    
                <%
                }
                %>
            
            </table>
        
        </center>
    </body>
</html>
