var VM = 0;

function Money(type, inputBill) {
    str = "";
    if (type == 0) {
        VM += inputBill;
    } else {
        if (VM >= inputBill) {
            VM -= inputBill;
            if (type == 1) {
                str += "<img src='./img/콜라.jpg' width='50'>"
            } else if (type == 2) {
                str += "<img src='./img/사이다.jpg' width='50'>"
            } else if (type == 3){
                str += "<img src='./img/환타.jpg' width='50' height='100'>"
            } else{
                str += "<img src='./img/블랙.gif' width='60' height='100'>"
            }
        } else{
            alert("금액이 부족합니다.");
        }
    }
    
    document.getElementById("f2").innerHTML += str;
    document.getElementById("f1").value = VM + "원";
}

function RM(){
    var C5_count = 0;
    var C1_count = 0;

    while(true) {
        if (VM >= 500) {
            VM -= 500;
            C5_count++;
        } else if(VM >= 100){
            VM -= 100;
            C1_count++;
        }
        else{
           break;
        }
   }

   document.getElementById("f1").value=VM+"원";
   document.getElementById("f3").value=C5_count;
   document.getElementById("f4").value=C1_count;
}
