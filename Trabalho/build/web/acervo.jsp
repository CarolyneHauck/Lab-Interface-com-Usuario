<!-- Igor de Oliveira Ferreira | Geovane Alberto de Paula Neto -->
<%@include file="header.jsp" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<article class="top-content">
    <header>
        <h1>Acervo</h1>
    </header>
    <footer>
        Confira nosso portfólio de produtos!
    </footer>
    <c:choose>
    	<c:when test="${produtos ne null}">
            <ul class="products">
                <c:forEach var="produto" items="${produtos}">
                    <li>
                        <a href="detalharProduto?id=<c:out value="${produto.id}" />">
                            <p><c:out value="${produto.descricao}" /></p>
                            <img src="img/<c:out value="${produto.imagem}" />" />
                        </a>
                    </li>
                </c:forEach>
            </ul>
    	</c:when>
    	<c:otherwise>
            <p class="access-denied">Acesso negado! Requisição incorreta da página!</p>
    	</c:otherwise>
    </c:choose>
</article>
<%@include file="footer.jsp" %>