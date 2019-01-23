package prv_database;

import java.sql.*;
import java.io.*;

public class PRV_Image_retrival {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/test";
        Class.forName("com.mysql.jdbc.Driver");
        FileOutputStream fos = new FileOutputStream("C:\\Users\\Public\\Pictures\\Sample Pictures\\DesertOutput.jpg");
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
                Blob image = rs.getBlob("col");
                byte[] b = image.getBytes(1, (int)image.length());
                fos.write(b, 0, b.length);
            }
        }
        else
        {
            System.out.println("Connection Failed");
        }
    }
}
