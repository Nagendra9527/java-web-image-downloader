import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class DBConnection {

    private static final String USERNAME = "";
    private static final String PASSWORD = ";
    private static final String CONN     = "jdbc:mysql://localhost:3306/sys";

    static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(CONN, USERNAME, PASSWORD);
    }
}
