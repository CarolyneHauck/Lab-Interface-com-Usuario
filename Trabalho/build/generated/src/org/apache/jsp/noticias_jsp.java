package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class noticias_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("                    <li><a href=\"desenvolvedores.jsp\">Desenvolvedores</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </nav>\n");
      out.write("        </header>\n");
      out.write("        <div class=\"main-content\">\n");
      out.write("            <div class=\"content\">");
      out.write("\n");
      out.write("<article class=\"top-content\">\n");
      out.write("    <header>\n");
      out.write("        <h1>Notícias</h1>\n");
      out.write("    </header>\n");
      out.write("    <footer>Últimas Notícias</footer>\n");
      out.write("    <div class=\"news\">\n");
      out.write("    \t<h1>Conheça a tecnologia M.2, que permite SSDs até três vezes mais rápidos</h1>\n");
      out.write("    \t<p>Embora os HDs tenham evoluído nos últimos anos, os SSDs continuam sendo a forma mais rápida de se armazenar e ler dados no seu computador. Mesmo que eles sejam consideravelmente mais caros que os HDs por GB de capacidade...</p>\n");
      out.write("    \t<a href=\"https://olhardigital.com.br/noticia/conheca-a-tecnologia-m-2-que-permite-ssds-ate-tres-vezes-mais-rapidos/69684\" target=\"_blank\">Ver mais</a>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"news\">\n");
      out.write("    \t<h1>DDR4: tudo o que você pode esperar da nova geração de memória RAM</h1>\n");
      out.write("    \t<p>Nos últimos anos, publicamos uma enormidade de notícias comentando sobre o futuro das memórias RAM. Em meio a tantas novidades, muitas empresas prometeram que estavam prestes a lançar o padrão DDR4 sendo que faltava...</p>\n");
      out.write("    \t<a href=\"https://www.tecmundo.com.br/memoria-ram/57551-ddr4-tudo-voce-esperar-nova-geracao-memoria-ram.htm\" target=\"_blank\">Ver mais</a>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"news\">\n");
      out.write("    \t<h1>Radeon RX Vega: AMD apresenta novas placas de vídeo com alto desempenho</h1>\n");
      out.write("    \t<p>AMD anunciou no último domingo (30/07) a sua próxima linha de placas de vídeo de alto desempenho, as Radeon RX Vega. Segundo a empresa, essa geração chega ao mercado em agosto desse ano, com dois modelos diferentes capazes...</p>\n");
      out.write("    \t<a href=\"https://www.techtudo.com.br/noticias/2017/07/radeon-rx-vega-amd-apresenta-novas-placas-de-video-com-alto-desempenho.ghtml\" target=\"_blank\">Ver mais</a>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"news\">\n");
      out.write("    \t<h1>AMD revela processador de 32 núcleos para entrar no território da Intel</h1>\n");
      out.write("    \t<p>Com a apresentação da arquitetura Zen e dos processadores Ryzen, a AMD tem se esforçado para voltar a brigar em alto nível com a Intel. Agora, a empresa revelou os novos chips Epyc para pisar em mais um território dominado...</p>\n");
      out.write("    \t<a href=\"https://olhardigital.com.br/noticia/amd-revela-processador-de-32-nucleos-para-entrar-no-territorio-da-intel/69197\" target=\"_blank\">Ver mais</a>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"news\">\n");
      out.write("    \t<h1>Gigabyte anuncia nova linha de placas-mãe Z370 AORUS</h1>\n");
      out.write("    \t<p>De acordo com o anúncio da Gigabyte, as placas desta linha oferecem suporte total para os novos processadores Intel Core de 8ª geração. Elas também estão preparadas para módulos de memória com frequências de até 4133MHz...</p>\n");
      out.write("    \t<a href=\"https://noticias.r7.com/tecnologia-e-ciencia/baboo/gigabyte-anuncia-nova-linha-de-placas-mae-z370-aorus-05102017\" target=\"_blank\">Ver mais</a>\n");
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
