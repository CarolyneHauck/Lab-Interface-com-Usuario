<%-- 
    Document   : BemVindo
    Created on : 08/09/2016, 21:59:05
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
    <center>
        <h2>Bem-vindo usuário!</h2>
        <p>
        Seu login foi:     
        <%
            Cookie cookies [] = request.getCookies();
            if (cookies!= null)
            {
                int tamanho = cookies.length;
                for (int i=0; i<tamanho; i++)
                {
                    Cookie cookie = cookies[i];
                    if (cookie.getName().equals("usuario"))
                            out.println(cookie.getValue());
                }
            }
        %>
    </center>
    </body>
</html>
