<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Read</title>
</head>
<body>
    <h1>쿠키 조회</h1>
    <%
    Cookie[] cookies = (Cookie[]) request.getAttribute("cookies");
    for (int i = 0; i < cookies.length; i++) {
        String name = cookies[i].getName();
        String value = cookies[i].getValue();
        int age = cookies[i].getMaxAge();
        out.println("Cookie [" + i + "] name: " + name + "<br>");
        out.println("Cookie [" + i + "] value: " + value + "<br>");
        out.println("Cookie [" + i + "] age: " + age + "<br>");
        out.println("<br>");
    }
    %><br>
    <a href="main.html">메인으로 이동</a>
</body>
</html>
