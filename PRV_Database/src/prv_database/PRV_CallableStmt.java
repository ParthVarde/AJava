package prv_database;

import java.sql.*;

public class PRV_CallableStmt {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String url = "jdbc:mysql://localhost:3306/test";
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn;
        conn = DriverManager.getConnection(url, "root", "root");
        CallableStatement clstmt;
        if(conn!=null)
        {
            clstmt = conn.prepareCall("CALL procedure1()");
            ResultSet rs = clstmt.executeQuery();
            while(rs.next())
            {
                System.out.println(rs.getInt("id"));
                System.out.println(rs.getString("name"));
            }
        }
        else
        {
            System.out.println("Connection Failed");
        }
    }
}
