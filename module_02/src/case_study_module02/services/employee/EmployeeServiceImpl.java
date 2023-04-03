package case_study_module02.services.employee;

import case_study_module02.models.Employee;
import case_study_module02.repository.employee_repo.EmployeeRepo;
import case_study_module02.repository.employee_repo.EmployeeRepoImpl;
import case_study_module02.services.Validate;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    static EmployeeRepo employeeRepo=new EmployeeRepoImpl();
    static List<Employee> listEmployee =employeeRepo.displayEmploy();

    static Scanner scanner = new Scanner(System.in);
    static String[] genderes = {
            "Male",
            "Female",
            "Other"
    };
    static String[] levelList = {
            "Trung cấp",
            "Cao đẳng",
            "Đại học",
            "Sau đại học"
    };
    static String[] locations = {
            "Lễ tân",
            "Phục vụ",
            "Chuyên viên",
            "Giám sát",
            "Quản lý",
            "Giám đốc"
    };

    public static String chooseGender() {
        String gender = null;
        boolean flag;
        do {
            flag = true;
            System.out.println("---/---/---/---/---/---/---/---/---/---/---/---/---/---/---/---");
            for (int i = 0; i < genderes.length; i++) {
                System.out.println((i + 1) + ". " + genderes[i]);
            }
            System.out.print("Choose gender:");
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
                    System.out.println("Try again");
                    flag = false;

            }
        } while (!flag);
        return gender;
    }

    public static String chooseLevel() {
        boolean flag;
        String level = null;
        do {
            flag = true;
            System.out.println("---/---/---/---/---/---/---/---/---/---/---/---/---/---/---");
            for (int i = 0; i < levelList.length; i++) {
                System.out.println((i + 1) + ". " + levelList[i]);
            }
            System.out.print("Choose level: ");
            String choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    level = levelList[0];
                    break;
                case "2":
                    level = levelList[1];
                    break;
                case "3":
                    level = levelList[2];
                    break;
                case "4":
                    level = levelList[3];
                    break;
                default:
                    System.out.println("Try again !");
                    flag = false;
            }
        } while (!flag);
        return level;
    }

    public static String chooseLocation() {
        boolean flag;
        String location = null;
        do {
            flag = true;
            System.out.println("---/---/---/---/---/---/---/---/---");
            for (int i = 0; i < locations.length; i++) {
                System.out.println((i + 1) + ". " + locations[i]);
            }

            System.out.print("Choose location: ");
            String choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    location = locations[0];
                    break;
                case "2":
                    location = locations[1];
                    break;
                case "3":
                    location = locations[2];
                    break;
                case "4":
                    location = locations[3];
                    break;
                case "5":
                    location = locations[4];
                    break;
                case "6":
                    location = locations[5];
                    break;
                default:
                    System.out.println("Try again !");
                    flag = false;
            }
        } while (!flag);
        return location;
    }

    @Override
    public void displayEmploy() {
        for (Employee e : listEmployee) {
            System.out.println(e);
        }
    }

    @Override
    public void addEmploy() {
        int id;
        String name,brithday,email,phone;
        boolean flag;
        do {
            flag = false;
            System.out.print("Enter id:");
            id = Integer.parseInt(scanner.nextLine());
            for (int i = 0; i < listEmployee.size(); i++) {
                if (listEmployee.get(i).getCode() == id) {
                    System.out.println("id is duplicated");
                    flag = true;
                }
            }
        }while (flag) ;
            do {
                flag = true;
                System.out.print("Enter name:");
                name = scanner.nextLine();
                if (!Validate.regexName(name)) {
                    System.out.println("Not valid.");
                    flag = false;
                }
            } while (!flag);
            do {
                flag = true;
                System.out.print("Enter brithday:");
                brithday = scanner.nextLine();
                if (!Validate.regexBrithday(brithday)) {
                    System.out.println("Not valid.");
                    flag = false;
                }
            } while (!flag);
            String gender = chooseGender();
            System.out.print("Enter Identity card:");
            int identityCard = Integer.parseInt(scanner.nextLine());
            do {
                flag = true;
                System.out.print("Enter number phone:");
                phone = scanner.nextLine();
                if (!Validate.regexPhone(phone)) {
                    System.out.println("Not valid.");
                    flag = false;
                }
            } while (!flag);

            do {
                flag = true;
                System.out.print("Enter email:");
                email = scanner.nextLine();
                if (!Validate.regexEmail(email)) {
                    System.out.println("Not valid.");
                    flag = false;
                }
            } while (!flag);

            String levels = chooseLevel();
            String location = chooseLocation();
            System.out.print("Enter wage:");
            long wage = Long.parseLong(scanner.nextLine());
            listEmployee.add(new Employee(id, name, brithday, gender
                    , identityCard, phone, email, levels, location, wage));
            employeeRepo.addEmploy(listEmployee);
        }

    @Override
    public void editInformationEmploy() {
         displayEmploy();
        int id;
        String name,brithday,phone,email;
        boolean flag ;
        do {
            flag=true;
            System.out.print("Enter id you want to edit:");
            id = Integer.parseInt(scanner.nextLine());
            for (int i = 0; i < listEmployee.size(); i++) {
                if (listEmployee.get(i).getCode() == id) {
                    flag = false;
                }
            }
            if (flag == true){
                System.out.print("id not is duplicated");
            }
        } while (flag);
        do {
            flag=true;
            System.out.print("Enter name:");
            name = scanner.nextLine();
            if (!Validate.regexName(name)){
                System.out.println("Not valid.");
                flag=false;
            }
        } while (!flag);
        do {
            flag=true;
            System.out.print("Enter brithday:");
            brithday = scanner.nextLine();
            if (!Validate.regexBrithday(brithday)){
                System.out.println("Not valid.");
                flag=false;
            }
        } while (!flag);
        String gender = chooseGender();
        System.out.print("Enter chứng minh nhân dân:");
        int identityCard = Integer.parseInt(scanner.nextLine());
        do {
            flag=true;
            System.out.print("Enter number phone:");
            phone = scanner.nextLine();
            if (!Validate.regexPhone(phone)){
                System.out.println("Not valid.");
                flag=false;
            }
        }while (!flag);

        do {
            flag=true;
            System.out.print("Enter email:");
            email = scanner.nextLine();
            if (!Validate.regexEmail(email)){
                System.out.println("Not valid.");
                flag=false;
            }
        }while(!flag);
        String levels = chooseLevel();
        String location = chooseLocation();
        System.out.print("Enter wage:");
        long wage = Long.parseLong(scanner.nextLine());
        Employee employee = new Employee(id, name, brithday, gender
                , identityCard, phone, email, levels, location, wage);
        for (int i = 0; i < listEmployee.size(); i++) {
            if (listEmployee.get(i).getCode() == id) {
                listEmployee.set(i,employee);
            }
        }
        employeeRepo.editInformationEmploy(listEmployee);
    }
}
