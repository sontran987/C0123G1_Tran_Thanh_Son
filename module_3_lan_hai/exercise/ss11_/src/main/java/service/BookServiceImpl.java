package service;

import model.Book;
import repository.BookRepo;
import repository.BookRepoImpl;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public class BookServiceImpl implements BookService{
    BookRepo bookRepo =new BookRepoImpl();

    @Override
    public List<Book> DisplayBook() {
        return bookRepo.DisplayBook();
    }

    @Override
    public void addBook(HttpServletRequest request) {
        int id = Integer.parseInt(request.getParameter("id"));
        String title = request.getParameter("title");
        int pageSize = Integer.parseInt(request.getParameter("pageSize"));
        String author = request.getParameter("author");
        String cateGory = request.getParameter("cateGory");
        bookRepo.addBook(new Book(id,title,pageSize,author,cateGory));
    }

    @Override
    public void editBook(HttpServletRequest request) {
        int id = Integer.parseInt(request.getParameter("id"));
        String title = request.getParameter("title");
        int pageSize = Integer.parseInt(request.getParameter("pageSize"));
        String author = request.getParameter("author");
        String cateGory = request.getParameter("cateGory");
        bookRepo.editBook(new Book(id,title,pageSize,author,cateGory));
    }

    @Override
    public boolean deleteBook(int id) {
        return false;
    }

    @Override
    public List<Book> searchBook(HttpServletRequest request) {
        String title = request.getParameter("search");
        List<Book> list = bookRepo.searchBook(title);
        return list;
    }

    @Override
    public Book findByID(int id) {
        return bookRepo.findById(id);
    }
}
