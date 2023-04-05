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

    public static boolean checkEndDate(String startDate, String endDate) {
        Date start = new Date(startDate);
        Date end = new Date(endDate);
        return start.before(end) ? true : false;
    }
    public static boolean checkStartDate(String startDate,String nameService,String typeOfService){
        Date start= new Date(startDate);
        for (Booking b : listBooking) {
            Date end=new Date(b.getEndDate());
            if (b.getServiceName().equals(nameService)&&b.getTypeOfService().equals(typeOfService)){
                if (start.after(end)){
                    return true;
                }else {
                    return false;
                }
            }
        }
        return false;
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
        String nameService = null;
        String typeOfService = null;
        do {
            flag = true;
            System.out.print("Enter id service: ");
           String  idService = scanner.nextLine();
            for (House h : houseMap.keySet()) {
                if (h.getIdService().equals(idService)) {
                    nameService=h.getServiceName();
                    typeOfService="House";
                    houseMap.put(h,houseMap.get(h)+1);
                    houseRepo.addNewHouse(houseMap);
                    flag = false;
                    break;
                }
            }
            for (Room r : roomMap.keySet()) {
                if (r.getIdService().equals(idService)) {
                    nameService=r.getServiceName();
                    typeOfService="Room";
                    roomMap.put(r,roomMap.get(r)+1);
                    roomRepo.addNewRoom(roomMap);
                    flag = false;
                    break;
                }
            }
            for (Villa v : villaMap.keySet()) {
                if (v.getIdService().equals(idService)) {
                    nameService=v.getServiceName();
                    typeOfService="Villa";
                    villaMap.put(v,villaMap.get(v)+1);
                    villaRepo.addNewVilla(villaMap);
                    flag = false;
                    break;
                }
            }
        } while (flag);
        String startDay;
        do {
            flag = true;
            System.out.print("Enter start day: ");
            startDay = scanner.nextLine();
            if (!Validate.regexDate(startDay)) {
                System.out.println("Not valid🤯🤯🤯");
                flag = false;
            }
           flag= checkStartDate(startDay,nameService,typeOfService);
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
            flag=checkEndDate(startDay,endDate);
        } while (!flag);

        Booking booking=new Booking(idBooking, startDay, endDate, idCustomer, nameService, typeOfService);
        listBooking.add(booking);
        bookingRepository.addBooking(booking);
        System.out.println("add booking already");
    }

    @Override
    public void displayListBooking() {
        listBooking = bookingRepository.displayListBooking();
        for (Booking b : listBooking) {
            System.out.println(b.toString());
        }
    }

    @Override
    public void editBooking() {

    }
}
