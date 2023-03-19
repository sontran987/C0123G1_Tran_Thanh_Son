package method_cua_array_list_theo_thu_vien.ve_nha.controller;

import method_cua_array_list_theo_thu_vien.ve_nha.service.LecturersService;
import method_cua_array_list_theo_thu_vien.ve_nha.service.StudentService;

import java.util.Scanner;

public class StudentManagement {
    public static void displayMenu() {

        Scanner scanner = new Scanner(System.in);
        int choose;
        do {
            System.out.println("1.Giảng viên\n" +
                    "2. Học viên\n" +
                    "3. THoat\n");
            System.out.println("Nhập số theo chức vụ: ");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    displayMenuLecturers();
                    break;
                case 2:
                    displayMenuStudent();
                    break;
                case 3:
                    System.out.println("ban da thoat");
                    break;
                default:
                    System.out.println("hay nhap lai");
            }
        } while (choose != 3);
    }

    public static void displayMenuLecturers() {
        LecturersService lecturersService=new LecturersService();
        Scanner scanner = new Scanner(System.in);
        int choose;
        do {
            System.out.println(
                    "1. Thêm mới giảng viên \n" +
                            "2. Xoá giảng viên \n" +
                            "3. Xem danh sách giảng viên \n" +
                            "4. Thoát\n");
            System.out.println("Nhập số tương ứng với chức năng: ");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    lecturersService.add();
                    break;
                case 2:
                    lecturersService.deletes();
                    break;
                case 3:
                    lecturersService.display();
                    break;
                case 4:
                    System.out.println("Bạn đã thoát. ");
                    break;
                default:
                    System.out.println("Hãy nhập lại: ");

            }
        } while (choose != 4);
    }

    public static void displayMenuStudent() {
        StudentService studentService = new StudentService();
        int choose;
        do {
            System.out.println(
                    "1. Thêm mới  học viên\n" +
                            "2. Xoá  học viên\n" +
                            "3. Xem danh sách học viên\n" +
                            "4. Thoát\n");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập số tương ứng với chức năng: ");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    studentService.add();
                    break;
                case 2:
                    studentService.deletes();
                    break;
                case 3:
                    studentService.display();
                    break;
                case 4:
                    System.out.println("Bạn đã thoát. ");
                    break;
                default:
                    System.out.println("Hãy nhập lại: ");

            }
        } while (choose != 4);
    }
}
