// $(document).ready(function(){
//     // 이 안에 있는 코드는 DOM이 완전히 로드된 후에 실행됩니다.
//     // DOM 요소에 대한 조작이 안전하게 수행될 수 있습니다.
// });

//줄인 버전
// $(function(){
//     // 이 안에 있는 코드도 DOM이 완전히 로드된 후에 실행됩니다.
// });

//이런걸 사용하는 이유는 웹 페이지의 DOM요소가 모두 준비 될 때까지
//기다리는 것이 중요한 경우에 유용
//DOM : 문서 객체 모델, 웹 페이지의 구조화된 표현을 나타냄, dom은 웹 페이지
//모든 요소를 트리 구조로 나타낸 것

$(document).ready(function(){
    //버튼 클릭 이벤트 처리
    $("#toggleButton").click(function(){
        //ID가 "myDiv"인 div 요소의 가시성을 토글
        $("#myDiv").toggle();
    });
});