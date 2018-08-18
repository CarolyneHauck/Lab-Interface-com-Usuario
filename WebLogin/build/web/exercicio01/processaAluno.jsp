<%-- 
    Document   : processaAluno
    Created on : 02/03/2017, 20:50:15
    Author     : professor
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    String nome = request.getParameter("pNome");
    float n1 = Float.parseFloat(request.getParameter("pNota1"));
    float n2 = Float.parseFloat(request.getParameter("pNota2"));
    float n3 = Float.parseFloat(request.getParameter("pNota3"));
      
    float media = (n1 + n2 + n3)/3;
      
    String msg = "";
    if(media >= 7)
        msg = "Aprovado!";
    else
        if(media <= 4)
            msg = "Reprovado!";
        else
            msg = "Prova Final!";

%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Demonstrativo de notas</title>
    </head>
    <body>
        <center>
        <h1>Situação do aluno</h1>        
            <p>
            <font face="Verdana" size="3">
                Nome do aluno: <b><%= nome %></b><p>
                Media Final: <font color="red"><b><%= media %></b></font><br>
                Situação: <font size="4" color="blue"><b><%= msg %></b></font><br>
            </font>            
        </center>
    </body>
</html>
