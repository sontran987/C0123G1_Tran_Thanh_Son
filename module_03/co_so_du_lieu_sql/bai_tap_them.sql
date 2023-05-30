-- + Mỗi một máy tính gồm có các thông tín: mã máy, hãng sản xuất, vị trí đặt máy
-- + Mỗi khách hàng khi sử dụng dịch vụ cần có thông tin : CCDC, tên, SĐT, Email, 
-- Loại khách hàng
-- + Loại khách hàng gồm ( vip, member, other)
-- + Các thông tin cần quản lý  khi khách hàng sử dụng dịch vụ: Mã máy, Mã khách 
-- hàng, thời gian bắt đầu, thời gian kết thúc, dịch vụ đi kèm, tổng tiền thanh toán
-- + Mỗi khách hàng có thể sử dụng nhiều dịch vụ đi kèm, các dịch vụ đi kèm gồm có
-- ( Nước ngọt, bánh mì, thuốc là,)

CREATE DATABASE cua_hang;
use cua_hang;
CREATE TABLE computer(
ma_may INT PRIMARY KEY ,
hang_san_xuat varchar(50) NOT NULL,
vi_tri_dat_may varchar(50) NOT NULL
);
CREATE TABLE loai_khach_hang(
ma INT PRIMARY KEY,
ten_loai_khach VARCHAR(50)
);
CREATE TABLE khach_hang(
cccd INT primary key,
ten VARCHAR(50) not null,
sdt varchar(50) not null,
email varchar(50) not null,
ma_loai_khach varchar(50) not NULL, FOREIGN KEY(ma_loai_khach) references loai_khach_hang(ma)
);
CREATE TABLE dich_vu_di_kem(
ma int primary KEY,
ten_dich_vu_di_kem varchar(50) NOT NULL
);
CREATE TABLE order
