package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/tmpl/header.jsp");
    _jspx_dependants.add("/tmpl/footer.jsp");
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

      out.write("<!-- AUTORES: LUIZ FELIPPE AUGUSTO GOMES E LUIZ GUILHERME RODRIGUES -->\n");
      out.write("<!-- AUTORES: LUIZ FELIPPE AUGUSTO GOMES E LUIZ GUILHERME RODRIGUES -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\" />\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("        <title>Info Nerd</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"style/style.css\" />\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        <header class=\"main-header\">\n");
      out.write("        \t<img src=\"img/infonerd.png\" />\n");
      out.write("            <nav>\n");
      out.write("            \t<ul>\n");
      out.write("                    <li><a href=\"home.jsp\">Home</a></li>\n");
      out.write("                    <li><a href=\"noticias.jsp\">Notícias</a></li>\n");
      out.write("                    <li><a href=\"criarAcervo\">Acervo</a></li>\n");
      out.write("                    <li><a href=\"cadastro.jsp\">Cadastro</a></li>\n");
      out.write("                    <li><a href=\"faleconosco.jsp\">Fale Conosco</a></li>\n");
      out.write("                    <li><a href=\"desenvolvedores.jsp\">Desenvolvedores</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </nav>\n");
      out.write("        </header>\n");
      out.write("        <div class=\"main-content\">\n");
      out.write("            <div class=\"content\">");
      out.write("\n");
      out.write("\n");
      out.write("<article class=\"top-content\">\n");
      out.write("    <header>\n");
      out.write("        <h1>Seja bem vindo(a)!</h1>\n");
      out.write("    </header>\n");
      out.write("    <footer>\n");
      out.write("        Desenvolvido por Luiz Felippe Gomes e Luiz Guilherme Rodrigues\n");
      out.write("    </footer>\n");
      out.write("    <p>A Info Nerd &reg; é uma loja voltada apenas para o console Super Nintendo. O motivo de toda esta dedicação se deve pelo fato de este super videogame ter feito parte da infância de muitas pessoas, inclusive dos criadores da loja.</p>\n");
      out.write("    <p>Sua trilha sonora para a época foi um marco, bem como seus jogos de forma geral, os quais continham gráficos super amigáveis e uma jogabilidade incrível. Jogos como Super Mario World, a série Mortal Kombat e Donkey Kong são marcos e fazem sucesso até hoje!</p>\n");
      out.write("    <p>Pelo site você pode conferir nossos produtos em estoque no momento, tendo em vista que o site é atualizado diariamente. Você também pode entrar em contato através do <a class=\"home\" href=\"faleconosco.jsp\">Fale Conosco</a> se julgar necessário, \n");
      out.write("    e pode automatizar sua filiação fazendo seu <a class=\"home\" href=\"cadastro.jsp\">Cadastro</a>.</p>\n");
      out.write("\t<p>Aproveite!</p>\n");
      out.write("\t<p><a class=\"home\" href=\"index.jsp\">Retornar à página de boas vindas</a></p>\n");
      out.write("</article>\n");
      out.write("\n");
      out.write("<!-- AUTORES: LUIZ FELIPPE AUGUSTO GOMES E LUIZ GUILHERME RODRIGUES -->\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("         <aside class=\"top-bar\">\n");
      out.write("        \t<article>\n");
      out.write("            \t<h1>Snesot</h1>\n");
      out.write("            \t<a href=\"http://www.snesot.com\" target=\"_blank\"><img src=\"img/snesot.png\"></a>\n");
      out.write("                <p>Participe de campeonatos online de Super Nintendo na SNESOT.</p>\n");
      out.write("            </article>\n");
      out.write("        </aside>\n");
      out.write("        \n");
      out.write("        <aside class=\"bottom-bar\">\n");
      out.write("        \t<article>\n");
      out.write("            \t<h1>Coolrom</h1>\n");
      out.write("                <p>Faça downloads de suas ROMS de Super Nintendo na Coolrom <a class=\"home\" href=\"http://www.coolrom.com\" target=\"_blank\">clicando aqui</a>.</p>\n");
      out.write("            </article>\n");
      out.write("        </aside>\n");
      out.write("        \n");
      out.write("        <footer class=\"main-footer\">\n");
      out.write("        \t<p>Luiz Felippe Gomes | Luiz Guilherme Rodrigues &copy;</p>\n");
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
