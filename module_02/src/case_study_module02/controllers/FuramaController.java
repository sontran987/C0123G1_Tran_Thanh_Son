package case_study_module02.controllers;

import case_study_module02.services.booking.BookingService;
import case_study_module02.services.booking.BookingServiceImpl;
import case_study_module02.services.contract.ContractService;
import case_study_module02.services.contract.ContractServiceImpl;
import case_study_module02.services.customer.CustomerService;
import case_study_module02.services.customer.CustomerServiceImpl;
import case_study_module02.services.employee.EmployeeService;
import case_study_module02.services.employee.EmployeeServiceImpl;
import case_study_module02.services.facility.FacilityService;
import case_study_module02.services.facility.FacilityServiceImpl;

import java.util.Scanner;

public class FuramaController {
    static EmployeeService employeeService = new EmployeeServiceImpl();
    static FacilityService facilityService = new FacilityServiceImpl();
    static CustomerService customerService = new CustomerServiceImpl();
    static BookingService bookingService = new BookingServiceImpl();
static ContractService contractService=new ContractServiceImpl();
    public static void displayMainMenu() {
        Scanner scanner = new Scanner(System.in);
        String choose;
        do {
            System.out.println(
                    "--------Furama management program-------\n" +
                            "1.\tEmployee Management\n" +
                            "2.\tCustomer Management\n" +
                            "3.\tFacility Management\n" +
                            "4.\tBooking Management\n" +
                            "5.\tPromotion Management\n" +
                            "6.\tExit\n");
            System.out.print("Choose number of the function: ");
            choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    employeeManagement();
                    break;
                case "2":
                    customerManagement();
                    break;
                case "3":
                    facilityManagement();
                    break;
                case "4":
                    bookingManagement();
                    break;
                case "5":
                    promotionManagement();
                    break;
                case "6":
                    System.out.println("Exited");
                    break;
                default:
                    System.out.println("Try again.");
            }
        } while (choose != "6");
    }

    public static void employeeManagement() {
        Scanner sc = new Scanner(System.in);
        String choose;
        boolean flag;
        do {
            flag=true;
            System.out.println(
                    "---------Function Emloyee Management--------- \n" +
                            "1.\tDisplay list employees\n" +
                            "2.\tAdd new employees\n" +
                            "3.\tEdit employees\n" +
                            "4.\tReturn main menu");
            System.out.print("Choose number of the function: ");
            choose = sc.nextLine();
            switch (choose) {
                case "1":
                    employeeService.displayEmploy();
                    break;
                case "2":
                    employeeService.addEmploy();
                    break;
                case "3":
                    employeeService.editInformationEmploy();
                    break;
                case "4":
                    System.out.println("Back to menu furama😘");
                    flag=false;
                    break;
                default:
                    System.out.println("Try again(●'◡'●)");
            }
        } while (flag);
    }

    public static void customerManagement() {
        Scanner scanner = new Scanner(System.in);
        String choose;
        boolean flag;
        do {
            flag=true;
            System.out.println(
                    "-----------Function Customer Management-----------\n" +
                            "1.\tDisplay list customers\n" +
                            "2.\tAdd new customer\n" +
                            "3.\tEdit customer\n" +
                            "4.\tReturn main menu\n");
            System.out.print("Choose number of the function: ");
            choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    customerService.displayCustomer();
                    break;
                case "2":
                    customerService.addCustomer();
                    break;
                case "3":
                    customerService.editInfomationCostomer();
                    break;
                case "4":
                    System.out.println("Back to menu furama😘");
                    flag=false;
                    break;
                default:
                    System.out.println("Try again(❁´◡`❁)");
            }
        } while (flag);
    }

    public static void facilityManagement() {
        Scanner scanner = new Scanner(System.in);
        String choose;
        boolean flag;
        do {
            flag=true;
            System.out.println(
                    "-------Function Facility Management---------\n" +
                            "1\tDisplay list facility\n" +
                            "2\tAdd new facility\n" +
                            "3\tEdit facility\n" +
                            "4\tDisplay list facility maintenance\n" +
                            "5\tReturn main menu\n");
            System.out.print("Choose number of the function: ");
            choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    facilityService.displayListFacility();
                    break;
                case "2":
                    facilityService.addNewFacility();
                    break;
                case "3":
                    facilityService.editFacility();
                    break;
                case "4":
                    facilityService.displayListFacilityMaintenance();
                    break;
                case "5":
                    System.out.println("Back to menu Furama😘");
                    flag=false;
                    break;
                default:
                    System.out.println("Try again😅");
            }
        } while (flag);
    }

    public static void bookingManagement() {
        Scanner scanner = new Scanner(System.in);
        String choose;
        boolean flag;
        do {
            flag=true;
            System.out.println(
                    "--------Function Booking Management----------\n" +
                            "1.\tAdd new booking\n" +
                            "2.\tDisplay list booking\n" +
                            "3.\tCreate new contract\n" +
                            "4.\tDisplay list contracts\n" +
                            "5.\tEdit contracts\n" +
                            "6.\tReturn main menu\n");
            System.out.print("Choose number of the function: ");
            choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    bookingService.addNewBooking();
                    break;
                case "2":
                    bookingService.displayListBooking();
                    break;
                case "3":
                    contractService.createNewContract();
                    break;
                case "4":
                    contractService.displayListContracts();
                    break;
                case "5":
                    contractService.editContracts();
                    break;
                case "6":
                    System.out.println("Back to menu Furama😘");
                    flag=false;
                    break;
                default:
                    System.out.println("Try again(❁´◡`❁)");
            }
        } while (flag);
    }

    public static void promotionManagement() {

        Scanner scanner = new Scanner(System.in);
        String choose;
        boolean flag;
        do {
            flag=true;
            System.out.println(
                    "---------Function Promotion Management--------- \n" +
                            "1.\tDisplay list customers use service\n" +
                            "2.\tDisplay list customers get voucher\n" +
                            "3.\tReturn main menu\n");
            System.out.print("Choose number of the function: ");
            choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    System.out.println("Back to menu Furama😘");
                    flag=false;
                    break;
                default:
                    System.out.println("Try again(❁´◡`❁)");
            }
        } while (flag);
    }
}
