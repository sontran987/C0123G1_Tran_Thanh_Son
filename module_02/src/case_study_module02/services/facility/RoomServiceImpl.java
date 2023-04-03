package case_study_module02.services.facility;

import case_study_module02.models.Room;
import case_study_module02.repository.facility_repo.RoomRepo;
import case_study_module02.repository.facility_repo.RoomRepoImpl;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class RoomServiceImpl implements RoomService {
    static Scanner scanner = new Scanner(System.in);
    static RoomRepo roomRepo=new RoomRepoImpl();
    static LinkedHashMap<Room, Integer> mapRoom = roomRepo.displayListRoom();

    static {
        mapRoom.put(new Room("1", "Room", 1, 1, 1, "1", "1"), 0);
        mapRoom.put(new Room("2", "Room1", 1, 1, 1, "1", "1"), 1);
        mapRoom.put(new Room("3", "Room2", 1, 1, 1, "1", "1"), 2);
    }

    static String[] listRentalType = {
            "year",
            "month",
            "day",
            "hour"
    };
    static final String REGEX_ID_ROOM = "^(SVRO-)[0-9]{4}$";
    static final String REGEX_NAME_ROOM = "^[A-Z][a-z]+$";

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

    @Override
    public void displayListRoom() {
        for (Room r : mapRoom.keySet()) {
            System.out.println(r + ", đã sử dụng: " + mapRoom.get(r) + " lần.");
        }
    }

    @Override
    public void addNewRoom() {
        String id, name, freeServiceIncluded, rentalType;
        double usableArea, rentalCosts;
        int maximumPeople;
        int count;
        do {
            count = 0;
            System.out.print("Enter id service(SVRO-YYYY):");
            id = scanner.nextLine();
            for (Room r : mapRoom.keySet()) {
                if (r.getIdService() == id) {
                    count++;
                }
            }
            if (!regexIdRoom(id)) {
                System.out.println("Not valid.");
                count++;
            }
        } while (count > 0);
        do {
            count = 0;
            System.out.print("Enter name service: ");
            name = scanner.nextLine();
            if (!regexNameRoom(name)) {
                System.out.println("Not valid.");
                count++;
            }
        } while (count > 0);
        do {
            count = 0;
            System.out.print("Enter usable area: ");
            usableArea = Double.parseDouble(scanner.nextLine());
            if (usableArea <= 30) {
                System.out.println("Not valid.");
                count++;
            }
        } while (count > 0);
        do {
            count = 0;
            System.out.print("Enter rental costs: ");
            rentalCosts = Double.parseDouble(scanner.nextLine());
            if (rentalCosts < 0) {
                System.out.println("Not valid.");
                count++;
            }
        } while (count > 0);
        do {
            count = 0;
            System.out.print("Enter the maximum of people");
            maximumPeople = Integer.parseInt(scanner.nextLine());
            if (maximumPeople < 0 || maximumPeople >= 20) {
                System.out.println("Not valid.");
                count++;
            }
        } while (count > 0);
        rentalType = chooseRentalType();
        System.out.print("Enter Free service included");
        freeServiceIncluded = scanner.nextLine();
        int value=0;
        mapRoom.put(new Room(id, name, usableArea, rentalCosts, maximumPeople, rentalType, freeServiceIncluded),value);
    roomRepo.addNewRoom(mapRoom);
    }

    @Override
    public void editRoom() {
        String id, name, rentalType, freeServiceIncluded;
        int count;
        double usableArea, rentalCosts;
        int maximumPeople;
        do {
            count = 0;
            System.out.print("Enter id service: ");
            id = scanner.nextLine();
            for (Room r : mapRoom.keySet()) {
                if (r.getIdService() != id) {
                    count++;
                }
            }
            if (!regexIdRoom(id)) {
                System.out.println("Not valid.");
                count++;
            }
        } while (count > 0);
        do {
            count = 0;
            System.out.print("Enter name service: ");
            name = scanner.nextLine();
            if (!regexNameRoom(name)) {
                System.out.println("Not valid.");
                count++;
            }
        } while (count > 0);
        do {
            count = 0;
            System.out.print("Enter usable area: ");
            usableArea = Double.parseDouble(scanner.nextLine());
            if (usableArea <= 30) {
                System.out.println("Not valid.");
                count++;
            }
        } while (count > 0);
        do {
            count = 0;
            System.out.print("Enter rental costs: ");
            rentalCosts = Double.parseDouble(scanner.nextLine());
            if (rentalCosts < 0) {
                System.out.println("Not valid.");
                count++;
            }
        } while (count > 0);
        do {
            count = 0;
            System.out.print("Enter the maximum of people");
            maximumPeople = Integer.parseInt(scanner.nextLine());
            if (maximumPeople < 0 || maximumPeople >= 20) {
                System.out.println("Not valid.");
                count++;
            }
        } while (count > 0);
        rentalType = chooseRentalType();
        System.out.print("Enter Free service included");
        freeServiceIncluded = scanner.nextLine();
        for (Room r : mapRoom.keySet()) {
            r.setIdService(id);
            r.setServiceName(name);
            r.setUsableArea(usableArea);
            r.setRentalCosts(rentalCosts);
            r.setMaximumPeople(maximumPeople);
            r.setRentalType(rentalType);
            r.setFreeServiceIncluded(freeServiceIncluded);
        }
        roomRepo.editRoom(mapRoom);
    }

    @Override
    public void displayListRoomMaintenance() {
        for (Room r : mapRoom.keySet()) {
            if (mapRoom.get(r) >= 5) {
                System.out.println(r + ", đã sử dụng: " + mapRoom.get(r) + " lần cần bảo trì.");
            }
        }
    }

    public static boolean regexIdRoom(String id) {
        return id.matches(REGEX_ID_ROOM);
    }

    public static boolean regexNameRoom(String name) {
        return name.matches(REGEX_NAME_ROOM);
    }
}
