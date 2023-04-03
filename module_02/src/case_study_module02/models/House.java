package case_study_module02.models;


public class House extends Facility {
    //tiêu chuẩn phòng, số tầng.
    private String roomStandard;
    private int numberOfFloors;

    public House() {
    }

    public House(String roomStandard, int numberOfFloors) {
        this.roomStandard = roomStandard;
        this.numberOfFloors = numberOfFloors;
    }

    public House(String idService, String serviceName, double usableArea, double rentalCosts, int maximumPeople, String rentalType, String roomStandard, int numberOfFloors) {
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

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return super.getInfoToCSV() + "," + roomStandard + "," + numberOfFloors;

    }

    public String getInfoToCSV() {
        return "House: " +
                super.toString() +
                ", roomStandard= " + roomStandard +
                ", numberOfFloors= " + numberOfFloors;
    }
}
