<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% 
    String name = request.getParameter("name");
    Cookie c = new Cookie("uname", name);
    c.setMaxAge(1 * 60);
    response.addCookie(c);
%>
<a href="readCookie.jsp">Click here for read</a>
