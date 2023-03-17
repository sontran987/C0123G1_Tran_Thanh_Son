package method_cua_array_list_theo_thu_vien.ve_nha.controller;

import java.util.Scanner;

public class StudentManagement {
    public static void displayMenu() {

        Scanner scanner = new Scanner(System.in);
        int choose;
        do {
            System.out.println("1.Giảng viên\n" +
                    "2. Học viên\n" +
                    "3. THoat\n");
            System.out.println("Nhap so theo chuc nang: ");
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
        System.out.println(
                "1. Thêm mới giảng viên hoặc học viên\n" +
                        "2. Xoá giảng viên hoặc học viên\n" +
                        "3. Xem danh sách giảng viên hoặc học viên\n" +
                        "4. Thoát\n");
        Scanner scanner = new Scanner(System.in);
        int choose;
        do {
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
                    System.out.println("Bạn đã thoát. ");
                    break;
                default:
                    System.out.println("Hãy nhập lại: ");

            }
        } while (choose != 4);
    }
    public static void displayMenuStudent() {
        System.out.println(
                "1. Thêm mới giảng viên hoặc học viên\n" +
                        "2. Xoá giảng viên hoặc học viên\n" +
                        "3. Xem danh sách giảng viên hoặc học viên\n" +
                        "4. Thoát\n");
        Scanner scanner = new Scanner(System.in);
        int choose;
        do {
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
                    System.out.println("Bạn đã thoát. ");
                    break;
                default:
                    System.out.println("Hãy nhập lại: ");

            }
        } while (choose != 4);
    }
}
