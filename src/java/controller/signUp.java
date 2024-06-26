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


@WebServlet(name="signUp", urlPatterns={"/signup"})
public class signUp extends HttpServlet {
   

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet signUp</title>");  
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet signUp at " + request.getContextPath () + "</h1>");
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
        String user = request.getParameter("user").trim();
        String pass = request.getParameter("pass").trim();
        String repass= request.getParameter("repass").trim();
        DAO dao = new DAO();
        Account a = dao.checkAccount(user);
        if(!(pass.equals(repass))){
            request.setAttribute("mess", "Wrong pass or user");
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }else{
            if(a == null){
                dao.signUp(user, pass);
                response.sendRedirect("login.jsp");
            }else{
                request.setAttribute("mess", "User is exsist!");
                request.getRequestDispatcher("login.jsp").forward(request, response);
            }
        }
    }

  
    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
