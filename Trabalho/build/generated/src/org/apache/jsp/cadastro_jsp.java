package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cadastro_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!-- Igor de Oliveira Ferreira | Geovane Alberto de Paula Neto -->\n");
      out.write("<!-- Igor de Oliveira Ferreira | Geovane Alberto de Paula Neto -->\n");
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
      out.write("\n");
      out.write("<article class=\"top-content\">\n");
      out.write("    <header>\n");
      out.write("        <h1>Cadastro</h1>\n");
      out.write("    </header>\n");
      out.write("    <footer>\n");
      out.write("        Cadastro de Clientes\n");
      out.write("    </footer>\n");
      out.write("    <form action=\"clienteCadastro\" method=\"post\">\n");
      out.write("        <div class=\"form-item\">\n");
      out.write("            <label>Nome</label>\n");
      out.write("            <div>\n");
      out.write("                <input type=\"text\" name=\"nome\" />\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"form-item\">\n");
      out.write("            <label>Rua</label>\n");
      out.write("            <div>\n");
      out.write("                <input type=\"text\" name=\"rua\" />\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"form-item\">\n");
      out.write("            <label>Cidade</label>\n");
      out.write("            <div>\n");
      out.write("                <input type=\"text\" name=\"cidade\" />\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"form-item\">\n");
      out.write("            <label>Estado</label>\n");
      out.write("            <div>\n");
      out.write("                <input type=\"text\" name=\"estado\" />\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"form-item\">\n");
      out.write("            <label>CEP</label>\n");
      out.write("            <div>\n");
      out.write("                <input type=\"text\" name=\"cep\" />\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"form-item\">\n");
      out.write("            <label>Telefone Residencial</label>\n");
      out.write("            <div>\n");
      out.write("                <input type=\"text\" name=\"telefoneResidencial\" />\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"form-item\">\n");
      out.write("            <label>Profissão</label>\n");
      out.write("            <div>\n");
      out.write("                <input type=\"text\" name=\"profissao\" />\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"form-item\">\n");
      out.write("            <label>Data de Nascimento</label>\n");
      out.write("            <div>\n");
      out.write("                <input type=\"text\" name=\"dataNascimento\" />\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"form-item\">\n");
      out.write("            <label>CPF</label>\n");
      out.write("            <div>\n");
      out.write("                <input type=\"text\" name=\"cpf\" />\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"form-item\">\n");
      out.write("            <label>E-mail</label>\n");
      out.write("            <div>\n");
      out.write("                <input type=\"text\" name=\"email\" />\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"form-item\">\n");
      out.write("            <label>Estado Civil</label>\n");
      out.write("            <div>\n");
      out.write("                <select name=\"estadoCivil\">\n");
      out.write("                    <option value=\"Solteiro\">Solteiro</option>\n");
      out.write("                    <option value=\"Casado\">Casado</option>\n");
      out.write("                </select>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"form-item\">\n");
      out.write("            <label>Sexo</label>\n");
      out.write("            <div>\n");
      out.write("                <p><input type=\"radio\" name=\"sexo\" value=\"Masculino\"> Masculino</p>\n");
      out.write("                <p><input type=\"radio\" name=\"sexo\" value=\"Feminino\"> Feminino</p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"form-item\">\n");
      out.write("            <label>Observações</label>\n");
      out.write("            <div>\n");
      out.write("                <textarea name=\"observacoes\"></textarea>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"form-btn\">\n");
      out.write("            <input type=\"submit\" value=\"Enviar\" />\n");
      out.write("            <input type=\"reset\" value=\"Limpar\" />\n");
      out.write("        </div>\n");
      out.write("    </form>\n");
      out.write("</article>\n");
      out.write("\n");
      out.write("<!-- Igor de Oliveira Ferreira | Geovane Alberto de Paula Neto -->\n");
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
