package repository.repoAuthor;

import model.Author;
import repository.BaseRepo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AuthorRepoImpl implements IAuthorRepo {
    private static final String SELECT_ALL_AUTHOR = "select * from authors";
    @Override
    public List<Author> displayAuthor() {
        Connection connection = BaseRepo.getConnection();
        List<Author> list = new ArrayList<>();
        try {
          Statement statement = connection.createStatement();
            ResultSet resultSet =statement.executeQuery(SELECT_ALL_AUTHOR);
            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String nameAuthor = resultSet.getString("name_authors");
                list.add(new Author(id,nameAuthor));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
