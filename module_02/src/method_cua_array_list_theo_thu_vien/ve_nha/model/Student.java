package method_cua_array_list_theo_thu_vien.ve_nha.model;

public class Student extends Person {

    private String classes;
    private double point;

    public Student() {
    }

    public Student(String classes, double point) {
        this.classes = classes;
        this.point = point;
    }

    public Student(int code, String name, String birthday, String gender, String classes, double point) {
        super(code, name, birthday, gender);
        this.classes = classes;
        this.point = point;
    }


    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", classes=" + classes +
                ", point=" + point;

    }
}
