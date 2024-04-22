/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

package controller;

import dao.DAO;
import entity.Account;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 *
 * @author PC
 */
@WebServlet(name="edit2", urlPatterns={"/edit2"})
public class edit2 extends HttpServlet {
   
   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet edit2</title>");  
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet edit2 at " + request.getContextPath () + "</h1>");
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
        String xprice= request.getParameter("price");
        float price = Float.parseFloat(xprice);
        String name = request.getParameter("name");
        String xquantity = request.getParameter("quantity");
        int quantity = Integer.parseInt(xquantity);
        String brand = request.getParameter("brand");
        String image = request.getParameter("image");
        String xcategory = request.getParameter("category");
        int category = Integer.parseInt(xcategory);
        HttpSession session = request.getSession();
        Account a = (Account) session.getAttribute("acc");
        int sid = a.getId(); 
        dao.edit(price, name, quantity, brand, image, category, sid, id);
        response.sendRedirect("manager");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
