//Creating a table in database

import java.sql.DriverManager;
import java.sql.*;

public class JDBC_2 {
    public static void main(String[] args) {
        try{
//            Class.forName("com.mysql.cj.jdbc.Driver");        Not needed 
            String url = "jdbc:mysql://localhost:3306/myTable";
            String username = "root";
            String password = "studyganesh";
            Connection con = DriverManager.getConnection(url, username, password);

            //Creating a query
            String q = "CREATE TABLE myTable(tId INT PRIMARY KEY AUTO_INCREMENT," +
                    "tName VARCHAR(50) NOT NULL, tCity VARCHAR(100))";

            //Creating a statement
            Statement stmt = con.createStatement();
            stmt.executeUpdate(q);
            System.out.println("Table created in database");

            con.close();
        }catch(Exception e){
            System.out.println("some exception occur " +e);
        }
    }
}
