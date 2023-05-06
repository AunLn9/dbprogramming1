package dbprogramming3;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

//เพิ่มข้อมูล (insert)
public class LAB9 {
    public static void main(String[] args) {
        String URL = "jdbc:mysql://localhost:3306/mydb3";
        String username = "root";
        String password = "inrita090";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(URL, username, password);
            Statement sta = con.createStatement();
            String sql = "insert into student(studentID, firstname, lastname, email, deptID)"
                + "values('111111', 'Inrita', 'Wara', 'inrita.wara@gmail.com', 'IT')";
            sta.executeUpdate(sql);

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Dbprogramming3.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Dbprogramming3.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
