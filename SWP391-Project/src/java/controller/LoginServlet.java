/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dal.UserDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.User;

/**
 *
 * @author Dell
 */
public class LoginServlet extends HttpServlet {

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
            out.println("<title>Servlet LoginServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet LoginServlet at " + request.getContextPath() + "</h1>");
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
//        processRequest(request, response);
        HttpSession session = request.getSession();
        if (session.getAttribute("user") != null) {
            request.getRequestDispatcher("home").forward(request, response);
        }
        request.setAttribute("path", request.getServletPath());
        request.getRequestDispatcher("jsp/account.jsp").forward(request, response);

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
        try {
            //        processRequest(request, response);
            String e = request.getParameter("email");
            String p = request.getParameter("pass");
            String r = request.getParameter("rem");
            UserDAO udao = new UserDAO();
            User u = udao.checkUser(e, p);
            if (u != null) {
                HttpSession session = request.getSession();
                session.setAttribute("user", u);
                //====================
                //Neu dang nhap thanh cong => tao cookie
                Cookie ce = new Cookie("email", e);
                Cookie cp = new Cookie("pass", p);
                Cookie cr = new Cookie("rem", r);
                //Neu nguoi dung check - muon luu lai
                //dat time life cho cookie
                if (r!=null)
                {
                    ce.setMaxAge(60*60*24);
                    cp.setMaxAge(60*60*24);
                    cr.setMaxAge(60*60*24);
                }
                else
                {
                    //Xoa cookie
                    ce.setMaxAge(0);
                    cp.setMaxAge(0);
                    cr.setMaxAge(0);
                }
                response.addCookie(ce);
                response.addCookie(cp);
                response.addCookie(cr);
                //====================
                response.sendRedirect("home");
            } else {
                request.setAttribute("err_log", "Email or password is invalid!");
                request.setAttribute("path", request.getServletPath());
                request.getRequestDispatcher("jsp/account.jsp").forward(request, response);
            }
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(LoginServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
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
