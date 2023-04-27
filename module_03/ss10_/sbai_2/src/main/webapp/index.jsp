<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <style>
        .from {
            width: 450px;
            margin: 0 30vw;
            padding: 0 5vw 10vw;
            text-align: center;
        }

        .data {
            text-align: left;
            float: left;
        }

        label {
            float: left;
            width: 150px;
        }

        button, select, input {
            margin-top: 2px;
            float: left;
        }

        button {
            margin-left: 150px;
        }
    </style>
</head>
<body>
<div class="from">
    <h1>Simple Calculator</h1>
    <form class="data" action="/calculator" method="post">
        <fieldset>
            <legend>Calculator</legend>
            <label>First operand: </label>
            <input type="text" name="first">
            <br>
            <label>Operator:</label>
            <select name="operator">
                <option value="+">summation</option>
                <option value="-">Subtraction</option>
                <option value="*">multiplication</option>
                <option value="/">division</option>
            </select>
            <br>
            <label> Second operand: </label>
            <input type="text" name="second">
            <br>
            <button type="submit">Calculate</button>
        </fieldset>

    </form>
</div>
<h2>Result:   ${result} </h2>
</body>
</html>