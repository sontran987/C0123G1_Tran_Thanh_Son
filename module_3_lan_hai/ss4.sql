-- - Thông kê các đầu sách được mượn nhiều nhất
SELECT books.*,COUNT(bor.id_books) as so_lan_muon  FROM books 
INNER JOIN borrows AS bor ON bor.id_books=books.id
GROUP BY bor.id_books
ORDER BY 
bor.id_books;

-- - Thông kê các đầu sách chưa được mượn
SELECT 
    *
FROM
    books
WHERE
    books.id NOT IN (SELECT 
            borrows.id_books
        FROM
            borrows);

-- - Lấy ra danh sách các học viên đã từng mượn sách và sắp xếp  theo số lượng mượn sách từ lớn đến nhỏ
SELECT s.*,COUNT(s.id) AS so_lan_muon_sach FROM  students AS s
INNER JOIN borrows AS bor ON bor.id_student=s.id
GROUP BY
bor.id_student
ORDER BY
so_lan_muon_sach DESC;
-- - Lấy ra các học viên mượn sách nhiều nhất của thư viện
CREATE VIEW w_max AS
    SELECT 
        s.*, COUNT(bor.id_student) AS so_lan_muon
    FROM
        students AS s
            INNER JOIN
        borrows AS bor ON bor.id_student = s.id
    GROUP BY bor.id_student;
SELECT * from w_max ;
SELECT max(so_lan_muon) from w_max;
SELECT * FROM w_max 
GROUP BY
w_max.id
HAVING max(so_lan_muon)
ORDER BY
MAX(so_lan_muon);

SELECT max(w_max.so_lan_muon)FROM w_max;
SELECT * FROM w_max
WHERE w_max.so_lan_muon IN ( SELECT MAX(w_max.so_lan_muon) FROM w_max);

