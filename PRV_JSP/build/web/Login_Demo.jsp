<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <body>
        <% 
            String user = request.getParameter("name");
            out.println("Welcome " + user);
        %>
    </body>
</html>
