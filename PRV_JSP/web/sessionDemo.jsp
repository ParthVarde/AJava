<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    if(session.isNew()) 
    {
        out.println("New Session<br/>");
    }
    Integer count = (Integer)session.getAttribute("count");
    if(count==null)
    {
        count = new Integer(0);
        session.setAttribute("count", ++count);
        out.println("Visit Count = " + count);
    }
    else
    {
        session.setAttribute("count", ++count);
        out.println("Visit Count = " + count);
    }
%>