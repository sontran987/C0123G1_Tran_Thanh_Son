package controller;

import model.Author;
import model.Book;
import model.Category;
import service.serviceAuthor.AuthorServiceImpl;
import service.serviceAuthor.IAuthorService;
import service.serviceBooks.IBookService;
import service.serviceBooks.BookServiceImpl;
import service.serviceCategory.CategoryServiceImpl;
import service.serviceCategory.ICategoryService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "BookServlet", value = "/BookServlet")
public class BookServlet extends HttpServlet {
    IBookService bookService = new BookServiceImpl();
   ICategoryService categoryService = new CategoryServiceImpl();
   IAuthorService authorService = new AuthorServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "add":
                showFormAdd(request, response);
                break;
            case "edit":
                showFormEdit(request, response);
                break;
            case "delete":
//                delete(request, response);
                break;
            default:
                List<Book> list = bookService.DisplayBook();
                request.setAttribute("list", list);
                showListBooks(request, "display.jsp", response);
        }

    }

    private void showFormAdd(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("listAu", authorService.displayAuthor());
        request.setAttribute("listCate", categoryService.displayCategory());
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("form-add.jsp");
        requestDispatcher.forward(request, response);
    }

    private void showFormEdit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Book book = this.bookService.findByID(id);
        List<Author> authorList = authorService.displayAuthor();
        List<Category> categoryList = categoryService.displayCategory();
        RequestDispatcher requestDispatcher1;
        if (book == null) {
            response.sendRedirect("/BookServlet");
        }
        request.setAttribute("author", authorList);
        request.setAttribute("category", categoryList);
        request.setAttribute("book", book);
        requestDispatcher1 = request.getRequestDispatcher("form-edit.jsp");
        requestDispatcher1.forward(request, response);
    }

    private static void showListBooks(HttpServletRequest request, String path, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher(path).forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "add":
                addBook(request, response);
                break;
            case "edit":
                edit(request, response);
                break;
            case "search":
                search(request, response);
                break;

        }
    }

//    private void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        int id = Integer.parseInt(request.getParameter("id"));
//       if (bookService.deleteBook(id)){
//           RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.jsp");
//           requestDispatcher.forward(request, response);
//       }else {
//           RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.jsp");
//           requestDispatcher.forward(request, response);
//       }
//
//
//    }

    private void edit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        bookService.editBook(request);
        response.sendRedirect("/BookServlet");
    }

    private void search(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Book> bookList = bookService.searchBook(request);
        List<Author> authorList = authorService.displayAuthor();
        List<Category> categoryList = categoryService.displayCategory();
        request.setAttribute("list", bookList);
        request.setAttribute("author", authorList);
        request.setAttribute("category", categoryList);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/display.jsp");
        requestDispatcher.forward(request, response);
    }

    private void addBook(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        bookService.addBook(request);

        response.sendRedirect("/BookServlet");
    }
}
