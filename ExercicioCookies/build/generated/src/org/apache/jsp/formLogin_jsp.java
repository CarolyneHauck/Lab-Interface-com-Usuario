package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class formLogin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Formulário de autentcação</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <center>\n");
      out.write("        <h3>Autenticação de Usuário via Cookie</h3>\n");
      out.write("        <p>\n");
      out.write("        <form action=\"processaLogin.jsp\">\n");
      out.write("            Login: <input type=\"text\" size=\"30\" name=\"pUser\"><p>\n");
      out.write("            Senha: <input type=\"password\" size=\"30\" name=\"pSenha\"><p>\n");
      out.write("            <input type=\"submit\" value=\"Efetuar Login\">\n");
      out.write("            <input type=\"reset\" value=\"Cancelar\">\n");
      out.write("        </form>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <h3>Autenticação de Usuário via Sessão e Servlet</h3>\n");
      out.write("        <p>\n");
      out.write("        <form action=\"Login\">\n");
      out.write("            Login: <input type=\"text\" size=\"30\" name=\"pUser\"><p>\n");
      out.write("            Senha: <input type=\"password\" size=\"30\" name=\"pSenha\"><p>\n");
      out.write("            <input type=\"submit\" value=\"Efetuar Login\">\n");
      out.write("            <input type=\"reset\" value=\"Cancelar\">\n");
      out.write("        </form>\n");
      out.write("    </center>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
