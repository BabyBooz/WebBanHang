/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

package controller;

import dao.DAO;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author PC
 */
@WebServlet(name="editAccount2", urlPatterns={"/edita2"})
public class editAccount2 extends HttpServlet {
   
 
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet editAccount2</title>");  
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet editAccount2 at " + request.getContextPath () + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    } 

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    } 

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        DAO dao = new DAO();
        String xid = request.getParameter("id");
        int id = Integer.parseInt(xid);
        String user = request.getParameter("user");
        String pass = request.getParameter("password");
        String xisSell = request.getParameter("isSell");
        int isSell = Integer.parseInt(xisSell);
        String xisAdmin = request.getParameter("isAdmin");
        int isAdmin = Integer.parseInt(xisAdmin);
        dao.editAccount(user, pass, isSell, isAdmin, id);
        response.sendRedirect("admin");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
