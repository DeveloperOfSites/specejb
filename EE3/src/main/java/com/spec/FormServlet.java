/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spec;

import com.spec.ejb.AppConfBean;
import com.spec.ejb.CalculatorBean;
import java.io.IOException;
import java.io.PrintWriter;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Student1
 */
@WebServlet(name = "FormServlet", urlPatterns = {"/FormServlet"})
public class FormServlet extends HttpServlet {

    @Inject
    CalculatorBean calc;

    @Inject
    AppConfBean conf;
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
        
//        System.out.println("== method = "+request.getMethod());
//        System.out.println("== fName = "+fName+", lName = "+lName);
        System.out.println("conf"+conf.getConfig());

        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet FormServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Калькулятор</h1>");
            out.println("<form action=\"/EE3/FormServlet\" method=\"POST\">");
            out.println("<label for=\"fname\">First Name</label>");
            out.println("<input type=\"text\" id=\"fname\" name=\"per1\">");
            out.println("<label for=\"lname\">Action</label>");
            out.println("<input type=\"text\" id=\"oname\" name=\"action\">");
            out.println("<label for=\"lname\">Last Name</label>");
            out.println("<input type=\"text\" id=\"lname\" name=\"per2\">");
            out.println("<input type=\"submit\" value=\"Submit\">");
            out.println("</form>");
            if(request.getMethod().equals("POST")) {
                Double p1 = Double.valueOf(request.getParameter("per1"));
                Double p2 = Double.valueOf(request.getParameter("per2"));
                String act = request.getParameter("action");
                out.println("<p>Результат: "+calc.calculate(p1, p2, act)+"</p>");
            }
            out.println("</body>");
            out.println("</html>");
            /*
            */
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
