<%-- 
    Document   : BemVindo
    Created on : 22/03/2017, 22:03:34
    Author     : iguin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Página do Usuário</title>
    </head>
    <body>
        <center>
            <h3>Bem-vindo Usuário!</h3>
            <%
                Cookie cookies[] = request.getCookies();

                if (cookies != null)
                {
                    int tamanho = cookies.length;
                    for (int i = 0; i < tamanho; i++)
                    {
                          Cookie cookie = cookies[i];
                        if (cookie.getName().equals("usuario"))
                        {
                            out.println(cookie.getValue());
                        }
                    }
                }
            %>
        </center>
    </body>
</html>
