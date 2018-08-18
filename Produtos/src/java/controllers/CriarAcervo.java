/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import produto.Produto;

/**
*
* @author LUIZ FELIPPE AUGUSTO GOMES E LUIZ GUILHERME RODRIGUES
*/
@WebServlet(name = "criarAcervo", urlPatterns = {"/criarAcervo"})
public class CriarAcervo extends HttpServlet {

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
        if(request.getSession().getAttribute("produtos") == null) {
            Produto produto;
            List<Produto> produtos = new ArrayList<Produto>();
            
            List<String> nomes = new ArrayList<String>();
            nomes = this.preencheNomes(nomes);

            List<String> precos = new ArrayList<String>();
            precos = this.preenchePrecos(precos);

            List<String> categorias = new ArrayList<String>();
            categorias = this.preencheCategorias(categorias);
            
            List<String> imagens = new ArrayList<String>();
            imagens = this.preencheImagens(imagens);
            
            List<Integer> estoques = new ArrayList<Integer>();
            estoques = this.preencheEstoques(estoques);
            
            for(int i=0;i<nomes.size();i++) {
                produto = new Produto();
                produto.setId(i);
                produto.setNome(nomes.get(i));
                produto.setPreco(precos.get(i));
                produto.setCategoria(categorias.get(i));
                produto.setImagem(imagens.get(i).concat(".png"));
                produto.setEstoque(estoques.get(i));
                produtos.add(produto);
            }

            request.getSession().setAttribute("produtos", produtos);
        }
        response.sendRedirect("acervo.jsp");
    }
    
    private List<String> preencheNomes(List<String> nomes) {
        nomes.add("Fita Donkey Kong 1");
        nomes.add("Fita Donkey Kong 2");
        nomes.add("Fita Donkey Kong 3");
        nomes.add("Fita Mortal Kombat 1");
        nomes.add("Fita Mortal Kombat 2");
        nomes.add("Fita Mortal Kombat 3");
        nomes.add("Fita Super Mario World");
        nomes.add("Fita Super Mario Kart");
        nomes.add("Fita Super Bomberman 4");
        nomes.add("Fita Goof Troop");
        nomes.add("Controle SNES");
        nomes.add("Console SNES");
        return nomes;
    }
    
    private List<String> preenchePrecos(List<String> precos) {
        precos.add("R$ 30,90");
        precos.add("R$ 31,90");
        precos.add("R$ 32,90");
        precos.add("R$ 20,70");
        precos.add("R$ 21,70");
        precos.add("R$ 22,70");
        precos.add("R$ 40,20");
        precos.add("R$ 39,20");
        precos.add("R$ 19,30");
        precos.add("R$ 18,80");
        precos.add("R$ 40,90");
        precos.add("R$ 100,00");
        return precos;
    }
    
     private List<String> preencheCategorias(List<String> categorias) {
            categorias.add("Aventura");
            categorias.add("Aventura");
            categorias.add("Aventura");
            categorias.add("Luta");
            categorias.add("Luta");
            categorias.add("Luta");
            categorias.add("Aventura");
            categorias.add("Corrida");
            categorias.add("Batalha");
            categorias.add("Raciocinio");
            categorias.add("Hardware");
            categorias.add("Hardware");
            return categorias;
     }
     
     private List<String> preencheImagens(List<String> imagens) {
    	 imagens.add("dk1");
    	 imagens.add("dk2");
    	 imagens.add("dk3");
    	 imagens.add("mk1");
    	 imagens.add("mk2");
    	 imagens.add("mk3");
    	 imagens.add("marioworld");
         imagens.add("mariokart");
         imagens.add("bomber4");
         imagens.add("gooftroop");
         imagens.add("snes-pad");
         imagens.add("snes-console");
         return imagens;
  }
     
     private List<Integer> preencheEstoques(List<Integer> estoques) {
    	 estoques.add(3);
    	 estoques.add(4);
    	 estoques.add(2);
    	 estoques.add(1);
    	 estoques.add(3);
    	 estoques.add(4);
    	 estoques.add(3);
    	 estoques.add(2);
    	 estoques.add(2);
    	 estoques.add(1);
    	 estoques.add(100);
         estoques.add(22);
         return estoques;
  }
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
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
