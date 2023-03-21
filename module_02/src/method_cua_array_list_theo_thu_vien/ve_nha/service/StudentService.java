package method_cua_array_list_theo_thu_vien.ve_nha.service;

import method_cua_array_list_theo_thu_vien.ve_nha.controller.StudentManagement;
import method_cua_array_list_theo_thu_vien.ve_nha.model.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentService implements Funtions {
    static ArrayList<Student> stack = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    static {
    stack.add(new Student(1,"son","123/123","qưeqưew","ưeqưe",132123));
}
    @Override
    public void add() {
        int id ;
        boolean flag;
        do {
            flag=false;
            System.out.println("nhap id: ");
            id = Integer.parseInt(scanner.nextLine());
            for (int i = 0; i < stack.size(); i++) {
                if (id == stack.get(i).getCode()) {
                    System.out.println("id đã tồn tại hãy nhập lại: ");
                    flag=true;
                    break;
                }

            }
        }while (flag);
        System.out.println("nhap ten: ");
        String name = scanner.nextLine();
        System.out.println("nhap ngay sinh: ");
        String birthday = scanner.nextLine();
        System.out.println("nhap gioi tinh: ");
        String gender = scanner.nextLine();
        System.out.println("nhap lop: ");
        String classes = scanner.nextLine();
        System.out.println("nhap diem so: ");
        double point = Double.parseDouble(scanner.nextLine());
        stack.add(new Student(id, name, birthday, gender, classes, point));

    }

    @Override
    public void deletes() {
        boolean flag = true;
        System.out.println("Enter ID of Student to remove: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < stack.size(); i++) {
            if (stack.get(i).getCode() == id){
                do {
                    System.out.println("Are you sure to delete");
                    String ensure = scanner.nextLine();
                    switch (ensure) {
                        case "yes":
                            stack.remove(i);
                            StudentManagement.displayMenu();
                            break;
                        case "no":
                            StudentManagement.displayMenu();
                            break;
                        default:
                            flag = false;
                            System.out.println("Incorrect, please type again.");
                    }
                }while (!flag);
            }
            else {
                System.out.println("ID is not found");
                StudentManagement.displayMenu();
            }
        }

    }

    @Override
    public void display() {
        for (Student s : stack) {
            System.out.println(s);
        }
    }
}
