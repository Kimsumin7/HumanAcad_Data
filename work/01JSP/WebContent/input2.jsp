<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
물건 이름과 가격 4개값 입력
 여자는 5% 추가활인
 5%10%15%20% 쿠폰 중복사용가능
 
 <form action=output2.jsp method=get>
	물건이름<input type='text' name=name>
	가격<input type='text' name=price><br>
	물건이름<input type='text' name=name>
	가격<input type='text' name=price><br>
	물건이름<input type='text' name=name>
	가격<input type='text' name=price><br>
	물건이름<input type='text' name=name>
	가격<input type='text' name=price><br>
	<input type='radio' name=gender checked value='w'> 여성
	<input type='radio' name=gender value='m'> 남성<br>
	할인률
	<input type='checkbox' name=sale value=5> 5%
	<input type='checkbox' name=sale value=10> 10%
	<input type='checkbox' name=sale value=15> 15%
	<input type='checkbox' name=sale value=20> 20%
	<input type=submit value=전송 >
</form>




</body>
</html>