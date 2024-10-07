<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>상품명</h3>
<ul>

    <c:forEach items="${names}" var="n">
        <li>${n}</li>
    </c:forEach>
</ul>
</body>
</html>
