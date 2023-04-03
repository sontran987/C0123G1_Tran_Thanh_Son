package case_study_module02.repository.facility_repo;

import case_study_module02.models.House;
import case_study_module02.models.Room;

import java.util.LinkedHashMap;

public interface HouseRepo {
    LinkedHashMap<House,Integer> displayListHouse();

    void addNewHouse(LinkedHashMap<House,Integer> linkedHashMap);

    void editHouse(LinkedHashMap<House,Integer>linkedHashMap);

    LinkedHashMap<House,Integer> displayListHouseMaintenance();
}
