package method_cua_array_list_theo_thu_vien.ve_nha.model;

public class Person {
    private int code;
    private String name;
    private String birthday;
    private String gender;

    public Person() {
    }

    public Person(int code, String name, String birthday, String gender) {
        this.code = code;
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
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

    public String isGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "id= " + code +
                ", name= " + name +
                ", birthday= " + birthday +
                ", gender= " + gender;
    }
}
