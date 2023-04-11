CREATE DATABASE case_study_furama;
USE case_study_furama;
CREATE TABLE vi_tri(`ma_vi_tri` INT PRIMARY KEY,`ten_vi_tri`VARCHAR(45));
insert into vi_tri values
(1,'Quản Lý'),
(2,'Nhân Viên');
CREATE TABLE trinh_do(`ma_trinh_do`INT PRIMARY KEY,`ten_trinh_do`VARCHAR(45)); 
insert into trinh_do values
(1,'Trung Cấp'),
(2,'Cao Đẳng'),
(3,'Đại Học'),
(4,'Sau Đại Học');

CREATE TABLE bo_phan(ma_bo_phan INT PRIMARY KEY ,`ten_bo_phan`VARCHAR(45));
insert into bo_phan values
(1,'Sale-Marketing'),
(2,'Hành chính'),
(3,'Phục vụ'),
(4,'Quản lý');
CREATE TABLE nhan_vien(
ma_nhan_vien INT primary key,
ho_ten VARCHAR(45) , 
ngay_sinh DATE,
so_cmnd VARCHAR(45),
luong DOUBLE,
so_dien_thoai VARCHAR(45),
email VARCHAR(45),
dia_chi VARCHAR(45),
ma_vi_tri INT,foreign key(ma_vi_tri) references vi_tri(ma_vi_tri),
ma_trinh_do INT,foreign key(ma_trinh_do) references trinh_do(ma_trinh_do),
ma_bo_phan INT, foreign key (ma_bo_phan) references bo_phan(ma_bo_phan));
insert into nhan_vien values
(1,'Nguyễn Văn An','1970-11-07','456231786',10000000,'0901234121','annguyen@gmail.com','295 Nguyễn Tất Thành, Đà Nẵng',1,3,1),
(2,'Lê Văn Bình','1997-04-09','654231234',7000000,'0934212314','binhlv@gmail.com','22 Yên Bái, Đà Nẵng',1,2,2),
(3,'Hồ Thị Yến','1995-12-12','999231723',14000000,'0412352315','thiyen@gmail.com','K234/11 Điện Biên Phủ, Gia Lai',1,3,2),
(4,'Võ Công Toản','1980-04-04','123231365',17000000,'0374443232','toan0404@gmail.com','77 Hoàng Diệu, Quảng Trị',1,4,4),
(5,'Nguyễn Bỉnh Phát','1999-12-09','454363232',6000000,'0902341231','phatphat@gmail.com','43 Yên Bái, Đà Nẵng',2,1,1),
(6,'Khúc Nguyễn An Nghi','2000-11-08','964542311',7000000,'0978653213','annghi20@gmail.com','294 Nguyễn Tất Thành, Đà Nẵng',2,2,3),
(7,'Nguyễn Hữu Hà','1993-01-01','534323231',8000000,'0941234553','nhh0101@gmail.com','4 Nguyễn Chí Thanh, Huế',2,3,2),
(8,'Nguyễn Hà Đông','1989-09-03','234414123',9000000,'0642123111','donghanguyen@gmail.com','111 Hùng Vương, Hà Nội',2,4,4),
(9,'Tòng Hoang','1982-09-03','256781231',6000000,'0245144444','hoangtong@gmail.com','213 Hàm Nghi, Đà Nẵng',2,4,4),
(10,'Nguyễn Công Đạo','1994-01-08','755434343',8000000,	'0988767111','nguyencongdao12@gmail.com','6 Hoà Khánh, Đồng Nai',2,3,2);

CREATE TABLE loai_khach(
ma_loai_khach INT primary key, 
ten_loai_khach VARCHAR(45));
insert into loai_khach values 
(1,'Diamond'),
(2,'Platinium'),
(3,'Gold'),
(4,'Silver'),
(5,'Member');

