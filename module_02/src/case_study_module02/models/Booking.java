package case_study_module02.models;

public class Booking {

    private int codeBooking;
    private String startDay;
    private String endDate;
    private int codeCustomet;
    private String serviceName;
    private String typeOfService;

    public Booking() {
    }

    public Booking(int codeBooking, String startDay, String endDate, int codeCustomet, String serviceName, String typeOfService) {
        this.codeBooking = codeBooking;
        this.startDay = startDay;
        this.endDate = endDate;
        this.codeCustomet = codeCustomet;
        this.serviceName = serviceName;
        this.typeOfService = typeOfService;
    }

    public int getCodeBooking() {
        return codeBooking;
    }

    public void setCodeBooking(int codeBooking) {
        this.codeBooking = codeBooking;
    }

    public String getStartDay() {
        return startDay;
    }

    public void setStartDay(String startDay) {
        this.startDay = startDay;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public int getCodeCustomet() {
        return codeCustomet;
    }

    public void setCodeCustomet(int codeCustomet) {
        this.codeCustomet = codeCustomet;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getTypeOfService() {
        return typeOfService;
    }

    public void setTypeOfService(String typeOfService) {
        this.typeOfService = typeOfService;
    }

    @Override
    public String toString() {
        return "Booking: " +
                "codeBooking= " + codeBooking +
                ", startDay= " + startDay +
                ", endDate= " + endDate +
                ", codeCustomet= " + codeCustomet +
                ", serviceName= " + serviceName +
                ", typeOfService= " + typeOfService;
    }
}
