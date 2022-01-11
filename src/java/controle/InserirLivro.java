/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.livro;
import modelo.livroDAO;

/**
 *
 * @author yango
 */
public class InserirLivro extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet InserirLivro</title>");            
            out.println("</head>");
            out.println("<body>");
             try {
                String prateleira_numero = request.getParameter("Prateleira_Numero");
                String edicao = request.getParameter("Edicao");
                String ano = request.getParameter("Ano");
                String descricao = request.getParameter("Descricao");
                String isbn_rda = request.getParameter("ISBN_RDA");
                String editora = request.getParameter("Editora");
                String turma = request.getParameter("Turma");
                String titulo = request.getParameter("Titulo");

                if (!turma.isEmpty() && !prateleira_numero.isEmpty()) { 
                    livro l = new livro();
                    livroDAO lDAO = new livroDAO();
                    l.setPrateleira_Numero(prateleira_numero);
                    l.setEdicao(edicao);
                    l.setAno(ano);
                    l.setDescricao(descricao);
                    l.setISBN_RDA(isbn_rda);
                    l.setEditora(editora);
                    l.setTurma(turma);
                    l.setTitulo(titulo);
                    lDAO.inserir(l);
                    response.sendRedirect("listar_livro.jsp");
                } else {
                    out.print("Algum campo obrigatório não foi preenchido!");
                }
            } catch (Exception e) {
                out.print("Erro:" + e);
            }
            
            
            
            
            
            
            out.println("<h1>Servlet InserirLivro at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
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
