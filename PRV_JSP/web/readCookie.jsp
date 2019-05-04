<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    Cookie c1[] = request.getCookies();
    for(Cookie i : c1) {
        out.println("<br/>Cookie Name = " + i.getName());
        out.println("<br/>Cookie Value = " + i.getValue());
        out.println("<br/>Age = " + i.getMaxAge());
    }
%>
<br/>
<a href="deleteCookie.jsp">Click here to Delete cookie</a>