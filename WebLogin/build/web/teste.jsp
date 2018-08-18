<%-- 
    Document   : teste
    Created on : 23/02/2017, 20:45:24
    Author     : professor
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    int a = 20;
    float b = a * 1.56f;
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Teste de JSP</h1>
        <p>
        <font size="3" face="Verdana" color="red"><% out.println("Meu texto do java"); %></font> 
        <p>
            <%
                if(Math.random() < 0.5)
                {
            %>
            Hoje vai <b> fazer sol</b>
             <%
                }
                else
                {
                %>
                Hoje vai <b> chover</b>
            <%
                }
            %>
    </body>
</html>
