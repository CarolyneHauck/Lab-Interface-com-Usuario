<!-- AUTORES: LUIZ FELIPPE AUGUSTO GOMES E LUIZ GUILHERME RODRIGUES -->
<%@include file="tmpl/header.jsp" %>
<article class="top-content">
    <header>
        <h1>Dados do cliente</h1>
    </header>
    <footer>
    	Confira seus dados para prosseguir com a navega��o
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
		    	<p><strong>Profiss�o: </strong><c:out value="${cliente.profissao}" /></p>
		    	<p><strong>Data de nascimento: </strong><c:out value="${cliente.dataNascimento}" /></p>
		    	<p><strong>Cpf: </strong><c:out value="${cliente.cpf}" /></p>
		    	<p><strong>E-mail: </strong><c:out value="${cliente.email}" /></p>
		    	<p><strong>Estado civil: </strong><c:out value="${cliente.estadoCivil}" /></p>
		    	<p><strong>Sexo: </strong><c:out value="${cliente.sexo}" /></p>
		    	<p><strong>Observa��es: </strong><c:out value="${cliente.observacoes}" /></p>
		    </div>
		    <div class="form-btn">
	        	<a href="cadastro.jsp">Voltar</a>
	        </div>
	    </c:when>
	    <c:otherwise>
	    	<p class="access-denied">Acesso negado. N�o h� dados a serem exibidos</p>
	    </c:otherwise>
    </c:choose>
</article>
<%@include file="tmpl/footer.jsp" %>