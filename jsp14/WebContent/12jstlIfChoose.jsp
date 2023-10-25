<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix ="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <form action = "number.jsp" method ="post">
        <p>숫자:<input type = "text" name="number">
        <p><input type ="submit" value="전송">
    </form>
    <% String number = "";
    if (request.getParameter("number") == null){
        number = "0";
        
    }
    else number = request.getParameter("number");
    %>
    <c:set var = "number" value="<%=number %>"/>
    <c:choose>
        <c:when test="${number%2==0 }">
            <c:out value="${number}"/> : 짝수입니다.
        </c:when>
    </c:choose>
    <c:choose>
        <c:when test="${number%2!=0 }">
            <c:out value="${number }"/> : 홀수입니다.
        </c:when>
    </c:choose>
</body>
</html>
