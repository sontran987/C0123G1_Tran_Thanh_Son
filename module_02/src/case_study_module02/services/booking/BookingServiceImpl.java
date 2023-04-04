package case_study_module02.services.booking;

import case_study_module02.models.*;
import case_study_module02.repository.booking_repo.BookingRepoImpl;
import case_study_module02.repository.booking_repo.BookingRepository;
import case_study_module02.repository.customer_repo.CustomerRepo;
import case_study_module02.repository.customer_repo.CustomerRepoImpl;
import case_study_module02.repository.facility_repo.*;
import case_study_module02.services.Validate;
import case_study_module02.services.customer.CustomerService;
import case_study_module02.services.customer.CustomerServiceImpl;
import case_study_module02.services.facility.FacilityService;
import case_study_module02.services.facility.FacilityServiceImpl;

import java.util.*;

public class BookingServiceImpl implements BookingService {
    static CustomerService customerService = new CustomerServiceImpl();
    static CustomerRepo customerRepo = new CustomerRepoImpl();
    static FacilityService facilityService = new FacilityServiceImpl();
    static HouseRepo houseRepo = new HouseRepoImpl();
    static RoomRepo roomRepo = new RoomRepoImpl();
    static VillaRepo villaRepo = new VillaRepoImpl();
    static BookingRepository bookingRepository = new BookingRepoImpl();
    static Set<Booking> listBooking = bookingRepository.displayListBooking();
    static List<Customer> customerList = customerRepo.displayCostomer();
    static LinkedHashMap<House, Integer> houseMap = houseRepo.displayListHouse();
    static LinkedHashMap<Room, Integer> roomMap = roomRepo.displayListRoom();
    static LinkedHashMap<Villa, Integer> villaMap = villaRepo.displayListVilla();
    static Scanner scanner = new Scanner(System.in);
    static String[] typeOfService = {
            "Villa",
            "House",
            "Room"};

    public static String chooseTypeOfService() {
        String typeService = null;
        for (int i = 0; i < typeOfService.length; i++) {
            System.out.println((i + 1) + ". " + typeOfService[i]);
        }
        String choose;
        boolean flag;
        do {
            flag = false;
            System.out.print("Choose Service: ");
            choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    typeService = typeOfService[0];
                    break;
                case "2":
                    typeService = typeOfService[1];
                    break;
                case "3":
                    typeService = typeOfService[2];
                    break;
                default:
                    System.out.println("Try again🤤🤤");
                    flag = true;
            }
        } while (flag);
        return typeService;
    }

    @Override
    public void addNewBooking() {
        //mã, ngày bắt đầu, ngày kết thúc, mã khách hàng, tên dịch vụ, loại dv

        System.out.println("------list Customer------");
        customerService.displayCustomer();
        System.out.println("------list service-------");
        facilityService.displayListFacility();
        int idBooking;
        boolean flag;
        do {
            flag = true;
            System.out.print("Enter id:");
            idBooking = Integer.parseInt(scanner.nextLine());
            for (Booking b : listBooking) {
                if (b.getCodeBooking() == idBooking) {
                    System.out.println("Try again🤗");
                    flag = false;
                    break;
                } else {
                    flag = true;
                }
            }
        } while (!flag);
        String startDay;
        do {
            flag = true;
            System.out.print("Enter start day: ");
             startDay = scanner.nextLine();
            if (!Validate.regexDate(startDay)) {
                System.out.println("Not valid🤯🤯🤯");
                flag = false;
            }
        } while (!flag);
        String endDate;
        do {
            flag = true;
            System.out.print("Enter end day: ");
             endDate = scanner.nextLine();
            if (!Validate.regexDate(endDate)) {
                System.out.println("Not valid🤯🤯🤯");
                flag = false;
            }
        } while (!flag);
        int idCustomer;
        do {
            flag = true;
            System.out.print("Enter id of the customer: ");
            idCustomer = Integer.parseInt(scanner.nextLine());
            for (Customer c : customerList) {
                if (c.getCode() == idCustomer) {
                    flag = false;
                    break;
                }
            }
        } while (flag);
        String nameService;

        do {
            flag = true;
            System.out.print("Enter name service: ");
            nameService = scanner.nextLine();
            for (House h : houseMap.keySet()) {
                if (h.getServiceName().equals(nameService)) {
                    int value=houseMap.get(h)+1;

                    flag = false;
                    break;
                }
            }
            for (Room r : roomMap.keySet()) {
                if (r.getServiceName().equals(nameService)) {
                    flag = false;
                    break;
                }
            }
            for (Villa v : villaMap.keySet()) {
                if (v.getServiceName().equals(nameService)) {
                    flag = false;
                    break;
                }
            }
        } while (flag);
        String typeOfService=chooseTypeOfService();
        bookingRepository.addBooking(new Booking(idBooking,startDay,endDate,idCustomer,nameService,typeOfService));
    }

    @Override
    public void displayListBooking() {
        for (Booking b : listBooking) {
            System.out.println(b.toString());
        }
    }

    @Override
    public void editBooking() {

    }
}
