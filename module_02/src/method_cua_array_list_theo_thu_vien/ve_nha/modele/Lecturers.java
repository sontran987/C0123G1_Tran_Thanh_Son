package method_cua_array_list_theo_thu_vien.ve_nha.modele;

public class Lecturers extends Person {
    private String specialize;

    public Lecturers() {
    }

    public Lecturers(String specialize) {
        this.specialize = specialize;
    }

    public Lecturers(int code, String name, String birthday, String gender, String specialize) {
        super(code, name, birthday, gender);
        this.specialize = specialize;
    }

    public String getSpecialize() {
        return specialize;
    }

    public void setSpecialize(String specialize) {
        this.specialize = specialize;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", specialize= " + specialize;
    }
}
