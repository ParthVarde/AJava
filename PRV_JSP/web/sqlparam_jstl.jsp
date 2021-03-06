<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>

<sql:setDataSource var="DS" url="jdbc:mysql://localhost:3306/test" user="root" password="root" driver="com.mysql.jdbc.Driver" />

<sql:update var="query2" dataSource="${DS}">
    insert into student values(?,?)
    <sql:param value="${param.id}"/>
    <sql:param value="${param.name}"/>
</sql:update>
    
<!--<sql:query var="query1" dataSource="${DS}">
    select * from student where id=?
    <sql:param value="${param.id}"/>
</sql:query>-->

<sql:query var="query1" dataSource="${DS}">
    select * from student
</sql:query>
    
<c:forEach var="row" items="${query1.rows}">
    <c:out value="${row.id}"></c:out>
    <c:out value="${row.name}"></c:out>
    <br/>
</c:forEach>