package prv_database;

import java.sql.*;

public class PRV_Create {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String url = "jdbc:mysql://localhost:3306/test";
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn;
        conn = DriverManager.getConnection(url, "root", "root");
        Statement stmt;
        if(conn!=null)
        {
            String crea = "create table demo (id int, name varchar(50))";
            stmt = conn.createStatement();
            int b = stmt.executeUpdate(crea);
            System.out.println("Rows affected = " + b);
        }
        else
        {
            System.out.println("Connection Failed");
        }
        
    }
}
