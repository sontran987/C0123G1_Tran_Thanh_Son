package case_study_module02.repository.facility_repo;

import case_study_module02.models.House;
import case_study_module02.untils.ReadAndWriteFileHouse;

import java.util.LinkedHashMap;

public class HouseRepoImpl implements HouseRepo {
    static final String PATH_FILE_HOUSE = "src/case_study_module02/data/house.csv";
    static LinkedHashMap<House, Integer> linkedHashMap = ReadAndWriteFileHouse.readFileHouse(PATH_FILE_HOUSE);

    @Override
    public LinkedHashMap<House, Integer> displayListHouse() {
        return linkedHashMap;
    }

    @Override
    public void addNewHouse(LinkedHashMap<House, Integer> linkedHashMap) {
        ReadAndWriteFileHouse.writedFileHouse(PATH_FILE_HOUSE, linkedHashMap);
    }

    @Override
    public void editHouse(LinkedHashMap<House, Integer> linkedHashMap) {
        ReadAndWriteFileHouse.writedFileHouse(PATH_FILE_HOUSE, linkedHashMap);
    }

    @Override
    public LinkedHashMap<House, Integer> displayListHouseMaintenance() {
        return linkedHashMap;
    }
}
