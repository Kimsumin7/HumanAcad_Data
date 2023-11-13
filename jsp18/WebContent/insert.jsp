<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
<script>
$(function(){ 
    $("button").click(function(){ 
        event.preventDefault(); 
        $("#displayHobby").append("<div><input type=text name=hobbys><button>X</button></div>");
    });

    $("#displayHobby").on("click","button",function(){ 
        event.preventDefault(); 
        // alert("test"); 
        $(this).parent().remove(); 
    });
});
</script>
</head>
<body>
<form action="/jsp18/customerHobbys/insertDB.customerHobbys" method="get"> 
	이름: <input type="text" name="name"><br>
	키: <input type="text" name="height"><br>
	생일: <input type="text" name="birthday"><br>
	취미: <div id='displayHobby'></div>
	<button>취미 추가</button>
	<input type="submit" value="전송">
	</form>
</body>
</html>