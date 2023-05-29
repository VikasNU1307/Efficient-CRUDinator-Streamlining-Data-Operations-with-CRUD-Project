import java.sql.PreparedStatement;
import java.util.Scanner;


public class Create_Database {
    public static void CreateDatabase()  {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("please insert Database name");

        try {
            PreparedStatement ps = DB_Connect.con.prepareStatement("create database ?");
            ps.setString(1, name);
            ps.executeQuery();
            DB_Connect.url = "jdbc:mysql://localhost:3306/"+name;
            System.out.println("Database Created Successfully with the name of  "+ name);
            System.out.println("you want to create table...");
            CRUD.menu();
            
        } catch (Exception e) {
            // TODO: handle exception
        }     
       
    }
}
