package repository.repoBooks;

import model.Author;
import model.Book;
import model.Category;
import repository.BaseRepo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BookRepoImpl implements IBookRepo {
    BaseRepo baseRepo = new BaseRepo();

    private static final String SELECT_ALL_BOOK = "select * from books " +
            "inner join authors as au on au.id=books.author_id " +
            "inner join cate_gory as cate on cate.id = books.cate_gory_id " +
            "group by books.id " +
            "order by books.id";

    private static final String INSERT_INTO_BOOK = "call sp_add_book(?,?,?,?);";

    private static final String UPDATE_BOOK = "UPDATE books" +
            " set title = ? ," +
            " page_size = ? , " +
            " author_id = ? ," +
            " cate_gory_id = ? " +
            " where id = ?";
    private static final String DELETE_BOOK = "call sp_delete_books(?)";
    @Override
    public List<Book> searchBook(String title) {
        String SEARCH_BOOK = "SELECT * from books where books.title LIKE '%" + title + "%'";
        Connection connection = baseRepo.getConnection();
        List<Book> bookList = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(SEARCH_BOOK);
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String titleBook = resultSet.getString("title");
                int pageSize = resultSet.getInt("page_size");
                int authorId = resultSet.getInt("author_id");
                int cateGoryId = resultSet.getInt("cate_gory_id");
                Author author = new Author(authorId);
                Category category = new Category(cateGoryId);
                bookList.add(new Book(id, titleBook, pageSize, author, category));
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
                int idAuthor = resultSet.getInt("author_id");
                int idCateGory = resultSet.getInt("cate_gory_id");
                String nameCategory = resultSet.getString("name_cate_gory");
                String nameAuthor = resultSet.getString("name_authors");
                Author author = new Author(idAuthor,nameAuthor);
                Category category = new Category(idCateGory, nameCategory);
                bookList.add(new Book(id, title, pageSize, author, category));
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
        Connection connection = BaseRepo.getConnection();
        try {
            CallableStatement callableStatement = connection.prepareCall(INSERT_INTO_BOOK);
            callableStatement.setString(1, book.getTitle());
            callableStatement.setInt(2, book.getPageSize());
            callableStatement.setInt(3, book.getAuthor().getIdAuthor());
            callableStatement.setInt(4, book.getCategory().getIdCategory());
            callableStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
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
            preparedStatement.setString(1, book.getTitle());
            preparedStatement.setInt(2, book.getPageSize());
            preparedStatement.setInt(3, book.getAuthor().getIdAuthor());
            preparedStatement.setInt(4, book.getCategory().getIdCategory());
            preparedStatement.setInt(5, book.getId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

     @Override
    public boolean deleteBook(int id) {
         Connection connection = BaseRepo.getConnection();
         try {
             CallableStatement callableStatement = connection.prepareCall(DELETE_BOOK);
             callableStatement.setInt(1,id);
             callableStatement.executeUpdate();
         } catch (SQLException e) {
             throw new RuntimeException(e);
         }
         return false;
    }


    @Override
    public Book findById(int id) {
        Connection connection = BaseRepo.getConnection();
        String FIND_BOOK_ID = "select * from books" +
                " inner join authors as au on au.id=books.author_id " +
                " inner join cate_gory as cate on cate.id = books.cate_gory_id "+
                " where books.id =" + id ;
        try {
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(FIND_BOOK_ID);
            while (result.next()) {
                String title = result.getString("title");
                int pageSize = result.getInt("page_size");
                int idAuthor = result.getInt("author_id");
                int idCateGory = result.getInt("cate_gory_id");
                String nameAuthor = result.getString("name_authors");
                String nameCategory = result.getString("name_cate_gory");
                Author author = new Author(idAuthor,nameAuthor);
                Category category = new Category(idCateGory,nameCategory);
                Book book = new Book(id, title, pageSize, author, category);
                return book;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}