-- - Tao index cho cột  title của bảng books
CREATE INDEX inx_title 
ON books(title);
-- - Tạo 1 view để lấy ra danh sách các quyển sách đã được mượn, có hiển thị thêm cột số lần đã được mượn
CREATE VIEW w_borrowed_books AS
SELECT b.*,count(borrows.id_books) AS so_lan_muon FROM books AS b
INNER JOIN borrows on borrows.id_books=b.id
GROUP BY 
b.id;
-- - Viết 1 stored procedure thêm mới book trong database với tham số kiểu IN
