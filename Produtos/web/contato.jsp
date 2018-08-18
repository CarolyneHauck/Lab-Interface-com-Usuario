<!-- AUTORES: LUIZ FELIPPE AUGUSTO GOMES E LUIZ GUILHERME RODRIGUES -->
<%@include file="tmpl/header.jsp" %>
<article class="top-content">
    <header>
        <h1>Contato</h1>
    </header>
    <footer>Dados enviados através do Fale Conosco</footer>
    <div class="informations">
	    <p><strong>Email do remetente:</strong> <%= request.getParameter("emailRemetente") %></p>
	   	<p><strong>Assunto:</strong> <%= request.getParameter("assunto") %></p>
    	<p><strong>Mensagem:</strong> <%= request.getParameter("mensagem") %></p>
    </div>
    <div class="form-btn">
    	<input type="button" value="Voltar" onclick="javascript:history.back(1);" />
    </div>
</article>
<%@include file="tmpl/footer.jsp" %>