<%-- 
    Document   : paginaJsp1
    Created on : 18/08/2016, 20:58:47
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
        <h1>Recuperação de dados</h1>
        <p>
        <% String str = request.getParameter("titulo"); %>    
            Valor recuperado = <%= str %>       <%-- exibição do resultado --%>      
    </body>
</html>
