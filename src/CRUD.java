import java.beans.Statement;
import java.net.SocketTimeoutException;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class CRUD {
    static String url = "jdbc:mysql://localhost:3306/";
    static String user = "root";
    static String pas = "vikas";
   public static void main(String[] agrs)  {
    DB_Connect d = new DB_Connect();

    Connection con = d.connect();
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Hii, I hope all is well..");
    System.out.println("What i can help :) please select following choice you want to do..");
    System.out.println("1.Create Database.");
    System.out.println("2.Create table.");
    System.out.println("3.Insert Record.");
    System.out.println("4.Update Record");
    System.out.println("5.Delete Record");
    System.out.println("6.Read the Information.");
    int Choice = sc.nextInt();

    switch(Choice){

        case 1:
         
        break;

        default:
        System.out.println("please Check your inseting wrong input :)");
        break;
    }
    
   }

}
