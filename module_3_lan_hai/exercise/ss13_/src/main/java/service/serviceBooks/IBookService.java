package service.serviceBooks;

import model.Book;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface IBookService {
    List<Book> DisplayBook();
    void addBook(HttpServletRequest request);
    void editBook(HttpServletRequest request);
//    boolean deleteBook(int id);
    List<Book> searchBook(HttpServletRequest request);
    Book findByID(int id);
}
