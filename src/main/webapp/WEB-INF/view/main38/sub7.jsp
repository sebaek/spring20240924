<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>고객 정보 수정</h3>
<form action="/main38/sub8" method="post">
    <div>
        고객번호
        <input type="text" name="id" value="">
    </div>
    <div>
        이름
        <input type="text" name="name" value="">
    </div>
    <div>
        계약명
        <input type="text" name="contactName" value="">
    </div>
    <div>
        주소
        <input type="text" name="address" value="">
    </div>
    <div>
        도시
        <input type="text" name="city" value="">
    </div>
    <div>
        우편번호
        <input type="text" name="postalCode" value="">
    </div>
    <div>
        국가
        <input type="text" name="country" value="">
    </div>
    <div>
        <button>저장</button>
    </div>
</form>
</body>
</html>
