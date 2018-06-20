/**
 * Created by dhjung on 2018. 6. 20..
 */
// window.onload = function () {
//     document.getElementById("button1").onclick = function () {
//         document.getElementById("div1").innerHTML = "Hello JAVASCRIPT";
//     }
//
// }

$(document).ready(function(){
    var a = $('input').attr("value");
    console.log(a);

    var b = $('input').attr("type");
    console.log(b);

    $('input').attr("value", "변경한 값입니다");
});