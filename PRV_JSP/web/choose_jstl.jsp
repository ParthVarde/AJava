<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="fruit" value="${param.fruit}"/>
<c:choose>
    <c:when test="${fruit == 'Grapes'}">
        I like Grapes.
    </c:when>
    <c:when test="${fruit == 'Apple'}">
        I like Apple.
    </c:when>
    <c:when test="${fruit == 'Mango'}">
        I like Mango.
    </c:when>
    <c:otherwise>
        Default : I like all Fruits.
    </c:otherwise>
</c:choose>