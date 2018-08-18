<!-- AUTORES: LUIZ FELIPPE AUGUSTO GOMES E LUIZ GUILHERME RODRIGUES -->
<%@include file="tmpl/header.jsp" %>
<article class="top-content">
    <header>
        <h1>Detalhes do produto</h1>
    </header>
    <footer>Cheque esta relíquia mais de perto!</footer>
    <c:choose>
    	<c:when test="${produto ne null}">
    		<div class="product-details">
		    	<img src="img/<c:out value="${produto.imagem}" />" />
		    	<div class="informations">
		    		<p><strong>Nome:</strong> <c:out value="${produto.nome}" /></p>
		   			<p><strong>Preço:</strong> <c:out value="${produto.preco}" /></p>
		   			<p><strong>Categoria:</strong> <c:out value="${produto.categoria}" /></p>
		   			<p><strong>Quantidade em estoque:</strong> <c:out value="${produto.estoque}" /></p> 
		    	</div>
		    </div>
	    	<div class="form-btn">
	        	<a href="acervo.jsp">Voltar</a>
	        </div>
    	</c:when>
    	<c:otherwise>
    		<p class="access-denied">Acesso negado. Não há dados a serem exibidos</p>
    	</c:otherwise>
    </c:choose>
</article>
<%@include file="tmpl/footer.jsp" %>
