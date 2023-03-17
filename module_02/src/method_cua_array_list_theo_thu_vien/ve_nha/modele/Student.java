package method_cua_array_list_theo_thu_vien.ve_nha.modele;

public class Student extends Person {

    private String classes;
    private double point;

    public Student() {
    }

    public Student(int studentCode, String name, String birthday, boolean gender) {
        super(studentCode, name, birthday, gender);
    }

    public Student(String classes, double point) {
        this.classes = classes;
        this.point = point;
    }

    public Student(int studentCode, String name, String birthday, boolean gender, String classes, double point) {
        super(studentCode, name, birthday, gender);
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
        return "Student{" +
                super.toString()+
                "classes='" + classes + '\'' +
                ", point=" + point +
                '}';
    }
}
