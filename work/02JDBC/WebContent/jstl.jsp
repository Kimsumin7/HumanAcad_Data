<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<c:out value="hello World"/>

<c:out value="hello World">기본값</c:out>
<c:out value="hello World" default="기본값"></c:out>

<c:out value="${null }" default="기본값"></c:out>
<br>
<c:out value="${null }"></c:out>
</body>
</html>










