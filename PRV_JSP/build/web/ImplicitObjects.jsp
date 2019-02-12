<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <body>
        <%
            response.setContentType("text/html");
            session.setAttribute("user", "admin");
            out.println(session.getAttribute("user") + "<br/>");
            application.setAttribute("user1", "admin");
            out.println(application.getAttribute("user1") + "<br/>");
            out.println(config.getServletContext() + "<br/>");
        %>
    </body>
</html>
