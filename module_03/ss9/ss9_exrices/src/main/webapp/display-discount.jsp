<%--
  Created by IntelliJ IDEA.
  User: TechCare
  Date: 4/26/2023
  Time: 2:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>display</title>
    <style>
        a{
            text-decoration: none;
        }
    </style>
</head>
<body>
<h2> Product Description: ${Product_Description}</h2>
<h2> List Price: ${List_Price}</h2>
<h2> Discount Percent:${Discount_Percent} </h2>
<h2>Discount amount: ${Discount_Amount}</h2>
<h2>Discount Price:  ${Discount_Price}</h2>
<button><a href="index.jsp">reset</a></button>
</body>
</html>
