INSERT INTO cate_gory VALUES
(1,'Tự nhiên'),
(2,'Xã Hội'),
(3,'Truyện'),
(4,'Tiểu Thuyết'),
(5,'Khác');
INSERT INTO authors VALUES 
(1,'Nguyễn Thái Học'),
(2,'Trần Mình Hoàng'),
(3,'Dương Trung Quốc'),
(4,'Lê Văn Hiến'),
(5,'Hà Văn Minh');
INSERT INTO students VALUES
(1,'Nguyễn Văn A','12-12-1999','C0822G1'),
(2,'Nguyễn Văn B','12-13-1999','C0822G1'),
(3,'Nguyễn Văn C','12-14-1999','C0822G1'),
(4,'Nguyễn Văn D','12-15-1999','C0922G1'),
(5,'Nguyễn Văn E','12-16-1999','C1022G1');
INSERT INTO books VALUES
(1,'Toán',45,1,1),
(2,'Văn',34,2,2),
(3,'Sử',56,3,2),
(4,'Địa',76,4,2),
(5,'Hoá',32,5,1);
INSERT INTO borrows VALUES
(1,1,1,'12-12-2022','12-13-2022'),
(2,2,2,'12-12-2022','12-15-2022'),
(3,3,3,'12-12-2022','12-15-2022'),
(4,4,4,'12-12-2022','12-12-2022'),
(5,1,5,'12-13-2022','12-15-2022'),
(6,1,5,'12-14-2022','12-14-2022'),
(7,3,4,'12-15-2022','12-29-2022'),
(8,3,3,'12-8-2022','12-14-2022'),
(9,1,2,'12-6-2022','12-30-2022');

SELECT b.*,cate.name_cate_gory,au.name_authors FROM books AS b
INNER JOIN authors AS au ON au.id = b.author_id
INNER JOIN cate_gory AS cate ON cate.id=b.cate_gory_id;

SELECT s.* FROM 
students AS s 
INNER JOIN borrows AS bor ON bor.id_student=s.id
GROUP BY
s.id
ORDER BY s.name_student ASC;

SELECT 
    books.*
FROM
    books
        INNER JOIN
    borrows AS bor ON bor.id_books = books.id
GROUP BY bor.id_books
HAVING COUNT(bor.id_books)
ORDER BY COUNT(bor.id_books) DESC
LIMIT 0 , 2;




