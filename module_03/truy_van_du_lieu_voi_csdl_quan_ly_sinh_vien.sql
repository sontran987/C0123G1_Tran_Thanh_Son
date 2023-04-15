CREATE DATABASE quan_ly_sinh_vien;
USE quan_ly_sinh_vien;
CREATE TABLE classes(
class_id INT PRIMARY KEY ,
class_name VARCHAR(50) NOT NULL,
start_date DATE,
statuss INT
);
INSERT INTO Classes
VALUES (1, 'A1', '2008-12-20', 1);
INSERT INTO Classes
VALUES (2, 'A2', '2008-12-22', 1);
INSERT INTO Classes
VALUES (3, 'B3', current_date, 0);

CREATE TABLE student(
student_id INT PRIMARY KEY,
student_name VARCHAR(50) NOT NULL,
address VARCHAR(50)NOT NULL,
phone VARCHAR(50) NULL,
statuss INT,
classes_id INT, FOREIGN KEY(classes_id) REFERENCES classes(class_id)
);
INSERT INTO student 
VALUES (1,'Hung', 'Ha Noi', '0912113113', 1, 1);
INSERT INTO student 
VALUES (2,'Hoa', 'Hai phong',NULL, 1, 1);
INSERT INTO student 
VALUES (3,'Manh', 'HCM', '0123123123', 0, 2);
CREATE TABLE subjects(
sub_id INT PRIMARY KEY,
sub_name VARCHAR(50) NOT NULL,
credit INT,
statuss INT
);
INSERT INTO subjects
VALUES (1, 'CF', 5, 1),
       (2, 'C', 6, 1),
       (3, 'HDJ', 5, 1),
       (4, 'RDBMS', 10, 1);
CREATE TABLE marks(
mark_id INT PRIMARY KEY,
sub_id INT,FOREIGN KEY(sub_id) REFERENCES subjects(sub_id),
student_id INT, FOREIGN KEY(student_id) REFERENCES student(student_id),
mark INT,
exam_times INT
);
INSERT INTO marks
VALUES (1,1, 1, 8, 1),
       (2,1, 2, 10, 2),
       (3,2, 1, 12, 1);

-- Hiển thị tất cả các sinh viên có tên bắt đầu bảng ký tự ‘h’
SELECT * FROM student
WHERE student_name LIKE "h%";
-- Hiển thị các thông tin lớp học có thời gian bắt đầu vào tháng 12.
SELECT * FROM classes
WHERE MONTH(start_date)=12 ;
-- Hiển thị tất cả các thông tin môn học có credit trong khoảng từ 3-5.
SELECT * FROM subjects 
WHERE credit BETWEEN 3 AND 5;
-- Thay đổi mã lớp(ClassID) của sinh viên có tên ‘Hung’ là 2.
SET SQL_SAFE_UPDATES=0;
UPDATE student 
SET 
    classes_id = 2
WHERE
student_name="hung";
SET SQL_SAFE_UPDATES=1;
   
SELECT 
    *
FROM
    student;
-- Hiển thị các thông tin: StudentName, SubName, Mark. Dữ liệu sắp xếp 
-- theo điểm thi (mark) giảm dần. nếu trùng sắp theo tên tăng dần.
SELECT student.student_name ,subjects.sub_name ,marks  
FROM marks 
INNER JOIN student ON student.student_id=marks.student_id
INNER JOIN subjects ON subjects.sub_id=marks.sub_id
ORDER BY marks DESC ,student.student_name;
