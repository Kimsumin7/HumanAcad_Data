// $(this).hide()- 현재 요소를 숨김
// $("p").hide()- 모든 <p> 요소를 숨김
// $(".test").hide()- class="test"인 모든 요소를 숨김
// $("#test").hide()- id="test"인 요소를 숨깁니다.


$(document).ready(function() {
    // 현재 요소를 숨기는 버튼 클릭 이벤트 처리
    $("#hideThisButton").click(function() {
        $(this).hide();
    });

    //모든 <p>요소를 숨기는 버튼 클릭 이벤트 처리
    $("#hidePButton").click(function() {
        $("p").hide();
    });

    //class="test"를 가진 모든 요소를 숨기는 버튼 클릭 이벤트 처리
    $("#hideClassButton").click(function() {
        $(".test").hide();
    });

    //id="test"를 가진 요소를 숨기는 버튼 클릭 이벤트 처리
    $("#hideIdButton").click(function() {
        $("#test").hide();
    });
});
