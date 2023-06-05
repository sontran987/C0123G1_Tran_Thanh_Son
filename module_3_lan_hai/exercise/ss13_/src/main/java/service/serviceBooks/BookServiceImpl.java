package service.serviceBooks;

import model.Author;
import model.Book;
import model.Category;
import repository.repoBooks.IBookRepo;
import repository.repoBooks.BookRepoImpl;

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
        Author author = new Author(idAuthor);
        Category category = new Category(idCateGory);
        bookRepo.addBook(new Book(title,pageSize,author,category));
    }

    @Override
    public void editBook(HttpServletRequest request) {
        int id = Integer.parseInt(request.getParameter("id"));
        String title = request.getParameter("title");
        int pageSize = Integer.parseInt(request.getParameter("pageSize"));
        int idAuthor = Integer.parseInt(request.getParameter("author"));
        int idCateGory = Integer.parseInt(request.getParameter("cateGory"));
        Author author = new Author(idAuthor);
        Category category = new Category(idCateGory);
        bookRepo.editBook(new Book(id,title,pageSize,author,category));
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

    @Override
    public Book findByID(int id) {
        return bookRepo.findById(id);
    }
}
