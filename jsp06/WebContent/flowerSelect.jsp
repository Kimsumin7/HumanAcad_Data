<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>원하는 꽃 선택 출력</title>
</head>
<body>

출력을 원하는 꽃을 선택하세요
<from action="FlowerServlet" method="get">
<from action="checkbox" name="flower" value="은방울꽃.jng">은방울꽃
<from action="checkbox" name="flower" value="카네이션.jng">카네이션
<from action="checkbox" name="flower" value="코스모스.jng">코스모스
<input type="submit" value="확인">
</body>
</html>