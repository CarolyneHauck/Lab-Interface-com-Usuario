<!-- Igor de Oliveira Ferreira | Geovane Alberto de Paula Neto -->
<%@include file="header.jsp" %>

<article class="top-content">
    <header>
        <h1>Fale Conosco</h1>
    </header>
    <footer>
        Espaço reservado para você! Entre em contato e nos dê um feedback à respeito de nossa loja.
    </footer>
    <form action="faleConosco" method="post">
        <div class="form-item">
            <label>E-mail</label>
            <div>
                <input type="text" name="email" />
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

<%@include file="footer.jsp" %>
