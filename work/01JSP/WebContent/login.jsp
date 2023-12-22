<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
if(<%=request.getParameter("fail")%>==true){
	alert("실패")	
}
</script>
</head>
<body>
<form action=MyLogin method=get>
아이디<input type="text" name=id>
비번<input type="password" name=pw>
<input type="submit" value="전송">
</form>

</body>
</html>