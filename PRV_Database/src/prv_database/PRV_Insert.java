package prv_database;

import java.sql.*;

public class PRV_Insert {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String url = "jdbc:mysql://localhost:3306/test";
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn;
        conn = DriverManager.getConnection(url, "root", "root");
        Statement stmt;
        if(conn!=null)
        {
            String ins = "insert into student values (1,'parth')";
            stmt = conn.createStatement();
            int b = stmt.executeUpdate(ins);
            System.out.println("Rows affected = " + b);
        }
        else
        {
            System.out.println("Connection Failed");
        }
    }
}
