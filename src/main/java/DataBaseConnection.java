import java.sql.*;

public class DataBaseConnection {

    public static Connection getConnection() {
        String url = "jdbc:postgresql://localhost:5432/demo";
        String username = "postgres";
        String password = "postgres";

        Connection connection = null;

        try {

            Class.forName("org.postgresql.Driver");

            connection = DriverManager.getConnection(url, username, password);

        } catch (SQLException | ClassNotFoundException e) {
            System.out.println(e);
        }
        return connection;
    }

}
