/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

package controller;

import dao.DAO;
import entity.Cart;
import entity.Item;
import entity.Product;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.util.List;


@WebServlet(name="process", urlPatterns={"/process"})
public class process extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet process</title>");  
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet process at " + request.getContextPath () + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    } 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        HttpSession session =   request.getSession(true);
        Cart cart = null;
        Object o = session.getAttribute("cart");
        if(o!=null){
            cart = (Cart) o;
        }else{
            cart= new Cart();
        }
        String xnum = request.getParameter("num").trim();
        String xid = request.getParameter("id");
        try {
            int num = Integer.parseInt(xnum);
            int id = Integer.parseInt(xid);
            if((num==-1)&&(cart.getQuantityById(id)<= 1)){
                cart.removeItem(id);
            }else{
                DAO dao = new DAO();
                Product p = dao.getProductID(id);
                double price =p.getPrice();
                Item t =new Item(p, num, price);
                cart.addItem(t);
            } 
        } catch (Exception e) {
            System.out.println(e);
        }
        
    } 

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        
        HttpSession session =   request.getSession(true);
        Cart cart = null;
        Object o = session.getAttribute("cart");
        if(o!=null){
            cart = (Cart) o;
        }else{
            cart= new Cart();
        }
        int id = Integer.parseInt(request.getParameter("id"));
        cart.removeItem(id);
        List<Item> list = cart.getItems();
        session.setAttribute("Cart", cart);
        session.setAttribute("size", list.size());
        request.getRequestDispatcher("home2.jsp").forward(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
