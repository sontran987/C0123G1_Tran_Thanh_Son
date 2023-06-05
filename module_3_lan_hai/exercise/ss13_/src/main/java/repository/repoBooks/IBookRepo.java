package repository.repoBooks;

import model.Book;

import java.util.List;

public interface IBookRepo {
    List<Book> DisplayBook();
    void addBook(Book book);
    void editBook(Book book);
//    boolean deleteBook(int id);
    List<Book> searchBook(String title);

    boolean deleteBook(int id);

    Book findById(int id);
}
