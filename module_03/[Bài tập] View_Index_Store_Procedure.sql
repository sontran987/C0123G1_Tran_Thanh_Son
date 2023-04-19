CREATE DATABASE demo;
USE demo;
CREATE TABLE products(
id INT PRIMARY KEY,
productCode VARCHAR(45) NOT NULL,
productName VARCHAR(50) NOT NULL,
productPrice VARCHAR(50),
productAmount INT,
productDescription VARCHAR(50) NULL,
productStatus VARCHAR(50) NOT NULL
);
INSERT INTO products VALUES
(1,"SS-01","Sam Sung","12300000",120,"cos cac chuc nang","tot"),
(2,"SS-03","nokia","12300000",120,"cos cac chuc nang","tot"),
(3,"SS-04","Sam Sunggalaxy note 10","12300000",120,"cos cac chuc nang","tot"),
(4,"SS-05","Iphone 18","12300000",120,"cos cac chuc nang","tot"),
(5,"SS-06","Iphone 18 Promax","12300000",120,"cos cac chuc nang","tot");
 
CREATE UNIQUE INDEX i_productCode ON products(productCode);
CREATE INDEX i_producName_price ON products(productName,productPrice);
DROP INDEX i_productCode ON products;
EXPLAIN SELECT * FROM products WHERE products.productCode ='SS-03' ;
EXPLAIN SELECT * FROM products AS p WHERE p.productName="Iphone 18" ;
SELECT * FROM products AS p WHERE p.productName LIKE "Iphone 18" ;
SELECT * FROM products AS p WHERE p.productName="Iphone 18 promax" ;


CREATE VIEW w_products AS
SELECT p.id,p.productName,p.productPrice, p.productStatus  FROM products AS p;
SELECT*FROM w_products;
UPDATE w_products SET productName="Thanh Son" WHERE productName="Iphone 18";
DELETE FROM w_products WHERE productName="Thanh Son" ;
DROP VIEW w_products;

DELIMITER //
CREATE PROCEDURE get_all_product()
BEGIN 
SELECT * FROM products ;
END //
DELIMITER ;
DELIMITER //
CREATE PROCEDURE add_products(IN id INT,IN productCode VARCHAR(45),IN productName VARCHAR(50),IN productPrice VARCHAR(50),IN productAmount INT,IN productDescription VARCHAR(50),IN productStatus VARCHAR(50))
BEGIN
INSERT INTO products VALUES
(id,productCode,productName,productPrice,productAmount,productDescription,productStatus);
END //
DELIMITER ;
CALL add_products(8,"IP-11","Iphone 11","1000002",12,null,"ok" );

DELIMITER //
CREATE PROCEDURE edit_products(IN p_id INT,IN productCode VARCHAR(45),IN productName VARCHAR(50),IN productPrice VARCHAR(50),IN productAmount INT,IN productDescription VARCHAR(50),IN productStatus VARCHAR(50))
BEGIN 
UPDATE  products SET id=id , productCode=productCode , productName=productName, productPrice=productPrice, productAmount=productAmount, productDescription=productDescription,  productStatus=productStatus WHERE id=p_id;
END //
DELIMITER ;
CALL edit_products(8,"IP-120","Iphone 9212","9012",902,null,"nat" );

DELIMITER //
CREATE PROCEDURE deleter(IN p_id INT)
BEGIN
DELETE FROM products WHERE id=p_id;
END //
DELIMITER ;
CALL deleter(8);