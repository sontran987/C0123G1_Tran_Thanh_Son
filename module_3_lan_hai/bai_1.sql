create DATABASE book_management;
use book_management;
CREATE TABLE books(
id int primary key,
name_book varchar(50) NOT NULL,
page_size int ,
author VARCHAR(50) not null
);

INSERT INTO books VALUES
(1,'Toán',45,'Nguyễn Thái Học'),
(2,'Văn',34,'Trần Mình Hoàng'),
(3,'Sử',56,'Dương Trung Quốc'),
(4,'Địa',76,'Lê Văn Hiến'),
(5,'Hoá',32,'Hà Văn Minh');

set sql_safe_updates =0;
UPDATE books 
SET page_size=50
WHERE books.name_book = "Sử%";
set sql_safe_updates =1;
DELETE from books 
where books.id=5;

DROP TABLE books;
DROP DATABASE book_management;
