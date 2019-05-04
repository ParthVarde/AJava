<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!--<c:out value="${param.t1}"/>
<c:set var="i" value="${param.t1}"/>
<c:out value="${i}"/>-->

<c:set var="fruit" value="${param.fruit}"/>
<c:if test="${fruit=='Grapes'}">
    I like grapes.
</c:if>
<c:if test="${fruit=='Apple'}">
    I like Apple.
</c:if>
<c:if test="${fruit=='Mango'}">
    I like Mango.
</c:if>
<br/>
<c:out value="You selected ${fruit}"/>
