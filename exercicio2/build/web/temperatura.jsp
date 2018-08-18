<%-- 
    Document   : temperatura
    Created on : 30/08/2017, 22:07:57
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
        <h3>Tabela Temperaturas</h3>
        <br />
        <table align="center" border="1" cellspacing="5" cellpadding="10">
            <tr align="center">
                <th>Fahrenheit</th>
                <th>Celsius</th>
            </tr>
            <%
                float fahrenheit = 0;
                float celsius = (fahrenheit - 30) / 2;
                
                while (celsius <= 60)
                {
            %>
                    <tr align="center">
                        <td><%= fahrenheit %></td>
                        <td><%= celsius %></td>
                    </tr>
            <%
                fahrenheit += 2;
                celsius = (fahrenheit - 30) / 2;
                }
            %>
        </table>
    </body>
</html>
