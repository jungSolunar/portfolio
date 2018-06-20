/**
 * Created by dhjung on 2018. 6. 20..
 */
// web-01
// window.onload = function () {
//     document.getElementById("button1").onclick = function () {
//         document.getElementById("div1").innerHTML = "Hello JAVASCRIPT";
//     }
//
// }

// web-02
// $(document).ready(function(){
//     var a = $('input').attr("value");
//     console.log(a);
//
//     var b = $('input').attr("type");
//     console.log(b);
//
//     $('input').attr("value", "변경한 값입니다");
// });

// web-03
var temp ="";
window.onload = function () {
    document.getElementById("btn1").onclick = function () {
        document.getElementById("result").innerHTML = document.getElementById("input1").value;
    }
}

$(document).ready(function () {
    $("#btn2").click(function () {
        $("#result").text($("#input1").val());
    });
});