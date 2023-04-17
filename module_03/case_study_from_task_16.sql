USE case_study_furama;
-- -------- task 16 ----------
-- 16.Xóa những Nhân viên chưa từng lập được hợp đồng nào từ năm 2019 đến năm 2021

DELIMITER //
CREATE PROCEDURE delete_nhan_vien(IN id INT)
BEGIN
DELETE FROM nhan_vien AS nv
 WHERE nv.ma_nhan_vien=id; 
END //
DELIMITER ;
 CALL delete_nhan_vien(10)
 -- ----------task 17 -------------
 -- 17.	Cập nhật thông tin những khách hàng có ten_loai_khach từ Platinum lên Diamond, 
 -- chỉ cập nhật những khách hàng đã từng đặt phòng với Tổng Tiền thanh toán trong năm 2021 là lớn hơn 10.000.000 VNĐ.
 
 DELIMITER //
CREATE PROCEDURE create_khach_hang()
BEGIN
UPDATE khach_hang SET ma_loai_khach="1" WHERE khach_hang.ma_loai_khach="2" AND khach_hang.ma_loai_khach IN (
SELECT kh.ma_loai_khach FROM loai_khach AS lk
INNER JOIN khach_hang AS kh ON kh.ma_loai_khach=lk.ma_loai_khach
INNER JOIN hop_dong AS hd ON hd.ma_khach_hang=kh.ma_khach_hang
INNER JOIN hop_dong_chi_tiet AS hdct ON hdct.ma_hop_dong=hd.ma_hop_dong
INNER JOIN dich_vu_di_kem AS dvdk ON dvdk.ma_dich_vu_di_kem=hdct.ma_dich_vu_di_kem
INNER JOIN dich_vu AS dv ON dv.ma_dich_vu=hd.ma_dich_vu
WHERE (dv.chi_phi_thue+hdct.so_luong*dvdk.gia)= "10000000"
);
END //
DELIMITER ;
 CALL create_khach_hang()
 