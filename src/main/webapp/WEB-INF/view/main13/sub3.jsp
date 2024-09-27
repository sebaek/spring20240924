<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%-- jstl choose tag--%>
<%-- ?country=uk--%>
<%-- ?country=jp--%>
<%-- ?country=kr--%>

<c:choose>
    <c:when test="${param.country == 'uk'}">
        <p>해리 케인</p>
    </c:when>
    <c:when test="${param.country == 'jp'}">
        <p>오타니 </p>
    </c:when>
    <c:when test="${param.country == 'kr'}">
        <p>흥민</p>
    </c:when>
    <c:when test="${not empty param.country}">
        <p>해당 선수가 없습니다.</p>
    </c:when>
    <c:otherwise>
        <p>국가를 선택해주세요.</p>
    </c:otherwise>
</c:choose>
</body>
</html>
