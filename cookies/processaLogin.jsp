<%

    String u = request.getParameter("pUser");
    String s = request.getParameter("pSenha");
    if ((u.equals("giuliano")) && (s.equals("123456")))
    {
        Cookie c1 = new Cookie("usuario", u);
        c1.setMaxAge(60 * 60 * 24 * 30);
        response.addCookie(c1);
        
        response.sendRedirect("BemVindo.jsp");
    }
%>