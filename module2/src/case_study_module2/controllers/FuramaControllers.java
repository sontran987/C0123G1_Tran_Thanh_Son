package case_study_module2.controllers;

import java.util.Scanner;

public class FuramaControllers {
    public static void displayMainMenu() {
        System.out.println(
                "1.\tEmployee Management\n" +
                "2.\tCustomer Management\n"+
                "3.\tFacility Management\n"+
                "4.\tBooking Management\n"+
                "5.\tPromotion Management\n"+
                "6.\tExit\n");
        Scanner scanner=new Scanner(System.in);
        int choose;
        do {
            System.out.println("Nhap so tuong ung voi chuc nang: ");
           choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    System.out.println("ban da thoat");
                    break;
                default:
                    System.out.println("Hay nhap lai");
            }
        }while(choose!=6);
    }

    public static void main(String[] args) {
        displayMainMenu();
    }
}
