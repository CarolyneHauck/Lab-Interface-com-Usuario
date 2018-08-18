<%-- 
    Document   : paginaJsp1
    Created on : 18/08/2016, 20:58:47
    Author     : professor
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%!
double dobro(double v)
{
 return v * 2;
}
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Pagina de Teste</h1>
        <p>
            Numero sorteado abaixo:
        <p>
        <b>
            <% double val = Math.random() * 100; %>  <%-- processamento --%>
            <hr width="70%">
            Valor sorteado = <%= val %>       <%-- exibição do resultado --%>      
            <p> Dobro do numero = <%= dobro(val) %>
        </b>
    </body>
</html>
