package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class formulario_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<script language=\"JavaScript\">\n");
      out.write("            function validacao(){\n");
      out.write("                senha=document.form1.senha.value;\n");
      out.write("                senha2= document.form1.senha2.value;\n");
      out.write("                ano = document.form1.ano.value;\n");
      out.write("                mes = document.form1.mes.value;\n");
      out.write("                user = document.form1.user.value;\n");
      out.write("                if(senha != senha2){\n");
      out.write("                    alert(\"confirmação de senha incorreta\");\n");
      out.write("                    document.form1.senha.focus();\n");
      out.write("                    return false;\n");
      out.write("                }else\n");
      out.write("                \n");
      out.write("                if(ano >=  1999 && mes == 12){\n");
      out.write("                    alert(\"menor de 18 anos\");\n");
      out.write("                    document.form1.ano.focus();\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("            \n");
      out.write("                if(mes < 1 || mes > 12){\n");
      out.write("                     alert(\"mes invalido\");\n");
      out.write("                    document.form1.mes.focus();\n");
      out.write("                    return false;\n");
      out.write("                }  \n");
      out.write("                \n");
      out.write("                if(user.length<5){\n");
      out.write("                    alert(\"deve conter pelo menos 5 caracteres\");\n");
      out.write("                    return false;\n");
      out.write("                } else return true; \n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            function SomenteNumero(e){\n");
      out.write("        var tecla=(window.event)?event.keyCode:e.which;\n");
      out.write("        \n");
      out.write("        if((tecla>47 && tecla<58)) return true;\n");
      out.write("        else{\n");
      out.write("            if(tecla == 8 || tecla == 0) return true;\n");
      out.write("            else return false;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("    }\n");
      out.write("    alert(document.form1.arquivo.value);\n");
      out.write("        \n");
      out.write("        </script>\n");
      out.write("        \n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <center>\n");
      out.write("        <h3>Formulario!</h3>\n");
      out.write("        <table border=\"0\" celspacing=\"5\" cellpadding=\"10\">\n");
      out.write("        <form name=\"form1\" action=\"formSessao.jsp\" method=\"post\" onsubmit=\"return validacao()\">\n");
      out.write("        <p>\n");
      out.write("            Usuario:<input type=\"text\" name=\"user\" size=\"20\" required='required' /><BR><BR>\n");
      out.write("            mês e ano de Nascimento:<input type=\"text\" name=\"mes\" size=\"5\" required='required' onkeypress='return SomenteNumero(event)' /> / <input type=\"text\" name=\"ano\" size=\"5\" required='required' onkeypress='return SomenteNumero(event)' /><BR><BR>\n");
      out.write("            Senha:<input type=\"password\" name=\"senha\" size=\"20\" required='required' /><BR><BR>\n");
      out.write("            confirma senha:<input type=\"password\" name=\"senha2\" size=\"20\" required='required' /><BR><BR>\n");
      out.write("            e-mail:<input type=\"text\" name=\"email\" size=\"20\" required='required' /><BR><BR>\n");
      out.write("            avatar:<input type=\"file\" name=\"arquivo\" width=\"10\" /><BR><BR>\n");
      out.write("            Termos de uso:<textarea name=\"\" rows=\"7\" cols=\"30\" readonly=\"readonly\">\n");
      out.write("                    Aceitação dos termos de Uso e Emendas.A cada vez em que você usar ou acessar este site, você concorda em submeter-se a estes Termosde Uso , bem como a suas emendas, feitas de tempos em tempos, com ou sem aviso. Além disso, se você utiliza um serviço específico neste ou através deste site, você estará sujeito a quaisquer\n");
      out.write("                    </textarea><BR>\n");
      out.write("                    <input type=\"checkbox\" name=\"concordo\" value=\"concordo\" />Eu concordo com os termos de uso<BR><BR>\n");
      out.write("            <input type=\"submit\" value=\"Cadastrar\" /><input type=\"reset\" value=\"limpar\">\n");
      out.write("        </center>\n");
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
