package repository;

import model.Book;

import java.util.List;

public interface BookRepo {
    List<Book> DisplayBook();
    void addBook(Book book);
    void editBook(Book book);
    boolean deleteBook(int id);
    List<Book> searchBook(String title);
    Book findById(int id);
}
