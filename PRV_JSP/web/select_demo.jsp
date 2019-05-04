<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*"%>
<%
    String s = "jdbc:mysql://localhost:3306/test";
    Class.forName("com.mysql.jdbc.Driver");
    Connection con;
    con = DriverManager.getConnection(s, "root", "root");
    Statement stmt;
    if(con!=null)
    {
        String sel = "select * from student";
        stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(sel);
        while(rs.next()) 
        {
            out.println("Id = " + rs.getInt("id") + "<br/>");
            out.println("Name = " + rs.getString("name") + "<br/>");
        }
    }
    else 
    {
        out.println("Connection Failed");
    }
%>
