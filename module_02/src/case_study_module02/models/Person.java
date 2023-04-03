package case_study_module02.models;

public abstract class Person {
    private int code;
    private String name;
    private String brithday;
    private String gender;
    private int identityCard;
    private String phoneNumber;
    private String email;

    public Person() {
    }

    public Person(int code, String name, String brithday, String gender, int identityCard, String phoneNumber, String email) {
        this.code = code;
        this.name = name;
        this.brithday = brithday;
        this.gender = gender;
        this.identityCard = identityCard;
        this.phoneNumber = phoneNumber;
        this.email = email;
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

    public String getBrithday() {
        return brithday;
    }

    public void setBrithday(String brithday) {
        this.brithday = brithday;
    }

    public String isGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(int identityCard) {
        this.identityCard = identityCard;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
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
        return "id=" + code +
                ", name= " + name +
                ", brithday= " + brithday +
                ", gender= " + gender +
                ", idNumber= " + identityCard +
                ", phoneNumber= " + phoneNumber +
                ", email= " + email;
    }

    public String getInfoToCSV() {
        return code + "," + name + "," + brithday + "," + gender + "," + identityCard + "," + phoneNumber + "," + email;
    }
}
