/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import beans.Carro;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author professor
 */
@WebServlet(urlPatterns = {"/processaCarro"})
public class processaCarro extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

            RequestDispatcher rd = null;

        if(request.getParameter("opcao") != null)
        {           
                int opcao = Integer.parseInt(request.getParameter("opcao").toString());

                if(opcao == 1)
                {                    
   
                    Carro carro = new Carro();
                    carro.setPlaca(request.getParameter("vPlaca"));
                    carro.setNome(request.getParameter("vNome"));
                    carro.setModelo(request.getParameter("vModelo"));
                    carro.setPreco(request.getParameter("vPreco"));
                    carro.setValorDiaria(Float.parseFloat(request.getParameter("vDiaria").toString()));                    
                    
                    HttpSession session = request.getSession(true);
                    session.setAttribute("meuCarro", carro);
                    rd = request.getRequestDispatcher("aluguelCarro.jsp");
                }

                if(opcao == 2)
                {
                    HttpSession session = request.getSession();
                    Carro carro = (Carro)session.getAttribute("meuCarro");
                    
                    int dias = Integer.parseInt(request.getParameter("vDias").toString());
                    carro.setDiasLocados(dias);
                    
                    session.setAttribute("meuCarro", carro);
                    rd = request.getRequestDispatcher("demonstrativoCarro.jsp");

                }
                
                if(opcao == 3)
                {
                    rd = request.getRequestDispatcher("index.jsp");
                }
        }        
        else
        {
            rd = request.getRequestDispatcher("processaCarro?opcao=3");           
        }
        
        rd.forward(request, response);

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
