
<%@include file="cabecalho.jsp"  %>

<%
    String nome = request.getParameter("nome");
    int numero = (int)(Math.random() * 1000);
    
    Cookie c1 = new Cookie("aluno", nome);
    Cookie c2 = new Cookie("matricula", Integer.toString(numero));
    c1.setMaxAge(60 * 60 * 24 * 30);
    c2.setMaxAge(60 * 60 * 24 * 30);
    response.addCookie(c1);
    response.addCookie(c2);
    
    session.setAttribute("login", request.getParameter("login"));
    session.setAttribute("senha", request.getParameter("senha"));
%>

<center><h1>Aluno Cadstrado com Sucesso!</h1></center>
<p>Nome: <%= request.getParameter("nome") %></p>
<p>Endereço: <%= request.getParameter("endereco") %></p>
<p>Telefone: <%= request.getParameter("telefone") %></p>
<p>Data Nascimento: <%= request.getParameter("dataNascimento") %></p>
<p>Curso: <%= request.getParameter("curso") %></p>
<p>Período: <%= request.getParameter("periodo") %></p>
<p>Estado Civíl: <%= request.getParameter("estadoCivil") %></p>
<p>E-mail: <%= request.getParameter("email") %></p>
<p>Login: <%= request.getParameter("login") %></p>
<br>
<br>
<br>
<center><a href="Login.jsp"> Efetuar login</a></center>
<%@include file="rodape.jsp"  %>