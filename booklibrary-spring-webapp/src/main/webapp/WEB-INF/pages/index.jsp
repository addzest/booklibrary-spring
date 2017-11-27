<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
    <head>
        <title>Title</title>
    </head>
    <body>
    <table>
        <thead>
        <tr>
        <th>title</th>
        <th>author</th>
        <th>publishyear</th>
        <th>description</th>
            <th>count</th>
    </tr>
    </thead>
    <c:forEach items="${bookTOList}" var="bookTO">
    <tr>
        <td><c:out value="${bookTO.title}" escapeXml="true"/></td>
        <td><c:out value="${bookTO.author}" escapeXml="true"/></td>
        <td><c:out value="${bookTO.publishYear}" escapeXml="true"/></td>
        <td><c:out value="${bookTO.description}" escapeXml="true"/></td>
        <td><c:out value="${bookTO.count}" escapeXml="true"/></td>
    </tr>
        </c:forEach>
</table>
</body>
</html>