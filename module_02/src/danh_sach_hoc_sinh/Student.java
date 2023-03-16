package danh_sach_hoc_sinh;

import java.util.Scanner;

public class Student {
    static StudentList[] studenList = new StudentList[10];

    static {
        studenList[0] = new StudentList(1, "thanhson", "123");
        studenList[1] = new StudentList(2, "thanh", "1233");
        studenList[2] = new StudentList(3, "thanhsn", "123");

    }

    Scanner scanner = new Scanner(System.in);

    public void add() {
        System.out.println("nhap id:");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("nhap ten: ");
        String name = scanner.nextLine();
        System.out.println("nhap lop: ");
        String classes = scanner.nextLine();
        StudentList studentList = new StudentList(id, name, classes);
        for (int i = 0; i < 10; i++) {
            if (studenList[i] == null) {
                studenList[i] = studentList;
                break;
            }
        }
    }

    public void deleteStudent() {
        System.out.println("Nhap vi tri muon xoa: ");
        int index = scanner.nextInt();
        for (int i = 0; i < studenList.length; i++) {
            if (index == i + 1) {
                studenList[i] = studenList[i+1];
            }if (index+1==i){
                studenList[i] = studenList[i+1];

            }
        }
    }

    public void editStudent() {
        System.out.println("Nhap vi tri muon sua: ");
        int index = scanner.nextInt();
        System.out.println("nhap id muon sua:");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("nhap ten muon sua: ");
        String name = scanner.nextLine();
        System.out.println("nhap lop muon sua: ");
        String classes = scanner.nextLine();
        StudentList studentList = new StudentList(id, name, classes);
        for (int i = 0; i < studenList.length; i++) {
            if (index == i + 1) {
                studenList[i] = studentList;
            }
        }
    }

    public void display() {
        for (int i = 0; i < studenList.length; i++) {
            if (studenList[i] != null) {
                System.out.println(studenList[i]);
            } else {
                break;
            }
        }
    }
}
