package prv_database;

import java.sql.*;

public class PRV_ResultSetMetaData {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String url = "jdbc:mysql://localhost:3306/test";
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn;
        conn = DriverManager.getConnection(url, "root", "root");
        if(conn!=null)
        {
            String sel = "select * from demo";
            Statement stmt;
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sel);
            ResultSetMetaData rsmd = rs.getMetaData();
            System.out.println("Column Count = " + rsmd.getColumnCount());
            System.out.println("Column Name = " + rsmd.getColumnName(1));
            System.out.println("Column Type = " + rsmd.getColumnTypeName(1));
            System.out.println("Column's Table Name = " + rsmd.getTableName(1));
        }
        else
        {
            System.out.println("Connection Failed");
        }
        conn.close();
    }
}
