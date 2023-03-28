package case_study_module02.services.employee;

import case_study_module02.models.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    static List<Employee> listEmployee = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void displayEmploy() {
        for (Employee e : listEmployee) {
            System.out.println(e);
        }
    }

    @Override
    public void addEmploy() {
        System.out.println("Enter id:");
        int id= Integer.parseInt(scanner.nextLine());
        System.out.println("Enter name:");
        String name= scanner.nextLine();
        System.out.println("Enter brithday:");
        String brithday= scanner.nextLine();
        System.out.println("Enter gender:");
        String gender= scanner.nextLine();
        System.out.println("Enter chứng minh nhân dân:");
        int identityCard= Integer.parseInt(scanner.nextLine());
        System.out.println("Enter number phone:");
        int phone=Integer.parseInt(scanner.nextLine());
        System.out.println("Enter email:");
        String email=scanner.nextLine();
        System.out.println("Enter level:");
        String level= scanner.nextLine();
        System.out.println("Enter location:");
        String location= scanner.nextLine();
        System.out.println("Enter wage:");
        double wage= Double.parseDouble(scanner.nextLine());
        listEmployee.add(new Employee(id,name,brithday,gender
                ,identityCard,phone,email,level,location,wage));
    }

    @Override
    public void editInformationEmploy() {
        System.out.println("Enter id you want to edit:");
        int id= Integer.parseInt(scanner.nextLine());
        System.out.println("Enter name:");
        String name= scanner.nextLine();
        System.out.println("Enter brithday:");
        String brithday= scanner.nextLine();
        System.out.println("Enter gender:");
        String gender= scanner.nextLine();
        System.out.println("Enter chứng minh nhân dân:");
        int identityCard= Integer.parseInt(scanner.nextLine());
        System.out.println("Enter number phone:");
        int phone=Integer.parseInt(scanner.nextLine());
        System.out.println("Enter email:");
        String email=scanner.nextLine();
        System.out.println("Enter level:");
        String level= scanner.nextLine();
        System.out.println("Enter location:");
        String location= scanner.nextLine();
        System.out.println("Enter wage:");
        double wage= Double.parseDouble(scanner.nextLine());
        Employee employee=new Employee(id,name,brithday,gender,
                identityCard,phone,email,level,location,wage);
        for (int i = 0; i < listEmployee.size(); i++) {
            if (listEmployee.get(i).getCode()==id){
                listEmployee.set(i,employee);
            }
        }
    }
}
