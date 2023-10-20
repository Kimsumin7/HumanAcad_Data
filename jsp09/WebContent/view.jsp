<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	view메뉴
	<a href="insert.do"></a>
	<a href="/jsp09frontcontroller/select.do"></a>
	<a href="http://localhost:8081/jsp09frontcontroller/delete.do"></a>
	<a href="http://localhost:8081<%=request.getContextPath()%>/update.do"></a>
</body>
</html>