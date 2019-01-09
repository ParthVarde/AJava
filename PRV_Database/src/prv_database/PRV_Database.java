package prv_database;

import java.sql.*;

public class PRV_Database {
    public static void main(String[] args) throws SQLException,ClassNotFoundException {
        String url = "jdbc:mysql://localhost:3306/";
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn;
        conn = DriverManager.getConnection(url, "root", "root");
        if(conn!=null)
        {
            System.out.println("Connection Successfull = " + conn);
        }
        else
        {
            System.out.println("Connection Failed");
        }
    }
    
}
