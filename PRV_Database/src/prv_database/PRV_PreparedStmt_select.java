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
            String sel = "select * from student where id = ?";
            pstmt = conn.prepareStatement(sel);
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter id of student = ");
            int id = sc.nextInt();
            pstmt.setInt(1,id);
            ResultSet rs = pstmt.executeQuery();
            while(rs.next())
            {
                System.out.println("Id = " + rs.getInt("id"));
                System.out.println("Name = " + rs.getString("name"));
            }
        }

    }
}
