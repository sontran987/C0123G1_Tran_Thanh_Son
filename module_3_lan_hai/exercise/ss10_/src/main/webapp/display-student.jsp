<%--
  Created by IntelliJ IDEA.
  User: TechCare
  Date: 5/25/2023
  Time: 2:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hien thi danh Sach</title>
</head>
<body>
<h1>${message}</h1>
<table border="1">
    <tr>
        <th>Mã Học viên</th>
        <th>Tên Học Viên</th>
        <th>Giới Tính</th>
        <th>Điểm Số</th>
        <th>Xếp Loại</th>
    </tr>
    <tr>
        <td>${maHocVien}</td>
        <td>${tenHocVien}</td>
        <td>${gioiTinh}</td>
        <td>${diemSo}</td>
        <td>${xepLoai}</td>
    </tr>
</table>
</body>
</html>
