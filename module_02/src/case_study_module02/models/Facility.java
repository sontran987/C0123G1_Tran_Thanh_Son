package case_study_module02.models;
public abstract class Facility {
    //Tên dịch vụ ,diện tích sử dụng, chi phí thuê,
// số lượng người ối đa, kiểu thuê
    private String serviceName;
    private String usableArea;
    private double rentalCosts;
    private int maximumPeson;
    private String rentalType;

    public Facility() {
    }

    public Facility(String serviceName, String usableArea, double rentalCosts, int maximumPeson, String rentalType) {
        this.serviceName = serviceName;
        this.usableArea = usableArea;
        this.rentalCosts = rentalCosts;
        this.maximumPeson = maximumPeson;
        this.rentalType = rentalType;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(String usableArea) {
        this.usableArea = usableArea;
    }

    public double getRentalCosts() {
        return rentalCosts;
    }

    public void setRentalCosts(double rentalCosts) {
        this.rentalCosts = rentalCosts;
    }

    public int getMaximumPeson() {
        return maximumPeson;
    }

    public void setMaximumPeson(int maximumPeson) {
        this.maximumPeson = maximumPeson;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return " service Name= " + serviceName +
                ", usable Area= " + usableArea +
                ", rental Costs= " + rentalCosts +
                ", maximum Peson= " + maximumPeson +
                ", rentalType= " + rentalType  ;
    }
}