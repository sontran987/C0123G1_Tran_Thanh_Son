package case_study_module02.models;

import java.util.Objects;

public abstract class Facility {
    //Tên dịch vụ ,diện tích sử dụng, chi phí thuê,
// số lượng người ối đa, kiểu thuê
    private String idService;
    private String serviceName;
    private double usableArea;
    private double rentalCosts;
    private int maximumPeople;
    private String rentalType;

    public Facility() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Facility facility = (Facility) o;
        return this.serviceName.equals(facility.serviceName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serviceName);
    }

    public Facility(String idService, String serviceName, double usableArea, double rentalCosts, int maximumPeople, String rentalType) {
        this.idService = idService;
        this.serviceName = serviceName;
        this.usableArea = usableArea;
        this.rentalCosts = rentalCosts;
        this.maximumPeople = maximumPeople;
        this.rentalType = rentalType;
    }

    public String getIdService() {
        return idService;
    }

    public void setIdService(String idService) {
        this.idService = idService;
    }

    public int getMaximumPeople() {
        return maximumPeople;
    }

    public void setMaximumPeople(int maximumPeople) {
        this.maximumPeople = maximumPeople;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(double usableArea) {
        this.usableArea = usableArea;
    }

    public double getRentalCosts() {
        return rentalCosts;
    }

    public void setRentalCosts(double rentalCosts) {
        this.rentalCosts = rentalCosts;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }


    @Override
    public String toString() {
        return " idService= " + idService +
                ", serviceName= " + serviceName +
                ", usableArea= " + usableArea +
                ", rentalCosts= " + rentalCosts +
                ", maximumPeople= " + maximumPeople +
                ", rentalType= " + rentalType;
    }

    public String getInfoToCSV() {
        return idService + "," + serviceName + "," + usableArea + "," + rentalCosts + "," + maximumPeople + "," + rentalType;
    }
}