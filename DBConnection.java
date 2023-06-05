import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class DBConnection {

    private static final String USERNAME = "root";
    private static final String PASSWORD = "Nagvir@518";
    private static final String CONN     = "jdbc:mysql://localhost:3306/sys";

    static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(CONN, USERNAME, PASSWORD);
    }
}
