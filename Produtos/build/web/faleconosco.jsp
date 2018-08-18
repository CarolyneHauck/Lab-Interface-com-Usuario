<!-- AUTORES: LUIZ FELIPPE AUGUSTO GOMES E LUIZ GUILHERME RODRIGUES -->
<%@include file="tmpl/header.jsp" %>

<article class="top-content">
    <header>
        <h1>Fale Conosco</h1>
    </header>
    <footer>
         Detalhe suas dúvidas, sugestões, reclamações...
    </footer>
    <form action="faleConosco" method="post">
        <div class="form-item">
            <label>E-mail</label>
            <div>
                <input type="text" name="emailRemetente" />
            </div>
        </div>
        <div class="form-item">
            <label>Assunto</label>
            <div>
                <input type="text" name="assunto" />
            </div>
        </div>
        <div class="form-item">
            <label>Mensagem</label>
            <div>
                <textarea name="mensagem"></textarea>
            </div>
        </div>
        <div class="form-btn">
        	<input type="submit" value="Enviar" />
        	<input type="reset" value="Limpar" />
        </div>
    </form>
</article>

<%@include file="tmpl/footer.jsp" %>
