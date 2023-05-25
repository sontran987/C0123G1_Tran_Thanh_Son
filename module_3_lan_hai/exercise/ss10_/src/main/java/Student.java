public class Student {
    private int maHocVien;
    private String tenHocVien;
    private String gioiTinh;
    private double diemSo ;

    public Student() {
    }

    public Student(int maHocVien, String tenHocVien, String gioiTinh, double diemSo) {
        this.maHocVien = maHocVien;
        this.tenHocVien = tenHocVien;
        this.gioiTinh = gioiTinh;
        this.diemSo = diemSo;
    }

    public int getMaHocVien() {
        return maHocVien;
    }

    public void setMaHocVien(int maHocVien) {
        this.maHocVien = maHocVien;
    }

    public String getTenHocVien() {
        return tenHocVien;
    }

    public void setTenHocVien(String tenHocVien) {
        this.tenHocVien = tenHocVien;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public double getDiemSo() {
        return diemSo;
    }

    public void setDiemSo(double diemSo) {
        this.diemSo = diemSo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "maHocVien=" + maHocVien +
                ", tenHocVien='" + tenHocVien + '\'' +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", diemSo=" + diemSo +
                '}';
    }
}
