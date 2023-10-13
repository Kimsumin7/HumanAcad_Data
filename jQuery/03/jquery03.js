$(document).ready(function(){
    $("*").css("border", "2px solid lightblue");
    $("button").click(function(){
        $(this).text("클릭됨");
    });
    $("p.intro").css("background-color", "yellow");
    $("p:first").css("font-weight", "bold");
});