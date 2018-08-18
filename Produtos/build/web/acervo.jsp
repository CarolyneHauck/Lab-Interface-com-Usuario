<!-- AUTORES: LUIZ FELIPPE AUGUSTO GOMES E LUIZ GUILHERME RODRIGUES -->
<%@include file="tmpl/header.jsp" %>
<article class="top-content">
    <header>
        <h1>Acervo</h1>
    </header>
    <footer>
        Nossos produtos são relíquias, e estão cada vez mais míticos! Confira!
    </footer>
    <c:choose>
    	<c:when test="${produtos ne null}">
    		<ul class="products">
		        <c:forEach var="produto" items="${produtos}">
		            <li>
		                <a href="detalharProduto?id=<c:out value="${produto.id}" />">
		                    <p><c:out value="${produto.nome}" /></p>
		                    <img src="img/<c:out value="${produto.imagem}" />" />
		                </a>
		            </li>
		        </c:forEach>
		    </ul>
    	</c:when>
    	<c:otherwise>
    		<p class="access-denied">Acesso negado. Não há dados a serem exibidos</p>
    	</c:otherwise>
    </c:choose>
</article>
<%@include file="tmpl/footer.jsp" %>