<%-- 
    Document   : formAluno
    Created on : 02/03/2017, 20:49:52
    Author     : professor
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Formulário de notas do aluno</title>
    </head>
    <body>
        <center>
        <h2>Cálculo da média final do aluno</h2>
        <p>
        <form action="processaAluno.jsp" method="get">
            Nome: <input type="text" name="pNome" size="50"><p>    
            Nota 1: <input type="text" name="pNota1" size="5"><p>    
            Nota 2: <input type="text" name="pNota2" size="5"><p>
            Nota 3: <input type="text" name="pNota3" size="5"><p>    
            <p>
                <input type="submit" value="Calcular">
                <input type="reset" value="Cancelar">
        </form>
        </center>
    </body>
</html>
