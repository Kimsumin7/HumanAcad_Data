$(document).ready(function(){
    //첫 번째 순서 목록(<ul>) 안의 첫 번째 목록 항목(<li>)을 선택하고 스타일 변경
    $("ul:first li:first").css("color", "blue");

    //모든 순서 목록(<ul>) 안의 첫 번째 목록 항목(<li>)을 선택하고 스타일 변경
    $("ul li:first-child").css("font-weight", "bold");

    //href 속성을 가진 모든 요소를 선택하고 스타일을 변경
    $("[href]").css("text-decoration", "underline");

    //target 속성 값이 "_blank"인 모든 <a>요소를 선택하고 스타일 변경
    $("a[target='_blank']").css("color", "green");
    
    //target 속성 값이 "_blank"가 아닌 모든 <a>요소를 선택하고 스타일을 변경
    $("a[target!='_blank']").css("color", "red");
});