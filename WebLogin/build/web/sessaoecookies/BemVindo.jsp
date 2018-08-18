<%-- 
    Document   : BemVindo
    Created on : 22/03/2017, 22:03:34
    Author     : professor
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Página do Usuário</title>
    </head>
    <body>        
        <%
            Cookie cookies[] = request.getCookies();
            Cookie cookie = null;
            if (cookies != null) {
                int tamanho = cookies.length;
                for (int i = 0; i < tamanho; i++) {
                      cookie = cookies[i];
                    if (cookie.getName().equals("usuario")) {
                        break;
                    }
                }
            }
        %>
        <center>
        <h3>Bem-vindo Usuário!</h3>
        <p>
        <h2>Seu login foi: <%= cookie.getValue()%></h2>    
        </center>
    </body>
</html>
