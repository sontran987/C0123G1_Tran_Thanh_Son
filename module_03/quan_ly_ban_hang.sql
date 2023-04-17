CREATE DATABASE quan_ly_ban_hang;
USE quan_ly_ban_hang;
CREATE TABLE customer (
    id_cus INT PRIMARY KEY,
    name_cus VARCHAR(25),
    age_cus TINYINT
);
INSERT INTO customer VALUES
(1,'Minh Quan',10),
(2,'Ngoc Oanh',20),
(3,'Hong Ha',50);

CREATE TABLE orders (
    id_odr INT PRIMARY KEY,
    id_cus INT,
    FOREIGN KEY (id_cus)
        REFERENCES customer (id_cus),
    date_odr DATE,
    total_price_odr INT NULL
);
INSERT INTO orders VALUES
(1,1,'2006-03-23',Null),
(2,2,'2006-3-26',Null),
(3,1,'2006-3-16',Null);
CREATE TABLE product (
    id_p INT PRIMARY KEY,
    name_p VARCHAR(25),
    price_p INT
);
INSERT INTO product VALUES 
(1,'May Giat',3),
(2,'Tu Lanh',5),
(3,'Dieu Hoa',7),
(4,'Quat',1),
(5,'Bep Dien',2);
CREATE TABLE order_detail (
    id_o INT,
    id_p INT,
    PRIMARY KEY (id_o , id_p),
    FOREIGN KEY (id_o)
        REFERENCES orders (id_odr),
    FOREIGN KEY (id_p)
        REFERENCES product (id_p),
    od_quatity INT
);
INSERT INTO order_detail VALUES
(1,1,3),
(1,3,7),
(1,4,2),
(2,1,1),
(3,1,8),
(2,5,4),
(2,3,3);


-- Hiển thị các thông tin  gồm oID, oDate, oPrice của tất cả các hóa đơn trong bảng Order
SELECT 
    orders.id_odr, orders.date_odr, orders.total_price_odr
FROM
    orders;
-- Hiển thị danh sách các khách hàng đã mua hàng, và danh sách sản phẩm được mua bởi các khách
SELECT 
customer.name_cus, product.name_p
FROM customer
INNER JOIN orders ON customer.id_cus = orders.id_cus
INNER JOIN order_detail ON orders.id_odr =order_detail.id_o
INNER JOIN product ON product.id_p = order_detail.id_p;
-- Hiển thị tên những khách hàng không mua bất kỳ một sản phẩm nào
SELECT 
customer.name_cus
FROM customer
WHERE 
customer.id_cus NOT IN(SELECT DISTINCT id_cus FROM orders);
-- Hiển thị mã hóa đơn, ngày bán và giá tiền của từng hóa đơn (giá một hóa đơn được tính bằng
-- tổng giá bán của từng loại mặt hàng xuất hiện trong hóa đơn. Giá bán của từng loại được tính = odQTY*pPrice)
SELECT orders.id_odr, orders.date_odr, SUM(od.od_quatity * product.price_p) AS 'price' 
FROM orders
JOIN order_detail od ON od.id_o=orders.id_odr
JOIN product p ON p.id_p=product.id_p
GROUP BY orders.id_odr;




