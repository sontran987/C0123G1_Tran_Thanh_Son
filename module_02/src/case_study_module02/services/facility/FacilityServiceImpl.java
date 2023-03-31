package case_study_module02.services.facility;

import java.util.Scanner;

public class FacilityServiceImpl implements FacilityService {
    HouseServiceImpl houseService = new HouseServiceImpl();
    RoomServiceImpl roomService = new RoomServiceImpl();
    VillaServiceImpl villaService = new VillaServiceImpl();
    static Scanner scanner = new Scanner(System.in);


    @Override
    public void displayListFacility() {
        villaService.displayListVilla();
        houseService.displayListHouse();
        roomService.displayListRoom();
    }

    @Override
    public void addNewFacility() {
        boolean flag;
        do {
            flag = true;
            System.out.println("1. Add new Villa\n" +
                    "2. Add new House\n" +
                    "3. Add new Room\n");
            String choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    villaService.addNewVilla();
                    break;
                case "2":
                    houseService.addNewHouse();
                    break;
                case "3":
                    roomService.addNewRoom();
                    break;
                default:
                    System.out.println("Try again🚄");
                    flag = false;
            }
        } while (!flag);
    }

    @Override
    public void editFacility() {
        boolean flag;
        do {
            flag = true;
            System.out.println("1. Edit Villa\n" +
                    "2. Edit House\n" +
                    "3. Edit Room\n");
            String choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    villaService.editVilla();
                    break;
                case "2":
                    houseService.editHouse();
                    break;
                case "3":
                    roomService.editRoom();
                    break;
                default:
                    System.out.println("Try again🚄");
                    flag = false;
            }
        } while (!flag);
    }

    @Override
    public void displayListFacilityMaintenance() {
        villaService.displayListVillaMaintenance();
        houseService.displayListHouseMaintenance();
        roomService.displayListRoomMaintenance();
    }
}
