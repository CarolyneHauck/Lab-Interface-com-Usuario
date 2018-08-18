package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class formProduto_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      beans.Produto prod = null;
      synchronized (_jspx_page_context) {
        prod = (beans.Produto) _jspx_page_context.getAttribute("prod", PageContext.PAGE_SCOPE);
        if (prod == null){
          prod = new beans.Produto();
          _jspx_page_context.setAttribute("prod", prod, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <center>\n");
      out.write("                <font size=\"2\" face=\"Tahoma\">\n");
      out.write("            <h3>Cadastro de Produto</h3>\n");
      out.write("            <p>\n");
      out.write("            <table border=\"0\" celspacing=\"5\" cellpadding=\"10\">\n");
      out.write("            <form action=\"ServletProduto\">\n");
      out.write("                <tr><td align=\"right\">Codigo:</td><td><input type=\"text\" size=\"10\" name=\"codigo\" /></td></tr>\n");
      out.write("                <tr><td>Nome:</td><td><input type=\"text\" size=\"30\" name=\"nome\"/></td></tr>\n");
      out.write("                <tr><td align=\"right\">Fornecedor:</td><td><input type=\"text\" size=\"20\" name=\"fornecedor\" /></td></tr>\n");
      out.write("                <tr><td align=\"right\">Tipo:</td><td><select name=\"tipo\"> \n");
      out.write("                    <option value=\"alimento\">Alimento</option>\n");
      out.write("                    <option value=\"cosmetico\">Cosmetico</option>\n");
      out.write("                    <option value=\"eletronico\">Eletronico</option>\n");
      out.write("                    <option value=\"vestuario\">Vestuario</option>\n");
      out.write("                </select></td></tr>\n");
      out.write("                <tr><td align=\"right\">Preço Unitário:</td><td><input type=\"text\" size=\"8\" name=\"preco\" /></td></tr>\n");
      out.write("                <tr><td>Data Validade:</td><td><input type=\"text\" size=\"12\" name=\"datavalidade\" /></td></tr>\n");
      out.write("\n");
      out.write("                <tr><td><input type=\"submit\" value=\"Cadastrar\" /></td><td align=\"right\"><input type=\"reset\" value=\"limpar\"></td></tr>\n");
      out.write("            </form>\n");
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
