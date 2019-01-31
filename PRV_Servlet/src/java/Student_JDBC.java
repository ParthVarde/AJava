import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class Student_JDBC extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String name = req.getParameter("name");
        String lname = req.getParameter("lname");
        String roll = req.getParameter("roll");
        int rollno = Integer.parseInt(roll);
        PrintWriter out = res.getWriter();
        //out.println(name + lname + roll);
        try {
            String url = "jdbc:mysql://localhost:3306/test";
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn;
            conn = DriverManager.getConnection(url, "root", "root");
            if (conn!= null) {
                out.println("Connection Successfull");
                String ins = "insert into student1 values ("+rollno+",'"+name+"','"+lname+"')";
                String sel = "select * from student1";
                Statement stmt;
                stmt = conn.createStatement();
                int a = stmt.executeUpdate(ins);
                out.println("Rows affected = " + a);
                ResultSet rs = stmt.executeQuery(sel);
                while(rs.next())
                {
                    out.println("Roll Number = " + rs.getInt(1));
                    out.println("First Name = " + rs.getString(2));
                    out.println("Last Name = " + rs.getString(3));
                }
            }
        }
        catch(SQLException e) {
            out.println(e);
        }
        catch(ClassNotFoundException e) {
            out.println(e);
        }
    }
}