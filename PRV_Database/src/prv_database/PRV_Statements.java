package prv_database;

import java.sql.*;

public class PRV_Statements {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String url = "jdbc:mysql://localhost:3306/test";
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn;
        conn = DriverManager.getConnection(url, "root", "root");
        Statement stmt;
        if(conn!=null)
        {
            String sel = "select * from student";
            String ins = "insert into student values (1,'parth')";
            String upd = "update student set name='xyz' where name='parth'";
            String crea = "create table demo (id int, name varchar(50))";
            String del = "delete from student where name='xyz'";
            String drop = "drop table demo";
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sel);
            while(rs.next())
            {
                System.out.println("Id = " + rs.getInt("id"));
                System.out.println("Name = " + rs.getString("name"));
            }
        }
        else
        {
            System.out.println("Connection Failed");
        }
    }
}
