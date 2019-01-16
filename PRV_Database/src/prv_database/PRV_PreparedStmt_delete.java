package prv_database;

import java.sql.*;
import java.util.*;

public class PRV_PreparedStmt_delete {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String url = "jdbc:mysql://localhost:3306/test";
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn;
        PreparedStatement pstmt;
        conn = DriverManager.getConnection(url, "root", "root");
        if(conn!=null)
        {
            String del = "delete from student where id = ?";
            pstmt = conn.prepareStatement(del);
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter id to be deleted = ");
            int id = sc.nextInt();
            pstmt.setInt(1,id);
            int rows = pstmt.executeUpdate();
            System.out.println("Rows affected = " + rows);
        }
    }
}
