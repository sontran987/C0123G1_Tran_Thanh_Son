package method_cua_array_list_theo_thu_vien.ve_nha.modele;

public class Lecturers extends Person {
    private String chuyenMon;

    public Lecturers() {
    }

    public Lecturers(String chuyenMon) {
        this.chuyenMon = chuyenMon;
    }

    public Lecturers(int studentCode, String name, String birthday, boolean gender, String chuyenMon) {
        super(studentCode, name, birthday, gender);
        this.chuyenMon = chuyenMon;
    }

    public String getChuyenMon() {
        return chuyenMon;
    }

    public void setChuyenMon(String chuyenMon) {
        this.chuyenMon = chuyenMon;
    }
}
