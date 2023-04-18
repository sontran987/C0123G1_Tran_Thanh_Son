USE case_study_furama;
-- -------- task 16 ----------
-- 16.Xóa những Nhân viên chưa từng lập được hợp đồng nào từ năm 2019 đến năm 2021

SET SQL_SAFE_UPDATES=0;
SET SQL_SAFE_UPDATES=1;
DELETE  FROM nhan_vien AS nv
 WHERE nv.ma_nhan_vien NOT IN (SELECT hd.ma_nhan_vien FROM hop_dong AS hd
WHERE (YEAR(hd.ngay_lam_hop_dong)) BETWEEN 2019 AND 2021 ); 

 -- ----------task 17 -------------
 -- 17.	Cập nhật thông tin những khách hàng có ten_loai_khach từ Platinum lên Diamond, 
 -- chỉ cập nhật những khách hàng đã từng đặt phòng với Tổng Tiền thanh toán trong năm 2021 là lớn hơn 10.000.000 VNĐ.
 -- way 1: 
WITH source as (
SELECT kh.ma_khach_hang as ma_khach_hang
	FROM khach_hang as kh
		INNER JOIN loai_khach AS lk ON lK.ma_loai_khach = kh.ma_loai_khach
		INNER JOIN hop_dong AS hd ON hd.ma_khach_hang = kh.ma_khach_hang
		INNER JOIN dich_vu AS dv ON dv.ma_dich_vu = hd.ma_dich_vu
		INNER JOIN hop_dong_chi_tiet AS hdct ON hdct.ma_hop_dong = hd.ma_hop_dong
		INNER JOIN dich_vu_di_kem AS dvdk ON dvdk.ma_dich_vu_di_kem = hdct.ma_dich_vu_di_kem
		WHERE
		 lk.ten_loai_khach = 'Platinium' AND 
			 YEAR(hd.ngay_lam_hop_dong)=2021
			GROUP BY 
			kh.ma_khach_hang, hd.ma_hop_dong, hdct.ma_hop_dong_chi_tiet
			having SUM(IFNULL(hdct.so_luong * dvdk.gia,0)+dv.chi_phi_thue) > 1000000
)

UPDATE khach_hang
INNER JOIN source as s ON s.ma_khach_hang = khach_hang.ma_khach_hang
SET 
    khach_hang.ma_loai_khach = '1'; 
-- way 2: 
SET SQL_SAFE_UPDATES=0;

UPDATE khach_hang
SET 
    khach_hang.ma_loai_khach = '1'
    WHERE khach_hang.ma_khach_hang IN (
    SELECT kh.ma_khach_hang as ma_khach_hang
	FROM (SELECT * FROM khach_hang) as kh
		INNER JOIN loai_khach AS lk ON lK.ma_loai_khach = kh.ma_loai_khach
		INNER JOIN hop_dong AS hd ON hd.ma_khach_hang = kh.ma_khach_hang
		INNER JOIN dich_vu AS dv ON dv.ma_dich_vu = hd.ma_dich_vu
		INNER JOIN hop_dong_chi_tiet AS hdct ON hdct.ma_hop_dong = hd.ma_hop_dong
		INNER JOIN dich_vu_di_kem AS dvdk ON dvdk.ma_dich_vu_di_kem = hdct.ma_dich_vu_di_kem
		WHERE
		 lk.ten_loai_khach = 'Platinium' AND 
			 YEAR(hd.ngay_lam_hop_dong)=2021
			GROUP BY 
			kh.ma_khach_hang, hd.ma_hop_dong, hdct.ma_hop_dong_chi_tiet
			having SUM(IFNULL(hdct.so_luong * dvdk.gia,0)+dv.chi_phi_thue) > 1000000
    );
 
 SET SQL_SAFE_UPDATES=1;
 
 
 
 SELECT khach_hang.ma_khach_hang,(IFNULL((hdct.so_luong * dvdk.gia),0)+dv.chi_phi_thue) AS NU
 FROM khach_hang
 INNER JOIN loai_khach AS lk ON lK.ma_loai_khach=khach_hang.ma_loai_khach
INNER JOIN hop_dong AS hd ON hd.ma_khach_hang = khach_hang.ma_khach_hang
INNER JOIN dich_vu AS dv ON dv.ma_dich_vu = hd.ma_dich_vu
INNER JOIN hop_dong_chi_tiet AS hdct ON hdct.ma_hop_dong = hd.ma_hop_dong
INNER JOIN dich_vu_di_kem AS dvdk ON dvdk.ma_dich_vu_di_kem = hdct.ma_dich_vu_di_kem
WHERE
 lk.ten_loai_khach = 'Platinium' AND 
     YEAR(hd.ngay_lam_hop_dong)=2021
    GROUP BY 
    khach_hang.ma_khach_hang, hd.ma_hop_dong,hdct.ma_hop_dong_chi_tiet
    having nu > 1000000; 

SELECT * FROM w_khach_hang;

 -- -------- task 18 ----------
 -- 18.	Xóa những khách hàng có hợp đồng trước năm 2021 (chú ý ràng buộc giữa các bảng).
 
 DELETE FROM khach_hang AS kh
 WHERE hd.ma_khach_hang IN (SELECT hd.ma_khach_hang FROM (SELECT * FROM khach_hang) hop_dong AS hd WHERE (YEAR(hd.ngay_lam_hop_dong))<2021);
 
 -- ----------task 19 --------------
 -- 19.	Cập nhật giá cho các dịch vụ đi kèm được sử dụng trên 10 lần trong năm 2020 lên gấp đôi.
 UPDATE  dich_vu_di_kem AS dvdk
 SET dvdk.gia=(dvdk.gia*10) WHERE dvdk.ma_dich_vu_di_kem IN (SELECT hdct.ma_dich_vu_di_kem FROM dich_vu_di_kem dvdk
 INNER JOIN hop_dong_chi_tiet AS hdct ON hdct.ma_dich_vu_di_kem=dvdk.ma_dich_vu_di_kem
 INNER JOIN hop_dong AS hd ON hd.ma_hop_dong=hdct.ma_hop_dong
 WHERE YEAR(hd.ngay_lam_hop_dong)=2020
 );
 
 