CREATE TABLE khach_hang(
ma_khach_hang INT primary key,
ho_ten varchar(45),
ngay_sinh date,
gioi_tinh bit(1),
so_cmnd varchar(45),
so_dien_thoai varchar(45),
email varchar(45),
dia_chi varchar(45),
ma_loai_khach int,foreign key(ma_loai_khach) references loai_khach(ma_loai_khach));
insert into khach_hang values 
	(1,	'Nguyễn Thị Hào','1970-11-07',0,'643431213','0945423362','thihao07@gmail.com','23 Nguyễn Hoàng, Đà Nẵng',5),
	(2,	'Phạm Xuân Diệu','1992-08-08',1,'865342123','0954333333','xuandieu92@gmail.com','K77/22 Thái Phiên, Quảng Trị',	3),
	(3,	'Trương Đình Nghệ','1990-02-27',1,'488645199','0373213122','nghenhan2702@gmail.com','K323/12 Ông Ích Khiêm, Vinh',1),
	(4,	'Dương Văn Quan','1981-07-08',1,'543432111','0490039241','duongquan@gmail.com','K453/12 Lê Lợi, Đà Nẵng',1),
	(5,	'Hoàng Trần Nhi Nhi','1995-12-09',0,'795453345','0312345678','nhinhi123@gmail.com',	'224 Lý Thái Tổ, Gia Lai',4),
	(6,	'Tôn Nữ Mộc Châu','2005-12-06',	0,'732434215','0988888844','tonnuchau@gmail.com','37 Yên Thế, Đà Nẵng',	4),
	(7,	'Nguyễn Mỹ Kim','1984-04-08',0,'856453123','0912345698','kimcuong84@gmail.com',',K123/45 Lê Lợi, Hồ Chí Minh',1),
	(8,	'Nguyễn Thị Hào','1999-04-08',0,'965656433','0763212345','haohao99@gmail.com','55 Nguyễn Văn Linh, Kon Tum',3),
	(9,	'Trần Đại Danh','1994-07-01',1,'432341235','0643343433','danhhai99@gmail.com','24 Lý Thường Kiệt, Quảng Ngãi',1),
	(10,'Nguyễn Tâm Đắc','1989-07-01',1,'344343432','0987654321','dactam@gmail.com','22 Ngô Quyền, Đà Nẵng',2);

CREATE TABLE hop_dong(
ma_hop_dong int primary key,
ngay_lam_hop_dong datetime, 
ngay_ket_thuc datetime,
 tien_dat_coc double,
 ma_nhan_vien int,foreign key(ma_nhan_vien) references nhan_vien(ma_nhan_vien),
 ma_khach_hang int,foreign key(ma_khach_hang) references khach_hang(ma_khach_hang),
 ma_dich_vu int,foreign key(ma_dich_vu) references dich_vu(ma_dich_vu));
 
CREATE TABLE hop_dong_chi_tiet(
ma_hop_dong_chi_tiet int primary key,
ma_hop_dong int, foreign key(ma_hop_dong)references hop_dong(ma_hop_dong),
ma_dich_vu int,foreign key(dich_vu) references dich_vu(ma_dich_vu),
so_luong int);

CREATE TABLE dich_vu_di_kem(
ma_dich_vu_di_kem int primary key, 
ten_dich_vu_di_kem varchar(45), 
gia double, don_vi varchar(45), 
trang_thai varchar(45));

CREATE TABLE loai_dich_vu(
ma_loai_dich_vu int primary key, 
ten_loai_dich_vu varchar(45));
insert into loai_dich_vu values
(1,'Villa'),
(2,'House'),
(3,'Room');
CREATE TABLE kieu_thue(
ma_kieu_thue int primary key, 
ten_kieu_thue varchar(45));
insert into kieu_thue values
(1,'year'),
(2,'month'),
(3,'day'),
(4,'hour');
CREATE TABLE dich_vu(
ma_dich_vu int primary key, 
ten_dich_vu varchar(45),
 dien_tich int, 
 chi_phi_thue double, 
 so_nguoi_toi_da int,
 ma_kieu_thue int, foreign key(ma_kieu_thue) references kieu_thue(ma_kieu_thue),
 ma_loai_dich_vu int, foreign key (ma_loai_dich_vu) references loai_dich_vu(ma_loai_dich_vu),
 tieu_chuan_phong varchar(45),
 mo_ta_tien_nghi_khac varchar(45), 
 dien_tich_ho_boi double, 
 so_tang int, 
 dich_vu_mien_phi text);
