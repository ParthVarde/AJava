<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    Cookie c = new Cookie("uname", "");
    c.setMaxAge(0);
    c.setValue("");
    response.addCookie(c);
%>
<br/>
<a href="readCookie.jsp">Click here for read</a>