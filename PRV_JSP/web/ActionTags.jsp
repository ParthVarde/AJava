<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <body>
        <% 
            out.println("Hello dude");
        %>
        <%--
            <jsp:include page="External_JSP.jsp"/>
            <jsp:forward page="External_JSP.jsp"/>
        --%>
        <jsp:plugin code="Applet_Demo" type="applet" height="500" width="500"> 
        </jsp:plugin>
    </body>
</html>