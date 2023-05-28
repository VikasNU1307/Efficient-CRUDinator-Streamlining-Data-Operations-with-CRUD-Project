import java.beans.Statement;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CRUD {
    static String url = "jdbc:mysql://localhost:3306/";
    static String user = "root";
    static String pas = "vikas";
   public static void main(String[] agrs)  {
    DB_Connect d = new DB_Connect();

    Connection con = d.connect();
    
    
   }

}
