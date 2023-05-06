package dbprogramming3;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

//เพิ่มข้อมูลโดยใช้ PreparedStatement
public class LAB12 {
    public static void main(String[] args) {
        String URL = "jdbc:mysql://localhost:3306/mydb3";
        String username = "root";
        String password = "inrita090";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(URL, username, password);
            String sql = "insert into student(studentID, firstname, lastname, email, deptID)"
                    + "values(?,?,?,?,?)";
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, "111111");
            preparedStatement.setString(2, "Jack");
            preparedStatement.setString(3, "Ryan");
            preparedStatement.setString(4, "jack.ryan@gmail.com");
            preparedStatement.setString(5, "IT");
            preparedStatement.executeUpdate();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Dbprogramming3.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Dbprogramming3.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
