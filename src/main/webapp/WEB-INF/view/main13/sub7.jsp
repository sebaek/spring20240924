<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<c:forEach items="${people}" var="person">
    <p>${person.getKey()} : ${person.getValue()}</p>
</c:forEach>


<c:forEach items="${people}" var="person">
    <p>${person.key} : ${person.value}</p>
</c:forEach>
</body>
</html>
