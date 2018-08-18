<%-- 
    Document   : nota
    Created on : 30/08/2017, 21:50:11
    Author     : alunoces
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%
    String nome = request.getParameter("nome");
    float n1 = Float.parseFloat(request.getParameter("n1"));
    float n2 = Float.parseFloat(request.getParameter("n2"));
    float n3 = Float.parseFloat(request.getParameter("n3"));
    float nota = n1 + n2 + n3;
    float media = nota / 3;
    String resultado = "Prova Final!";
    
    if (media > 7)
        resultado = "Aprovado!";
    else if (media <= 4)
        resultado = "Reprovado!";
%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h3>Resultado</h3>
        <p>Prezado <%= nome %>,</p>
        <p>Sua média total é: <%= media %>.</p>
        <p>Sua situação é: <%= resultado %>.</p>
    </body>
</html>
