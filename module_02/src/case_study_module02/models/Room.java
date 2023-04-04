package case_study_module02.models;

public class Room extends Facility {
    //dịch vụ miễn phí đi kèm
    private String freeServiceIncluded;

    public Room() {
    }

    public Room(String treeServiceIncluded) {
        this.freeServiceIncluded = treeServiceIncluded;
    }

    public Room(String idService, String serviceName, double usableArea, double rentalCosts, int maximumPeople, String rentalType, String freeServiceIncluded) {
        super(idService, serviceName, usableArea, rentalCosts, maximumPeople, rentalType);
        this.freeServiceIncluded = freeServiceIncluded;
    }

    public String getFreeServiceIncluded() {
        return freeServiceIncluded;
    }

    public void setFreeServiceIncluded(String freeServiceIncluded) {
        this.freeServiceIncluded = freeServiceIncluded;
    }

    @Override
    public String toString() {
        return super.getInfoToCSV() + "," + freeServiceIncluded;

    }

    @Override
    public String getInfoToCSV() {
        return "Room: " +
                super.toString() +
                ", treeServiceIncluded= " + freeServiceIncluded;
    }
}
