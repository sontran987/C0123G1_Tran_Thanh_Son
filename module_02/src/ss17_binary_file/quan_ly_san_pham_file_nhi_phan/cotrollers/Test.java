package ss17_binary_file.quan_ly_san_pham_file_nhi_phan.cotrollers;

import ss17_binary_file.quan_ly_san_pham_file_nhi_phan.services.IProduct1Service;
import ss17_binary_file.quan_ly_san_pham_file_nhi_phan.util.ReadAndWrite;

import java.util.Scanner;

public class Test {
   static IProduct1Service iProduct1Service = new IProduct1Service();
static {
    iProduct1Service.setList(ReadAndWrite.readFileBinary("src/ss17_binary_file/quan_ly_san_pham_file_nhi_phan/data/product1_file.dat"));
}
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choose;
        do {

            System.out.println("Function:\n" +
                    "1. Add\n" +
                    "2. Display\n" +
                    "3. Search\n" +
                    "4. Exit");
            System.out.println("Enter number ");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    iProduct1Service.add();
                    break;
                case 2:
                    iProduct1Service.display();
                    break;
                case 3:
                    iProduct1Service.search();
                    break;
                case 4:
                    System.out.println("Exited");
                    break;
                default:
                    System.out.println("Hay nhap lai!");
            }
        } while (choose != 4);
    }
}
