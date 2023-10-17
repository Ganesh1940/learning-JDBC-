//Updating the data in the table(deleting a tuple and adding the new tuple).

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.io.*;
import java.util.Scanner;

public class update_JDBC {
    public static void main(String[] args) {

            //Method 1
        /*String url = "jdbc:mysql://localhost:3306/myTable";
        String username = "root";
        String password = "studyganesh";

        try {
            Connection con = DriverManager.getConnection(url, username, password);

            String q = "UPDATE myTable SET tName=? , tCity=? WHERE tId=?";

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter new name : ");
            String name = br.readLine();

            System.out.print("Enter new City : ");
            String city = br.readLine();

            System.out.print("Enter Id : ");
            int id = Integer.parseInt(br.readLine());

            PreparedStatement ps = con.prepareStatement(q);
            ps.setString(1,name);
            ps.setString(2,city);
            ps.setInt(3,id);

            ps.executeUpdate();
            System.out.println("Data updated...");
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }*/

            //Method 2 (Easy method)
        String url = "jdbc:mysql://localhost:3306/myTable";
        String username = "root";
        String password = "studyganesh";

        try {
            Connection con = DriverManager.getConnection(url, username, password);
            String q = "UPDATE myTable SET tName=? , tCity=? WHERE tId=?";

            PreparedStatement pst = con.prepareStatement(q);
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter new name : ");
            String name = sc.nextLine();

            System.out.println("Enter new City : ");
            String city = sc.nextLine();

            System.out.println("Enter ID : ");
            int id = sc.nextInt();

            pst.setString(1,name);
            pst.setString(2,city);
            pst.setInt(3,id);

            pst.executeUpdate();
            System.out.println("Data updated...");
            con.close();

        }catch(Exception e){
            System.out.println(e);
        }
    }
}
