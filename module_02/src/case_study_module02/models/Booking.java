package case_study_module02.models;

import java.util.Date;
import java.util.Objects;

public class Booking implements Comparable<Booking>{

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

public String getInfoToCSV(){
        return codeBooking+","+startDay+","+endDate+
                ","+codeCustomet+","+serviceName+","+typeOfService;
}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Booking booking = (Booking) o;
        return codeBooking==booking.codeBooking ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codeBooking);
    }

    @Override
    public int compareTo(Booking o) {
        if (startDay.equals(o.startDay)){
            Date endDate=new Date(getEndDate());
            Date endDate1=new Date(o.endDate);
            return endDate.after(endDate1) ? 1 :-1;
        }
        Date startDate = new Date(startDay);
        Date startDateObj = new Date(o.startDay);
        return startDate.after(startDateObj) ? 1 : -1;
    }
}
