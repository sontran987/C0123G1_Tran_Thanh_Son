CREATE DATABASE library;
USE library;

CREATE TABLE students (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name_student VARCHAR(50) NOT NULL,
    brithday VARCHAR(50) NOT NULL,
    class_name VARCHAR(50) NULL
);
CREATE TABLE authors(
id INT AUTO_INCREMENT PRIMARY KEY,
name_authors VARCHAR(50) NOT NULL
);
 INSERT into authors(name_authors) VALUES
 ('thanh Son'),
 ('thanhkim'),
 ('quoc thiet'),
 ('quang dang');

CREATE TABLE cate_gory (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name_cate_gory VARCHAR(50) NOT NULL
);
INSERT into cate_gory(name_cate_gory) VALUES
('tieu thuyet'),
('truyen tranh'),
('sach'),
('phi kim');
CREATE TABLE books (
    id INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(50) NOT NULL,
    page_size INT NOT NULL,
    author_id INT NOT NULL,
    FOREIGN KEY (author_id)
        REFERENCES authors (id),
    cate_gory_id INT NOT NULL,
    FOREIGN KEY (cate_gory_id)
        REFERENCES cate_gory (id)
);
CREATE TABLE borrows(
id INT PRIMARY KEY ,
id_student INT NOT NULL ,FOREIGN KEY(id_student) REFERENCES students(id),
id_books INT NOT NULL ,FOREIGN KEY(id_books) REFERENCES books(id),
borrow_date VARCHAR(50) NOT NULL,
return_date VARCHAR(50) NOT NULL

);
SELECT * from books where books.title LIKE '%a%';
DELETE from books where id = ? ;

DELIMITER //
CREATE PROCEDURE sp_add_book(IN title VARCHAR(50) ,IN page_size INT , IN author_id INT, IN category_id INT)
BEGIN
INSERT INTO books (title,page_size,author_id,cate_gory_id) VALUES
(title,page_size,author_id,category_id);
END //
DELIMITER ;
call sp_add_book(?,?,?,?);
DELIMITER //
CREATE PROCEDURE sp_delete_books(IN id INT)
BEGIN
DELETE from books where books.id=id;
END //
DELIMITER ;


