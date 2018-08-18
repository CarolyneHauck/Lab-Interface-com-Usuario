<%

    String u = request.getParameter("pUser");
    String s = request.getParameter("pSenha");
    if ((u.equals("giuliano")) && (s.equals("123456")))
    {
        session.setAttribute("usuario", u);
        session.setAttribute("nome", "Giuliano Prado"); 
        
        //int a = Integer.parseInt(session.getAttribute("idade").toString());
        
        
        response.sendRedirect("BemVindoSessao.jsp");
    }
%>