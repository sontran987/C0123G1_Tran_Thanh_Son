<%--
  Created by IntelliJ IDEA.
  User: TechCare
  Date: 5/31/2023
  Time: 9:46 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
  <select name="author">
    <c:forEach var="au" items="${listAu}" varStatus="lop">
      <option  value="${au.idAuthor}" >${au.nameAuthor}</option>
    </c:forEach>
  </select>
  <br>
  <label>Category: </label>
  <select name="cateGory">
    <c:forEach var="cate" items="${listCate}" varStatus="lop">
      <option value="${cate.idCategory}" >${cate.nameCategory}</option>
    </c:forEach>
  </select>
  <br>
  <button type="submit"> Add</button>
</form>

</body>
</html>
