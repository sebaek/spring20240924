<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%-- forEach : 반복 --%>

<c:forEach begin="1" end="3">
    <p>반복해야하는 컨텐츠</p>
</c:forEach>
<hr>
<c:forEach begin="0" end="4">
    <p>다섯번</p>
</c:forEach>

<c:forEach begin="1" end="5" var="idx">
    <p>${idx} 번</p>
</c:forEach>

<%-- begin 보다 end가 커야함 --%>
<%-- begin 의 값은 음수가 될 수 없음 --%>
<hr>
<p>11</p>
<p>12</p>
<p>13</p>
<p>14</p>
<p>15</p>
</body>
</html>
