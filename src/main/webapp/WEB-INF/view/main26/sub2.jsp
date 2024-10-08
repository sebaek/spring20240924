<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>국가별 고객 조회</h3>
<form>
    <select name="" id="">
        <option value="Germany">Germany</option>
        <option value="Mexico">Mexico</option>
    </select>
    <div style="border: 1px solid black; margin: 10px;">
        <h5>정렬 조건</h5>
        <input type="radio" name="" id="">
        <label for="">고객명</label>
        <input type="radio" name="" id="">
        <label for="">계약명</label>
    </div>
</form>
<hr>
<%--조회된 고객 데이터들 출력하는 table--%>
<table></table>
</body>
</html>
