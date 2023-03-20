package method_cua_array_list_theo_thu_vien.ve_nha.service;

import method_cua_array_list_theo_thu_vien.ve_nha.controller.StudentManagement;
import method_cua_array_list_theo_thu_vien.ve_nha.modele.Lecturers;

import java.util.Scanner;
import java.util.Stack;

public class LecturersService implements Funtions {
    static Stack<Lecturers> stack = new Stack<>();
    Scanner scanner = new Scanner(System.in);

    static {
        stack.add(new Lecturers(1, "thanh son", "12/12/1414", "Nam", "chuyenMon"));
    }

    @Override
    public void add() {

        int id;
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
        System.out.println("nhap chuyen mon: ");
        String specialize = scanner.nextLine();
        stack.add(new Lecturers(id, name, birthday, gender, specialize));

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
        for (Lecturers s : stack) {
            System.out.println(s);
        }
    }
}
