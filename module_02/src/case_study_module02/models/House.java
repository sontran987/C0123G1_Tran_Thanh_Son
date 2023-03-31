package case_study_module02.models;


public class House extends Facility {
    //tiêu chuẩn phòng, số tầng.
    private String roomStandard;
    private String numberOfFloors;

    public House() {
    }

    public House(String roomStandard, String numberOfFloors) {
        this.roomStandard = roomStandard;
        this.numberOfFloors = numberOfFloors;
    }

    public House(String idService, String serviceName, double usableArea, double rentalCosts, int maximumPeople, String rentalType, String roomStandard, String numberOfFloors) {
        super(idService, serviceName, usableArea, rentalCosts, maximumPeople, rentalType);
        this.roomStandard = roomStandard;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(String numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "House: " +
                super.toString() +
                ", roomStandard= " + roomStandard +
                ", numberOfFloors= " + numberOfFloors;
    }

    public String getInfoToCSV() {
        return super.getInfoToCSV() + "," + roomStandard + "," + numberOfFloors;
    }
}
