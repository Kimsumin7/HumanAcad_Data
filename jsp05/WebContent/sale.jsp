<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>원신 원석 구매 페이지</title>
</head>
<body>
	<form action="CalculatorServlet" method="post">
		<table border="1">
			<tr>
				<td colspan="4">
					<h2>원신 원석 구매 페이지(쿠폰지급중)</h2>
				</td>
			</tr>
			<!-- 창세의 결정(1) -->
			<tr>
				<td><input type="checkbox" name="product1" value="100">
					창세의 결정(1)</td>
				<td>가격: $100</td>
				<td><img src="창세.png" alt="창세의 결정(1) 이미지"></td>
			</tr>
			<!-- 창세의 결정(2) -->
			<tr>
				<td><input type="checkbox" name="product2" value="200">
					창세의 결정(2)</td>
				<td>가격: $200</td>
				<td><img src="창세.png" alt="창세의 결정(2) 이미지"></td>
			</tr>
			<!-- 창세의 결정(3) -->
			<tr>
				<td><input type="checkbox" name="product3" value="300">
					창세의 결정(3)</td>
				<td>가격: $300</td>
				<td><img src="창세.png" alt="창세의 결정(3) 이미지"></td>
			</tr>
			<!-- 창세의 결정(4) -->
			<tr>
				<td><input type="checkbox" name="product4" value="400">
					창세의 결정(4)</td>
				<td>가격: $400</td>
				<td><img src="창세.png" alt="창세의 결정(4) 이미지"></td>
			</tr>
		</table>
		<form action="CalculatorServlet" method="post">
		<br> <label for="coupon">할인 쿠폰 (%):</label> <input type="number"
			id="coupon" name="coupon" step="0.01"> <br> <input
			type="submit" value="계산하기">
		</form>
	</form>
</body>
</html>
