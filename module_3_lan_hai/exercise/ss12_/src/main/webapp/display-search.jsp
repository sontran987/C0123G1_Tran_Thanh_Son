<%--
  Created by IntelliJ IDEA.
  User: TechCare
  Date: 5/31/2023
  Time: 1:40 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>search</title>
</head>
<body>
<table>
  <tr>
    <th>STT</th>
    <th>title</th>
    <th>page size</th>
    <th>author</th>
    <th>category</th>
    <th>Edit</th>
    <th>Delete</th>
  </tr>
  <c:forEach var="b" items="${searchTitle}" varStatus="loop">
    <form action="/BookServlet" method="post">
      <tr>
        <td> <c:out value="${loop.count}"/> </td>
        <td> <c:out value="${b.title}"/> </td>
        <td> <c:out value="${b.pageSize}"/> </td>
        <td> <c:out value="${b.author}"/> </td>
        <td> <c:out value="${b.cateGory}"/> </td>
        <td> <button href="/BookServlet?action=edit">Edit</button> </td>
        <td> <button href="/BookServlet?action=delete">Delete</button> </td>
      </tr>
    </form>
  </c:forEach>
</table>
</body>
</html>
