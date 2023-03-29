package case_study_module02.services.facility;

import case_study_module02.models.House;

import java.util.LinkedHashMap;

public class HouseServiceImpl implements FacilityService{
    static LinkedHashMap<House,Integer> mapHouse =new LinkedHashMap<>();
static {
    mapHouse.put(new House("house","1",1,1,"1","1",1),1);

}
    @Override
    public void displayListFacility() {
        for (House h: mapHouse.keySet()) {
            System.out.println(h+", đã sử dụng: "+mapHouse.get(h));
        }
    }

    @Override
    public void addNewFacility() {

    }

    @Override
    public void displayListFacilityMaintenance() {

    }
}
