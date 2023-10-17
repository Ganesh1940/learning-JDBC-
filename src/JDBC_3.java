//inserting data into the table

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

public class JDBC_3 {
    public static void main(String[] args) {
        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/myTable";
            String username = "root";
            String password = "studyganesh";
            Connection con = DriverManager.getConnection(url, username, password);

            //Creating a query
            String q = "INSERT INTO myTable (tName, tCity) values (?,?)";

            //getting the prepared statement object
            PreparedStatement pstmt = con.prepareStatement(q);
//            pstmt.setString(1,"Satish");
//            pstmt.setString(2, "Mumbai");

            pstmt.setString(1,"Sonu");
            pstmt.setString(2, "HYD");

            pstmt.setString(1,"Vignesh");
            pstmt.setString(2, "Pune");
            pstmt.executeUpdate();
            System.out.println("Data inserted in the table");
            con.close();

        }catch(Exception e){
            System.out.println("Some Exception occur "+e);
        }

        //Creating a query
    }
}
