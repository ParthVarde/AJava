package prv_database;

import java.sql.*;
import java.util.*;

public class PRV_CallableStmt_Demo {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String url = "jdbc:mysql://localhost:3306/test";
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn;
        conn = DriverManager.getConnection(url, "root", "root");
        PreparedStatement pstmt;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter id to be searched = ");
        int id = sc.nextInt();
        System.out.print("Enter name to be searched = ");
        String name = sc.next();
        if(conn!=null)
        {
            pstmt = conn.prepareStatement("CALL procedure1(?,?)");
            pstmt.setInt(1,id);
            pstmt.setString(2,name);
            ResultSet rs = pstmt.executeQuery();
            while(rs.next())
            {
                System.out.println("Id = " + rs.getInt("id"));
                System.out.println("Name = " + rs.getString("name"));
            }
        }
        else
        {
            System.out.println("Connection Failed");
        }
    }
}
