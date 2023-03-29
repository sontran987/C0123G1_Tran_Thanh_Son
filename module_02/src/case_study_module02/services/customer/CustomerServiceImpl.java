package case_study_module02.services.customer;

import case_study_module02.models.Customer;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    static List<Customer> customerList = new LinkedList<>();
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
            System.out.println("Enter type of guest: ");
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
        System.out.println("Enter id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        System.out.println("Enter brithday: ");
        String brithday = scanner.nextLine();
        String gender = chooseGender();
        System.out.println("Enter identily card: ");
        int identityCard = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter number phone: ");
        int numberPhone = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter email: ");
        String email = scanner.nextLine();
        String guest = chooseTypeOfGuest();
        System.out.println("Enter address: ");
        String address = scanner.nextLine();
        customerList.add(new Customer(id, name, brithday, gender,
                identityCard, numberPhone, email, guest, address));
    }

    @Override
    public void editInfomationCostomer() {
        System.out.println("Enter id you want to edit: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        System.out.println("Enter brithday: ");
        String brithday = scanner.nextLine();
        String gender = chooseGender();
        System.out.println("Enter identily card: ");
        int identityCard = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter number phone: ");
        int numberPhone = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter email: ");
        String email = scanner.nextLine();
        String guest = chooseTypeOfGuest();
        System.out.println("Enter address: ");
        String address = scanner.nextLine();
        Customer customer = new Customer(id, name, brithday, gender,
                identityCard, numberPhone, email, guest, address);
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getCode() == id) {
                customerList.set(i, customer);
            }
        }
    }
}
