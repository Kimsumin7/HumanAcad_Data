<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>결과 페이지</title>
</head>
<body>
    <h1>결과 페이지</h1>
    <p>총 가격: $<%= request.getAttribute("total") %></p>
    <p>할인 금액: $<%= request.getAttribute("discountAmount") %></p>
    <p>할인 후 총 가격: $<%= request.getAttribute("discountedTotal") %></p>
</body>
</html>
