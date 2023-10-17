//Using select

import java.sql.DriverManager;
import java.sql.*;

public class select_JDBC {
    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://localhost:3306/myTable";
            String username = "root";
            String password = "studyganesh";

            Connection con = DriverManager.getConnection(url, username, password);

            String q = "SELECT * FROM myTable";
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery(q);

            while(resultSet.next()){
                    //method 1
                int id = resultSet.getInt("tId");
                String name = resultSet.getString("tName");
                String city = resultSet.getString("tCity");
                System.out.print("tId : "+id + "\t tName : "+name + "\t tCity : "+city);
                System.out.println(" ");

                    //method 2
//                int id = resultSet.getInt(1);
//                String name = resultSet.getString(2);
//                String city = resultSet.getString(3);
//                System.out.print("tId : "+id + "\t  tName : "+name + "\t tCity : "+city);
//                System.out.println(" ");
            }
            con.close();

        }catch(Exception e){
            System.out.println(e);
        }
    }
}
