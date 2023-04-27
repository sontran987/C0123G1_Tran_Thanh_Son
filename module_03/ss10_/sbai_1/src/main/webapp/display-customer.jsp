
<%--
  Created by IntelliJ IDEA.
  User: TechCare
  Date: 4/27/2023
  Time: 10:43 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>List Customer</title>
    <Style>
        .list{

            width: 700px;
            margin: 0 auto;
            padding: 0 20px 20px;
            border: solid gray 2px;
        }
        #display{
            float: none;

        }
        img{
            width: 100px;
            height: 90px;
        }

        h1{
         justify-content: center;
            text-align: center;

        }

       th,td{
            padding:0 3vw;
           border-bottom: solid 2px gray;
        }

    </Style>
</head>
<body>
<div class="list">
    <table id="display" >
        <tr><h1>Danh sach khach hang</h1></tr>
        <tr aria-colspan="1">
            <th>STT</th>
            <th>Name</th>
            <th>Brithday</th>
            <th>Address</th>
            <th>Image</th>
        </tr>
        <c:forEach var="customer" items="${customer}" varStatus="status">
            <tr>
                <td>${status.count}</td>
                <td>${customer.getName()}</td>
                <td>${customer.getBrithday()}</td>
                <td>${customer.getAddress()}</td>
                <td><img src="${customer.getImg()}" alt="thanh son"></td>
            </tr>
        </c:forEach>
    </table>
</div>

</body>
</html>
