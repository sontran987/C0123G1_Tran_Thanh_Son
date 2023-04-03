package case_study_module02.repository.facility_repo;

import case_study_module02.models.Villa;

import java.util.LinkedHashMap;

public interface VillaRepo {
    LinkedHashMap<Villa,Integer> displayListVilla();

    void addNewVilla(LinkedHashMap<Villa,Integer> linkedHashMap);

    void editVilla(LinkedHashMap<Villa,Integer> linkedHashMap);

    void displayListVillaMaintenance();
}
