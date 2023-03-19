package method_cua_array_list_theo_thu_vien.ve_nha.service;

import method_cua_array_list_theo_thu_vien.ve_nha.modele.Lecturers;

import java.util.Scanner;
import java.util.Stack;

public class LecturersService implements Funtions {
    static Stack<Lecturers> stack = new Stack<>();

    static {
        stack.add(new Lecturers(1, "thanh son", "12/12/1414", "Nam", "chuyenMon"));
    }

    @Override
    public void add() {

        Scanner scanner = new Scanner(System.in);
        int id = 0;
        System.out.println("nhap id: ");
        id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < stack.size(); i++) {
            while (id == stack.get(i).getCode()) {
                for (int j = 0; j < stack.size(); j++) {
                    System.out.println("nhap id: ");
                    id = Integer.parseInt(scanner.nextLine());
                }

            }

        }
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
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vị trí muốn xoá: ");
        int index = Integer.parseInt(scanner.nextLine());
        stack.remove(index - 1);
    }

    @Override
    public void display() {
        for (Lecturers s : stack) {
            System.out.println(s);
        }
    }
}
