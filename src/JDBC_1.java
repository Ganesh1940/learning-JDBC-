//Creating a connection

import java.sql.DriverManager;
import java.sql.*;

public class JDBC_1 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String dbUrl = "jdbc:mysql://localhost:3306/learning_jdbc";
            String username = "root";
            String password = "studyganesh";
            Connection con = DriverManager.getConnection(dbUrl, username, password);

            if(con.isClosed()){
                System.out.println("Connection is closed...");
            }else{
                System.out.println("Connection created...");
            }
        }catch(Exception e){
            System.out.println("some exception "+e);
        }
    }
}
