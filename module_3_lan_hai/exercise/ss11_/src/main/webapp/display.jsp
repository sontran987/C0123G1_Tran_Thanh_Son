<%--
  Created by IntelliJ IDEA.
  User: TechCare
  Date: 5/31/2023
  Time: 8:16 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Display</title>
</head>
<body>
<button ><a href="/BookServlet?action=add">Add Book New</a></button>
<form action="/BookServlet?action=search" method="post">
    <input type="text" name="search" placeholder="Search">
    <button type="submit">Submit</button>
</form>
<table class="container-fluid " border="2 solid">
    <tr>
        <th>STT</th>
        <th>title</th>
        <th>page size</th>
        <th>author</th>
        <th>category</th>
        <th>Edit</th>
        <th>Delete</th>
    </tr>

   <c:forEach var="b" items="${list}" varStatus="loop">
           <tr>
               <td> <c:out value="${loop.count}"/> </td>
               <td> <c:out value="${b.title}"/> </td>
               <td> <c:out value="${b.pageSize}"/> </td>
               <td> <c:out value="${b.author}"/> </td>
               <td> <c:out value="${b.cateGory}"/> </td>
               <td> <button ><a href="/BookServlet?action=edit&id=${b.id}">Edit</a></button></td>
               <td> <button ><a href="/BookServlet?action=delete&id=${b.id}">Delete</a></button> </td>
           </tr>
   </c:forEach>

</table>
</body>
</html>
