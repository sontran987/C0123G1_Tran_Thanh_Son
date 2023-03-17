package method_cua_array_list_theo_thu_vien.ve_nha.modele;

public class Person {
    private int studentCode;
    private String name;
    private String birthday;
    private boolean gender;

    public Person() {
    }

    public Person(int studentCode, String name, String birthday, boolean gender) {
        this.studentCode = studentCode;
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
    }

    public int getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(int studentCode) {
        this.studentCode = studentCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "studentCode=" + studentCode +
                ", name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                ", gender=" + gender +
                '}';
    }
}
