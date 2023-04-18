-- 2.	Hiển thị thông tin của tất cả nhân viên có trong hệ thống có tên 
-- bắt đầu là một trong các ký tự “H”, “T” hoặc “K” và có tối đa 15 kí tự.
USE case_study_furama;
SELECT * FROM nhan_vien AS nv 
WHERE ho_ten LIKE "H%" or ho_ten LIKE "T%" OR ho_ten LIKE "K%" AND length(nv.ho_ten)<=15;
-- 3.Hiển thị thông tin của tất cả khách hàng có độ tuổi từ 18 đến 50 tuổi và
--  có địa chỉ ở “Đà Nẵng” hoặc “Quảng Trị”.
SELECT kh.* FROM khach_hang AS kh 
WHERE (ROUND(datediff(curdate(),kh.ngay_sinh)/365) BETWEEN 18 AND 50 )
 AND (kh.dia_chi LIKE "% Đà Nẵng" OR kh.dia_chi LIKE "% Quảng Trị");
 -- 4.Đếm xem tương ứng với mỗi khách hàng đã từng đặt phòng bao nhiêu lần. 
 -- Kết quả hiển thị được sắp xếp tăng dần theo số lần đặt phòng của khách hàng. 
 -- Chỉ đếm những khách hàng nào có Tên loại khách hàng là “Diamond”.
 SELECT kh.*,COUNT(hd.ma_hop_dong) AS so_lan_dat_phong FROM khach_hang AS kh
 INNER JOIN hop_dong  AS hd ON hd.ma_khach_hang=kh.ma_khach_hang
 INNER JOIN loai_khach AS lk ON lk.ma_loai_khach=kh.ma_loai_khach
 WHERE 
  lk.ten_loai_khach LIKE "Diamond%"
 GROUP BY 
 kh.ma_khach_hang
 ORDER BY 
 so_lan_dat_phong;
 
 -- 5.Hiển thị ma_khach_hang, ho_ten, ten_loai_khach, ma_hop_dong, ten_dich_vu, 
 -- ngay_lam_hop_dong, ngay_ket_thuc, tong_tien (Với tổng tiền được tính theo công 
 -- thức như sau: Chi Phí Thuê + Số Lượng * Giá, với Số Lượng và Giá là từ bảng dich_vu_di_kem,
 -- hop_dong_chi_tiet) cho tất cả các khách hàng đã từng đặt phòng. (những khách hàng nào chưa từng
 -- đặt phòng cũng phải hiển thị ra).
 SELECT 
    kh.ma_khach_hang,
    kh.ho_ten,
    lk.ten_loai_khach,
    hd.ma_hop_dong,
    dv.ten_dich_vu,
    hd.ngay_lam_hop_dong,
    hd.ngay_ket_thuc,
    (dv.chi_phi_thue +SUM( IFNULL(hdct.so_luong*dvdk.gia,0))) AS tong_tien
FROM
    khach_hang AS kh
        INNER JOIN
    loai_khach AS lk ON lk.ma_loai_khach = kh.ma_loai_khach
        LEFT JOIN
    hop_dong AS hd ON hd.ma_khach_hang = kh.ma_khach_hang
        LEFT JOIN
    dich_vu AS dv ON dv.ma_dich_vu = hd.ma_dich_vu
    LEFT JOIN 
    hop_dong_chi_tiet AS hdct ON hdct.ma_hop_dong = hd.ma_hop_dong
    LEFT JOIN 
    dich_vu_di_kem AS dvdk ON dvdk.ma_dich_vu_di_kem = hdct.ma_dich_vu_di_kem
    GROUP BY 
    kh.ma_khach_hang,
    hd.ma_hop_dong
    ORDER BY 
    tong_tien DESC ;
    -- 6.Hiển thị ma_dich_vu, ten_dich_vu, dien_tich, chi_phi_thue, ten_loai_dich_vu 
    -- của tất cả các loại dịch vụ chưa từng được khách hàng thực hiện đặt từ quý 1 của năm 2021 (Quý 1 là tháng 1, 2, 3).
    
    SELECT dv.ma_dich_vu, dv.ten_dich_vu, dv.dien_tich, dv.chi_phi_thue, ldv.ten_loai_dich_vu FROM dich_vu AS dv 
    INNER JOIN loai_dich_vu AS ldv ON ldv.ma_loai_dich_vu = dv.ma_loai_dich_vu
    INNER JOIN hop_dong AS hd ON hd.ma_dich_vu = dv.ma_dich_vu 
    WHERE dv.ma_dich_vu NOT IN (SELECT dv.ma_dich_vu FROM dich_vu AS dv
    INNER JOIN hop_dong AS hd ON hd.ma_dich_vu =dv.ma_dich_vu
    WHERE YEAR(hd.ngay_lam_hop_dong)=2021 AND quarter(hd.ngay_lam_hop_dong)=1
    )
    GROUP BY 
    dv.ma_dich_vu
    ORDER BY 
    dv.ma_dich_vu ;
    
    -- 7.Hiển thị thông tin ma_dich_vu, ten_dich_vu, dien_tich, so_nguoi_toi_da, chi_phi_thue, 
    -- ten_loai_dich_vu của tất cả các loại dịch vụ đã từng được khách hàng đặt phòng trong năm 
    -- 2020 nhưng chưa từng được khách hàng đặt phòng trong năm 2021.
    SELECT * FROM dich_vu AS dv 
    
    
    
