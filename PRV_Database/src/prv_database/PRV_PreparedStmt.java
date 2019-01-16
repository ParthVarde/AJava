package prv_database;

import java.sql.*;

public class PRV_PreparedStmt {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String url = "jdbc:mysql://localhost:3306/test";
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn;
        conn = DriverManager.getConnection(url, "root", "root");
        PreparedStatement pstmt;
        if(conn!=null)
        {
            String ins = "insert into student values (7,'parth')";
            pstmt = conn.prepareStatement(ins);
            int b = pstmt.executeUpdate(ins);
            System.out.println("Rows affected = " + b);
        }
        else
        {
            System.out.println("Connection Failed");
        }
    }
}
