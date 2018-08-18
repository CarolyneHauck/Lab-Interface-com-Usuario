package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class erroLogin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/cabecalho.jsp");
    _jspx_dependants.add("/rodape.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    Throwable exception = org.apache.jasper.runtime.JspRuntimeLibrary.getThrowable(request);
    if (exception != null) {
      response.setStatus((Integer)request.getAttribute("javax.servlet.error.status_code"));
    }
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

      out.write('\n');
      out.write('\n');
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Instituição X</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <center><h1>Instituição X</h1></center>\n");
      out.write("        <p>Rua A - 120, Centro, Juiz de Fora - MG</p>\n");
      out.write("        <p>Missão: Formar alunos.</p>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>");
      out.write("\n");
      out.write("        <h1 align=\"center\">Atenção</h1>\n");
      out.write("        <p>\n");
      out.write("        <center><font color=\"red\" face =\"Tahoma \"><b> Login ou Senha incorretos!!!</b></font></center>    \n");
      out.write("\n");
      out.write("\n");
      out.write("        <div style=\"position: fixed; bottom: 30px; width: 33%;\"><center><a href=\"Historico.jsp\">histórico</a></center></div>\n");
      out.write("        <div style=\"position: fixed; bottom: 30px; left: 33%; width: 33%;\"><center><a href=\"Estrutura.jsp\">Estrutura</a></center></div>\n");
      out.write("        <div style=\"position: fixed; bottom: 30px; left: 77%; idth: 33%;\"><center><a href=\"FaleConosco.jsp\">Fale Conosco</a></center></div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write('\n');
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
