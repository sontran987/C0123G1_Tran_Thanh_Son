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
UPDATE khach_hang AS kh 
SET 
    kh.ma_loai_khach = '1'
WHERE
    kh.ma_loai_khach = '2';
       --  AND kh.ma_loai_khach IN (SELECT 
--             kh.ma_loai_khach
--         FROM
--             khach_hang AS kh
--                 INNER JOIN
--             loai_khach AS lk ON kh.ma_loai_khach = lk.ma_loai_khach
--                 INNER JOIN
--             hop_dong AS hd ON hd.ma_khach_hang = kh.ma_khach_hang
--                 INNER JOIN
--             hop_dong_chi_tiet AS hdct ON hdct.ma_hop_dong = hd.ma_hop_dong
--                 INNER JOIN
--             dich_vu_di_kem AS dvdk ON dvdk.ma_dich_vu_di_kem = hdct.ma_dich_vu_di_kem
--                 INNER JOIN
--             dich_vu AS dv ON dv.ma_dich_vu = hd.ma_dich_vu
--         WHERE
--             (dv.chi_phi_thue + hdct.so_luong * dvdk.gia) = 10000000);

 -- -------- task 18 ----------
 -- 18.	Xóa những khách hàng có hợp đồng trước năm 2021 (chú ý ràng buộc giữa các bảng).
 
 DELETE kh.*,hd.ma_khach_hang FROM khach_hang AS kh
 INNER JOIN hop_dong hd ON hop_dong.ma_khach_hang=kh.ma_khach_hang
 WHERE hd.ma_khach_hang IN (SELECT hd.ma_khach_hang FROM hop_dong AS hd WHERE (YEAR(hd.ngay_lam_hop_dong))<2021);