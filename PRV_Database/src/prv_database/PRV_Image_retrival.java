package prv_database;

import java.sql.*;
import java.io.*;

public class PRV_Image_retrival {
    public static void main(String[] args) throws SQLException, ClassNotFoundException, FileNotFoundException {
        String url = "jdbc:mysql://localhost:3306/test";
        Class.forName("com.mysql.jdbc.Driver");
        File f = new File("C:\\Users\\Public\\Pictures\\Sample Pictures\\DesertOutput.jpg");
        FileOutputStream fos = new FileOutputStream(f);

        Connection conn;
        conn = DriverManager.getConnection(url, "root", "root");
        Statement stmt;
        if(conn!=null)
        {
            String sel = "select * from image";
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sel);
            while(rs.next())
            {


            }
        }
        else
        {
            System.out.println("Connection Failed");
        }
    }
}
