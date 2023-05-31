package controller;

import model.Book;
import service.BookService;
import service.BookServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "BookServlet", value = "/BookServlet")
public class BookServlet extends HttpServlet {
    BookService bookService = new BookServiceImpl();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action =request.getParameter("action");
        if (action==null){
            action="";
        }
        switch (action){
            case "add":
                RequestDispatcher requestDispatcher = request.getRequestDispatcher("add-book.jsp");
                requestDispatcher.forward(request,response);
                break;
            case"edit":
                formEdit(request, response);
                break;
            default:
                List<Book> list = bookService.DisplayBook();
                request.setAttribute("list",list);
                showFormAdd(request, "display.jsp", response);
        }

    }

    private void formEdit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      int id = Integer.parseInt(request.getParameter("id"));
      Book book = this.bookService.findByID(id);
        RequestDispatcher requestDispatcher1;
      if (book== null){
          requestDispatcher1 =request.getRequestDispatcher("index.jsp");
          requestDispatcher1.forward(request,response);
      }
      request.setAttribute("book",book);
         requestDispatcher1 = request.getRequestDispatcher("form-edit.jsp");
        requestDispatcher1.forward(request, response);
    }

    private static void showFormAdd(HttpServletRequest request, String path, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher(path).forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action =request.getParameter("action");
        if (action==null){
            action="";
        }
        switch (action){
            case "add":
                addBook(request, response);
                break;
            case "edit":
                edit(request, response);
                break;
            case "delete":
                break;
            case "search":
                search(request, response);
                break;

        }
    }

    private void edit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        bookService.editBook(request);


        RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.jsp");
        requestDispatcher.forward(request, response);
    }

    private void search(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Book> bookList = bookService.searchBook(request);
        request.setAttribute("searchTitle",bookList);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/display-search.jsp");
        requestDispatcher.forward(request, response);
    }

    private void addBook(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        bookService.addBook(request);
        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }
}
