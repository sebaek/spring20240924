<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%-- var 속성의 이름으로 test 연산 결과가 el 객체(attribute)에 저장됨 --%>
<c:if test="${param.age < 21}" var="forKids">
    <p>어린이용 컨텐츠1</p>
</c:if>
<c:if test="${param.age >= 21}" var="forAdults">
    <p>성인용 컨텐츠1</p>
</c:if>
<hr>
<c:if test="${forKids}">
    <p>어린이용 컨텐츠2</p>
</c:if>
<c:if test="${forAdults}">
    <p>성인용 컨텐츠2</p>
</c:if>

<hr>
<%-- loc 요청 파라미터가 kr 이면 한국 컨텐츠들--%>
<%-- loc 요청 파라미터가 us 이면 미국 컨텐츠들--%>

<p>한국 컨텐츠1</p>
<p>미국 컨텐츠1</p>

<p>여러 코드들...</p>

<p>한국 컨텐츠2</p>
<p>미국 컨텐츠2</p>


</body>
</html>
