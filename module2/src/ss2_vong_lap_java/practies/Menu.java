package ss2_vong_lap_java.practies;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        int choice;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Menu");
            System.out.println("1. Draw the triangle");
            System.out.println("2. Draw the square");
            System.out.println("3. Draw the rectangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Draw the triangle");
                    for (int i = 1; i < 5; i++) {
                        for (int j = 0; j < 5; j++) {
                            if (i==0||j==0||j==i||i==5){

                            }
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
            }
        } while (choice != 0);
    }
}
