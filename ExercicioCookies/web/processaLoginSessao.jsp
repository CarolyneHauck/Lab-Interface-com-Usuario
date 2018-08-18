<%

    String u = request.getParameter("pUser");
    String s = request.getParameter("pSenha");
    if ((u.equals("igor")) && (s.equals("123456")))
    {
        session.setAttribute("usuario", u);
        session.setAttribute("nome", "papagaio");
        
        response.sendRedirect("BemVindoSessao.jsp");
    }
    else
    {
        response.sendRedirect("erroLogin.html");
    }
%>