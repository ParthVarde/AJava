package prv_database;

import javax.xml.transform.Result;
import java.sql.*;

public class PRV_UpdatableResultSet {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String url = "jdbc:mysql://localhost:3306/test";
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn;
        conn = DriverManager.getConnection(url, "root", "root");
        if(conn!=null)
        {
            String sel = "select *from demo";
            Statement stmt;
            stmt = conn.createStatement(1005, 1008);
            ResultSet rs = stmt.executeQuery(sel);
            while(rs.next())
            {
                rs.updateInt(1, rs.getInt(1) + 1);
                rs.updateRow();
                rs.updateString(2, rs.getString(2).concat(" Varde"));
                rs.updateRow();
                System.out.println("Id = " + rs.getInt(1));
                System.out.println("Name = " + rs.getString(2));
            }
        }
        else
        {
            System.out.println("Connection Failed");
        }
        conn.close();
    }
}
