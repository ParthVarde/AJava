package prv_database;

import java.sql.*;

public class PRV_Delete  {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String url = "jdbc:mysql://localhost:3306/test";
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn;
        conn = DriverManager.getConnection(url, "root", "root");
        Statement stmt;
        if(conn!=null)
        {
            String del = "delete from student where name='parth'";
            stmt = conn.createStatement();
            int b = stmt.executeUpdate(del);
            System.out.println("Rows affected = " + b);
        }
        else
        {
            System.out.println("Connection Failed");
        }
    }
}
