package prv_database;

import java.sql.*;
import java.io.*;

public class PRV_Image {
    public static void main(String[] args) throws SQLException, ClassNotFoundException, FileNotFoundException {
        String url = "jdbc:mysql://localhost:3306/test";
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn;
        conn = DriverManager.getConnection(url, "root", "root");
        PreparedStatement pstmt;
        File f = new File("C:\\Users\\Public\\Pictures\\Sample Pictures\\Desert.jpg");
        FileInputStream fis = new FileInputStream(f);
        if(conn!=null)
        {
            String sql = "insert into image values (?)";
            pstmt = conn.prepareStatement(sql);
            pstmt.setBlob(1, fis, f.length());
            int rows = pstmt.executeUpdate();
            System.out.println("Rows affected = " + rows);
        }
        else
        {
            System.out.println("Connection Failed");
        }
    }
}
