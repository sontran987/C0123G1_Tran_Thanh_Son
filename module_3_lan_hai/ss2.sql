CREATE DATABASE library;
USE library;

CREATE TABLE students (
    id INT PRIMARY KEY,
    name_student VARCHAR(50) NOT NULL,
    brithday VARCHAR(50) NOT NULL,
    class_name VARCHAR(50) NULL
);
CREATE TABLE authors(
id INT PRIMARY KEY,
name_authors VARCHAR(50) NOT NULL
);

CREATE TABLE cate_gory (
    id INT PRIMARY KEY,
    name_cate_gory VARCHAR(50) NOT NULL
);

CREATE TABLE books (
    id INT PRIMARY KEY,
    title VARCHAR(50) NOT NULL,
    page_size INT,
    author_id INT NOT NULL,
    FOREIGN KEY (author_id)
        REFERENCES authors (id),
    cate_gory_id INT NOT NULL,
    FOREIGN KEY (cate_gory_id)
        REFERENCES cate_gory (id)
);
CREATE TABLE borrows(
id INT PRIMARY KEY,
id_student INT,FOREIGN KEY(id_student) REFERENCES students(id),
id_books INT,FOREIGN KEY(id_books) REFERENCES books(id),
borrow_date VARCHAR(50),
return_date VARCHAR(50)

);