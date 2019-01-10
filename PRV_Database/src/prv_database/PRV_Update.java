package prv_database;

import java.sql.*;

public class PRV_Update {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String url = "jdbc:mysql://localhost:3306/test";
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn;
        conn = DriverManager.getConnection(url, "root", "root");
        Statement stmt;
        if(conn!=null)
        {
            String upd = "update student set name='xyz' where name='parth'";
            stmt = conn.createStatement();
            int b = stmt.executeUpdate(upd);
            System.out.println("Rows affected = " + b);
        }
        else
        {
            System.out.println("Connection Failed");
        }
        
    }
}
