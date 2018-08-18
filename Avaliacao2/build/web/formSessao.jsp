<%

    String x = request.getParameter("concordo");
    String u = request.getParameter("user");
    String m = request.getParameter("mes");
    String a = request.getParameter("ano");
    String s = request.getParameter("senha");
    String ss = request.getParameter("senha2");
    String e = request.getParameter("email");
    String av = request.getParameter("arquivo");
    
    if(x.equals("concordo")){
        session.setAttribute("user", u);
        session.setAttribute("mes", m);
        session.setAttribute("ano", a);
        session.setAttribute("senha", s);
        session.setAttribute("senha2", ss);
        session.setAttribute("email", e);
        session.setAttribute("arquivo", av);
        
        response.sendRedirect("confirmacao.jsp");
    }
%>