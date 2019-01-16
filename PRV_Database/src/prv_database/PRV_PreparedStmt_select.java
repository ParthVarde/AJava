package prv_database;

import java.sql.*;
import java.util.*;

public class PRV_PreparedStmt_select {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String url = "jdbc:mysql://localhost:3306/test";
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn;
        PreparedStatement pstmt;
        conn = DriverManager.getConnection(url, "root", "root");
        if(conn!=null)
        {
            String sel = "select * from student where id = '1'";
            pstmt = conn.prepareStatement(sel);
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter id of student = ");
            int id = sc.nextInt();
            System.out.print("Enter name of student = ");
            String name = sc.next();
            pstmt.setInt(1,id);
            pstmt.setString(2,name);
            int rows = pstmt.executeUpdate();
            System.out.println("Rows affected = " + rows);
        }

    }
}
