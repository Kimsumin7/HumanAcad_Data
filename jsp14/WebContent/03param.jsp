<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	(스크립틀립)
	<br> 설명:
	<%=request.getParameter("name")%><br> 숫자1:
	<%=request.getParameter("num1")%><br> 숫자2:
	<%=request.getParameter("num2")%><br> (EL 방식)
	<br> 설명: ${param.name }
	<br> 숫자1: ${param.num1 }
	<br> 숫자2: ${param.num2 }
	<br> 사용자 입력 처리
	<br> 한 개의 데이터는 param에 받고, 여러 개의 데이터는 paramValues로 받습니다. 아이디:
	${param.id }: ${param["id"] }
	<br> 선택한 동물: ${paramValues.animal[0]}
	<br> ${paramValues.animal[1]}
	<br> ${paramValues.animal[2]}
	<br> ${paramValues['animal'][0] }
	<br> ${paramValues['animal'][1] }
	<br> ${paramValues['animal'][2] }
	<br> 나중에 JSTL을 배워서 반복문을 사용하여 유동적인 데이터를 처리할 수 있습니다.
	<br> ${empty str1}과 ${not empty str2}는 해당 변수가 비어 있는지 여부를 확인하는 EL의
	조건문 예시입니다.

	<%
 	request.setAttribute("str1", null);
 	request.setAttribute("str2", "hello");
 %>
	${empty str1} == true ${empty str2} == false ${not empty str2} == true
	null를 넣었을 때
	<br> request null:
	<%=request.getParameter("id")%>:null 찍힘
	<br> EL null: ${param.id }:null 안찍힘
	<br> (스크립틀립)
	<br>
	<%=request.getParameter("name").equals("park")%><br> (EL 방식)
	<br> EL == 연산자 사용 결과: ${param.name == "park" }
	<br> (스크립틀립)
	<br>넘어온 값 연산
	<br>
	<br>

	<%
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
	%>

	<%=num1%>+<%=num2%>
	=
	<%=num1 + num2%>
	<br> EL 사용한 방법
	<br> ${param.num1}+${param.num2}=${param.num1+param.num2 }
	<br>
</body>
</html>
