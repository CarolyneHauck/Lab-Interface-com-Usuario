<%-- 
    Document   : Converte
    Created on : 08/03/2017, 23:01:28
    Author     : professor
--%>
<%!
private double toDouble(String value)
{
    return(Double.valueOf(value).doubleValue());
}
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page errorPage="PaginaErros.jsp"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <center>    
        <h1>Conversão de Numeros</h1>
        <p>
        <%
            String numero = request.getParameter("pValor");
            double valor=0;
            if(numero != null && !numero.isEmpty())
            {
                valor = toDouble(numero);
            }
            else
            {
                out.println("<font size='2' color='red'>String não passada!</font>");
            }        
        %>
        
        <b>Valor convertido = <%= valor %></b>        
    </body>
</html>
