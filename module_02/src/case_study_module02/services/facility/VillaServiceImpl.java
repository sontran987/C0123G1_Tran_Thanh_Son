package case_study_module02.services.facility;

import case_study_module02.models.Villa;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class VillaServiceImpl implements FacilityService{
    static LinkedHashMap<Villa,Integer> mapVilla=new LinkedHashMap<>();
    Scanner scanner=new Scanner(System.in);
static {
    mapVilla.put(new Villa("villa","1",1,1,"1","1",1,1), 0);
}
    @Override
    public void displayListFacility() {
        for (Villa v : mapVilla.keySet()) {
            System.out.println(v+", đã sử dụng: "+mapVilla.get(v));
        }
    }

    @Override
    public void addNewFacility() {
        System.out.println("Enter name service:");
        System.out.println("Enter usable area:");
        System.out.println("Enter rental costs:");
        System.out.println("Enter maximum people:");
        System.out.println("Enter rental type:");
        System.out.println("Enter room standard:");
        System.out.println("Enter swimming pool:");
        System.out.println("Enter name service:");
    }

    @Override
    public void displayListFacilityMaintenance() {

    }
}
