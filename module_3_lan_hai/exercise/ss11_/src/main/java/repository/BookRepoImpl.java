package repository;

import model.Book;

import java.util.ArrayList;
import java.util.List;

public class BookRepoImpl implements BookRepo {
    static List<Book> list = new ArrayList<>();

    static {
    list.add(new Book(1,"SachHoá",1209,"Thanh Son","Sach giao khoa"));
    list.add(new Book(2,"SachVăn",3133,"Thanh Son","Sach giao khoa"));
    list.add(new Book(3,"SachAnh",1223,"Thanh Son","Sach giao khoa"));
    list.add(new Book(4,"SachToán",768,"Thanh Son","Sach giao khoa"));
    list.add(new Book(5,"SachSử",678,"Thanh Son","Sach giao khoa"));
    list.add(new Book(6,"SachTựnhiên",656756,"Thanh Son","Sach giao khoa"));
    }

    @Override

    public List<Book> DisplayBook() {
        return list;
    }

    @Override
    public void addBook(Book book) {
        list.add(book);
    }

    @Override
    public void editBook(Book book) {
        for (Book b : list) {
            if (b.getId()==book.getId()){
                b.setTitle(book.getTitle());
                b.setPageSize(book.getPageSize());
                b.setAuthor(book.getAuthor());
                b.setCateGory(book.getCateGory());
            }
        }
    }

    @Override
    public boolean deleteBook(int id) {
        return false;
    }

    @Override
    public List<Book> searchBook(String title) {
        List<Book> bookList = new ArrayList<>();
        for (Book b : list) {
            if (b.getTitle().contains(title)){
                bookList.add(b);
            }
        }
        return bookList;
    }

    @Override
    public Book findById(int id) {
        for (Book b : list) {
            if (b.getId()==id){
                return b;
            }
        }
        return null;
    }
}