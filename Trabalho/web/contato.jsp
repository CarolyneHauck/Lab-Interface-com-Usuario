<!-- Igor de Oliveira Ferreira | Geovane Alberto de Paula Neto -->
<%@include file="header.jsp" %>
<article class="top-content">
    <header>
        <h1>Contato</h1>
    </header>
    <footer>Confirmação de Contato! Em breve retornaremos!</footer>
    <div class="informations">
        <p><strong>E-mail: </strong><%= request.getParameter("email") %></p>
        <p><strong>Assunto: </strong><%= request.getParameter("assunto") %></p>
    	<p><strong>Mensagem: </strong><%= request.getParameter("mensagem") %></p>
    </div>
    <div class="form-btn">
    	<input type="button" value="Voltar" onclick="javascript:history.back(1);" />
    </div>
</article>
<%@include file="footer.jsp" %>
