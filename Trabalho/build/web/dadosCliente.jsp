<!-- Igor de Oliveira Ferreira | Geovane Alberto de Paula Neto -->
<%@include file="header.jsp" %>
<article class="top-content">
    <header>
        <h1>Dados do Cliente</h1>
    </header>
    <footer>
    	Confirmação de Cadastro do Cliente! Obrigado por fazer parte desta família!
    </footer>
    <c:choose>
        <c:when test="${cliente ne null}">
            <div class="informations">
                <p><strong>Nome: </strong><c:out value="${cliente.nome}" /></p>
                <p><strong>Rua: </strong><c:out value="${cliente.rua}" /></p>
                <p><strong>Cidade: </strong><c:out value="${cliente.cidade}" /></p>
                <p><strong>Estado: </strong><c:out value="${cliente.estado}" /></p>
                <p><strong>Cep: </strong><c:out value="${cliente.cep}" /></p>
                <p><strong>Telefone residencial: </strong><c:out value="${cliente.telefoneResidencial}" /></p>
                <p><strong>Profissão: </strong><c:out value="${cliente.profissao}" /></p>
                <p><strong>Data de nascimento: </strong><c:out value="${cliente.dataNascimento}" /></p>
                <p><strong>Cpf: </strong><c:out value="${cliente.cpf}" /></p>
                <p><strong>E-mail: </strong><c:out value="${cliente.email}" /></p>
                <p><strong>Estado civil: </strong><c:out value="${cliente.estadoCivil}" /></p>
                <p><strong>Sexo: </strong><c:out value="${cliente.sexo}" /></p>
                <p><strong>Observações: </strong><c:out value="${cliente.observacoes}" /></p>
            </div>
            <div class="form-btn">
                <a href="cadastro.jsp">Voltar</a>
            </div>
        </c:when>
        <c:otherwise>
            <p class="access-denied">Acesso negado! Requisição incorreta da página!</p>
        </c:otherwise>
    </c:choose>
</article>
<%@include file="footer.jsp" %>