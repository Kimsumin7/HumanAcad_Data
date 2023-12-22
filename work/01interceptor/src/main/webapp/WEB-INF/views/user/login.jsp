<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="true" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<form action="/ex/user/loginpost" method="post">
아이디  <input type="text" name=id >
암호     <input type="text" name=pw >
<input type="submit" value="전송">
</form>
<a href="/ex/user/logout">로그 아웃</a>
</body>
</html>
