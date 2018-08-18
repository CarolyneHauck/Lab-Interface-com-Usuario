<%-- 
    Document   : processaCalculo
    Created on : 23/08/2017, 21:52:23
    Author     : professor
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
        <%
            String v1 = request.getParameter("valorA");
            int b = Integer.parseInt(request.getParameter("valorB"));
            
            int a = Integer.parseInt(v1);
        
            int soma = a + b;                        
        %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h3>Resultado do cálculo</h3>
        <p>
           A soma calculada = <%= soma %>
    </body>
</html>
