<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p>/main13/sub1.jsp</p>
<p>${attr1}</p>
<%-- EL implicit objects --%>
<%-- 총 11개 (아래사이트 참고)--%>
<%--https://www.javatpoint.com/EL-expression-in-jsp--%>

<%--
param, paramValues,
pageScope, requestScope, sessionScope, applicationScope
--%>

<%--
param : request parameter 를 map으로 담은 객체
--%>
<%-- ?name=흥민&age=33--%>
<p>${param.name}</p> <%--흥민--%>
<p>${param.age}</p> <%--33--%>

<%-- ?address=seoul&city=jeju --%>
<p>${param["address"]}</p>
<p>${param.city}</p>

<%-- 쿼리스트링 작성하고 요청 보내기 --%>
<p>${param.email}</p>
<p>${param.hobby}</p>
<p>${param.score}</p>
<p>${param.location}</p>

</body>
</html>
