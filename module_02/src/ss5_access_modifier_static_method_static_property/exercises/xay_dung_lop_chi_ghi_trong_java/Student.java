package ss5_access_modifier_static_method_static_property.exercises.xay_dung_lop_chi_ghi_trong_java;

public class Student {
private String name="Join";
private String classes ="CO2";
    public void setName(String name) {
        this.name = name;
    }
    public void setClasses(String classes) {
        this.classes = classes;
    }

    public Student(){

}
public Student(String name,String classes){
        this.name=name;
        this.classes=classes;
}

    @Override
    public String toString() {
        return "Name= " + name + '\n' +
                "Class= " + classes ;
    }
}
