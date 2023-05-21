package dbprogramming1;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Dbprogramming1 {
    public static void main(String[] args) {
        String URL = "jdbc:mysql://localhost:3306/mydb3";
        String username = "root";
        String password = "inrita090";
        try {
            // 1. Loading Drivers
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded");

            // 2. Establishing Connections
            Connection con = DriverManager.getConnection(URL, username, password);
            System.out.println("Database Connected");

            // 3. Creating Statement
            Statement sta = con.createStatement();

            // 4.Executing Statements
            String sql = "select * from student";
            ResultSet result = sta.executeQuery(sql);

            // 5. Processing ResultSet
            while (result.next()) {
                System.out.println(result.getString(1) + " " + result.getString(2) + " "
                + result.getString(3) + " " + result.getString(4));
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Dbprogramming1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Dbprogramming1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
