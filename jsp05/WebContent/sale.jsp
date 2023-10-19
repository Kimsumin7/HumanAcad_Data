<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>원신 원석 구매 페이지</title>
</head>
<body>
	<table border="1">
		<tr>
			<th>물건 이름</th>
			<th>정가</th>
			<th>쿠폰</th>
			<th>할인가</th>
		</tr>
		<tr>
			<td>창세의 결정(1)</td>
			<td><input type="text" name="price1" value="100"></td>
			<td><select name="coupon1">
					<option value="0.05">5% 할인</option>
					<option value="0.10">10% 할인</option>
					<option value="0.15">15% 할인</option>
					<option value="0.20">20% 할인</option>
			</select></td>
			<td>${discountedPrice1}</td>
		</tr>
		<tr>
			<td>창세의 결정(2)</td>
			<td><input type="text" name="price2" value="200"></td>
			<td><select name="coupon2">
					<option value="0.05">5% 할인</option>
					<option value="0.10">10% 할인</option>
					<option value="0.15">15% 할인</option>
					<option value="0.20">20% 할인</option>
			</select></td>
			<td>${discountedPrice2}</td>
		</tr>
		<tr>
			<td>창세의 결정(3)</td>
			<td><input type="text" name="price3" value="300"></td>
			<td><select name="coupon3">
					<option value="0.05">5% 할인</option>
					<option value="0.10">10% 할인</option>
					<option value="0.15">15% 할인</option>
					<option value="0.20">20% 할인</option>
			</select></td>
			<td>${discountedPrice3}</td>
		</tr>
		<tr>
			<td>창세의 결정(4)</td>
			<td><input type="text" name="price4" value="400"></td>
			<td><select name="coupon4">
					<option value="0.05">5% 할인</option>
					<option value="0.10">10% 할인</option>
					<option value="0.15">15% 할인</option>
					<option value="0.20">20% 할인</option>
			</select></td>
			<td>${discountedPrice4}</td>
		</tr>
	</table>
	<form action="CheckoutServlet" method="post">
		<input type="submit" value="계산">
	</form>
</body>
</html>
