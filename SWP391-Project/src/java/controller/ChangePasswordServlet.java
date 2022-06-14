/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dal.UserDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.User;

/**
 *
 * @author ADMIN
 */
public class ChangePasswordServlet extends HttpServlet {

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
            out.println("<title>Servlet Change_password</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Change_password at " + request.getContextPath() + "</h1>");
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
        request.getRequestDispatcher("jsp/change_password.jsp").forward(request, response);
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
        String oldpass = request.getParameter("oldpass");
        String newpass = request.getParameter("newpass");
        String cfpass = request.getParameter("cfpass");
        HttpSession ses = request.getSession();
        User u = (User) ses.getAttribute("user");
        if (u == null) {
            request.getRequestDispatcher("jsp/change_password.jsp").forward(request, response);
        } else {
            if (oldpass.equals(u.getUpassword())) {
                if (newpass.equals(cfpass)) {
                    UserDAO ud = new UserDAO();
                    User u2 = new User(u.getUid(), u.getUemail(), newpass, u.getUfullname(), u.getUimg(), u.getGid(), u.getUdob(), u.getUphone(), u.getUaddress(), u.getUwallet());
//                    User u2 = new User(2, "daotv@gmail.com", newpass, "Tran Van Dao", "https://upload.wikimedia.org/wikipedia/commons/thumb/1/12/User_icon_2.svg/800px-User_icon_2.svg.png", 1, "2001-12-16", "92141718", "Nam Dinh", null);
                    ud.updateUserPassword(u2);
                    HttpSession session = request.getSession();
                    session.setAttribute("user", u2);
                    response.sendRedirect("login");
                } else {
                    request.setAttribute("error", "Confirmation password is incorrect!");
                    request.getRequestDispatcher("jsp/change_password.jsp").forward(request, response);
                }

            } else {
                request.setAttribute("error", "Incorrect password!");
                request.getRequestDispatcher("jsp/change_password.jsp").forward(request, response);
            }
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
