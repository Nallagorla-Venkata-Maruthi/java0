package JDBC;
import java.sql.*;

public class DbConnect {
    public static void main(String[] args) {
        try {
            // 1. Load JDBC Driver (for MySQL)



            String url = "jdbc:mysql://localhost:3306/hospital";
            String username = "root";
            String password = "your_password";

            Connection con = DriverManager.getConnection(url, username, password);

            System.out.println("Connected Successfully!");

            // 3. Close connection
            con.close();
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
