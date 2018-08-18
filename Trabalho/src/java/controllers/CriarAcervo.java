// Igor de Oliveira Ferreira | Geovane Alberto de Paula Neto
package controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Produto;

@WebServlet(name = "criarAcervo", urlPatterns = {"/criarAcervo"})
public class CriarAcervo extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if(request.getSession().getAttribute("produtos") == null) {
            Produto produto;
            List<Produto> produtos = new ArrayList<Produto>();
            
            List<String> descricoes = new ArrayList<String>();
            descricoes = this.preencheDescricoes(descricoes);

            List<String> precos = new ArrayList<String>();
            precos = this.preenchePrecos(precos);

            List<String> imagens = new ArrayList<String>();
            imagens = this.preencheImagens(imagens);
            
            List<Integer> estoques = new ArrayList<Integer>();
            estoques = this.preencheEstoques(estoques);
            
            for(int i=0;i<descricoes.size();i++) {
                produto = new Produto();
                produto.setId(i);
                produto.setDescricao(descricoes.get(i));
                produto.setPreco(precos.get(i));
                produto.setImagem(imagens.get(i).concat(".jpg"));
                produto.setEstoque(estoques.get(i));
                produtos.add(produto);
            }

            request.getSession().setAttribute("produtos", produtos);
        }
        response.sendRedirect("acervo.jsp");
    }
    
    private List<String> preencheDescricoes(List<String> descricoes) {
        descricoes.add("Processador Intel Core i5-8600k Coffee Lake 8a Geração");
        descricoes.add("SSD Kingston 2.5´ 120GB A400 SATA III");
        descricoes.add("Processador AMD Ryzen 7 1700 c/ Wraith Spire");
        descricoes.add("Cadeira Gamer DT3 Sports GT Black 10293-5");
        descricoes.add("Placa-Mãe ASUS p/ AMD AM3+ mATX M5A78L-M LX/BR");
        descricoes.add("WaterCooler Corsair Hydro Series High Performance");
        descricoes.add("Notebook Gamer Acer Intel Core I7-7700HQ");
        descricoes.add("Memória Kingston HyperX FURY 8GB 2400Mhz DDR4");
        descricoes.add("Processador Intel Core i7-7700K Kaby Lake 7a Geração");
        descricoes.add("Repetidor Expansor TP-Link Wi-Fi Network 300Mbps");
        descricoes.add("Placa-Mãe GIGABYTE p/ Intel LGA 1151 mATX GA-B250M-GAMING 3");
        descricoes.add("HD Seagate Externo Portátil Expansion USB 3.0 1TB");
        return descricoes;
    }
    
    private List<String> preenchePrecos(List<String> precos) {
        precos.add("R$ 1.234,91");
        precos.add("R$ 288,90");
        precos.add("R$ 979,90");
        precos.add("R$ 552,41");
        precos.add("R$ 309,90");
        precos.add("R$ 234,90");
        precos.add("R$ 4.549,90");
        precos.add("R$ 599,90");
        precos.add("R$ 1.337,90");
        precos.add("R$ 85,90");
        precos.add("R$ 489,90");
        precos.add("R$ 269,90");
        return precos;
    }
    
    private List<String> preencheImagens(List<String> imagens) {
        imagens.add("processador-i5");
        imagens.add("ssd-120GB");
        imagens.add("processador-rizen-7-1700");
        imagens.add("cadeira-gamer");
        imagens.add("placa-mae-asus");
        imagens.add("water-cooler-corsair");
        imagens.add("notebook-gamer");
        imagens.add("memoria-ddr4");
        imagens.add("processador-i7-7700");
        imagens.add("repetidor-wifi");
        imagens.add("placa-mae-gigabyte");
        imagens.add("hd-seagate");
        return imagens;
    }
     
    private List<Integer> preencheEstoques(List<Integer> estoques) {
        estoques.add(12);
        estoques.add(16);
        estoques.add(8);
        estoques.add(4);
        estoques.add(12);
        estoques.add(16);
        estoques.add(12);
        estoques.add(8);
        estoques.add(8);
        estoques.add(4);
        estoques.add(37);
        estoques.add(29);
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
