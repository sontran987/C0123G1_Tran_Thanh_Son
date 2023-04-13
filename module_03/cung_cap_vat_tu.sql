CREATE DATABASE cung_cap_vat_tu;
USE cung_cap_vat_tu;
CREATE TABLE phieu_xuat (
    so_phieu_xuat INT PRIMARY KEY,
    ngay_xuat DATETIME
);
CREATE TABLE phieu_nhap (
    so_phieu_nhap INT PRIMARY KEY,
    ngay_nhap DATETIME
);
CREATE TABLE sdt (
    sdt VARCHAR(45) PRIMARY KEY,
    ma_ncc INT,
    FOREIGN KEY (ma_ncc) REFERENCES nha_cung_cap(ma_ncc)
);
CREATE TABLE nha_cung_cap (
    ma_ncc INT PRIMARY KEY,
    ten_ncc VARCHAR(50),
    dia_chi TEXT
);
CREATE TABLE don_dat_hang (
    so_don_hang INT PRIMARY KEY,
    ngay_dat_hang DATETIME,
    ma_ncc INT,
    FOREIGN KEY (ma_ncc)
        REFERENCES nha_cung_cap (ma_ncc)
);
CREATE TABLE vat_tu (
    ma_vat_tu INT PRIMARY KEY,
    ten_vat_tu VARCHAR(50)
);
CREATE TABLE chi_tiet_phieu_xuat (
    id INT PRIMARY KEY,
    don_gia_xuat VARCHAR(50),
    so_luong_xuat INT,
    so_phieu_xuat INT,
    FOREIGN KEY (so_phieu_xuat)
        REFERENCES phieu_xuat (so_phieu_xuat),
    ma_vat_tu INT,
    FOREIGN KEY (ma_vat_tu)
        REFERENCES vat_tu (ma_vat_tu)
);
CREATE TABLE chi_tiet_phieu_nhap (
    id INT PRIMARY KEY,
    don_gia_nhap VARCHAR(50),
    so_luong_nhap INT,
    so_phieu_nhap INT,
    FOREIGN KEY (so_phieu_nhap)
        REFERENCES phieu_nhap (so_phieu_nhap),
    ma_vat_tu INT,
    FOREIGN KEY (ma_vat_tu)
        REFERENCES vat_tu (ma_vat_tu)
);
CREATE TABLE chi_tiet_don_dat_hang (
    id INT PRIMARY KEY,
    ma_vat_tu INT,
    FOREIGN KEY (ma_vat_tu)
        REFERENCES vat_tu (ma_vat_tu),
    so_don_hang INT,
    FOREIGN KEY (so_don_hang)
        REFERENCES don_dat_hang (so_don_hang)
);


