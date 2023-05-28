import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class DB_Connect {
    static String url = "jdbc:mysql://localhost:3306/";
    static String user = "root";
    static String pas = "vikas";
    static Connection con = null;
    public Connection connect() {
        try {
             con = DriverManager.getConnection(url, user, pas);
            System.out.println("the Connection establish successfully....");
        } catch (SQLException e) {
            System.out.println(e);
        }
     return con;
    }
}
