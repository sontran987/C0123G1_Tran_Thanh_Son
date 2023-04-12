CREATE DATABASE quan_ly_ban_hang;
USE quan_ly_ban_hang;
CREATE TABLE customer (
    id_cus INT PRIMARY KEY,
    name_cus VARCHAR(50),
    age_cus INT
);
CREATE TABLE orders (
    id_odr INT PRIMARY KEY,
    id_cus INT,
    FOREIGN KEY (id_cus)
        REFERENCES customer (id_cus),
    date_odr DATE,
    total_price_odr VARCHAR(50)
);
CREATE TABLE product (
    id_p INT PRIMARY KEY,
    name_p VARCHAR(50),
    price_p VARCHAR(50)
);
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
