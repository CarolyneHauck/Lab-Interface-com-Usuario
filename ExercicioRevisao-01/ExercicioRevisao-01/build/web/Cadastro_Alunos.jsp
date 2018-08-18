
<%@include file="cabecalho.jsp"  %>
<form method="get" action="Alunos.jsp">
    <p>Nome: <input type="text" name="nome"></p>
    <p>Endereço: <input type="text" name="endereco"></p>
    <p>Telefone: <input type="text" name="telefone"></p>
    <p>Data Nascimento: <input type="text" name="dataNascimento"></p>
    <p>Curso: <input type="text" name="curso"></p>
    <p>Período: 
        <select size="1" name="periodo">
            <option>1º Período</option>
            <option>2º Período</option>
            <option>3º Período</option>
            <option>4º Período</option>
            <option>5º Período</option>
            <option>6º Período</option>
            <option>7º Período</option>
            <option>8º Período</option>
        </select>
    </p>
    <p>Estado Civíl: 
        <input type="radio" name="estadoCivil">Solteiro 
        <input type="radio" name="estadoCivil">Casado 
        <input type="radio" name="estadoCivil">Viúvo 
        <input type="radio" name="estadoCivil">Divorciado
    </p>
    <p>E-mail: <input type="text" name="email"></p>
    <p>Login: <input type="text" name="login"></p>
    <p>Senha: <input type="text" name="senha"></p>
    <p><input type="submit" value="Cadastrar Aluno"></p>
</form>
<%@include file="rodape.jsp"  %>