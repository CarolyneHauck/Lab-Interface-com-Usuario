
<%@include file="cabecalho.jsp"  %>
<form method="get" action="Alunos.jsp">
    <p>Nome: <input type="text" name="nome"></p>
    <p>Endere�o: <input type="text" name="endereco"></p>
    <p>Telefone: <input type="text" name="telefone"></p>
    <p>Data Nascimento: <input type="text" name="dataNascimento"></p>
    <p>Curso: <input type="text" name="curso"></p>
    <p>Per�odo: 
        <select size="1" name="periodo">
            <option>1� Per�odo</option>
            <option>2� Per�odo</option>
            <option>3� Per�odo</option>
            <option>4� Per�odo</option>
            <option>5� Per�odo</option>
            <option>6� Per�odo</option>
            <option>7� Per�odo</option>
            <option>8� Per�odo</option>
        </select>
    </p>
    <p>Estado Civ�l: 
        <input type="radio" name="estadoCivil">Solteiro 
        <input type="radio" name="estadoCivil">Casado 
        <input type="radio" name="estadoCivil">Vi�vo 
        <input type="radio" name="estadoCivil">Divorciado
    </p>
    <p>E-mail: <input type="text" name="email"></p>
    <p>Login: <input type="text" name="login"></p>
    <p>Senha: <input type="text" name="senha"></p>
    <p><input type="submit" value="Cadastrar Aluno"></p>
</form>
<%@include file="rodape.jsp"  %>