<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <style>
        .navbar {
            display: flex;
            gap: 5px;
        }

        .nav-item {
            padding: 10px;
        }

        .nav-item:hover {
            background-color: darkgray;
            color: yellow;
        }
    </style>
    <title>Title</title>
</head>
<body>
<%--div.navbar>div.nav-item*5--%>
<div class="navbar">
    <div class="nav-item">증권홈</div>
    <div class="nav-item">국내증시</div>
    <div class="nav-item">해외증시</div>
    <div class="nav-item">시장지표</div>
    <div class="nav-item">리서치</div>
</div>

<hr>
<h1>SUB1.JSP 컨텐츠들</h1>
<%--h2>lorem5^p>lorem--%>
<h2>Lorem ipsum dolor sit amet.</h2>
<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Ab assumenda blanditiis consectetur consequatur deleniti
    dignissimos et, exercitationem fuga fugit harum nemo quam quis recusandae sed temporibus vero voluptatibus. Cum,
    iste.</p>


</body>
</html>
