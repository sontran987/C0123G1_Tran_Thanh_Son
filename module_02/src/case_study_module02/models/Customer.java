package case_study_module02.models;

public class Customer extends Person {
    private String typeOfGuest;
    private String address;

    public Customer() {
    }

    public Customer(String typeOfGuest, String address) {
        this.typeOfGuest = typeOfGuest;
        this.address = address;
    }

    public Customer(int code, String name, String brithday, String gender, int identityCard, String phoneNumber, String email, String typeOfGuest, String address) {
        super(code, name, brithday, gender, identityCard, phoneNumber, email);
        this.typeOfGuest = typeOfGuest;
        this.address = address;
    }

    public String getTypeOfGuest() {
        return typeOfGuest;
    }

    public void setTypeOfGuest(String typeOfGuest) {
        this.typeOfGuest = typeOfGuest;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer: " +
                super.toString() +
                ", typeOfGuest= " + typeOfGuest +
                ", address= " + address;
    }

    @Override
    public String getInfoToCSV() {
        return super.getInfoToCSV() + "," + typeOfGuest + "," + address;
    }
}
