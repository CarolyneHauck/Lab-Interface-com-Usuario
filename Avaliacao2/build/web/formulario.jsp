<%-- 
    Document   : formulario
    Created on : 29/11/2017, 18:39:50
    Author     : alunoces
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<script language="JavaScript">
            function validacao(){
                senha=document.form1.senha.value;
                senha2= document.form1.senha2.value;
                ano = document.form1.ano.value;
                mes = document.form1.mes.value;
                user = document.form1.user.value;
                if(senha != senha2){
                    alert("confirmação de senha incorreta");
                    document.form1.senha.focus();
                    return false;
                }else
                
                if(ano >=  1999 && mes == 12){
                    alert("menor de 18 anos");
                    document.form1.ano.focus();
                    return false;
                }
            
                if(mes < 1 || mes > 12){
                     alert("mes invalido");
                    document.form1.mes.focus();
                    return false;
                }  
                
                if(user.length<5){
                    alert("deve conter pelo menos 5 caracteres");
                    return false;
                } else return true; 
            }
            
            function SomenteNumero(e){
        var tecla=(window.event)?event.keyCode:e.which;
        
        if((tecla>47 && tecla<58)) return true;
        else{
            if(tecla == 8 || tecla == 0) return true;
            else return false;
        }
        
    }
    
        
        </script>
        

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <center>
        <h3>Formulario!</h3>
        <table border="0" celspacing="5" cellpadding="10">
        <form name="form1" action="formSessao.jsp" method="post" onsubmit="return validacao()">
        <p>
            Usuario:<input type="text" name="user" size="20" required='required' /><BR><BR>
            mês e ano de Nascimento:<input type="text" name="mes" size="5" required='required' onkeypress='return SomenteNumero(event)' /> / <input type="text" name="ano" size="5" required='required' onkeypress='return SomenteNumero(event)' /><BR><BR>
            Senha:<input type="password" name="senha" size="20" required='required' /><BR><BR>
            confirma senha:<input type="password" name="senha2" size="20" required='required' /><BR><BR>
            e-mail:<input type="text" name="email" size="20" required='required' /><BR><BR>
            avatar:<input type="file" name="arquivo" value="arquivo" width="10" /><BR><BR>
            Termos de uso:<textarea name="" rows="7" cols="30" readonly="readonly">
                    Aceitação dos termos de Uso e Emendas.A cada vez em que você usar ou acessar este site, você concorda em submeter-se a estes Termosde Uso , bem como a suas emendas, feitas de tempos em tempos, com ou sem aviso. Além disso, se você utiliza um serviço específico neste ou através deste site, você estará sujeito a quaisquer
                    </textarea><BR>
                    <input type="checkbox" name="concordo" value="concordo" />Eu concordo com os termos de uso<BR><BR>
            <input type="submit" value="Cadastrar" /><input type="reset" value="limpar">
        </center>
    </body>
</html>
