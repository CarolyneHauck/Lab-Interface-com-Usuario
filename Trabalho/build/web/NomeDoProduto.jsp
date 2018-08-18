<!-- Igor de Oliveira Ferreira | Geovane Alberto de Paula Neto -->
<%@include file="header.jsp" %>
<article class="top-content">
    <header>
        <h1>Detalhes do Produto</h1>
    </header>
    <footer>Avalie o detalhamento do produto</footer>
    <c:choose>
    	<c:when test="${produto ne null}">
            <div class="product-details">
                <img src="img/<c:out value="${produto.imagem}" />" />
                <div class="informations">
                    <p><strong>Nome:</strong> <c:out value="${produto.descricao}" /></p>
                    <p><strong>Preço:</strong> <c:out value="${produto.preco}" /></p>
                    <p><strong>Quantidade em estoque:</strong> <c:out value="${produto.estoque}" /></p> 
                </div>
            </div>
            <div class="form-btn">
                <a href="acervo.jsp">Voltar</a>
            </div>
    	</c:when>
    	<c:otherwise>
            <p class="access-denied">Acesso negado! Requisição incorreta da página!</p>
    	</c:otherwise>
    </c:choose>
</article>
<%@include file="footer.jsp" %>