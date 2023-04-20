USE quan_ly_sinh_vien;
-- part 1
SELECT address, COUNT(student_id) AS so_luong_hoc_vien
FROM student
GROUP BY address;
-- part 2
SELECT 
    s.student_id, s.student_name, AVG(mark.mark)
FROM
    student s
        JOIN
    mark ON mark.student_id = s.student_id
GROUP BY s.student_id , s.student_name;

-- exercise
-- Hiển thị tất cả các thông tin môn học (bảng subject) có credit lớn nhất.
SELECT 
     s.sub_id,s.sub_name,s.statuss, MAX(credit) AS credit_max
FROM
    subjects s
GROUP BY 
s.sub_id,
s.sub_name,
s.statuss
ORDER BY credit_max DESC
LIMIT 1;
-- Hiển thị các thông tin môn học có điểm thi lớn nhất.
SELECT s.sub_id,s.sub_name,s.statuss,s.statuss ,MAX(mark) AS mark
FROM mark m
INNER JOIN subjects s ON s.sub_id=m.sub_id
GROUP BY 
s.sub_id,s.sub_name,s.statuss,s.statuss
ORDER BY 
mark DESC
LIMIT 1;
-- Hiển thị các thông tin sinh viên và điểm trung bình của mỗi sinh viên, xếp hạng theo thứ tự điểm giảm dần

SELECT s.*,ROUND(AVG(m.mark),0) AS diem_trung_binh
FROM student s
INNER JOIN marks m ON m.student_id=s.student_id
GROUP BY
s.student_id
ORDER BY
diem_trung_binh desc;




