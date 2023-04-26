<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <style>
        .content{
            width: 450px;
            margin: 0 auto;
            padding: 0px 20px 20px;
            background: white;
            border:solid navy 2px ;
        }
        label{
            width: 15vw;
            padding-right: 1vw;
            float: left;
        }
        input{
            width: 15vw;
            margin-bottom: 5px;
            float: left;
        }
    </style>
</head>
<body>
<div class="content">
    <h1> Product Discount Calculator </h1>
    <br/>
    <form action="/hello-servlet" method="post">
        <div>
            <label>Product Description: </label>
            <input type="text" name="Product-Description">
            <br>
            <label>List Price:  </label>
            <input type="text" name="List-Price">
            <br>
            <label>Discount Percent:  </label>
            <input type="text" name="Discount-Percent">
            <br>
        </div>
        <div>
            <button type="submit"> Calculate Discount </button>
        </div>
    </form>


</div>

</body>
</html>