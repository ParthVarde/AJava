<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>

<c:import var="stud" url="Person.xml"/>

<x:parse var="display" xml="${stud}"/>

<x:out select="$display/Person/student[1]/name"/>

<x:if select="$display/Person/student[1]/name='XYZ'">
    <x:out select="$display/Person/student[1]/marks"/>
</x:if>

<x:forEach var="data" select="$display/Person/student/name">
    <ul>
        <li><x:out select="$data"/></li>
    </ul>
</x:forEach>

<x:forEach var="data" select="$display/Person/student">
    <x:choose>
        <x:when select="$data/marks>40">
            <x:out select="$data/name"/>
        </x:when>
    </x:choose>
</x:forEach>
