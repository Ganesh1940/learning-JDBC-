import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

public class JDBC_3 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/learning_jdbc";
            String username = "root";
            String password = "studyganesh";
            Connection con = DriverManager.getConnection(url, username, password);

            //Creating a query
            String q = "INSERT INTO learning_jdbc";
        }catch(Exception e){
            System.out.println("Some Exception occur "+e);
        }

        //Creating a query
    }
}
