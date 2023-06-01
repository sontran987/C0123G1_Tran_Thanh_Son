package service;

import model.Book;
import repository.IBookRepo;
import repository.BookRepoImpl;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public class BookServiceImpl implements IBookService {
    IBookRepo bookRepo =new BookRepoImpl();

    @Override
    public List<Book> DisplayBook() {
        return bookRepo.DisplayBook();
    }

    @Override
    public void addBook(HttpServletRequest request) {
        String title = request.getParameter("title");
        int pageSize = Integer.parseInt(request.getParameter("pageSize"));
        int idAuthor = Integer.parseInt(request.getParameter("author"));
        int idCateGory = Integer.parseInt(request.getParameter("cateGory"));
        bookRepo.addBook(new Book(title,pageSize,idAuthor,idCateGory));
    }

    @Override
    public void editBook(HttpServletRequest request) {
        String title = request.getParameter("title");
        int pageSize = Integer.parseInt(request.getParameter("pageSize"));
        int idAuthor = Integer.parseInt(request.getParameter("author"));
        int idCateGory = Integer.parseInt(request.getParameter("cateGory"));
        bookRepo.editBook(new Book(title,pageSize,idAuthor,idCateGory));
    }

//    @Override
//    public boolean deleteBook(int id) {
//        return bookRepo.deleteBook(id);
//    }
//
    @Override
    public List<Book> searchBook(HttpServletRequest request) {
        String title = request.getParameter("search");
        List<Book> list = bookRepo.searchBook(title);
        return list;
    }
//
//    @Override
//    public Book findByID(int id) {
//        return bookRepo.findById(id);
//    }
}
