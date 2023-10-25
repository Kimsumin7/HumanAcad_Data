<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix ="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:out value="hello world!" />
	<br>
	<c:out value="name:${param.name }" />
	<br>
	
	<c:set var="msg" value="hello" />
	\${msg }=${msg }
	<br>

	<c:set var="msg" value="${name }" />
	\${msg }=${msg }
	<br>

	<c:set var="age" value="30" />
	\${age }=${age }
	<br>

	<c:set var="age">
	15
	</c:set>
	\${age }=${age }
	<br>
	<br>

	<%
		pageContext.setAttribute("name", "page Name1");
				request.setAttribute("name", "page Name2");
				session.setAttribute("name", "page Name3");
				application.setAttribute("name", "page Name4");
	%>
	page속성 : ${pageScope.name}
	<hr>
	request속성 : ${requestScope.name }
	<hr>
	session속성 : ${sessionScope.name }
	<hr>
	name : ${name }
	<hr>
</body>
</html>
