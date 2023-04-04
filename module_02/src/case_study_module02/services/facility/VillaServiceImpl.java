package case_study_module02.services.facility;

import case_study_module02.models.Villa;
import case_study_module02.repository.facility_repo.VillaRepo;
import case_study_module02.repository.facility_repo.VillaRepoImpl;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class VillaServiceImpl implements VillaService {
    static VillaRepo villaRepo =new VillaRepoImpl();
    static LinkedHashMap<Villa, Integer> mapVilla = villaRepo.displayListVilla();
    Scanner scanner = new Scanner(System.in);

    static String[] listRentalType = {
            "Year",
            "Month",
            "Day",
            "Hour"
    };
    static String[] listRoomStandard = {
            "Standard",
            "Superior",
            "Deluxe",
            "Executive"
    };
    static final String REGEX_ID_VILLA = "^(SVVL-)[0-9]{4}$";
    static final String REGEX_NAME_VILLA = "^[A-Z][a-z]+$";

    public String chooseRentalType() {
        String rentalType = null;
        String choose;
        boolean flag;
        for (int i = 0; i < listRentalType.length; i++) {
            System.out.println((i + 1) + ". " + listRentalType[i]);
        }
        do {
            flag = true;
            System.out.print("Choose rental type: ");
            choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    rentalType = listRentalType[0];
                    break;
                case "2":
                    rentalType = listRentalType[1];
                    break;
                case "3":
                    rentalType = listRentalType[2];
                    break;
                case "4":
                    rentalType = listRentalType[3];
                    break;
                default:
                    System.out.println("Try again🤔");
                    flag = false;
            }
        } while (!flag);
        return rentalType;
    }

    public String chooseRoomStandard() {
        boolean flag;
        String roomStandard = null;
        String choose;
        do {
            flag = true;
            for (int i = 0; i < listRoomStandard.length; i++) {
                System.out.println((i + 1) + ". " + listRoomStandard[i]);
            }
            System.out.print("Enter choose room standard: ");
            choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    roomStandard = listRoomStandard[0];
                    break;
                case "2":
                    roomStandard = listRoomStandard[1];
                    break;
                case "3":
                    roomStandard = listRoomStandard[2];
                    break;
                case "4":
                    roomStandard = listRoomStandard[3];
                    break;
                default:
                    System.out.println("Try again!");
                    flag = false;
            }
        } while (!flag);
        return roomStandard;
    }
    public static boolean regexIdVilla(String id) {
        return id.matches(REGEX_ID_VILLA);
    }

    public static boolean regexNameVilla(String name) {
        return name.matches(REGEX_NAME_VILLA);
    }

    @Override
    public void displayListVilla() {
        for (Villa v : mapVilla.keySet()) {
            System.out.println(v.getInfoToCSV() + ", used: " + mapVilla.get(v)+"times.");
        }
    }

    @Override
    public void addNewVilla() {
        String id, name;
        double area, areapool;
        int costs = 0, people, number;
        int count;
        do {
            count = 0;
            System.out.print("Enter id service(SVVL-YYYY):");
            id = scanner.nextLine();
            for (Villa v : mapVilla.keySet()) {
                if (v.getIdService().equals(id)) {
                    count++;
                }
            }
            if (!regexIdVilla(id)) {
                System.out.println("Not valid.");
                count++;
            }
        } while (count > 0);
        do {
            count = 0;
            System.out.print ("Enter name service:");
            name = scanner.nextLine();
            if (!regexNameVilla(name)) {
                System.out.println("Not valid.");
                count++;
            }
        } while (count > 0);
        do {
            count = 0;

            System.out.print ("Enter usable area:");
            area = Double.parseDouble(scanner.nextLine());
            if (area <= 30) {
                System.out.println("Not valid.");
                count++;
            }
        } while (count > 0);
        do {
            count = 0;
            try {
                System.out.print("Enter rental costs:");
                costs = Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e){
                e.getMessage();
            }
            if (costs < 0) {
                System.out.println("Not valid.");
                count++;
            }
        } while (count > 0);
        do {
            count = 0;
            System.out.print("Enter maximum people:");
            people = Integer.parseInt(scanner.nextLine());
            if (people < 0 || people >= 20) {
                System.out.println("Not valid.");
                count++;
            }
        } while (count > 0);
         String type = chooseRentalType();
         String room = chooseRoomStandard();
        do {
            count = 0;
            System.out.print("Enter swimming pool area:");
            areapool = Double.parseDouble(scanner.nextLine());
            if (areapool <= 30) {
                System.out.println("Not valid.");
                count++;
            }
        } while (count > 0);
        do {
            count = 0;
            System.out.print("Enter number of floors:");
            number = Integer.parseInt(scanner.nextLine());
            if (number < 0) {
                System.out.println("Not valid.");
                count++;
            }
        } while (count > 0);
        int value=0;
        mapVilla.put(new Villa(id,name,area,costs,people,type,room,areapool,number),value);
        villaRepo.addNewVilla(mapVilla);
    }

    @Override
    public void editVilla() {
        String id, name, type, room;
        double area, areaPool;
        int costs, people, number;
        int count;
        boolean flag;
        do {
           flag=true;
            System.out.print("Enter id service:");
            id = scanner.nextLine();
            for (Villa v : mapVilla.keySet()) {
                if (!v.getIdService().equals(id)) {
                    flag=false;
                }
            }
            if (!regexIdVilla(id)) {
                System.out.println("Not valid.");
                flag=true;
            }
        } while (flag);
        do {
            count = 0;
            System.out.print("Enter name service:");
            name = scanner.nextLine();
            if (!regexNameVilla(name)) {
                System.out.println("Not valid.");
                count++;
            }
        } while (count > 0);
        do {
            count = 0;
            System.out.print("Enter usable area:");
            area = Double.parseDouble(scanner.nextLine());
            if (area <= 30) {
                System.out.println("Not valid.");
                count++;
            }
        } while (count > 0);
        do {
            count = 0;
            System.out.print("Enter rental costs:");
            costs = Integer.parseInt(scanner.nextLine());
            if (costs < 0) {
                System.out.println("Not valid.");
                count++;
            }
        } while (count > 0);
        do {
            count = 0;
            System.out.print("Enter maximum people:");
            people = Integer.parseInt(scanner.nextLine());
            if (people < 0 || count >= 20) {
                System.out.println("Not valid.");
                count++;
            }
        } while (count > 0);
        type = chooseRentalType();
        room = chooseRoomStandard();
        do {
            count = 0;
            System.out.print("Enter swimming pool area:");
            areaPool = Double.parseDouble(scanner.nextLine());
            if (areaPool <= 30) {
                System.out.println("Not valid.");
                count++;
            }
        } while (count > 0);
        do {
            count = 0;
            System.out.print("Enter number of floors:");
            number = Integer.parseInt(scanner.nextLine());
            if (number < 0) {
                System.out.println("Not valid.");
                count++;
            }
        } while (count > 0);
        for (Villa v : mapVilla.keySet()) {
            v.setIdService(id);
            v.setServiceName(name);
            v.setUsableArea(area);
            v.setRentalCosts(costs);
            v.setMaximumPeople(people);
            v.setRentalType(type);
            v.setRoomStandard(room);
            v.setSwimmingPoolArea(areaPool);
            v.setNumberOfFloors(number);
        }
        villaRepo.editVilla(mapVilla);
    }

    @Override
    public void displayListVillaMaintenance() {
        for (Villa v : mapVilla.keySet()) {
            if (mapVilla.get(v) >= 5) {
                System.out.println(v.getInfoToCSV() + ", used: " + mapVilla.get(v) + " times, need maintennance. ");
            }
        }
    }




}