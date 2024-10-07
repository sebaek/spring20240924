<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <style>
        table {
            border-collapse: collapse;
        }

        th, td {
            border: 1px solid black;
        }
    </style>
    <title>Title</title>
</head>
<body>
<table>
    <thead>
    <tr>
        <th>번호</th>
        <th>First Name</th>
        <th>Last Name</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${employeeList}" var="e">
        <tr>
            <td>${e.id}</td>
            <td>${e.firstName}</td>
            <td>${e.lastName}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
