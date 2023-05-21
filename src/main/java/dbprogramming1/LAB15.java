package dbprogramming1;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

// Result Set Metadata
public class LAB15 {
    public static void main(String[] args) {
        String URL = "jdbc:mysql://localhost:3306/mydb3";
        String username = "root";
        String password = "veerapat076";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(URL, username, password);
            Statement sta = con.createStatement();
            String sql = "select * from student";
            ResultSet result = sta.executeQuery(sql);
            ResultSetMetaData rsMetaData = result.getMetaData();

            for (int i = 1; i <= rsMetaData.getColumnCount(); i++) {
                System.out.println(rsMetaData.getColumnCount());
            }

            while (result.next()) {
                for (int i = 1; i <= rsMetaData.getColumnCount(); i++)
                    System.out.printf("%-12s\t", result.getObject(i));
                System.out.println();
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Dbprogramming3.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Dbprogramming3.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
