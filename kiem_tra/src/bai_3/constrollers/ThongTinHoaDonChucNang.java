package bai_3.constrollers;

import bai_3.services.ThongTinHoaDonDichVu;
import bai_3.services.ThongTinHoaDonImpl;

import java.util.Scanner;

public class ThongTinHoaDonChucNang {
    static ThongTinHoaDonDichVu service = new ThongTinHoaDonImpl();

    public void thongTin() {
        Scanner scanner = new Scanner(System.in);
        boolean flag;
        do {
            flag = true;
            System.out.println("Chuc nang cua thong tin hoa don\n" +
                    "1.Them moi\n" +
                    "2.Hien Thi\n");
            System.out.print("chon chuc nang:");
            String choose = scanner.nextLine();
            switch (choose) {
                case "0":
                    flag = false;
                    System.out.println("Ban da thoat.");
                    break;
                case "1":
                    service.add();
                    break;
                case "2":
                    service.display();
                    break;
                default:
                    System.out.println("hay nhap lai");
            }
        } while (flag);
    }
}
