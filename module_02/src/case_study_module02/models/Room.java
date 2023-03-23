package case_study_module02.models;

public class Room extends Facility{
    //dịch vụ miễn phí đi kèm
    private String treeServiceIncluded;

    public Room() {
    }

    public Room(String treeServiceIncluded) {
        this.treeServiceIncluded = treeServiceIncluded;
    }

    public Room(String serviceName, String usableArea, double rentalCosts, int maximumPeson, String rentalType, String treeServiceIncluded) {
        super(serviceName, usableArea, rentalCosts, maximumPeson, rentalType);
        this.treeServiceIncluded = treeServiceIncluded;
    }

    public String getTreeServiceIncluded() {
        return treeServiceIncluded;
    }

    public void setTreeServiceIncluded(String treeServiceIncluded) {
        this.treeServiceIncluded = treeServiceIncluded;
    }

    @Override
    public String toString() {
        return "Room= " +
                super.toString() +
                ", treeServiceIncluded= " + treeServiceIncluded ;
    }
}
