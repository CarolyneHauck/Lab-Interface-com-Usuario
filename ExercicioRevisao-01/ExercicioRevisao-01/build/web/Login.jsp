 <%@include file="cabecalho.jsp"  %>
    <center>
        <h3>Autenticação de Usuário</h3>

        <form action="Logar">
            Login: <input type="text" size="30" name="login"><p>
            Senha: <input type="password" size="30" name="senha"><p>
                
            <input type="submit" value="Efetuar Login">
            <input type="reset" value="Cancelar">
        </form>
 <%@include file="rodape.jsp"  %>