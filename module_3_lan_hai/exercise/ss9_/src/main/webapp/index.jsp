<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <style>
        .login{
            text-align: center;
        }
        label{
            text-align: right;
        }
        input{
            text-align: left;
            margin: 5px;
            padding: 5px;
        }
        button{
            margin-left: -55px;
        }
    </style>
</head>
<body>
<div class="login">
    <h1>Login</h1>
    <br/>
    <form action="/LoginServlet?action=login" method="post">
        <label for="user" >Username: </label>
        <input name="name" type="text" id="user" placeholder="username">
        <br>
        <label for="pass">Password: </label>
        <input name="pass" type="text" id="pass" placeholder="password">
        <br>
        <button> Login</button>
    </form>
    ${thongbao}
</div>

</body>
</html>