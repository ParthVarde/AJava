package prv_database;

import java.sql.*;

public class PRV_DatabaseMetaData {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String url = "jdbc:mysql://localhost:3306/test";
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn;
        conn = DriverManager.getConnection(url, "root", "root");
        if(conn!=null)
        {
            DatabaseMetaData dbmd = conn.getMetaData();
            dbmd.supportsSavepoints();
            dbmd.supportsStoredProcedures();
            ResultSet rs = dbmd.getTables("","","",null);
            while(rs.next())
            {
                System.out.println("Table Name = " + rs.getString(3));
            }
        }
        else
        {
            System.out.println("Connection Failed");
        }
        conn.close();
    }
}
