<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*"%>
<% 
    String s = "jdbc:mysql://localhost:3306/test";
    Class.forName("com.mysql.jdbc.Driver");
    Connection con;
    con = DriverManager.getConnection(s, "root", "root");
    Statement stmt;
    if(con!=null)
    {
        String str = request.getParameter("id");
        String name = request.getParameter("name");
        int id = Integer.parseInt(str);
        String ins = "insert into student values ("+id+",'"+name+"')";
        stmt = con.createStatement();
        int rows = stmt.executeUpdate(ins);
        out.println("Data Inserted Successfully<br/>");
        out.println("Rows affected = " + rows + "<br/>");
        out.println("<a href='select_demo.jsp'>Click here to view data</a>");
    }
    else 
    {
        out.println("Connection Failed");
    }
%>

