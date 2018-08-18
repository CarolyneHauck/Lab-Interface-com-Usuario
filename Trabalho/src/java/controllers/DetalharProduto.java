// Igor de Oliveira Ferreira | Geovane Alberto de Paula Neto
package controllers;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import beans.Produto;

@WebServlet(name = "detalharProduto", urlPatterns = {"/detalharProduto"})
public class DetalharProduto extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {      
        Integer id = Integer.parseInt(request.getParameter("id"));
        Object prod = request.getSession().getAttribute("produtos");
        if(id != null && prod != null) {
            List<Produto> produtos = (List<Produto>) prod;
            for(Produto produto : produtos) {
                if(produto.getId().equals(id)) {
                    request.getSession().setAttribute("produto", produto);
                    break;
                }
            }
            response.sendRedirect("NomeDoProduto.jsp");
        }
        else
            response.sendRedirect("acervo.jsp");
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