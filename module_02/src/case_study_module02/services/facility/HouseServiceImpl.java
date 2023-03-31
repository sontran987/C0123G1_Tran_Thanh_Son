package case_study_module02.services.facility;

import case_study_module02.models.House;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class HouseServiceImpl implements HouseService {
    static Scanner scanner = new Scanner(System.in);
    static LinkedHashMap<House, Integer> mapHouse = new LinkedHashMap<>();

    static {
        mapHouse.put(new House("1", "House", 1, 1, 1, "1", "1", "1"), 0);

    }

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
    static final String REGEX_ID_HOUSE = "^(SVHO-)[0-9]{4}$";
    static final String REGEX_NAME_HOUSE = "^[A-Z][a-z]+$";

    public String chooseRentalType() {
        String rentalType = null;
        String choose;
        boolean flag;
        for (int i = 0; i < listRentalType.length; i++) {
            System.out.println((i + 1) + ". " + listRentalType[i]);
        }
        do {
            flag = true;
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
            System.out.println("Enter choose room standard: ");
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


    @Override
    public void displayListHouse() {
        for (House h : mapHouse.keySet()) {
            System.out.println(h + ", đã sử dụng: " + mapHouse.get(h) + " lần.");
        }
    }

    @Override
    public void addNewHouse() {
        String id, name, rentalType, roomStandard, numberOfFloors;
        double usableArea, costs;
        int maximumPeople;
        int count = 0;
        do {
            System.out.println("Enter id service(SVHO-YYYY):");
            id = scanner.nextLine();
            for (House h : mapHouse.keySet()) {
                if (h.getIdService() == id) {
                    count++;
                }
            }
            if (!regexIdService(id)) {
                count++;
            }
        System.out.println("Enter name service: ");
        name = scanner.nextLine();
        if (!regexNameService(name)){
            count++;
        }
        System.out.println("Enter usable area: ");
        usableArea = Double.parseDouble(scanner.nextLine());
        if (usableArea<30){
            count++;
        }
        System.out.println("Enter rental costs: ");
        costs = Double.parseDouble(scanner.nextLine());
        if(costs<0){
            count++;
        }
        System.out.println("Enter maximum people: ");
        maximumPeople = Integer.parseInt(scanner.nextLine());
        if (maximumPeople<0||maximumPeople>20){
            count++;
        }
        rentalType = chooseRentalType();
        roomStandard = chooseRoomStandard();
        System.out.println("Enter number of floors: ");
        numberOfFloors = scanner.nextLine();
            if (count > 0) {
                System.out.println("Hãy nhập lại. ");
            }
        } while (count > 0);
        mapHouse.put(new House(id, name, usableArea, costs, maximumPeople, rentalType, roomStandard, numberOfFloors), 0);
    }

    @Override
    public void editHouse() {
        String id, name, rentalType, roomStandard, numberOfFloors;
        int maximumPeople;
        double usableArea, costs;
        int count = 0;
        do {
            System.out.println("Enter id service: ");
            id = scanner.nextLine();
            for (House h : mapHouse.keySet()) {
                if (h.getIdService() != id) {
                    count++;
                }
            }
            if (!regexIdService(id)) {
                count++;
            }
            System.out.println("Enter name service: ");
            name = scanner.nextLine();
            if (!regexNameService(name)) {
                count++;
            }
            System.out.println("Enter usable area: ");
            usableArea = Double.parseDouble(scanner.nextLine());
            if (usableArea < 30) {
                count++;
            }
            System.out.println("Enter rental costs: ");
            costs = Double.parseDouble(scanner.nextLine());
            if (costs < 0) {
                count++;
            }
            System.out.println("Enter maximum people: ");
            maximumPeople = Integer.parseInt(scanner.nextLine());
            if (maximumPeople < 0 || maximumPeople > 20) {
                count++;
            }
            rentalType = chooseRentalType();
            roomStandard = chooseRoomStandard();
            System.out.println("Enter number of floors: ");
            numberOfFloors = scanner.nextLine();
            if (count > 0) {
                System.out.println("Hãy nhập lại. ");
            }
        } while (count > 0);
        for (House h : mapHouse.keySet()) {
            if (h.getIdService() == id) {
                h.setIdService(id);
                h.setServiceName(name);
                h.setUsableArea(usableArea);
                h.setRentalCosts(costs);
                h.setMaximumPeople(maximumPeople);
                h.setRentalType(rentalType);
                h.setRoomStandard(roomStandard);
                h.setNumberOfFloors(numberOfFloors);

            }
        }
    }

    @Override
    public void displayListHouseMaintenance() {
        for (House h : mapHouse.keySet()) {
            if (mapHouse.get(h) >= 5) {
                System.out.println(h + ", đã sử dụng: " + mapHouse.get(h) + " lần, cần bảo trì.");
            }
        }
    }

    public static boolean regexIdService(String idService) {
        return idService.matches(REGEX_ID_HOUSE);

    }

    public static boolean regexNameService(String name) {
        return name.matches(REGEX_NAME_HOUSE);
    }
}
