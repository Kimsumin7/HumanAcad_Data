<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
        String data1 = request.getParameter("data1");
        String[] data2 = request.getParameterValues("data2");
    %>

	data1값은 :
	<br>
	<%= data1 %>
	<br>
	data2값은 :
	<br>

	<%
    if (data2 != null) {
        for (String str : data2) {
    %>
	<%= str %>
	<br>
	<%
        }
    } else {
    %>
	값이 없음
	<br>
	<%
    }
    %>
</body>
</html>