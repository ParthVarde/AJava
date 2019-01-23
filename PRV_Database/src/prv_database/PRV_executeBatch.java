package prv_database;

import java.sql.*;

public class PRV_executeBatch {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String url = "jdbc:mysql://localhost:3306/test";
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn;
        conn = DriverManager.getConnection(url, "root", "root");
        Statement stmt;
        if(conn!=null)
        {
            String ins = "insert into student values (5,'parth')";
            String upd = "update student set name='xyz' where name = 'parth'";
            stmt = conn.createStatement();
            stmt.addBatch(ins);
            stmt.addBatch(upd);
            int rows[] = stmt.executeBatch();
            for(int i : rows)
            {
                System.out.println(i);
            }
        }
        else
        {
            System.out.println("Connection Failed");
        }
    }
}
