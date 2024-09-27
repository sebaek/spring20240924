<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p>/main13/sub2</p>
<%--
JSTL : JSP Standard Tag Library

반복된 코드실행
출력 여부

--%>

<%--
if
--%>
<c:if test="false">
    <p>출력이 될까?</p>
</c:if>
<c:if test="${param.g == '남자'}">
    <p>남자입니다.</p>
</c:if>
<c:if test="${param.g == '여자'}">
    <p>여자입니다.</p>
</c:if>

</body>
</html>
