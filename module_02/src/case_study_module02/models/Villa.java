package case_study_module02.models;


public class Villa extends Facility{
    //tiêu chuẩn phòng, diện tích hồ bơi, số tầng
    private String roomStandard;
    private double swimmingPoolArea;
    private int numberOfFloors;

    public Villa() {
    }

    public Villa(String roomStandard, double swimmingPoolArea, int numberOfFloors) {
        this.roomStandard = roomStandard;
        this.swimmingPoolArea = swimmingPoolArea;
        this.numberOfFloors = numberOfFloors;
    }

    public Villa(String serviceName, String usableArea, double rentalCosts, int maximumPeople, String rentalType, String roomStandard, double swimmingPoolArea, int numberOfFloors) {
        super(serviceName, usableArea, rentalCosts, maximumPeople, rentalType);
        this.roomStandard = roomStandard;
        this.swimmingPoolArea = swimmingPoolArea;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public double getSwimmingPoolArea() {
        return swimmingPoolArea;
    }

    public void setSwimmingPoolArea(double swimmingPoolArea) {
        this.swimmingPoolArea = swimmingPoolArea;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "Villa: " +
                super.toString() +
                ", roomStandard= " + roomStandard +
                ", swimmingPoolArea= " + swimmingPoolArea +
                ", numberOfFloors= " + numberOfFloors ;
    }
}
