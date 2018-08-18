/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cliente.Cliente;

/**
 *
 * @author LUIZ FELIPPE AUGUSTO GOMES E LUIZ GUILHERME RODRIGUES
 */
@WebServlet(name = "ClienteCadastro", urlPatterns = {"/clienteCadastro"})
public class ClienteCadastro extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
    	Cliente cliente = new Cliente();
    	cliente.setNome(this.getForm("nome", request));
    	cliente.setRua(this.getForm("rua", request));
    	cliente.setCidade(this.getForm("cidade", request));
    	cliente.setEstado(this.getForm("estado", request));
    	cliente.setCep(this.getForm("cep", request));
    	cliente.setTelefoneResidencial(this.getForm("telefoneResidencial", request));
    	cliente.setProfissao(this.getForm("profissao", request));
    	cliente.setProfissao(this.getForm("profissao", request));
    	cliente.setDataNascimento(this.getForm("dataNascimento", request));
    	cliente.setCpf(this.getForm("cpf", request));
    	cliente.setEmail(this.getForm("email", request));
    	cliente.setEstadoCivil(this.getForm("estadoCivil", request));
    	cliente.setSexo(this.getForm("sexo", request));
    	cliente.setObservacoes(this.getForm("observacoes", request));
    	
    	request.getSession().setAttribute("cliente", cliente);
    	response.sendRedirect("dadosCliente.jsp");
    }
    
    private String getForm(String name, HttpServletRequest request) {
    	String req = request.getParameter(name);
    	return (req != null && req != "") ? req : "(vazio)";
    }    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}