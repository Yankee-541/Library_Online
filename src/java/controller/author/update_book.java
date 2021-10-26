/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.author;

import dao.libraryConnect;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.author;
import model.book;
import model.category_book;

/**
 *
 * @author Tebellum
 */
@WebServlet(name = "update_book", urlPatterns = {"/library/updatebook"})
public class update_book extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        int id = Integer.parseInt(request.getParameter("id"));
        libraryConnect lib = new libraryConnect();
        book b = lib.getbook(id);
        ArrayList<author> auth = lib.getAuthor();
        ArrayList<category_book> cates = lib.getCate();
        request.setAttribute("auth", auth);
        request.setAttribute("cates", cates);
        request.setAttribute("book", b);
        request.getRequestDispatcher("../view_author/update_book.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        libraryConnect l = new libraryConnect();
        book b = new book();
        b.setBook_id(Integer.parseInt(request.getParameter("book_id")));
        b.setBook_name(request.getParameter("book_name"));
        b.setDescription(request.getParameter("description"));
        b.setShort_des(request.getParameter("short_des"));

        author a = new author();
        a.setAuthor_id(Integer.parseInt(request.getParameter("author_id")));
        b.setAuthor(a);

        category_book c = new category_book();
        c.setCategory_id(Integer.parseInt(request.getParameter("category_id")));
        b.setCategory(c);

        l.updateBook(b);
        response.sendRedirect("list");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
