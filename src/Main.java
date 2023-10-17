import java.sql.Connection;
import java.sql.DriverManager;

public class Main {
    public static Connection getConnection(){
        try{
//            String driver= "com.mysql.jdbc.Driver";
            String dbUrl = "jdbc:mysql://localhost:3306/world";
            String username = "root";
            String password = "studyganesh";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(dbUrl, username, password );
            System.out.println("Database connected, Now you can do more operations");
            return conn;
        }
        catch(Exception e){
            System.out.println("Some Exception occur" +e);
        }
        return null;
    }
    public static void main(String[] args) {
//        System.out.printf("Hello and welcome!");
        getConnection();
    }
}