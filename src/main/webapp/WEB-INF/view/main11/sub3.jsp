<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p>${data.list1[0]}</p>
<p>${data.list1[1]}</p>
<p>${data.list1[2]}</p>
<hr>
<p>${data.languages[0]}</p>
<p>${data.languages[1]}</p>
<p>${data.languages[2]}</p>
<p>${data.languages[3]}</p>
<hr>
<p>${data["list1"][0]}</p>
<p>${data["list1"][1]}</p>
<p>${data["list1"][2]}</p>
<hr>
<p>${data["languages"][0]}</p>
<p>${data["languages"][1]}</p>
<p>${data["languages"][2]}</p>
<p>${data["languages"][3]}</p>

</body>
</html>
