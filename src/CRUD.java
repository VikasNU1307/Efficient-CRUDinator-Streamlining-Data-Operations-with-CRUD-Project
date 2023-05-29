
import java.util.Scanner;

public class CRUD {
    static String url = "jdbc:mysql://localhost:3306/";
    static String user = "root";
    static String pas = "vikas";
   public static void main(String[] agrs)  {
   
    
    Scanner sc = new Scanner(System.in);

   
    
    System.out.println("Hii, I hope all is well..");
    System.out.println("What i can help you :) please select following choice you want to do..");
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
        case 2:
         
        break;
        case 3:
         
        break;
        case 4:
         
        break;
        case 5:
         
        break;
        case 6:
         
        break;

        default:
        System.out.println("please Check your inseting wrong input :)");
        break;
    }
    
   }
public static void menu() {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Hii, I hope all is well..");
    System.out.println("What i can help you :) please select following choice you want to do..");
   
    System.out.println("2.Create table.");
    System.out.println("3.Insert Record.");
    System.out.println("4.Update Record");
    System.out.println("5.Delete Record");
    System.out.println("6.Read the Information.");
    int Choice = sc.nextInt();

    switch(Choice){

        case 1:
        Create_Database.CreateDatabase();
        break;
        case 2:
         
        break;
        case 3:
         
        break;
        case 4:
         
        break;
        case 5:
         
        break;
        case 6:
         
        break;

        default:
        System.out.println("please Check your inseting wrong input :)");
        break;
    }
}

}
