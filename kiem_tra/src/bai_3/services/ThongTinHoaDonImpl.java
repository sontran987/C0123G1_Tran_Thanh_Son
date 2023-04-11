package bai_3.services;

import bai_3.modules.ThongTinHoaDon;
import bai_3.repository.ThongTinHoaDonRepository;
import bai_3.repository.ThongTinHoaDonRepositoryImp;
import bai_3.utils.Validate;

import java.util.List;
import java.util.Scanner;

public class ThongTinHoaDonImpl implements ThongTinHoaDonDichVu {
    static Scanner scanner = new Scanner(System.in);
    static ThongTinHoaDonRepository billRepository = new ThongTinHoaDonRepositoryImp();
    static List<ThongTinHoaDon> listBill = billRepository.display();
    static String[] typeCustomer = {
            "sinh hoat",
            "kinh doanh"};

    public static String chooseCustomer() {
        boolean flag;
        String typeCus = null;
        do {
            flag = true;
            for (int i = 0; i < typeCustomer.length; i++) {
                System.out.println((i + 1) + ". " + typeCustomer[i]);
            }
            System.out.print("chon loai khach: ");
            String choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    typeCus = typeCustomer[0];
                    flag = false;
                    break;
                case "2":
                    flag = false;
                    typeCus = typeCustomer[1];
                    break;
                default:
                    System.out.println("hay nhap lai.");
            }
        } while (flag);
        return typeCus;
    }

    @Override
    public void add() {
        String code, nameCostomer, typeCostomer;
        long kw;
        boolean flag;
        do {
            flag = true;
            System.out.print("nhap ma hoa don(MHD-XXXX): ");
            code = scanner.nextLine();
            if (!Validate.maHoaDon(code)) {
                flag = false;
                System.out.println("Dinh dang sai. ");
            }
        } while (!flag);
        do {
            flag = true;
            System.out.print("Nhap ten khach hang: ");
            nameCostomer = scanner.nextLine();
            if (!Validate.nameCustomer(nameCostomer)) {
                System.out.println("Dinh dang sai. ");
                flag = false;
            }
        } while (!flag);
        typeCostomer = chooseCustomer();
        do {
            flag = true;
            System.out.print("nhap dinh muc tieu thu(KW): ");
            kw = Long.parseLong(scanner.nextLine());
            if (kw <= 0) {
                flag = false;
                System.out.println("nhap lai");
            }
        } while (!flag);
        ThongTinHoaDon bill = new ThongTinHoaDon(code, nameCostomer, typeCostomer, kw);
        listBill.add(bill);
        billRepository.add(bill);
        System.out.println("them moi thanh cong.");
    }

    @Override
    public void display() {
        for (ThongTinHoaDon t : listBill) {
            System.out.println(t);
            System.out.println("Tong tien: "+t.getDinhMucTieuThu()*2500+"VND");
        }
    }
}
