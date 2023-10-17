//Dynamic input (asking for the input)
import java.sql.*;
import java.io.*;

public class JDBC_4 {
    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://localhost:3306/myTable";
            String username = "root";
            String password = "studyganesh";

            Connection con = DriverManager.getConnection(url, username, password);
            String q = "INSERT INTO myTable (tName, tCity) values (?,?)";

            PreparedStatement ps = con.prepareStatement(q);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter Name : ");
            String name = br.readLine();

            System.out.print("Enter City : ");
            String city = br.readLine();

            ps.setString(1, name);
            ps.setString(2,city);

            ps.executeUpdate();
            System.out.println("Data inserted...");
            con.close();
        }catch(Exception e){
            System.out.println("Exception : "+e);
        }
    }
}
