package bai_3.modules;

public class ThongTinHoaDon {
    private String maHoaDon;
    private String hoTenKhachHang;
    private String loaiKhach;
    private long dinhMucTieuThu;

    public ThongTinHoaDon() {
    }

    public ThongTinHoaDon(String maHoaDon, String hoTenKhachHang, String loaiKhach, long dinhMucTieuThu) {
        this.maHoaDon = maHoaDon;
        this.hoTenKhachHang = hoTenKhachHang;
        this.loaiKhach = loaiKhach;
        this.dinhMucTieuThu = dinhMucTieuThu;
    }

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public String getHoTenKhachHang() {
        return hoTenKhachHang;
    }

    public void setHoTenKhachHang(String hoTenKhachHang) {
        this.hoTenKhachHang = hoTenKhachHang;
    }

    public String getLoaiKhach() {
        return loaiKhach;
    }

    public void setLoaiKhach(String loaiKhach) {
        this.loaiKhach = loaiKhach;
    }

    public long getDinhMucTieuThu() {
        return dinhMucTieuThu;
    }

    public void setDinhMucTieuThu(long dinhMucTieuThu) {
        this.dinhMucTieuThu = dinhMucTieuThu;
    }

    @Override
    public String toString() {
        return "ThongTinHoaDon: " +
                "maHoaDon=" + maHoaDon +
                ", hoTenKhachHang='" + hoTenKhachHang + '\'' +
                ", loaiKhach='" + loaiKhach + '\'' +
                ", dinhMucTieuThu=" + dinhMucTieuThu ;
    }

    public String getToCSV() {
        return maHoaDon + "," + hoTenKhachHang + "," + loaiKhach + "," + dinhMucTieuThu;
    }
}