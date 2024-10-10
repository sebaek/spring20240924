<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>주문 목록 (페이징)</h3>
<table>
    <thead>
    <tr>
        <th>id</th>
        <th>고객id</th>
        <th>직원id</th>
        <th>주문일</th>
        <th>배송id</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${orderList}" var="order">
        <tr>
            <td>${order.id}</td>
            <td>${order.customerId}</td>
            <td>${order.employeeId}</td>
            <td>${order.orderDate}</td>
            <td>${order.shipperId}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<div style="margin: 10px;">
    <c:forEach begin="1" end="${lastPageNumber}" var="pageNumber">
        <c:url value="/main27/sub6" var="link">
            <c:param name="page" value="${pageNumber}"></c:param>
        </c:url>
        <a href="${link}">${pageNumber}</a>
    </c:forEach>
</div>
</body>
</html>
