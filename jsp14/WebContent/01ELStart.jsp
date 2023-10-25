<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
</head>
<body>
<!-- 표현 언어 (Expression Language) 값을 쉽게 가져오기 위해서 사용 -->
<!-- 다음 3가지 방법은 모두 같은 방법인데 앞으로 EL를 사용하자. -->
${"hello"}<br>
<%="hello" %><br> <!-- 표현식 -->
<%out.println("hello"); %> <!-- 스크립틀릿 -->
<!-- EL로 표시할 수 있는 자료형 -->
정수형: ${10}<br>
실수형: ${20.3}<br>
문자형: ${"park"}<br>
논리형: ${true}<br>
null: ${null}<br>
<!-- 일반적으로 null를 찍어면 null이라고 나오지만 EL에서는 아무것도 출력되지 않는다. -->
<br>
<!-- EL 연산 -->
\${5+2} = ${5+2}<br>
\${5/2} = ${5/2}<br>
\${5 mod 2} = ${5 mod 2}<br>
\${5>2} = ${5>2}<br>
\${2 gt 10} = ${2 gt 10}<br>
\${5>2?5:2} = ${5>2?5:2}<br>
\${(5>2)||(2<10)} = ${(5>2)||(2<10)}<br>
</body>
</html>
