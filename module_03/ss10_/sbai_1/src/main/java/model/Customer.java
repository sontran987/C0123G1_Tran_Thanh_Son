package model;

public class Customer {
    private int id;
    private String name;
    private String brithday;
    private String address;
    private String img;

    public Customer() {
    }

    public Customer(int id, String name, String brithday, String address,String img) {
        this.id = id;
        this.name = name;
        this.brithday = brithday;
        this.address = address;
        this.img=img;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
