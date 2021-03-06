/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.login;

import dao.AccountDBConnect;
import dao.libraryConnect;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.account;

/**
 *
 * @author Tebellum
 */
@WebServlet(name = "login_controller", urlPatterns = {"/library/login"})
public class login_controller extends HttpServlet {

       @Override
       protected void doGet(HttpServletRequest request, HttpServletResponse response)
               throws ServletException, IOException {
              request.getRequestDispatcher("../view/login/Login.jsp").forward(request, response);
       }

       @Override
       protected void doPost(HttpServletRequest request, HttpServletResponse response)
               throws ServletException, IOException {
              String user = request.getParameter("user");
              String pass = request.getParameter("pass");
              AccountDBConnect adb = new AccountDBConnect();
              account acc = adb.getAcc(user, pass);
              if (acc == null) {
                     request.setAttribute("mess", "!!! Invalid username or pasword");
                     request.getSession().setAttribute("account", acc);
                     request.getRequestDispatcher("../view/login/Login.jsp").forward(request, response);//mang dữ liệu đi
              } else {
                     request.getSession().setAttribute("account", acc);
                     response.sendRedirect("home");
              }
       }

       @Override
       public String getServletInfo() {
              return "Short description";
       }// </editor-fold>

}
