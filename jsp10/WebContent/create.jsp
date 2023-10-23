<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Create</title>
</head>
<body>
    <h1>쿠키 설정 페이지</h1>
    <% request.setCharacterEncoding("utf-8"); %>
    name: <%= request.getAttribute("name") %><br>
    value: <%= request.getAttribute("value") %><br>
    age: <%= request.getAttribute("age") %><br>
    <br>
    <a href="main.html">메인으로 이동</a>
</body>
</html>
