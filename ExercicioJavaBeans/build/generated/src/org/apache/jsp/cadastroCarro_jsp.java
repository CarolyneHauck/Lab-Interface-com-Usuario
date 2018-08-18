package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cadastroCarro_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <center>\n");
      out.write("        <font face=\"Verdana\" size=\"2\"><b>\n");
      out.write("        <h3>Faça o cadastro de seu Carro</h3>\n");
      out.write("        <p><p>&nbsp;\n");
      out.write("        <form action=\"processaCarro\" method=\"get\">\n");
      out.write("            Placa: <input type=\"text\" name=\"vPlaca\" size=\"10\"/><p>\n");
      out.write("            Nome: <input type=\"text\" name=\"vNome\" size=\"30\"/><p>\n");
      out.write("            Modelo: <select name=\"vModelo\">\n");
      out.write("                <option value=\"GM\">Chevrolet</option>\n");
      out.write("                <option value=\"Citroen\">Citroen</option>\n");
      out.write("                <option value=\"Fiat\">Fiat</option>\n");
      out.write("                <option value=\"Ford\">Ford</option>\n");
      out.write("                <option value=\"VW\">Volkswagen</option>                                \n");
      out.write("                    </select><p>\n");
      out.write("            Preço: <input type=\"text\" name=\"vPreco\" size=\"10\"/><p>    \n");
      out.write("            Valor da diária: <input type=\"text\" name=\"vDiaria\" size=\"10\"/><p>    \n");
      out.write("            Nº de dias de locação: <input type=\"text\" name=\"vDias\" size=5/><p>\n");
      out.write("            <input type=\"hidden\" name=\"opcao\" value=\"1\" />            \n");
      out.write("            <input type=\"submit\" value=\"Cadastrar\" />\n");
      out.write("            <input type=\"reset\" value=\"Cancelar\" />\n");
      out.write("        </form>\n");
      out.write("        </b></font>\n");
      out.write("    </center>    \n");
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
