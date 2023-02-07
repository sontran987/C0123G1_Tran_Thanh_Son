function changemoney() {
    let amount =document.getElementById("amount").value;
    let from =document.getElementById("fromC").value;
    let to =document.getElementById("toC").value;
    let Result;

    if(from == "USD" && to == "VND"){
        Result ="Result: " + (amount*27000) +"Đ";
    }
    else if(from == "VND" && to == "USD"){
        Result ="Result: " + (amount/27000) +"$";
    }
    else if (from == "VND") {
        Result="Result:" + amount + " Đ"
    } else {
        Result = "Result: " + amount + " $"
    }
    document.getElementById("Result").innerHTML =Result;
}
