<%@include file="cabecalho.jsp"  %>


         <h3>Bem-vindo Usuário!</h3>
         <p>
            <br>
            Seu Login é:<%= session.getAttribute("login")%>
            
            <br>
            <br>
            <%
            Cookie cookies[] = request.getCookies();
            
            if (cookies != null) {
                int tamanho = cookies.length;
                for (int i = 0; i < tamanho; i++) 
                {
                      Cookie cookie = cookies[i];
                    if (cookie.getName().equals("aluno")) {
                        out.println("Bem vindo usuario " + cookie.getValue());
                    } 
                 %>
                 <br>
                 <%
                    if (cookie.getName().equals("matricula")) {
                        out.println("Seu numero de matricula é <b>" + cookie.getValue());
                    }
                }
            }
        %>
       
            
        
 <%@include file="rodape.jsp"  %>