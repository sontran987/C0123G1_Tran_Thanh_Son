<%--
  Created by IntelliJ IDEA.
  User: TechCare
  Date: 5/31/2023
  Time: 2:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Edit</title>
</head>
<body>
<form action="/BookServlet?action=edit" method="post">

    <label>id: </label>
    <input type="text" name="id" value="${book.id}" readonly>
    <br>
    <label>title: </label>
    <input type="text" name="title" value="${book.title}" >
    <br>
    <label>Page: </label>
    <input type="text" name="pageSize" value="${book.pageSize}" >
    <br>
    <label>author: </label>
    <select  name="author">
        <option value="${book.author.idAuthor}" >${book.author.nameAuthor}</option>
        <c:forEach var="au" items="${author}" varStatus="loops">
            <option  value="${au.idAuthor}" >${au.nameAuthor}</option>
        </c:forEach>
    </select>
    <br>
    <label>Category: </label>
    <select name="cateGory" >
        <option value="${book.category.idCategory}" >${book.category.nameCategory}</option>
        <c:forEach var="cate" items="${category}" varStatus="loop">
            <option  value="${cate.idCategory}" >${cate.nameCategory}</option>
        </c:forEach>
    </select>
    <br>
    <button type="submit"> Edit</button>
</form>
</body>
</html>
