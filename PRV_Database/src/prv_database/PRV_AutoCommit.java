package prv_database;

import java.util.*;
import java.sql.*;

public class PRV_AutoCommit {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String url = "jdbc:mysql://localhost:3306/test";
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn;
        conn = DriverManager.getConnection(url, "root", "root");
        if(conn!=null)
        {
            String ins = "insert into demo values (9, 'parth');";
            Statement stmt;
            stmt = conn.createStatement();
            conn.setAutoCommit(false);
            int rows = stmt.executeUpdate(ins);
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Decision = ");
            String dec = sc.next();
            if(dec.equals("rollback()"))
            {
                conn.rollback();
            }
            else if(dec.equals("commit()"))
            {
                conn.commit();
            }
            System.out.println("Rows affected = " + rows);
        }
        else
        {
            System.out.println("Connection Failed");
        }
        conn.close();
    }
}
