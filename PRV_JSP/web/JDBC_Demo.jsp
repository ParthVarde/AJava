<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*"%>
<%
    String s = "jdbc:mysql://localhost:3306/test";
    Class.forName("com.mysql.jdbc.Driver");
    Connection con;
    con = DriverManager.getConnection(s, "root", "root");
    if(con!=null)
    {
        out.println("Connection Successfull<br/>");
        out.println("<a href='insert_data.html'>Click here to Insert Data</a>");
    }
    else 
    {
        out.println("Connection Failed");
    }
%>