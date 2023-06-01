<%--
  Created by IntelliJ IDEA.
  User: TechCare
  Date: 5/31/2023
  Time: 9:46 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Thêm mới</title>
</head>
<body>
<form action="/BookServlet?action=add" method="post">
  <label>title: </label>
  <input type="text" name="title" placeholder="title">
  <br>
  <label>Page: </label>
  <input type="text" name="pageSize" placeholder="page size">
  <br>
  <label>author: </label>
  <input type="text" name="author" placeholder="author">
  <br>
  <label>Category: </label>
  <input type="text" name="cateGory" placeholder="category">
  <br>
  <button type="submit"> Add</button>
</form>

</body>
</html>
