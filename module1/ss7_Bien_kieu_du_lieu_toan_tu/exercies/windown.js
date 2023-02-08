function Add() {
    let number1 = document.getElementById("number1").value;
    let number2 = document.getElementById("number2").value;
    let result = Number(number1)+Number(number2);
    document.getElementById("Result").innerHTML = result;
}
function Sub() {
    let number1 = document.getElementById("number1").value;
    let number2 = document.getElementById("number2").value;
    let result = Number(number1) - Number(number2);
    document.getElementById("Result").innerHTML = result;
}
function Mul() {
    let number1 = document.getElementById("number1").value;
    let number2 = document.getElementById("number2").value;
    let result = Number(number1) * Number(number2);
    document.getElementById("Result").innerHTML = result;
}
function Divi() {
    let number1 = document.getElementById("number1").value;
    let number2 = document.getElementById("number2").value;
    let result = Number(number1) / Number(number2);
    document.getElementById("Result").innerHTML = result;
}