package case_study_module02.services.facility;

import case_study_module02.models.Room;

import java.util.LinkedHashMap;

public class RoomServiceImpl implements FacilityService{
    static LinkedHashMap<Room,Integer> mapRoom =new LinkedHashMap<>();
    static {
        mapRoom.put(new Room("room","1",1,1,"1","1"),1);
    }
    @Override
    public void displayListFacility() {
        for (Room r : mapRoom.keySet()) {
            System.out.println(r +", đã sử dụng: " +mapRoom.get(r));
        }
    }

    @Override
    public void addNewFacility() {

    }

    @Override
    public void displayListFacilityMaintenance() {

    }
}
