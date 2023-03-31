package case_study_module02.controllers;

import case_study_module02.services.customer.CustomerService;
import case_study_module02.services.customer.CustomerServiceImpl;
import case_study_module02.services.employee.EmployeeService;
import case_study_module02.services.employee.EmployeeServiceImpl;
import case_study_module02.services.facility.FacilityService;
import case_study_module02.services.facility.FacilityServiceImpl;

import java.util.Scanner;

public class FuramaController {

    public static void displayMainMenu() {

        Scanner scanner = new Scanner(System.in);
        int choose;
        do {
            System.out.println(
                    "Menu Furama: \n" +
                            "1.\tEmployee Management\n" +
                            "2.\tCustomer Management\n" +
                            "3.\tFacility Management\n" +
                            "4.\tBooking Management\n" +
                            "5.\tPromotion Management\n" +
                            "6.\tExit\n");
            System.out.println("Nhap so tuong ung voi chuc nang: ");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    employeeManagement();
                    break;
                case 2:
                    customerManagement();
                    break;
                case 3:
                    facilityManagement();
                    break;
                case 4:
                    bookingManagement();
                    break;
                case 5:
                    promotionManagement();
                    break;
                case 6:
                    System.out.println("ban da thoat");
                    break;
                default:
                    System.out.println("Hay nhap lai");
            }
        } while (choose != 6);
    }

    public static void employeeManagement() {
        EmployeeService employeeService = new EmployeeServiceImpl();
        Scanner sc = new Scanner(System.in);
        int choose;
        do {
            System.out.println(
                    "Menu : \n" +
                            "1.\tDisplay list employees\n" +
                            "2.\tAdd new employees\n" +
                            "3.\tEdit employees\n" +
                            "4.\tReturn main menu");
            System.out.println("Nhập số tương ứng với chức năng: ");
            choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 1:
                    employeeService.displayEmploy();
                    break;
                case 2:
                    employeeService.addEmploy();
                    break;
                case 3:
                    employeeService.editInformationEmploy();
                    break;
                case 4:
                    System.out.println("Back to menu furama.");
                    break;
                default:
                    System.out.println("Hãy nhập lại");
            }
        } while (choose != 4);
    }

    public static void customerManagement() {
        CustomerService customerService = new CustomerServiceImpl();
        Scanner scanner = new Scanner(System.in);
        int choose;
        do {
            System.out.println(
                    "Menu: \n" +
                            "1.\tDisplay list customers\n" +
                            "2.\tAdd new customer\n" +
                            "3.\tEdit customer\n" +
                            "4.\tReturn main menu\n");
            System.out.println("Nhập số tương ứng với chức năng: ");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    customerService.displayCustomer();
                    break;
                case 2:
                    customerService.addCustomer();
                    break;
                case 3:
                    customerService.editInfomationCostomer();
                    break;
                case 4:
                    System.out.println("Back to menu furama.");
                    break;
                default:
                    System.out.println("Hãy nhập lại");
            }
        } while (choose != 4);
    }

    public static void facilityManagement() {
        FacilityService facilityService = new FacilityServiceImpl();
        Scanner scanner = new Scanner(System.in);
        int choose;
        do {
            System.out.println(
                    "Menu: \n" +
                            "1\tDisplay list facility\n" +
                            "2\tAdd new facility\n" +
                            "3\tEdit facility\n" +
                            "4\tDisplay list facility maintenance\n" +
                            "5\tReturn main menu\n");
            System.out.println("Nhập số tương ứng với chức năng: ");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    facilityService.displayListFacility();
                    break;
                case 2:
                    facilityService.addNewFacility();
                    break;
                case 3:
                    facilityService.editFacility();
                    break;
                case 4:
                    facilityService.displayListFacilityMaintenance();
                    break;
                case 5:
                    System.out.println("Back to menu furama");
                    break;
                default:
                    System.out.println("Hãy nhập lại");
            }
        } while (choose != 5);
    }

    public static void bookingManagement() {

        Scanner scanner = new Scanner(System.in);
        int choose;
        do {
            System.out.println(
                    "Menu:\n" +
                            "1.\tAdd new booking\n" +
                            "2.\tDisplay list booking\n" +
                            "3.\tCreate new contract\n" +
                            "4.\tDisplay list contracts\n" +
                            "5.\tEdit contracts\n" +
                            "6.\tReturn main menu\n");
            System.out.println("Nhập số tương ứng với chức năng: ");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    displayMainMenu();
                    break;
                default:
                    System.out.println("Hãy nhập lại");
            }
        } while (choose != 6);
    }

    public static void promotionManagement() {

        Scanner scanner = new Scanner(System.in);
        int choose;
        do {
            System.out.println(
                    "Menu: \n" +
                            "1.\tDisplay list customers use service\n" +
                            "2.\tDisplay list customers get voucher\n" +
                            "3.\tReturn main menu\n");
            System.out.println("Nhập số tương ứng với chức năng: ");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    displayMainMenu();
                    break;
                default:
                    System.out.println("Hãy nhập lại");
            }
        } while (choose != 3);
    }
}
