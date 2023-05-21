package dbprogramming1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

// ลบข้อมูล (Delete)
public class LAB11 {
    public static void main(String[] args) {
        String URL = "jdbc:mysql://localhost:3306/mydb3";
        String username = "root";
        String password = "veerapat076";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(URL, username, password);
            Statement sta = con.createStatement();
            String sql = "delete from student where studentID = '111111'";
            sta.execute(sql);

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Dbprogramming3.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Dbprogramming3.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
