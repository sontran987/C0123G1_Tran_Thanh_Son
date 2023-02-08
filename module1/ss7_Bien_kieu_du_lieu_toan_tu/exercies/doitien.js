function changemoney() {
    let x =document.getElementById("amount").value;
    let y =document.getElementById("fromC").value;
    let z =document.getElementById("toC").value;
    let Result;

    if(y == "USD" && z == "VND") {
        Result ="Result: " + (x * 27000) +"Đ";
    }
    else if(y == "VND" && z == "USD") {
        Result ="Result: " + (x / 27000) +"$";
    }
    else if (z == "VND"){
        Result = "Result:" + x +"Đ";
    }
    else {
        Result = "Result:" + x +"$";
    }
    document.getElementById("Result").innerHTML =Result;
}
