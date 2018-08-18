package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class projeto_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/footer.jsp");
  }

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
      response.setContentType("text/html");
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
      out.write("        <meta charset=\"utf-8\" />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("        <title>Byte Shop</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"style/style.css\" />\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <header class=\"main-header\">\n");
      out.write("            <img src=\"img/logo.png\" />\n");
      out.write("            <nav>\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"home.jsp\">Home</a></li>\n");
      out.write("                    <li><a href=\"noticias.jsp\">Notícias</a></li>\n");
      out.write("                    <li><a href=\"criarAcervo\">Acervo</a></li>\n");
      out.write("                    <li><a href=\"cadastro.jsp\">Cadastro</a></li>\n");
      out.write("                    <li><a href=\"faleconosco.jsp\">Fale Conosco</a></li>\n");
      out.write("                    <li><a href=\"projeto.jsp\">Projeto do Site</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </nav>\n");
      out.write("        </header>\n");
      out.write("        <div class=\"main-content\">\n");
      out.write("            <div class=\"content\">");
      out.write("\n");
      out.write("<article class=\"top-content\">\n");
      out.write("    <header>\n");
      out.write("        <h1>Projeto do Site</h1>\n");
      out.write("    </header>\n");
      out.write("    <footer>\n");
      out.write("    \tSaiba mais sobre o nosso projeto!\n");
      out.write("    </footer>\n");
      out.write("    <div class=\"project\">\n");
      out.write("        <h3>POLÍTICAS DO SITE</h3>\n");
      out.write("    \t<div class=\"informations\">\n");
      out.write("            <p><strong>1) Oferta e Preço</strong></p>\n");
      out.write("            <p>As ofertas somente serão válidas quando disponibilizadas por escrito no site durante o prazo indicado ou, caso não seja mencionado o prazo, enquanto detivermos a mercadoria disponível em estoque.\n");
      out.write("            O preço do produto, prazos e condições de pagamento são estabelecidos no ato da contratação.</p>\n");
      out.write("    \t</div>\n");
      out.write("        <div class=\"informations\">\n");
      out.write("            <p><strong>2) Assistência Técnica do Fabricante</strong></p>\n");
      out.write("            <p>Nos casos que a Byte Shop indicar a assistência técnica autorizada para reparo/conserto, o cliente deverá acionar a mesma, garantindo assim um célere e eficaz atendimento, vez que esta empresa não detém de autorização de conserto para determinados produtos.\n");
      out.write("            A mercadoria deverá ser enviada para as assistências autorizadas com a nota fiscal de compra, na embalagem original, com todos acessórios (cabos, manuais, cds e etc.) que acompanham o produto.</p>\n");
      out.write("    \t</div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"project\">\n");
      out.write("        <h3>DESENVOLVEDORES</h3>\n");
      out.write("    \t<div class=\"informations\">\n");
      out.write("            <p><strong>Nome: </strong>Igor de Oliveira Ferreira</p>\n");
      out.write("            <p><strong>Idade: </strong>24</p>\n");
      out.write("            <p><strong>Formação: </strong>Técnico de Informática | Engenheiro de Software</p>\n");
      out.write("            <p><strong>Instituição: </strong>Colégio Politécnico Pio XII | Centro de Ensino Superior de Juiz de Fora - CES-JF</p>\n");
      out.write("    \t</div>\n");
      out.write("        <div class=\"informations\">\n");
      out.write("            <p><strong>Nome:</strong> Geovane Alberto de Paula Neto</p>\n");
      out.write("            <p><strong>Idade: </strong>24</p>\n");
      out.write("            <p><strong>Formação: </strong>Técnico de Informática | Engenheiro de Software</p>\n");
      out.write("            <p><strong>Instituição: </strong>Colégio Politécnico Pio XII | Centro de Ensino Superior de Juiz de Fora - CES-JF</p>\n");
      out.write("    \t</div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"project\">\n");
      out.write("        <h3>TECNOLOGIAS UTILIZADAS</h3>\n");
      out.write("    \t<div class=\"informations\">\n");
      out.write("            <p><strong>JAVA</strong></p>\n");
      out.write("            <p><strong>CSS</strong></p>\n");
      out.write("    \t</div>\n");
      out.write("    </div>\n");
      out.write("</article>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <footer class=\"main-footer\">\n");
      out.write("        \t<p>Byte Shop | 2017</p>\n");
      out.write("        </footer>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
