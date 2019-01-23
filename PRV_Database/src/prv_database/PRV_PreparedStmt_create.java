package prv_database;

import java.sql.*;
import java.util.*;

public class PRV_PreparedStmt_create {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String url = "jdbc:mysql://localhost:3306/test";
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn;
        PreparedStatement pstmt;
        conn = DriverManager.getConnection(url, "root", "root");
        if(conn!=null)
        {
            String crea = "create table demo(id int, name varchar(50))";
            pstmt = conn.prepareStatement(crea);
            boolean rows = pstmt.execute();
            System.out.println("Rows affected = " + rows);
        }
        else
        {
            System.out.println("COnnection Failed");
        }

    }
}
