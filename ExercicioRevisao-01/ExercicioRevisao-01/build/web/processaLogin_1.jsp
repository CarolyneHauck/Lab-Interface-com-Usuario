<%

    String login = request.getParameter("login");
    String senha = request.getParameter("senha");
    if ((login.equals("geovane")) && (senha.equals("123456")))
    {
        session.setAttribute("usuario", login);
        
        
        response.sendRedirect("BemVindo.jsp");
    }
    else
    {
       response.sendRedirect("erroLogin.jsp");
    }
%>