package case_study_module02.repository.facility_repo;

import case_study_module02.models.Villa;
import case_study_module02.untils.ReadAndWriteFileVilla;

import java.util.LinkedHashMap;

public class VillaRepoImpl implements VillaRepo {
    static final String PATH_FILE_VILLA="D:\\codegym\\C0123G1_Tran_Thanh_Son\\module_02\\src\\case_study_module02\\data\\villa.csv";
    static LinkedHashMap<Villa,Integer> linkedHashMap= ReadAndWriteFileVilla.readFileVilla(PATH_FILE_VILLA);
    @Override
    public LinkedHashMap<Villa, Integer> displayListVilla() {
        return linkedHashMap;
    }

    @Override
    public void addNewVilla(LinkedHashMap<Villa,Integer> linkedHashMap) {
        ReadAndWriteFileVilla.writeFileVilla(PATH_FILE_VILLA,linkedHashMap);
    }

    @Override
    public void editVilla(LinkedHashMap<Villa,Integer> linkedHashMap1) {
        ReadAndWriteFileVilla.writeFileVilla(PATH_FILE_VILLA,linkedHashMap1);

    }

    @Override
    public void displayListVillaMaintenance() {

    }


}
