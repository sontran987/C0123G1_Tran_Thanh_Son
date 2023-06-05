package repository.repoCategory;

import model.Category;
import repository.BaseRepo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CategoryRepoImpl implements ICategoryRepo {
    private static final String SELECT_ALL_CATEGORY = "select * from cate_gory";
    @Override
    public List<Category> displayCategory() {
        Connection connection = BaseRepo.getConnection();
        List<Category> list = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet =statement.executeQuery(SELECT_ALL_CATEGORY);
            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String nameCategory = resultSet.getString("name_cate_gory");
                list.add(new Category(id,nameCategory));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
