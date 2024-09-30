<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <style>
        .footer {
            display: flex;
            gap: 5px;
            justify-content: center;
            border-top: 1px solid black;
            padding: 15px;
        }


        .footer-colum {
            border-left: 1px solid black;
            border-right: 1px solid black;
            padding: 30px;
        }

        .footer-item {
            margin-bottom: 20px;
        }


    </style>
    <title>Title</title>
</head>
<body>
<h1>sub5.jsp</h1>
<h1>Lorem ipsum dolor sit amet.</h1>
<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Dolorem ea in minima nam nemo quasi rem voluptates? Aliquam
    aut distinctio, dolores ex maiores, nihil quaerat quibusdam ratione ullam vero voluptates!</p>

<%-- footer --%>
<%--div.footer>div.footer-colum*3>div.footer-item*5>lorem1--%>
<div class="footer">
    <div class="footer-colum">
        <div class="footer-item">Lorem.</div>
        <div class="footer-item">Id.</div>
        <div class="footer-item">Quo?</div>
        <div class="footer-item">Totam.</div>
        <div class="footer-item">Velit.</div>
    </div>
    <div class="footer-colum">
        <div class="footer-item">Lorem.</div>
        <div class="footer-item">Voluptatem.</div>
        <div class="footer-item">Voluptas?</div>
        <div class="footer-item">Mollitia!</div>
        <div class="footer-item">Beatae?</div>
    </div>
    <div class="footer-colum">
        <div class="footer-item">Lorem.</div>
        <div class="footer-item">Dolores.</div>
        <div class="footer-item">Voluptatibus!</div>
        <div class="footer-item">Accusamus.</div>
        <div class="footer-item">Consectetur!</div>
    </div>
</div>

</body>
</html>
