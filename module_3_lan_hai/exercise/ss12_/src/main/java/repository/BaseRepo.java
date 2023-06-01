package repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseRepo {
    private static String jdbcURL="jdbc:mysql://localhost:3306/library";
    private static String jdbcUsername ="root";
    private static String jdbcPassword = "thanhson09112002****";

    protected static Connection getConnection(){
        Connection connection= null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL,jdbcUsername,jdbcPassword);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
