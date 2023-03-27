package case_study_module02.models;

public abstract class Person {
    private int employeeCode;
    private String name;
    private String brithday;
    private boolean gender;
    private int idNumber;
    private int phoneNumber;
    private String email;

    public Person() {
    }

    public Person(int employeeCode, String name, String brithday, boolean gender, int idNumber, int phoneNumber, String email) {
        this.employeeCode = employeeCode;
        this.name = name;
        this.brithday = brithday;
        this.gender = gender;
        this.idNumber = idNumber;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public int getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(int employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrithday() {
        return brithday;
    }

    public void setBrithday(String brithday) {
        this.brithday = brithday;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Id=" + employeeCode +
                ", name= " + name +
                ", brithday= " + brithday +
                ", gender= " + gender +
                ", idNumber= " + idNumber +
                ", phoneNumber= " + phoneNumber +
                ", email= " + email ;
    }
}
