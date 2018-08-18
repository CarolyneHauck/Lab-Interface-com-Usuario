/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

/**
 *
 * @author professor
 */
public class Usuario 
{
    private String login;
    private String senha;
    private String nome;

    public Usuario() 
    {
        this.login = "giuliano";
        this.senha = "123456";
    }
    
    public boolean autenticar(String u, String s)
    {
        if(u.equals(login) && s.equals(senha))
            return true;
        else
            return false;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    
    
}
