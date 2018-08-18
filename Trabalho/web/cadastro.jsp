<!-- Igor de Oliveira Ferreira | Geovane Alberto de Paula Neto -->
<%@include file="header.jsp" %>

<article class="top-content">
    <header>
        <h1>Cadastro</h1>
    </header>
    <footer>
        Cadastro de Clientes
    </footer>
    <form action="clienteCadastro" method="post">
        <div class="form-item">
            <label>Nome</label>
            <div>
                <input type="text" name="nome" />
            </div>
        </div>
        <div class="form-item">
            <label>Rua</label>
            <div>
                <input type="text" name="rua" />
            </div>
        </div>
        <div class="form-item">
            <label>Cidade</label>
            <div>
                <input type="text" name="cidade" />
            </div>
        </div>
        <div class="form-item">
            <label>Estado</label>
            <div>
                <input type="text" name="estado" />
            </div>
        </div>
        <div class="form-item">
            <label>CEP</label>
            <div>
                <input type="text" name="cep" />
            </div>
        </div>
        <div class="form-item">
            <label>Telefone Residencial</label>
            <div>
                <input type="text" name="telefoneResidencial" />
            </div>
        </div>
        <div class="form-item">
            <label>Profissão</label>
            <div>
                <input type="text" name="profissao" />
            </div>
        </div>
        <div class="form-item">
            <label>Data de Nascimento</label>
            <div>
                <input type="text" name="dataNascimento" />
            </div>
        </div>
        <div class="form-item">
            <label>CPF</label>
            <div>
                <input type="text" name="cpf" />
            </div>
        </div>
        <div class="form-item">
            <label>E-mail</label>
            <div>
                <input type="text" name="email" />
            </div>
        </div>
        <div class="form-item">
            <label>Estado Civil</label>
            <div>
                <select name="estadoCivil">
                    <option value="Solteiro">Solteiro</option>
                    <option value="Casado">Casado</option>
                </select>
            </div>
        </div>
        <div class="form-item">
            <label>Sexo</label>
            <div>
                <p><input type="radio" name="sexo" value="Masculino"> Masculino</p>
                <p><input type="radio" name="sexo" value="Feminino"> Feminino</p>
            </div>
        </div>
        <div class="form-item">
            <label>Observações</label>
            <div>
                <textarea name="observacoes"></textarea>
            </div>
        </div>
        <div class="form-btn">
            <input type="submit" value="Enviar" />
            <input type="reset" value="Limpar" />
        </div>
    </form>
</article>

<%@include file="footer.jsp" %>