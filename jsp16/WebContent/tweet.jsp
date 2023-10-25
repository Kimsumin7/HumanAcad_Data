<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE-edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>트위터 글 작성 저장</title>
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
    <%
    // 사용자 이름과 메시지를 가져옴
    String username = request.getParameter("user_id");
    String msg = request.getParameter("tweet_msg");

    // ArrayList를 가져와서 null인 경우 새로운 ArrayList를 생성
    ArrayList<String> msgs = (ArrayList<String>) application.getAttribute("msgs");
    if (msgs == null) {
        msgs = new ArrayList<String>();
        application.setAttribute("msgs", msgs);
    }

    // 이름, 메시지, 날짜 정보를 포함하여 ArrayList에 추가
    msgs.add(username + "::" + msg + ", " + new java.util.Date());

    // 게시글 등록 후 메인 화면으로 이동
    response.sendRedirect("twitter_list.jsp");
    %>
    </script>
</head>
<body>
<h1>트위터 글 작성</
