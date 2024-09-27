<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p>이름:${actor.name}</p>
<p>소속사:${actor.agency}</p>
<p>생일:${actor.birth}</p>
<p>mbti:${actor.mbti}</p>
<p>
    작품
<ul>
    <c:forEach items="${actor.works}" var="work">
        <li>${work}</li>
    </c:forEach>
</ul>
</p>

</body>
</html>
