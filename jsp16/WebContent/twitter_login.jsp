<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>트위터 로그인</title>
    <style>
        /* 콘텐츠를 페이지 내에서 가운데 정렬 */
        body {
            display: flex;
            flex-direction: column;
            align-items: center;
            justify-content: center;
        }
    </style>
    <script src="jquery-3.4.1.js"></script>
    <script>
    if (<%= request.getParameter("isSuccess") %> == "false") {
        alert('아이디 혹은 비밀번호가 잘못 입력되었습니다.');
    } else if (<%= request.getParameter("isLogout") %> == "true") {
        alert('로그아웃 되었습니다. 로그인 페이지로 이동합니다.');
    } else if (<%= request.getParameter("isLogin") %> == "false") {
        alert('로그인해야 이용할 수 있는 페이지입니다. 로그인 페이지로 이동합니다.');
    }
    </script>
</head>
<body>
<div class="content">
    <h1>트위터 로그인</h1>
    <form action="twitter_list" method="post">
        <label for="user_id">아이디:</label>
        <input type="text" name="user_id" id="user_id" autocomplete="off" required>
        <br>
        <label for="user_pw">비밀번호:</label>
        <input type="password" name="user_pw" id="user_pw" autocomplete="off" required>
        <br>
        <button type="submit" id="btn">LOGIN</button>
    </form>
</div>
</body>
</html>
