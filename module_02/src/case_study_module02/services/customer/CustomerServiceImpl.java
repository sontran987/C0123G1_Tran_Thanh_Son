package case_study_module02.services.customer;

import case_study_module02.models.Customer;
import case_study_module02.repository.customer_repo.CustomerRepo;
import case_study_module02.repository.customer_repo.CustomerRepoImpl;
import case_study_module02.services.Validate;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    static CustomerRepo customerRepo = new CustomerRepoImpl();
    static List<Customer> customerList = customerRepo.displayCostomer();
    static Scanner scanner = new Scanner(System.in);

    static String[] genderes = {
            "Male",
            "Female",
            "Other"
    };
    static String[] typeOfGuest = {
            "Diamond",
            "Platinium",
            "Gold",
            "Silver",
            "Member"
    };

    public static String chooseGender() {
        boolean flag;
        String gender = null;
        do {
            flag = true;
            System.out.println("---/---/---/---/---/---/---/---/---/---");
            for (int i = 0; i < genderes.length; i++) {
                System.out.println((i + 1) + ". " + genderes[i]);
            }
            System.out.print("Choose gender: ");
            String choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    gender = genderes[0];
                    break;
                case "2":
                    gender = genderes[1];
                    break;
                case "3":
                    gender = genderes[2];
                    break;
                default:
                    System.out.println("Try again.");
                    flag = false;
            }
        } while (!flag);
        return gender;
    }

    public static String chooseTypeOfGuest() {
        String guest = null;
        boolean flag;
        do {
            flag = true;
            System.out.println("---/---/---/---/---/---/---/---/---/---");
            for (int i = 0; i < typeOfGuest.length; i++) {
                System.out.println((i + 1) + " ." + typeOfGuest[i]);
            }
            System.out.print("Choose type of guest: ");
            String choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    guest = typeOfGuest[0];
                    break;
                case "2":
                    guest = typeOfGuest[1];
                    break;
                case "3":
                    guest = typeOfGuest[2];
                    break;
                case "4":
                    guest = typeOfGuest[3];
                    break;
                case "5":
                    guest = typeOfGuest[4];
                    break;
                default:
                    System.out.println("Try again ^_^");
                    flag = false;
            }

        } while (!flag);
        return guest;
    }

    @Override
    public void displayCustomer() {
        for (Customer c : customerList) {
            System.out.println(c);
        }
    }

    @Override
    public void addCustomer() {
        String name, brithday, numberPhone, email;
        int id;
        boolean flag;
        do {
            flag = true;
            System.out.print("Enter id: ");
            id = Integer.parseInt(scanner.nextLine());
            for (int i = 0; i < customerList.size(); i++) {
                if (customerList.get(i).getCode() == id) {
                    System.out.println("id already available ");
                    flag = false;
                }
            }
        } while (!flag);
        do {
            flag = true;
            System.out.print("Enter name: ");
            name = scanner.nextLine();
            if (!Validate.regexName(name)) {
                System.out.println("Not valid.");
                flag = false;
            }
        } while (!flag);
        do {
            flag = true;
            System.out.print("Enter brithday: ");
            brithday = scanner.nextLine();
            if (!Validate.regexBrithday(brithday)) {
                System.out.println("Not valid.");
                flag = false;
            }
        } while (!flag);
        String gender = chooseGender();
        System.out.print("Enter identily card: ");
        int identityCard = Integer.parseInt(scanner.nextLine());
        do {
            flag = true;
            System.out.print("Enter number phone: ");
            numberPhone = scanner.nextLine();
            if (!Validate.regexPhone(numberPhone)) {
                System.out.println("Not valid.");
                flag = false;
            }
        } while (!flag);
        do {
            flag = true;
            System.out.print("Enter email: ");
            email = scanner.nextLine();
            if (!Validate.regexEmail(email)) {
                System.out.println("Not valid.");
                flag = false;
            }
        } while (!flag);
        String guest = chooseTypeOfGuest();
        System.out.print("Enter address: ");
        String address = scanner.nextLine();
        customerList.add(new Customer(id, name, brithday, gender,
                identityCard, numberPhone, email, guest, address));
        customerRepo.addCustomer(customerList);
    }

    @Override
    public void editInfomationCostomer() {
        String name, brithday, numberPhone, email;
        int id;
        boolean flag;
        do {
            flag = true;
            System.out.print("Enter id: ");
            id = Integer.parseInt(scanner.nextLine());
            for (int i = 0; i < customerList.size(); i++) {
                if (customerList.get(i).getCode() == id) {
                    flag=false;
                }
            }
        } while (flag);
        do {
            flag = true;
            System.out.print("Enter name: ");
            name = scanner.nextLine();
            if (!Validate.regexName(name)) {
                System.out.println("Not valid.");
                flag = false;
            }
        } while (!flag);
        do {
            flag = true;
            System.out.print("Enter brithday: ");
            brithday = scanner.nextLine();
            if (!Validate.regexBrithday(brithday)) {
                System.out.println("Not valid.");
                flag = false;
            }
        } while (!flag);
        String gender = chooseGender();
        System.out.print("Enter identily card: ");
        int identityCard = Integer.parseInt(scanner.nextLine());
        do {

            System.out.print("Enter number phone: ");
            numberPhone = scanner.nextLine();
            if (!Validate.regexPhone(numberPhone)) {
                System.out.println("Not valid.");
                flag = false;
            }
        } while (!flag);
        do {
            flag = true;
            System.out.print("Enter email: ");
            email = scanner.nextLine();
            if (!Validate.regexEmail(email)) {
                System.out.println("Not valid.");
                flag = false;
            }
        } while (!flag);
        String guest = chooseTypeOfGuest();
        System.out.print("Enter address: ");
        String address = scanner.nextLine();
        Customer customer = new Customer(id, name, brithday, gender,
                identityCard, numberPhone, email, guest, address);
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getCode() == id) {
                customerList.set(i, customer);
            }
        }
        customerRepo.editInformationCustomer(customerList);
    }
}
