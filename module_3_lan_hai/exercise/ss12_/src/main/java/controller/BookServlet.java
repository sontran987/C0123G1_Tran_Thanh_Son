package controller;

import model.Author;
import model.Book;
import model.Category;
import repository.AuthorRepoImpl;
import repository.CategoryRepoImpl;
import repository.IAuthorRepo;
import repository.ICategoryRepo;
import service.IBookService;
import service.BookServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "BookServlet", value = "/BookServlet")
public class BookServlet extends HttpServlet {
    IBookService bookService = new BookServiceImpl();
    ICategoryRepo categoryRepo =new CategoryRepoImpl();
    IAuthorRepo authorRepo =new AuthorRepoImpl();
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
//                formEdit(request, response);
                break;
            case "delete":
//                delete(request, response);
                break;
            default:
                List<Book> list = bookService.DisplayBook();
                List<Author>authorList = authorRepo.displayAuthor();
                List<Category> categoryList = categoryRepo.displayAuthor();
                request.setAttribute("list",list);
                request.setAttribute("author",authorList);
                request.setAttribute("category",categoryList);
                showFormAdd(request, "display.jsp", response);
        }

    }

//    private void formEdit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//      int id = Integer.parseInt(request.getParameter("id"));
//      Book book = this.bookService.findByID(id);
//        RequestDispatcher requestDispatcher1;
//      if (book== null){
//          requestDispatcher1 =request.getRequestDispatcher("index.jsp");
//          requestDispatcher1.forward(request,response);
//      }
//      request.setAttribute("book",book);
//         requestDispatcher1 = request.getRequestDispatcher("form-edit.jsp");
//        requestDispatcher1.forward(request, response);
//    }

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

        response.sendRedirect("/BookServlet");
    }
}
