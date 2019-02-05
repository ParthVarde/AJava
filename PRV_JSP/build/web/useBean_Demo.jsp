<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <body>
        <jsp:useBean id="mybean" class="p1.employee"/>
            <jsp:setProperty name="mybean" property="id" value="5"/>
            <jsp:getProperty name="mybean" property="id"/>
    </body>
</html>
