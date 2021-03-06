/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.bookDBConnect;
import dao.category_author_DBConnect;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.book;
import model.category_book;

/**
 *
 * @author Tebellum
 */
public class homeController extends HttpServlet {

       protected void processRequest(HttpServletRequest request, HttpServletResponse response)
               throws ServletException, IOException {
              bookDBConnect bdbc = new bookDBConnect();

              int pageSize = 12;
              String page_raw = request.getParameter("page");
              if (page_raw == null || page_raw.length() == 0) {
                     page_raw = "1";
              }
              int pageIndex = Integer.parseInt(page_raw);
              int total_row = bdbc.getRowCount();
              int totalpage = (total_row % pageSize == 0) ? total_row / pageSize : (total_row / pageSize) + 1;

              ArrayList<book> books = bdbc.get_books_Pagging(pageIndex, pageSize);

              category_author_DBConnect cdbc = new category_author_DBConnect();
              ArrayList<category_book> list_cate = cdbc.get_cateBook();
              request.setAttribute("cates", list_cate);
              request.setAttribute("pageIndex", pageIndex);
              request.setAttribute("totalpage", totalpage);
              request.setAttribute("books", books);
              request.getRequestDispatcher("../view/home.jsp").forward(request, response);

       }

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
