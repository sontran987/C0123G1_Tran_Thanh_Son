package danh_sach_hoc_sinh;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Student student = new Student();
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.Add\n" + "2.Delete\n" + "3.Edit\n" + "4.Display");
        int son;
        boolean flag = true;
        do {
            System.out.println("chon kieu ");
            son = scanner.nextInt();
            switch (son) {
                case 1:
                    System.out.println("them");
                    student.add();
                    break;
                case 2:
                    System.out.println("xoa");
                    student.deleteStudent();
                    break;
                case 3:
                    System.out.println("sua");
                    student.editStudent();
                    break;
                case 4:
                    System.out.println("in");
                    student.display();
                    break;
                case 5:
                    System.out.println("thoat");
                    flag = false;
                    break;
                default:
                    System.out.println("hay nhap lai");
            }
        } while (flag);
    }
}
