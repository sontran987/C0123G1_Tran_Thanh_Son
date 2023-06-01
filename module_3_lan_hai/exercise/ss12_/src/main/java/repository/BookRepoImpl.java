package repository;

import model.Author;
import model.Book;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BookRepoImpl implements IBookRepo {
    BaseRepo baseRepo = new BaseRepo();

    private static final String SELECT_ALL_BOOK = "select * from books " ;

    private static final String INSERT_INTO_BOOK = "insert into books(`title`,page_size,author_id,cate_gory_id)" +
            "values(?,?,?,?)";

    private static final String UPDATE_BOOK = "update books " +
            "set books.title=?" +
            "set books.page_size=?" +
            "set books.author_id=?" +
            "set books.cate_gory_id=?" +
            "where books.id=?";
    private static final String SEARCH_BOOK = "select * from books where books.title = ? ";

    @Override
    public List<Book> searchBook(String title) {
        Connection connection = BaseRepo.getConnection();
        List<Book> bookList = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(SEARCH_BOOK);
            PreparedStatement preparedStatement = connection.prepareStatement(SEARCH_BOOK);
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
//                String titleB =resultSet.getString("title");
                int pageSize = resultSet.getInt("page_size");
                int author = resultSet.getInt("author_id");
                int cateGory = resultSet.getInt("cate_gory_id");
                preparedStatement.setString(1,title);
                bookList.add(new Book(id, title, pageSize, author, cateGory));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return bookList;
    }
    @Override

    public List<Book> DisplayBook() {
        Connection connection = BaseRepo.getConnection();
        List<Book> bookList = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(SELECT_ALL_BOOK);
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String title = resultSet.getString("title");
                int pageSize = resultSet.getInt("page_size");
                int author = resultSet.getInt("author_id");
                int cateGory = resultSet.getInt("cate_gory_id");
                bookList.add(new Book(id, title, pageSize, author, cateGory));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return bookList;
    }

    @Override
    public void addBook(Book book) {
        Connection connection =BaseRepo.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_INTO_BOOK);
            preparedStatement.setString(1,book.getTitle());
            preparedStatement.setInt(2,book.getPageSize());
            preparedStatement.setInt(3,book.getIdAuthor());
            preparedStatement.setInt(4,book.getIdCateGory());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }

    @Override
    public void editBook(Book book) {
        Connection connection = BaseRepo.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_BOOK);
            preparedStatement.setString(1,book.getTitle());
            preparedStatement.setInt(2,book.getPageSize());
            preparedStatement.setInt(3,book.getIdAuthor());
            preparedStatement.setInt(4,book.getIdCateGory());
            preparedStatement.setInt(5,book.getId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

//    @Override
//    public boolean deleteBook(int id) {
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i).getId() == id) {
//                list.remove(i);
//                return true;
//            }
//        }
//        return false;
//    }
//


//    @Override
//    public Book findById(int id) {
//        for (Book b : list) {
//            if (b.getId() == id) {
//                return b;
//            }
//        }
//        return null;
//    }
}